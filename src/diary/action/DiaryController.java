package diary.action;

import diary.dao.DiaryDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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

}
