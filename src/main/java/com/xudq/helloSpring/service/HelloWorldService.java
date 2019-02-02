/**
 * 
 */
package com.xudq.helloSpring.service;

import com.xudq.helloSpring.test.HelloWorld;

/**
 * @author dingqiang.xu
 *
 */
public class HelloWorldService {
    private HelloWorld helloWorld;
    
    public HelloWorldService() {
    	  
    }
  
    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
  
    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }
}
