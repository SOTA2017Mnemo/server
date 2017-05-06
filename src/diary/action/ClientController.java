package diary.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import diary.util.DateInfo;
import diary.util.Lunar;
import diary.util.MyJSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

/**
 * Created by admin on 2017/5/6.
 */
@Controller
public class ClientController {
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
        }

        try {
            DateInfo[] dateInfos = Lunar.getMonthInfo(year,month);
           // System.out.println(dateInfos[);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("status","200");
            JSONArray array = new JSONArray();
            for(DateInfo dateInfo:dateInfos){
                array.add(JSON.toJSONString(dateInfo));
            }
            jsonObject.put("data",array);
            writer.println(jsonObject.toJSONString());
            writer.flush();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private void sendBadRequest(MyJSON myJSON, PrintWriter writer){
        myJSON.setStatus("400");
        writer.println(myJSON.toJSONString());
        writer.flush();
    }
}
