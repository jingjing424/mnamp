package com.mnamp.test.service.impl;

import java.util.List;

import com.mnamp.common.dao.BaseDao;
import com.mnamp.test.bean.User;
import com.mnamp.test.dao.UserDao;
import com.mnamp.test.service.UserService;



public class UserServiceImpl implements UserService {
	   private BaseDao baseDao;  
	   private UserDao userDao;
	    
	    public User login(User user) {  
	        List<User> list = baseDao.findAll(  
	                "from User where UserName = ? and Password = ?", User.class,  
	                new Object[] { user.getUserName(), user.getPassword() });  
	        if (list.size() == 1) {  
	            return list.get(0);  
	        }  
	        return null;  
	    }


		public UserDao getUserDao() {
			return userDao;
		}


		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}


		public BaseDao getBaseDao() {
			return baseDao;
		}  

}
