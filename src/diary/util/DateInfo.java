package diary.util;

public class DateInfo {

    private String date;
    private String weekday;
    private String lunar;

    DateInfo(String date, String weekday, String lunar) {
        this.date = date;
        this.weekday = weekday;
        this.lunar = lunar;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getLunar() {
        return lunar;
    }

    public void setLunar(String lunar) {
        this.lunar = lunar;
    }
}
