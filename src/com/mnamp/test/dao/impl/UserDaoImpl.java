package com.mnamp.test.dao.impl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mnamp.test.bean.User;
import com.mnamp.test.dao.UserDao;


public class UserDaoImpl implements UserDao{
	
	private SessionFactory sessionFactory;

	/**
	 * 实现接口增加方法
	 */
	public void saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	

}
