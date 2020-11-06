package com.naver;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {

	public void me16() {
		String i = "    �˰�%d ��     ";

		System.out.println(String.format(i, 1000));
		System.out.println(String.format(i, 1000).trim());

	}

	public void me15() {
		String msg1 = "hello";
		String msg2 = "Hello";
		String msg3 = "HELLP";
		String s1 = msg1.toUpperCase();
		System.out.println(s1);
		
	

		String s2 = msg3.toLowerCase();
		System.out.println(s2);
	}

	public void me14(int age) {
		// ���ڿ��� ���ڸ� + ������ ������� �ʰ� ǥ���ϴ� ���
		String msg = "ȫ�浿��" + age + "�� �Դϴ�.";
		System.out.println(msg);

		String msg2 = "ȫ�浿�� %d ���Դϴ�.";
		System.out.println(String.format(msg2, 16));

		// 2020�� 3��20��
		// 2020��11�� 5��
		int month = 3;
		String msg3 = "������ 2020��%2d��20���Դϴ�.";
		System.out.println(String.format(msg3, month));
		int date = 5;
		String msg4 = "������ 2020��11��%-2d���Դϴ�.";
		System.out.println(String.format(msg4, date));
		int money = 1000;
		String msg5 = "�� ������� %d ���Դϴ�.";
		System.out.println(String.format(msg5, money));
		String msg6 = "�� ������� %,d ���Դϴ�.";
		System.out.println(String.format(msg6, money));

		String msg7 = "�� ������� %,15d ���Դϴ�";
		System.out.println(String.format(msg7, money));

		// �ڸ����� �������ְ�, �̸� �� �� ä���� �� ���� ������ 0���� ä���
		// �ڸ��� : 5, ���ڴ� 11�̸� -> 00011
		String msg8 = "�� ���ȣ�� %2d�Դϴ�.";
		System.out.println(String.format(msg8, 7));
		String msg9 = "�� ���ȣ�� %02d�Դϴ�.";
		System.out.println(String.format(msg9, 7));
		// String.format()
		// 1:format ���ڿ�,2:�� 3.%d : ����, %s : ���ڿ�, %f : �Ǽ���
		// �ڸ��� ���� : %3d
		// ,�� ǥ���ϰ� ���� �� : %,5d
		// �¿����� : %,-5d(-��������)
		// �ڸ��� ���� �Ŀ� �� ������ 0���� ä��� ������ : %,05d

		String msg10 = "%d+%d = %d �Դϴ�";
		System.out.println(String.format(msg10, 3, 4, 5, 6, 7));

		String msg11 = "%3.2f%%�Դϴ�.";
		System.out.println(String.format(msg11, 51.6));
	}

	public void me13() {
		// Ư�� ���� ����(delim)�� �̿��Ͽ� ���� �ٸ� �ǹ̸�
		// ���� �ִ� ���ڿ�(=token, ��ū)�� �����ϱ�
		String msg = "teacheryo#1234##vip#1000#g#";
		String[] arrStr = msg.split("#");
		System.out.println(arrStr.length);

		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		System.out.println("#####################");
		StringTokenizer st = new StringTokenizer(msg, "#");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);

		}
		int i = 0;
		String[] tArr = new String[st.countTokens()];
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			tArr[i] = token;
			i++;

		}
		System.out.println("#######");
		String str = "rmh#6363#vvip#A";
		String[] arr = str.split("#");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

		StringTokenizer st2 = new StringTokenizer(str, "#");
		String[] tArr2 = new String[st2.countTokens()];
		int j = 0;
		while (st2.hasMoreTokens()) {
			String token = st2.nextToken();
			tArr2[j++] = token;

			System.out.println(token);

		}
		String str3 = "���ع���#��λ���#������#�⵵��";
		StringTokenizer st3 = new StringTokenizer(str3, "#");
		String[] stArr = new String[st3.countTokens()];
		while (st3.hasMoreTokens()) {
			String token = st3.nextToken();
			stArr[i] = token;
			i++;
			System.out.println(token);

		}
		i = 0;
		String lylics = "i#will#time#runing#out";
		StringTokenizer stl = new StringTokenizer(lylics, "#");
		String[] arrL = new String[stl.countTokens()];
		while (stl.hasMoreTokens()) {
			String token = stl.nextToken();
			arrL[i] = token;
			i++;
			System.out.println(token);

		}
		String kbo = "�λ�#kt#sk#nc#��ȭ";
		StringTokenizer stk = new StringTokenizer(kbo, "#");
		String[] kboArr = new String[stk.countTokens()];
		i = 0;
		while (stk.hasMoreTokens()) {
			String token = stk.nextToken();
			kboArr[i] = token;
			i++;
			System.out.println(token);
		}
		String[] kArr = kbo.split("#");
		for (int k = 0; k < kArr.length; k++) {
			System.out.println(kArr[k]);
		}

		String aa = "�ȳ��ϼ���";
		System.out.println(aa.substring(2, 5));

	}

	public void me12() {
//		+�����ڴ� ���ڿ���������ȴ�.
//		-�����ڴ� ���ڿ��� ������� �ʴ´�
//		"hello world"����
//		"hello"�� �߶󳻰� "world"�� �����ϰ� �ʹٸ�? substring()                    
		String msg1 = "hello world";
		int idx = msg1.indexOf('l');
		System.out.println(idx);
		int idx2 = msg1.indexOf('l', idx + 1);
		System.out.println(idx2);
		int subidx = msg1.indexOf('r');
		System.out.println(subidx);
		String result = msg1.substring(idx2, subidx + 1);
		System.out.println(result);

	}

	public void me11() {
		// �¿� ������ �����ϰ������
		String msg = "     he   llo        ";
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);
	}

	public void me10() {
		// ���ڿ����� ������ ���� ������ ���θ� Ȯ���ϰ� ���� ��, equals()/equalsIgnoreCase
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";
		boolean result1 = msg1.equals(msg2);
		boolean result2 = msg1.equals(msg3);
		System.out.println(result1);
		System.out.println(result2);
		boolean result3 = msg1.equalsIgnoreCase(msg3);
		System.out.println(result3);
	}

	public void me9() {
		// ���ڿ��� Ư�� ���ڿ��� �������� �˰� ���� ��,
		String msg = "hello";
		boolean result = msg.startsWith("he");
		System.out.println(result);

	}

	public void me8() {
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";
		boolean result = msg1.endsWith("jpg");
		System.out.println(result);
		boolean result2 = msg2.endsWith("txt");
		System.out.println(result2);
	}

	public void me7(String msg) {

		// contains() or indexOf()
		boolean result = msg.contains("z");
		// Ư�� ���� �Ǵ� ���ڿ��� ���� ������ �ε����� ��ȯ �޼��� indexOf()
		// ��, �ش� ���� �Ǵ� ���ڿ��� ������ -1 ��ȯ...
		int idx = msg.indexOf('z');
		System.out.println(result);
		System.out.println(idx);
		System.out.println(msg.lastIndexOf('l'));
		// ���ڿ����� �˻��� ���� ���� �� ���� ������ ������ �ε����� lastindexOf()

		idx = msg.indexOf('l');
		System.out.println(idx);
		idx = msg.indexOf('l', idx + 1);
		System.out.println(idx);
		idx = msg.indexOf('l', idx + 1);
		System.out.println(idx);

	}

	public void me6() {
		String msg = "hello";
		// ���ڿ��� Ư�� �ε����� �ִ� ���ڸ� �˰� ������
		System.out.println(msg.charAt(msg.length() - 1));

		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}

	public void me5() {
		String str = "hello";
		System.out.println(str.length());
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.remove(1);

		// list.size();

	}

	public void me4() {
		StringBuffer sb = new StringBuffer();
		// String Ŭ������ �Һ��� ����
		String msg = "hello";
		msg = "good";
		// ���ڿ��� ����ؼ� ���� �Ǵ°��,
		// StringŬ������ ����ϸ�
		// �������ϰ� �߻��Ѵ�.
		// StringBuffer�� ����ϼ���
//		msg ="";
//		msg += "�ȳ��ϼ���";
//		msg +="���� ȫ�浿�Դϴ�.";
//		msg +="���� ���� ������� �ô뿡 ����ֽ��ϴ�.";

		sb.append("�ȳ��ϼ���");
		sb.append("���� ȫ�浿 �Դϴ�");
		sb.append("���� ���� ������� �ô뿡 ����ֽ��ϴ�");
		msg = sb.toString();
	}

	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";

		System.out.println(msg1 == msg2);
		System.out.println(msg1 == msg3);
		System.out.println(msg3 == msg4);
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg4));

		// String Ŭ������ ��ü ���� �ΰ��� ���
		// 1.����� ��ü ������
		// 2.�Ͻ��� ��ü ������
		// �� �� ����� �޸� ���鿡�� ��� �ٸ����� �н�
		// �� �����Ͱ� ���� ���, ���� ��ü�� �ν��ϰ� �ϴ� ���
		// �� �����ڷ��������� == �Ⱦ� equals() ���
		// ���ϼ��� vs ��� ��
		// == vs equals( )
	}

	public void me2() {
		// �Ͻ��� ��ü ������
		String msg2 = "hello";
	}

	public void me1() {
		// ����� ��ü ������
		String msg = new String("hello");

	}

}
