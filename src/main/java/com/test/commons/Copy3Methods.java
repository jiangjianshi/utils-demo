package com.test.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.TeeOutputStream;

/**
 * 文件复制
 * 
 * @author bairong
 *
 */
public class Copy3Methods {

	public static void main(String[] args) throws IOException {

		// 复制方式1
		FileUtils.copyFile(new File("/Users/jjs/Desktop/abc.txt"), new File("/Users/jjs/Desktop/abc_bak.txt"));

		// 复制方式2
		Writer write = new FileWriter("/Users/jjs/Desktop/abc_bak.txt");
		InputStream ins = new FileInputStream(new File("/Users/jjs/Desktop/abc.txt"));
		IOUtils.copy(ins, write);
		write.close();
		IOUtils.closeQuietly(ins);

		// 将内容同时写入两个不同的文件，就当是一种另类的复制吧
		File test1 = new File("/Users/jjs/Desktop/split1.txt");
		File test2 = new File("/Users/jjs/Desktop/split2.txt");
		OutputStream outStream = null;
		try {
			FileOutputStream fos1 = new FileOutputStream(test1);
			FileOutputStream fos2 = new FileOutputStream(test2);
			// 包含不同的文本
			outStream = new TeeOutputStream(fos1, fos2);
			outStream.write("One Two Three, Test".getBytes());
			outStream.flush();
		} catch (IOException ioe) {
			System.out.println("Error writing to split output stream");
		} finally {
			IOUtils.closeQuietly(outStream);

		}
	}
}
