/**
 * 
 */
package com.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: SpringStart   
 * @Description: 
 * @author zhangcb  
 * @date 2018年11月7日 下午3:16:23 
 * @Copyright: 2018 www.yunqi.com Inc. All rights reserved.
 */
@SpringBootApplication
public class SpringStart {
	private static Logger log = LoggerFactory.getLogger(SpringStart.class);
	/**
	 * @Title: main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringStart.class, args);
		log.info("YunQi WApp booted.");
	}

}
