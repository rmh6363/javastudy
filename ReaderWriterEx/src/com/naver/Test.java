package com.naver;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	public void me7() {
		Writer out = null;
		PrintWriter pw = null;
		try {
			out = new FileWriter("aaa.txt");
			pw = new PrintWriter(out);
			
			pw.print(false);
			pw.println(false);
			pw.println(false);
			pw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (pw != null) {
					pw.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me6() {
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			in = new FileInputStream("C:"+File.separator+"abc.txt");
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			//��Ƽ�̵�� ������ �����ʹ� ���ڽ�Ʈ���� ����� �� ����.
			String what = null;
			
			while (true) {
				what =br.readLine();
				if(what == null) {
					break;
				}
				System.out.println(what);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me5() throws Exception {
		// �ܼ�â���� ������� �Է���
		// scanner�� �̿��ؼ� ȹ���ߴµ�
		// �������� �� � ȸ����� ������
		// BufferedReader�� �̿��մϴ�
		// InputStreamReader      Input �� Reader ���������

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("����� ���� �����ϴ� ���� �ϳ��� �Է��Ͻÿ�.");

		String sNum = br.readLine();
		int num = Integer.parseInt(sNum);
		System.out.println("����� ���� �����ϴ� ���� �ϳ��� �Է��Ͻÿ�.");
		String sNum2 = br.readLine();
		int num2 = Integer.parseInt(sNum2);
		System.out.println("�� ���� ���� " + (num + num2));
		if (br != null) {
			br.close();
		}
	}

	public void me4() {
		// InputStream - OutputStream
		// FileInputStream - FileoutputStream
		// pair�� �����
		// pair�� �� ���ߴ� ���� : �ϳ��� ���� ��� �Ǵµ�, �ٸ� ���� ���� ����� �� ��.
		// BufferedReader  enter �������� ����
		// Scanner
		Reader in = null;
		BufferedReader br = null;
		try {
			in = new FileReader("C:"+File.separator+"ss.txt");
			br = new BufferedReader(in);
			String read = null;
			while (true) {
				read = br.readLine();
				if (read == null) {
					break;
				}
				System.out.println(read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		
	}

	public void me3() {
		Reader in = null;
		Writer out = null;
		try {
			out = new FileWriter("C:" + File.separator + "abc.txt");
			List<String> list = new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("�����");
			list.add("5");
			for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i));
				out.write(System.getProperty("line.separator"));
			}
			out.flush();
			in = new FileReader("C:" + File.separator + "abc.txt");
			char[] arr = new char[1024];
			int length = -1;
			while (true) {
				length = in.read(arr);
				if (length == -1) {
					break;
				}
				for (int i = 0; i < length; i++) {
					System.out.print(arr[i]);
				}
			}

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

	public void me2() {
		Reader in = null;
		try {
			in = new FileReader("C:" + File.separator + "ss.txt");
			char[] arr = new char[1024];
			int length = -1;
			while (true) {
				length = in.read(arr);
				if (length == -1) {
					break;
				}
				for (int i = 0; i < length; i++) {
					System.out.print(arr[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void me1() {
		Writer out = null;
		try {
			out = new FileWriter("C:" + File.separator + "asdf.txt");
			Set<String> set = new HashSet<String>();
			set.add("��");
			set.add("��");
			set.add("��");
			set.add("��");
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String string = it.next();
				System.out.println(string);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}