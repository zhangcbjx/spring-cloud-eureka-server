package com.learn.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

/**
 * @ClassName: HelloAgent
 * @Description:
 * @author zhangcb
 * @date 2019年4月28日 上午10:00:00
 * @Copyright: 2019 www.yunqi.com Inc. All rights reserved.
 */
public class HelloAgent {
	public static void main(String[] args) throws Exception {
		// 首先建立一个MBeanServer，MBeanServer用来管理我们的MBean，通常是通过MBeanServer来获取我们MBean的信息
		MBeanServer server = ManagementFactory.getPlatformMBeanServer();
		String domainName = "MyMBean";
		// 为MBean（下面的new Hello()）创建ObjectName实例
		ObjectName helloName = new ObjectName(domainName + ":name=HelloWorld");
		// 将new Hello()这个对象注册到MBeanServer上去
		server.registerMBean(new Hello(), helloName);
		
		Thread  thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
	}
}
