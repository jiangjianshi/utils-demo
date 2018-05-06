package com.test.commons;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * 下载
 * 
 * @author bairong
 *
 */
public class Download3Methods {

	public static void main(String[] args) throws IOException {

		// 下载方式1
		URL url = new URL("http://www.baidu.com/img/baidu_logo.gif");
		File file = new File("/Users/bairong/Desktop/baidu1.gif");
		FileUtils.copyURLToFile(url, file);

		// 下载方式2
		InputStream in = new URL("http://www.baidu.com/img/baidu_logo.gif").openStream();
		byte[] gif = IOUtils.toByteArray(in);
		FileUtils.writeByteArrayToFile(new File("/Users/bairong/Desktop/baidu2.gif"), gif);
		IOUtils.closeQuietly(in);
		//
		// //下载方式3
		InputStream in3 = new URL("http://www.baidu.com/img/baidu_logo.gif").openStream();
		byte[] gif3 = IOUtils.toByteArray(in3);
		IOUtils.write(gif3, new FileOutputStream(new File("/Users/bairong/Desktop/baidu3.gif")));
		IOUtils.closeQuietly(in3);
	}
}
