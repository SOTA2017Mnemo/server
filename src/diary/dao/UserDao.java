package diary.dao;

import diary.bean.User;
import org.hibernate.*;

import javax.annotation.Resource;

public class UserDao{

    private SessionFactory sessionFactory;

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    public void addUser(User user) {
        this.getSession().save(user);
    }

    public SessionFactory getSessionFactory() throws HibernateException {
        return sessionFactory;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public User findUserByAccount(String account) {
        String hql = "from User u where u.account=?";
        Query query = getSession().createQuery(hql);// 本地SQL检索方式
        query.setString(0, account);
        return (User)query.uniqueResult();
    }

    public void save(User user){
        Session session = this.getSession();
        session.save(user);
       // session.close();
    }

    public User login(String account, String password) {
        String hql = "from User u where u.account=? and u.password=?";
        Query query = getSession().createQuery(hql);// 本地SQL检索方式
        query.setString(0, account);
        query.setString(1, password);
        return (User)query.uniqueResult();
    }

}
