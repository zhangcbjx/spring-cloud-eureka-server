package com.learn.jmx;

/**
 * @ClassName: Hello
 * @Description:
 * @author zhangcb
 * @date 2019年4月28日 上午9:59:28
 * @Copyright: 2019 www.yunqi.com Inc. All rights reserved.
 */
public class Hello implements HelloMBean {
	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String printHello() {
		return "Hello " + name;
	}

	@Override
	public String printHello(String whoName) {
		return "Hello  " + whoName;
	}
}
