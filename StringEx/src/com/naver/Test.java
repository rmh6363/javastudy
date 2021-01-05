package com.naver;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {

	public void me16() {
		String i = "    싯가%d 원     ";

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
		// 문자열과 숫자를 + 연산을 사용하지 않고 표현하는 방법
		String msg = "홍길동은" + age + "살 입니다.";
		System.out.println(msg);

		String msg2 = "홍길동은 %d 살입니다.";
		System.out.println(String.format(msg2, 16));

		// 2020년 3월20일
		// 2020년11월 5일
		int month = 3;
		String msg3 = "오늘은 2020년%2d월20일입니다.";
		System.out.println(String.format(msg3, month));
		int date = 5;
		String msg4 = "오늘은 2020년11월%-2d일입니다.";
		System.out.println(String.format(msg4, date));
		int money = 1000;
		String msg5 = "내 전재산은 %d 원입니다.";
		System.out.println(String.format(msg5, money));
		String msg6 = "내 전재산은 %,d 원입니다.";
		System.out.println(String.format(msg6, money));

		String msg7 = "내 전재산은 %,15d 원입니다";
		System.out.println(String.format(msg7, money));

		// 자리수를 지정해주고, 이를 다 못 채웠을 때 앞의 공백을 0으로 채우기
		// 자릿수 : 5, 숫자는 11이면 -> 00011
		String msg8 = "내 등번호는 %2d입니다.";
		System.out.println(String.format(msg8, 7));
		String msg9 = "내 등번호는 %02d입니다.";
		System.out.println(String.format(msg9, 7));
		// String.format()
		// 1:format 문자열,2:값 3.%d : 정수, %s : 문자열, %f : 실수형
		// 자릿수 지정 : %3d
		// ,를 표현하고 싶을 때 : %,5d
		// 좌우정렬 : %,-5d(-좌측정렬)
		// 자릿수 지정 후에 빈 공간을 0으로 채우고 싶으면 : %,05d

		String msg10 = "%d+%d = %d 입니다";
		System.out.println(String.format(msg10, 3, 4, 5, 6, 7));

		String msg11 = "%3.2f%%입니다.";
		System.out.println(String.format(msg11, 51.6));
	}

	public void me13() {
		// 특정 기준 문자(delim)를 이용하여 서로 다른 의미를
		// 갖고 있는 문자열(=token, 토큰)을 분할하기
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
		String str3 = "동해물과#백두산이#마르고#닳도록";
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
		String kbo = "두산#kt#sk#nc#한화";
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

		String aa = "안녕하세요";
		System.out.println(aa.substring(2, 5));

	}

	public void me12() {
//		+연산자는 문자열에도적용된다.
//		-연산자는 문자열에 적용되지 않는다
//		"hello world"에서
//		"hello"를 잘라내고 "world"만 남게하고 싶다면? substring()                    
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
		// 좌우 공백을 제거하고싶을떄
		String msg = "     he   llo        ";
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);
	}

	public void me10() {
		// 문자열끼리 데이터 값이 같은지 여부를 확인하고 싶을 때, equals()/equalsIgnoreCase
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
		// 문자열이 특정 문자열로 시작한지 알고 싶을 때,
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
		// 특정 문자 또는 문자열의 시작 문자의 인덱스를 반환 메서드 indexOf()
		// 단, 해당 문자 또는 문자열이 없으면 -1 반환...
		int idx = msg.indexOf('z');
		System.out.println(result);
		System.out.println(idx);
		System.out.println(msg.lastIndexOf('l'));
		// 문자열에서 검색된 동일 문자 중 가장 마지막 문자의 인덱스는 lastindexOf()

		idx = msg.indexOf('l');
		System.out.println(idx);
		idx = msg.indexOf('l', idx + 1);
		System.out.println(idx);
		idx = msg.indexOf('l', idx + 1);
		System.out.println(idx);

	}

	public void me6() {
		String msg = "hello";
		// 문자열의 특정 인덱스에 있는 문자를 알고 싶을때
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
		// String 클래스는 불변적 성격
		String msg = "hello";
		msg = "good";
		// 문자열이 계속해서 누적 되는경우,
		// String클래스를 사용하면
		// 성능저하가 발생한다.
		// StringBuffer를 사용하세요
//		msg ="";
//		msg += "안녕하세요";
//		msg +="저는 홍길동입니다.";
//		msg +="저는 조선 세종대왕 시대에 살고있습니다.";

		sb.append("안녕하세요");
		sb.append("저는 홍길동 입니다");
		sb.append("저는 조선 세종대왕 시대에 살고있습니다");
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

		// String 클래스의 객체 생성 두가지 방법
		// 1.명시적 객체 생성법
		// 2.암시적 객체 생성법
		// ㅁ 두 방법이 메모리 측면에서 어떻게 다른지도 학습
		// ㅁ 데이터가 같을 경우, 같은 객체로 인식하게 하는 방법
		// ㅁ 참조자료형에서는 == 안씀 equals() 사용
		// 동일성비교 vs 동등성 비교
		// == vs equals( )
	}

	public void me2() {
		// 암시적 개체 생성법
		String msg2 = "hello";
	}

	public void me1() {
		// 명시적 객체 생성법
		String msg = new String("hello");

	}

}
