/**
 * 
 */
package com.xudq.helloSpring.dao;

import java.util.List;

import com.xudq.helloSpring.bean.User;

/**
 * @author dingqiang.xu
 *
 */
public interface UserDao {
	   public List<User> queryUsers() throws Exception ;

}
