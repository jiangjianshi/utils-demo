package com.test.commons;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class InputStreamToString {
	
	
	//将输入流转换成文本
	public static void main(String[] args) throws IOException {
//		URL webUrl = new URL("https://wenku.baidu.com/view/7999faba960590c69ec376be.html?from=search");
		URL webUrl = new URL("http://ent.ifeng.com/a/20180105/43019249_0.shtml?_zbs_baidu_news");
		InputStream ins = webUrl.openStream();
		String contents = IOUtils.toString(ins, "gb2312");
		System.out.println("contents: " + contents);
	}
}
