package diary.dao;

import diary.bean.Diary;
import diary.bean.User;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import javax.annotation.Resource;
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


    public List<Diary> findByCriteria(
            final String propertyName, final boolean isAsc,
            final int firstResult, final int maxResults,String userId) {
        Session session = this.getSession();
        Criteria criteria = session.createCriteria(Diary.class);
        // 按属性条件查询
//        if(criterions!=null)
//            for (int i = 0; i < criterions.size(); i++) {
//                criteria.add(criterions.get(i));
//            }
        criteria.add(Restrictions.eq("user_id",Integer.parseInt(userId)));
        // 按某个属性排序
        if ( propertyName != null) {
            if (isAsc) {
                criteria.addOrder(Order.asc(propertyName));
            } else {
                criteria.addOrder(Order.desc(propertyName));
            }
        }
        // 用于分页查询
        if (maxResults != 0) {
            criteria.setFirstResult(firstResult);
            criteria.setMaxResults(maxResults);
        }
        List<Diary> list = criteria.list();
        return list;
    }

}
