package com.test.commons;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class TraditionalReadWrite {

	// 通过字节流 写文件
	public static void ByteWrite() {
		File file = new File("/Users/bairong/Desktop/abcd.txt");
		try {
			OutputStream outputStream = new FileOutputStream(file);
			String textString = "commons-io工具类";
			byte[] data = textString.getBytes("UTF-8");
			outputStream.write(data);
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ByreRead() throws IOException {
		// File file = new File("/Users/jjs/Desktop/abcd.txt");
		FileReader reader = new FileReader("/Users/bairong/Desktop/abcd.txt");
		BufferedReader br = new BufferedReader(reader);
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		ByteWrite();
	}
}
