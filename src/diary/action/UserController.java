package diary.action;


import com.alibaba.fastjson.JSONObject;
import diary.bean.User;
import diary.dao.UserDao;
import diary.seviceClient.AlmanacClient;
import diary.util.Encoder;
import diary.util.MyJSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private UserDao userDao;

    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //@RequestMapping(params = "method=login", method = RequestMethod.POST)
    @RequestMapping(params = "method=login", method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        System.out.println("password: " + password + "account:" + account);
        //System.out.println("忌："+AlmanacClient.getJI());
        User user = userDao.login(account, Encoder.EncoderByMd5(password));
        System.out.println(user);
        MyJSON myJSON = new MyJSON();
        PrintWriter writer = response.getWriter();
        if (user == null) {
            myJSON.setStatus("400");
            writer.println(myJSON.toJSONString());
            writer.flush();
            return;
        }

        request.getSession().setAttribute("user", user);
        myJSON.setStatus("200");
        myJSON.putData("id", user.getId() + "");
        myJSON.putData("account", user.getAccount());
        myJSON.putData("name", user.getName());
        myJSON.putData("birthday",
                user.getBirthday() == null ? "":user.getBirthday().toString());

        writer.println(myJSON.toJSONString());
        writer.flush();
    }

    @RequestMapping(params = "method=register", method = RequestMethod.POST)
    public void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("register");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        String account = request.getParameter("account");
        String password =  request.getParameter("password");
        String name = request.getParameter("name");
        MyJSON myJSON = new MyJSON();
        PrintWriter writer = response.getWriter();
        if(account == null || password == null || name == null){
            this.sendBadRequest(myJSON,writer);
            return;
        }
        User user = userDao.findUserByAccount(account);
        if (user == null) {
            user = new User();
            user.setAccount(account);
            System.out.println(Encoder.EncoderByMd5(password));
            user.setPassword(Encoder.EncoderByMd5(password));
            user.setName(name);
            request.getSession().setAttribute("user", user);
            userDao.save(user);
            myJSON.setStatus("200");
            writer.println(myJSON.toJSONString());
        } else
            this.sendBadRequest(myJSON,writer);
        writer.flush();
    }

    @RequestMapping(params = "method=logout", method = RequestMethod.POST)
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        User currentUser = (User) request.getSession().getAttribute("user");
        request.getSession().invalidate();

        MyJSON myJSON = new MyJSON();
        myJSON.setStatus("200");
        PrintWriter writer = response.getWriter();
        writer.println(myJSON.toJSONString());
        writer.flush();
    }

    private void sendBadRequest(MyJSON myJSON,PrintWriter writer){
        myJSON.setStatus("400");
        writer.println(myJSON.toJSONString());
        writer.flush();
    }
}