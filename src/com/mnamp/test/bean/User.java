package com.mnamp.test.bean;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String UserName;
	private String Password;
	private String Flag;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	

	// Property accessors
	public User(Integer id, String UserName, String Password,String Flag) {
		super();
		this.Flag=Flag;
		this.id=id;
		this.Password=Password;
		this.UserName=UserName;
		
	}
	public Integer getId() {
		return this.id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}