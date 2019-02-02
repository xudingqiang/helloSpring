/**
 * 
 */
package com.xudq.helloSpring.bean;

import java.util.Date;

/**
 * @author dingqiang.xu
 *
 */
public class User {
	private int userId;
	private String userName;
	private int credits;
	private String password;
	private Date dateTime;
	private String  lastIp;
	
	
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	
	
}
