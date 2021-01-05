package kr.co.ezen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Test {
	
	
	public List<DTO2> me8() {
		List<DTO2> list = new ArrayList<DTO2>();
		list.add(new DTO2("a001", "대구", "사과1", 1500));
		list.add(new DTO2("a002", "대전", "사과2", 2000));
		list.add(new DTO2("a005", "청송", "사과5", 1000));
		list.add(new DTO2("a003", "서울", "사과3", 3000));
		list.add(new DTO2("a004", "부산", "사과4", 2500));
		System.out.println("#############################");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("###########################");
		
		list.remove(3);
		list.remove(2);
		list.clear();
		return list;
		
	}
	public List<DTO> me7() {
		List<DTO> list = new ArrayList<DTO>();
		list.add(new DTO("m001", "kim", 5));
		list.add(new DTO("m002", "lee", 11));
		list.add(new DTO("m002", "park", 53));
		list.add(new DTO("m004", "kang", 55));
		list.add(new DTO("m005", "choi", 11));
		return list;
		
		
		
	}

	
	public void me6() {
		//list 객체를 만드시오. 단,map<String,Objrct>를 담을 수 있음.
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(new HashMap<String, Object>());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		list.clear();
	}
	
	public void me5() {
		//list 객체를 마드시오. 단, thread를 담을수 있습니다.
		List<Thread> list = new ArrayList<Thread>();
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}));
		for (int i = 0; i < list.size(); i++) {
			Thread a = list.get(i);
			System.out.println(a);
		}
	}
	
	public void me4() {
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		for (int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println(list);
	}
	
	
	public void me3() {
		List<Double> list = new ArrayList<Double>();
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);
		for (int i = 0; i < list.size(); i++) {
			Double d = list.get(i);
			System.out.println(d);
		}
		list.set(list.size()-1, 1.1);
		for (int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
			System.out.println(list);
		}
	}
	
	public void me2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		
		for (int i = 0; i < list.size(); i++) {
			Integer a = list.get(i);
			System.out.println(a);
		}
		list.set(1, 100);
		System.out.println(list);
		list.remove(2);
		list.remove(1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	
		}
		
	
	
	public void me1() { 
		List<Apple> list = new ArrayList<Apple>();
		//자료형이 Apple인 객체만 넣을수 있음
		list.add(new Apple());
		Apple a = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			Apple b =list.get(i);
			System.out.println(b);
		}
		
	}

}
