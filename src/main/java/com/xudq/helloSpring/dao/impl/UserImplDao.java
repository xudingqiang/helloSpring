/**
 * 
 */
package com.xudq.helloSpring.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.xudq.helloSpring.bean.User;
import com.xudq.helloSpring.dao.UserDao;

/**
 * @author dingqiang.xu
 *
 */
public class UserImplDao implements UserDao {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	

	public List<User> queryUsers() throws SQLException  {
	       Connection conn = dataSource.getConnection();
	       String sql = "Select user_id ,user_name  from t_user";
	       Statement smt = conn.createStatement();
	       ResultSet rs = smt.executeQuery(sql);
	       List<User> list = new ArrayList<User>();
	       while(rs.next()) {
	    	   int userId = rs.getInt("user_id");
	    	   String userName = rs.getString("user_name");
	    	   User user = new User(userId,userName);
	    	   list.add(user);
	       }
	       
		return list;
	}

}
