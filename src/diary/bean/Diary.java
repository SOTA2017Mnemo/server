package diary.bean;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2017/4/29.
 */
@Entity
@Table(name = "diary")
public class Diary {
    private int id;
    private String title;
    private String content;
    private Date diaryDate;
    private String luckyColor;
    private String weather;
    private Integer userId;
    private String imgPath;
    private String picPath;



    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content", nullable = true, length=16777216)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "diary_date", nullable = true)
    public Date getDiaryDate() {
        return diaryDate;
    }

    public void setDiaryDate(Date diaryDate) {
        this.diaryDate = diaryDate;
    }

    @Basic
    @Column(name = "lucky_color", nullable = true, length = 45)
    public String getLuckyColor() {
        return luckyColor;
    }

    public void setLuckyColor(String luckyColor) {
        this.luckyColor = luckyColor;
    }

    @Basic
    @Column(name = "weather", nullable = true, length = 100)
    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Diary diary = (Diary) o;

        if (id != diary.id) return false;
        if (title != null ? !title.equals(diary.title) : diary.title != null) return false;
        if (content != null ? !content.equals(diary.content) : diary.content != null) return false;
        if (diaryDate != null ? !diaryDate.equals(diary.diaryDate) : diary.diaryDate != null) return false;
        if (luckyColor != null ? !luckyColor.equals(diary.luckyColor) : diary.luckyColor != null) return false;
        if (weather != null ? !weather.equals(diary.weather) : diary.weather != null) return false;
        if (userId != null ? !userId.equals(diary.userId) : diary.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (diaryDate != null ? diaryDate.hashCode() : 0);
        result = 31 * result + (luckyColor != null ? luckyColor.hashCode() : 0);
        result = 31 * result + (weather != null ? weather.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "img_path")
    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Basic
    @Column(name = "pic_path")
    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}

