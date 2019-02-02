/**
 * 
 */
package com.xudq.helloSpring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xudq.helloSpring.bean.User;
import com.xudq.helloSpring.dao.UserDao;
import com.xudq.helloSpring.service.HelloWorldService;
import com.xudq.helloSpring.test.HelloWorld;

/**
 * @author dingqiang.xu
 *
 */
public class HelloProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
         
//        HelloWorldService service =
//             (HelloWorldService) context.getBean("helloWorldService");
//          
//        HelloWorld hw= service.getHelloWorld();
//         
//        hw.sayHello();
		
		UserDao userDao =  (UserDao)context.getBean("userDAO");
		List<User> list = userDao.queryUsers();
//		System.out.println("list size  "+list.size());
		for(User user:list) {
			System.out.println("id   "+user.getUserId()  +"   name:   "+user.getUserName());
		}
		
	}

}
