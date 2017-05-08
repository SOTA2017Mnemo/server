package diary.dao;

import diary.bean.Diary;
import diary.bean.User;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;

/**
 * Created by admin on 2017/4/29.
 */
public class DiaryDao {

    private SessionFactory sessionFactory;

   /* static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            sessionFactory.openSession();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }*/

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }


    public SessionFactory getSessionFactory() throws HibernateException {
        return sessionFactory;
    }
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public Diary findDiaryById(String id) {
        String hql = "from Diary d where d.id=?";
        Query query = getSession().createQuery(hql);// 本地SQL检索方式
        query.setInteger(0, Integer.parseInt(id));
        return (Diary)query.uniqueResult();
    }

    public List<Diary> findDiaryList(
            final int firstResult, final int maxResults,String userId,String year) {
        String hql = "from Diary d where d.userId=? and d.diaryDate like :year"+" order by diaryDate desc ";
        Query query = getSession().createQuery(hql);
        query.setString("year","%"+year+"%");
        query.setInteger(0,Integer.parseInt(userId));
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        List<Diary> list = query.list();
        return list;
    }
    public int findDiaryNum(String userId,String year) {
        String hql = "from Diary d where d.userId=? and d.diaryDate like :year"+" order by diaryDate desc ";
        Query query = getSession().createQuery(hql);
        query.setString("year","%"+year+"%");
        query.setInteger(0,Integer.parseInt(userId));
        List<Diary> list = query.list();
        return list.size();
    }

    public void save(Diary diary){
        Session session = this.getSession();
        session.save(diary);
    }

    public HashSet<Integer> queryYearsById(String userId) {
        HashSet<Integer> results=new HashSet<Integer>();
        String hql = "from Diary d where d.userId=? "+" order by diaryDate desc ";
        Query query = getSession().createQuery(hql);
        query.setInteger(0,Integer.parseInt(userId));
        List<Diary> list = query.list();
        for(int i=0;i<list.size();i++){
            results.add(list.get(i).getDiaryDate().getYear()+1900);
        }
        return results;
    }

    public List<Diary> queryDiaryByDay(String userId, String month, String day) {
        if(month.length()==1){
            month="0"+month;
        }
        if(day.length()==1){
            day="0"+day;
        }
        String hql = "from Diary d where d.userId=? and d.diaryDate like :format"+" order by diaryDate desc ";
        Query query = getSession().createQuery(hql);
        query.setString("format","%"+month+"-"+day+"%");
        query.setInteger(0,Integer.parseInt(userId));
        List<Diary> list = query.list();
        return list;
    }
}
