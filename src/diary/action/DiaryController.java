package diary.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import diary.bean.Diary;
import diary.dao.DiaryDao;
import diary.util.MyJSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 * Created by admin on 2017/4/29.
 */
@Controller
@RequestMapping(value = "/diary")
public class DiaryController {
    private DiaryDao diaryDao;

    @Resource
    public void setDiaryDao(DiaryDao diaryDao){
        this.diaryDao = diaryDao;
    }

    @RequestMapping(params = "method=writeDiary", method = RequestMethod.POST)
    public void writeDiary(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        String title = request.getParameter("title");
        String userId = request.getParameter("userId");
        String content = request.getParameter("content");
        String weather = request.getParameter("weather");
        String imgPath =request.getParameter("imgPath");
        String picPath =request.getParameter("picPath");
        System.out.println(title);
        System.out.println(userId);
        System.out.println(content);
        System.out.println(weather);
        System.out.println(imgPath);
        System.out.println(picPath);
        MyJSON myJSON = new MyJSON();
        PrintWriter writer = response.getWriter();
        if(picPath==null||imgPath == null || userId == null || content == null || weather == null){
            this.sendBadRequest(myJSON,writer);
            return;
        }

        Diary diary = new Diary();
        diary.setContent(content);
        diary.setDiaryDate(new Date());
        diary.setTitle(title);
        diary.setWeather(weather);
        diary.setUserId(Integer.parseInt(userId));
        diary.setImgPath(imgPath);
        diary.setPicPath(picPath);

        diaryDao.save(diary);

        myJSON.setStatus("200");
        writer.print(myJSON.toJSONString());
        writer.flush();
    }

    @RequestMapping(params = "method=queryDiary", method = RequestMethod.POST)
    public void queryDiary(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        String id = request.getParameter("diary_id");
        Diary diary = id == null ? null : diaryDao.findDiaryById(id);

        MyJSON myJSON = new MyJSON();
        PrintWriter writer = response.getWriter();
        if(diary == null) {
            this.sendBadRequest(myJSON, writer);
            return;
        }
        System.out.println(diary.getDiaryDate());
        System.out.println(JSON.toJSONString(diary.getDiaryDate()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(diary.getDiaryDate());
        myJSON.putData(JSON.toJSONString(diary));
        myJSON.putData("diaryDate",dateStr);
        String imgPath=diary.getImgPath()+"";
        String picPath=diary.getPicPath()+"";
        myJSON.putData("imgPath",imgPath);
        myJSON.putData("picPath",picPath);
        myJSON.setStatus("200");

        writer.println(myJSON.toJSONString());
        writer.flush();
    }

    @RequestMapping(params = "method=diaryList", method = RequestMethod.POST)
    public void diaryList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        String index = request.getParameter("index");
        String count = request.getParameter("count");
        String userId = request.getParameter("user_id");
        String year=request.getParameter("year");

        PrintWriter writer = response.getWriter();
        if(index == null || count == null || userId == null || year==null){
            MyJSON myJSON = new MyJSON();
            this.sendBadRequest(myJSON,writer);
            return;
        }

        List<Diary> diaryList = diaryDao.findDiaryList(Integer.parseInt(index),
                Integer.parseInt(count),userId,year);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status","200");
        JSONArray array = new JSONArray();

        for(Diary diary:diaryList){


            JSONObject object = JSON.parseObject(JSON.toJSONString(diary));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = sdf.format(diary.getDiaryDate());
            object.put("diaryDate",dateStr);
            String content=diary.getContent();
            if(content.length()>50){
                content=content.substring(0,50)+"...";
            }
            object.put("content",content);
            array.add(object.toJSONString());

        }

        jsonObject.put("data",array);
        writer.println(jsonObject.toJSONString());
        writer.flush();


    }
    @RequestMapping(params = "method=diaryNum", method = RequestMethod.POST)
    public void diaryNum(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");
;

        String userId=request.getParameter("userId");
        PrintWriter writer = response.getWriter();
        if(userId==null){
            MyJSON myJSON = new MyJSON();
            this.sendBadRequest(myJSON,writer);
            return;
        }
        HashSet<Integer> diaryYear=diaryDao.queryYearsById(userId);
        JSONArray array=new JSONArray();
        for(int i:diaryYear){
            System.out.println(i);
            int num = diaryDao.findDiaryNum(userId,i+"");
            JSONObject jo=new JSONObject();
            jo.put("year",i);
            jo.put("num",num);
            array.add(jo);
        }


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status","200");
        jsonObject.put("years",array);
        writer.println(jsonObject.toJSONString());
        writer.flush();


    }
    @RequestMapping(params = "method=diaryDay", method = RequestMethod.POST)
    public void diaryDay(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        ;

        String userId=request.getParameter("userId");
        String month=request.getParameter("month");
        String day=request.getParameter("day");
        PrintWriter writer = response.getWriter();
        if(userId==null||month==null||day==null){
            MyJSON myJSON = new MyJSON();
            this.sendBadRequest(myJSON,writer);
            return;
        }
        List<Diary> diaryList = diaryDao.queryDiaryByDay(userId,month,day);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status","200");
        JSONArray array = new JSONArray();

        for(Diary diary:diaryList){


            JSONObject object = JSON.parseObject(JSON.toJSONString(diary));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = sdf.format(diary.getDiaryDate());
            object.put("diaryDate",dateStr);
            String imgPath=diary.getImgPath()+"";
            String picPath=diary.getPicPath()+"";
            object.put("imgPath",imgPath);
            object.put("picPath",picPath);
            String content=diary.getContent();
            if(content.length()>50){
                content=content.substring(0,50)+"...";
            }
            object.put("content",content);
            array.add(object);

        }

        jsonObject.put("data",array);
        writer.println(jsonObject.toJSONString());
        writer.flush();


    }


    private void sendBadRequest(MyJSON myJSON,PrintWriter writer){
        myJSON.setStatus("400");
        writer.println(myJSON.toJSONString());
        writer.flush();
    }
}
