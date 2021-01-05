package com.naver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test2 {
	public void name() {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("C:"+File.separator+"test.jpg");
			out = new FileOutputStream("."+File.separator+"src"+File.separator+"upload"+File.separator+"testcopy.jpg");
			byte[] arr = new byte[1024];
			while (true) {
				int length = in.read(arr);
				if (length == -1) {
					break;
					
				}
				out.write(arr, 0, length);
			}System.out.println("end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
