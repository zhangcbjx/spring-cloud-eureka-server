/**
 * 
 */
package com.learn.jmx;

/**
 * @ClassName: HelloMBean
 * @Description:
 * @author zhangcb
 * @date 2019年4月28日 上午9:58:56
 * @Copyright: 2019 www.yunqi.com Inc. All rights reserved.
 */
public interface HelloMBean {
	
	public String getName();

	public void setName(String name);

	public String printHello();

	public String printHello(String whoName);
}
