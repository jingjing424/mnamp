package com.mnamp.common.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ActionBase extends ActionSupport implements RequestAware,  
SessionAware, ApplicationAware {  

private static final long serialVersionUID = 1L;  

protected Map<String, Object> request;  
protected Map<String, Object> session;  
protected Map<String, Object> application;  

public Map<String, Object> getRequest() {  
return request;  
}  

public Map<String, Object> getSession() {  
return session;  
}  

public Map<String, Object> getApplication() {  
return application;  
}  

 
public void setRequest(Map<String, Object> request) {  
this.request = request;  
}  


public void setSession(Map<String, Object> session) {  
this.session = session;  
}  

 
public void setApplication(Map<String, Object> application) {  
this.application = application;  
}  
public HttpServletResponse getResponse(){
	HttpServletResponse response = ServletActionContext.getResponse();
	return response;
}
public HttpServletRequest getHttpRequest(){
	HttpServletRequest request = ServletActionContext.getRequest();
	return request;
}
public void responseWrite(String strJSON) throws IOException{
	getResponse().setCharacterEncoding("utf-8");
	getResponse().setContentType("json/application;charset=utf-8");
	PrintWriter out = getResponse().getWriter();
	out.print(strJSON);
	out.flush();
	out.close();
}


} 