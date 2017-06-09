package com.mnamp.test.action;

import com.mnamp.common.util.ActionBase;
import com.mnamp.test.bean.User;
import com.mnamp.test.service.UserService;


public class LoginAction extends ActionBase{
	 private static final long serialVersionUID = 1L;  
	  
	    private String username;  
	    private String password;  
	    private User user;
	    private UserService userService;  
	  
	    public String save(){
	    	
	    	System.out.println("测试成功！");
	    	return "input";
	    }
	    
	    public String login() throws Exception {  
	        user.setUserName(username);
	        user.setPassword(password);
	        System.out.println(user.getPassword());
	        User login = userService.login(user);  
	        if (login != null) {  
	            session.put("user", login);  
	            return SUCCESS;  
	        }  
	        return INPUT;  
	    }  
	  
	    public String getUsername() {  
	        return username;  
	    }  
	  
	    public void setUsername(String username) {  
	        this.username = username;  
	    }  
	  
	    public String getPassword() {  
	        return password;  
	    }  
	  
	    public void setPassword(String password) {  
	        this.password = password;  
	    }
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}

		public UserService getUserService() {
			return userService;
		}

		public void setUserService(UserService userService) {
			this.userService = userService;
		}
	  
}
