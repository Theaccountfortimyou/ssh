package com.itheima.bean.test;

import com.itheima.bean.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateTest {
    @Test
    public void fun01(){
        Configuration configuration = new Configuration();
        Configuration configure = configuration.configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = new User();
        user.setUage(18);
        user.setUname("小乔");
        session.save(user);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
