/**
 * 
 */
package com.xudq.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	public static void main(String[] args) {
		ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
         
        HelloWorldService service =
             (HelloWorldService) context.getBean("helloWorldService");
          
        HelloWorld hw= service.getHelloWorld();
         
        hw.sayHello();
	}

}
