package com.naver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public void me4() {
		Set<DTO> set = new HashSet<DTO>();
		set.add(new DTO("m001", "kim", 4));
		set.add(new DTO("m002", "lee", 11));
		set.add(new DTO("m005", "park", 32));
		Iterator<DTO> itr = set.iterator();
		DTO dto= itr.next();
		dto.setId("m002");
		System.out.println(dto.getId());
		}

	

	public void me3() {
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("a001", "대구", "사과1", 1500));
		set.add(new Apple("a002", "대전", "사과2", 2000));
		set.add(new Apple("a003", "서울", "사과3", 3000));
		set.add(new Apple("a004", "부산", "사과4", 500));
		set.add(new Apple("a005", "청송", "사과5", 1000));

	}

	public void me2() {
		Set<String> set = new HashSet<String>();

		set.add("hello");
		set.add(new String("hello"));
		set.add("Hello");
		set.add(new String("Hello"));
		set.add("HELLO");
		set.add(new String("HELLO"));

	}

	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);

	}

}
