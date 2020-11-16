package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
		
		int idx = filename.lastIndexOf(".");
		String key = filename.substring(idx+1);//+1은 .을 제외하기 위해서
		String msg = map.get(key.toLowerCase());
		//key.toLowerCase(): map의 key가 모두 소문자로 되어 있어서.
		if(msg == null) {//map에 없는 key를 입력하면 value로 null을 반환함
			System.out.println("시스템파일");
		}else {
			System.out.println(msg);
		}
	
		}
		
			
		
		
				
	
	
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "누렁이", "진도인", 3));
		list1.add(new Dog("d002", "백구", "진도인2", 4));
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "독일인1", 3));
		list2.add(new Dog("d004", "타크", "독일인", 2));
		map.put("진돗개", list1);
		map.put("세퍼드", list2);
		List<Dog> a = map.get("진돗개");
		List<Dog> b =map.get("세퍼드");
		System.out.println(a);
		System.out.println(b);
		System.out.println(map.get("진돗개").get(0));
		
		
	}
	
	public void me3() {
		//1. map 객체 생성
		// 단 k : String v : List<String>
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exel");
		list1.add("genesis");
		list1.add("grandue");
		List<String> list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("지프");
		
		map.put("현대차", list1);
		map.put("기아차", list2);
		System.out.println(map);
		String a;
		for (int i = 0; i < map.get("현대차").size(); i++) {
			a = map.get("현대차").get(i);
			System.out.println(a);
		}
		
		
		
	}
	
	public void me2() {
		// 1. map 객체를 만듬
		// 2. key : integer v : String
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "kang");//기존 kim -> kang
		String a =map.get(1);
		System.out.println(a);
		a =map.get(2);
		System.out.println(a);
		a =map.get(0);
		System.out.println(a);
		System.out.println(map);
		
		
	}
	
	public void me1() {
		//1.map,hashmap
		//2.map 객체를 만드세요.
		//단key:String, value : integer
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//map에 데이터 입력
		map.put("중력가속도", 9);
		map.put("우리집 비밀번호", 12345);
		map.put("서울과 부산간의거리", 300);
		Integer a = map.get("중력가속도");
		System.out.println(a);
		int b = map.get("우리집 비밀번호");
		System.out.println(b);
		int c = map.get("서울과 부산간의거리");
		System.out.println(c);
		System.out.println(map);
		
	}

}
