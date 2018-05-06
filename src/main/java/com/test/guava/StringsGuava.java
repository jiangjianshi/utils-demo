package com.test.guava;

import com.google.common.base.Strings;

/**
 * 字符串处理
 * @author bairong
 *
 */
public class StringsGuava {

	public static void main(String[] args) {
		
		/**
		 * null to "";
		 */
//		String activityId = paramMap.get("activityId") != null ? paramMap.get("activityId").toString() : "";
		System.out.println(Strings.nullToEmpty(null));// ""
		System.out.println(Strings.nullToEmpty("ay"));// "ay"
		System.out.println(Strings.emptyToNull(""));// null
		System.out.println(Strings.emptyToNull("ay"));// "ay"
		
		/**
		 * 共同前缀
		 */
		String a = "com.jd.coo.Hello";
		String b = "com.jd.coo.Hi";
		String ourCommonPrefix = Strings.commonPrefix(a, b);
		System.out.println("a,b common prefix is " + ourCommonPrefix);
		
		/**
		 * 共同后缀
		 */
		// Strings.commonSuffix(a,b) demo
		String c = "com.google.Hello";
		String d = "com.jd.Hello";
		String ourSuffix = Strings.commonSuffix(c, d);
		System.out.println("c,d common suffix is " + ourSuffix);
	}
}
