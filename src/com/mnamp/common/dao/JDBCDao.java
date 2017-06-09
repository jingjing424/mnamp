package com.mnamp.common.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class JDBCDao {
	private  static final  String ForName="com.mysql.jdbc.Driver";
	private  static final  String Url="jdbc:mysql://192.168.14.88:3306/tradeDB";
	public  static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName(ForName);
			conn=(Connection) DriverManager.getConnection(Url,"unitele","123456");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return conn;
		
	}
	//测试jdbc数据�?
	public static void main(String[] args) {
		Connection conn=null;
		Statement st=null;
		 ResultSet  rs=null;
		 try {
			String sql="select * from ft_test_t_ljj";
			conn=getConnection();
		st=conn.createStatement();
		rs=st.executeQuery(sql);
		while (rs.next()) {
			String  name = (String) rs.getString("username");
			System.out.println(name);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
