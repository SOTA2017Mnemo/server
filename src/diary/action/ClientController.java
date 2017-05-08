package diary.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import diary.bean.User;
import diary.dao.UserDao;
import diary.seviceClient.AlmanacClient;
import diary.seviceClient.StarSignClient;
import diary.util.DateInfo;
import diary.util.Lunar;
import diary.util.MyJSON;
import diary.util.StarSign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by admin on 2017/5/6.
 */
@Controller
public class ClientController {
    private UserDao userDao;

    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(value = "/calendar", method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        String year = request.getParameter("year");
        String month = request.getParameter("month");

        MyJSON myJSON = new MyJSON();
        PrintWriter writer = response.getWriter();
        if(year == null || month == null){
            this.sendBadRequest(myJSON,writer);
            return;
        }

        try {
            DateInfo[] dateInfos = Lunar.getMonthInfo(year,month);
           // System.out.println(dateInfos[);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("status","200");
            JSONArray array = new JSONArray();
            for(DateInfo dateInfo:dateInfos){
                JSONObject jo=new JSONObject();
                jo.put("lunar",dateInfo.getLunar());
                array.add(jo);
            }
            jsonObject.put("data",array);
            writer.println(jsonObject.toJSONString());
            writer.flush();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/starSign", method = RequestMethod.POST)
    public void starSign(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        String userId = request.getParameter("userId");

        MyJSON myJSON = new MyJSON();
        PrintWriter writer = response.getWriter();
        if(userId == null){
            this.sendBadRequest(myJSON,writer);
            return;
        }
        User user = userDao.findUserById(userId);
        if(user == null){
            this.sendBadRequest(myJSON,writer);
            return;
        }

        Date date =user.getBirthday();
        System.out.println("yue:"+date.getMonth());
        String starSign = StarSign.getXingZuoName(date.getMonth()+1,date.getDate());
        String color = StarSignClient.getColor(starSign);

        myJSON.setStatus("200");
        myJSON.putData("color",color);
        writer.println(myJSON.toJSONString());
        writer.flush();

    }

    @RequestMapping(value = "/almanac", method = RequestMethod.POST)
    public void almanac(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        MyJSON myJSON = new MyJSON();
        PrintWriter writer = response.getWriter();

        String JI = AlmanacClient.getJI();
        String YI = AlmanacClient.getYI();

        myJSON.setStatus("200");
        myJSON.putData("JI",JI);
        myJSON.putData("YI",YI);

        writer.println(myJSON.toJSONString());
        writer.flush();

    }

    private void sendBadRequest(MyJSON myJSON, PrintWriter writer){
        myJSON.setStatus("400");
        writer.println(myJSON.toJSONString());
        writer.flush();
    }
}
