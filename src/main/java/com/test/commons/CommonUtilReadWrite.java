package com.test.commons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CommonUtilReadWrite {

	public static void main(String[] args) throws IOException {

		FileUtils.write(new File("/Users/jjs/Desktop/abc.txt"), "commons-io工具类", "UTF-8", true);
		FileUtils.writeStringToFile(new File("/Users/jjs/Desktop/abcd.txt"), "作者：cxy", "UTF-8", true);

		// 读文件
		System.out.println(FileUtils.readFileToString(new File("/Users/jjs/Desktop/abcd.txt"), "UTF-8"));

		System.out.println(FileUtils.readLines(new File("/Users/jjs/Desktop/abcd.txt"), "UTF-8")); // 返回一个list

	}
}
