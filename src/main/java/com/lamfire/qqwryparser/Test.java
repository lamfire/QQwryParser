package com.lamfire.qqwryparser;

import com.lamfire.utils.RandomUtils;

public class Test {
	
	public static String randomIp(){
		return String.format("%d.%d.%d.%d", RandomUtils.nextInt(230), RandomUtils.nextInt(255), RandomUtils.nextInt(255), RandomUtils.nextInt(255));
	}
	
	public static void main(String[] args)throws Exception {
		System.out.println(QQwryUtils.getElement("127.0.0.1"));
        System.out.println(QQwryUtils.getElement(randomIp()));
        System.out.println(QQwryUtils.getElement("121.46.120.85"));
	}
}
