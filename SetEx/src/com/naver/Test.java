package com.naver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	public void me4() {
		// �ߺ��� ������� ����/�Է°� ��»��̿� ������谡 ����
		// ���ϼ� �Ϲ��ڷ��� / ��� �����ڷ���
		// iterator():iterator �������̽� �ڷ������� ������ ��ȯ while���� �̿��ؼ�
		// set�����͸� ȹ��
		Set<DTO> set = new HashSet<DTO>();
		set.add(new DTO("m001", "kim", 4));
		set.add(new DTO("m002", "lee", 11));
		set.add(new DTO("m005", "park", 32));
		set.remove(new DTO("m001", null, 0));
		int size = set.size();
		System.out.println(size);
		// 1. �迭 arr�� set�� ���� �ִ� �����͸� �����ϰ�
		// 2. �� �� id�� m005�� memberdto ��ü�� �̿��ؼ�
		// 3. �� ��ü�� age ���� ����Ͻÿ�.

		Iterator<DTO> it = set.iterator();
		List<DTO> list = new ArrayList<DTO>();

		while (it.hasNext()) {
			DTO dto = it.next();
			list.add(dto);

		}
		int idx = list.indexOf(new DTO("m005", null, 0));
		System.out.println(list.get(idx).getAge());

		set.remove(new DTO("m001", null, 0));
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}

	public void me3() {
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("a001", "�뱸", "���1", 1500));
		set.add(new Apple("a002", "����", "���2", 2000));
		set.add(new Apple("a003", "����", "���3", 3000));
//		set.add(new Apple("a002", "�λ�", "���4", 500));
		set.add(new Apple("a005", "û��", "���5", 1000));
		int size = set.size();
		System.out.println(size);
		Iterator<Apple> it = set.iterator();
		List<Apple> list = new ArrayList<Apple>();
		while (it.hasNext()) {
			Apple apple = it.next();
			System.out.println(apple);
			list.add(apple);

		}
		int idx = list.indexOf(new Apple("a003", null, null, 0));
		Apple id = list.get(idx);
		System.out.println(id);
		set.remove(new Apple("a002", null, null, 0));
		System.out.println(set);

	}

	public void me2() {
		Set<String> set = new HashSet<String>();

		set.add("hello");
		// set.add(new String("hello"));
		set.add("Hello");
		// set.add(new String("Hello"));
		set.add("HELLO");
		// set.add(new String("HELLO"));
		List<String> list = new ArrayList<String>();

		int size = set.size();
		System.out.println(size);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = it.next();
			System.out.println(string);
			list.add(string);

		}
		int idx = list.indexOf("HELLO");
		System.out.println(list.get(idx));

		set.remove(new String("Hello"));
		System.out.println(set);

	}

	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);

		List<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer);
			list.add(integer);

		}

		int idx = list.indexOf(3);
		int num = list.get(idx);
		System.out.println(num);

		set.remove(new Integer(2));
		int size = set.size();
		System.out.println(size);

		System.out.println(set);

	}

}
