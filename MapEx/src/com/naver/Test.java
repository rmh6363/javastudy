package com.naver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif", "�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");

		int idx = filename.lastIndexOf(".");
		String key = filename.substring(idx + 1);// +1�� .�� �����ϱ� ���ؼ�
		String msg = map.get(key.toLowerCase());
		// key.toLowerCase(): map�� key�� ��� �ҹ��ڷ� �Ǿ� �־.
		if (msg == null) {// map�� ���� key�� �Է��ϸ� value�� null�� ��ȯ��
			System.out.println("�ý�������");
		} else {
			System.out.println(msg);
		}
		map.replace("txt", "�ؽ�Ʈ����");
		System.out.println(map);

	}

	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "������", "������", 3));
		list1.add(new Dog("d002", "�鱸", "������2", 4));
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "������1", 3));
		list2.add(new Dog("d004", "Ÿũ", "������", 2));
		map.put("������", list1);
		map.put("���۵�", list2);
		List<Dog> a = map.get("������");
		List<Dog> b = map.get("���۵�");
		System.out.println(a);
		System.out.println(b);
		System.out.println(map.get("������").get(0));

	}

	public void me3() {
		// 1. map ��ü ����
		// �� k : String v : List<String>
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
		list2.add("����");

		map.put("������", list1);
		map.put("�����", list2);
		System.out.println(map);
		String a;
		for (int i = 0; i < map.get("������").size(); i++) {
			a = map.get("������").get(i);
			System.out.println(a);
		}
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			List<String> val = map.get(key);
			System.out.println(key + " : " + val);

		}

	}

	public void me2() {
		// 1. map ��ü�� ����
		// 2. key : integer v : String
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "kang");// ���� kim -> kang
		String a = map.get(1);
		System.out.println(a);
		a = map.get(2);
		System.out.println(a);
		a = map.get(0);
		System.out.println(a);
		System.out.println(map);
		map.replace(1, "kim");
		System.out.println(map);
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			String val = map.get(key);
			System.out.println(key + " : " + val);

		}

	}

	public void me1() {
		// 1.map,hashmap
		// 2.map ��ü�� ���弼��.
		// ��key:String, value : integer
		Map<String, Integer> map = new HashMap<String, Integer>();

		// map�� ������ �Է�
		map.put("�߷°��ӵ�", 9);
		map.put("�츮�� ��й�ȣ", 12345);
		map.put("����� �λ갣�ǰŸ�", 300);
		Integer a = map.get("�߷°��ӵ�");
		System.out.println(a);
		int b = map.get("�츮�� ��й�ȣ");
		System.out.println(b);
		int c = map.get("����� �λ갣�ǰŸ�");
		System.out.println(c);
		System.out.println(map);
		map.replace("����� �λ갣�ǰŸ�", 280);
		System.out.println(map);
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int val = map.get(key);

			System.out.println(key + " : " + val);

		}
		Collection<Integer> val = map.values();
		Iterator<Integer> it2 = val.iterator();
		while (it2.hasNext()) {
			Integer val2 = it2.next();
			System.out.println(val2);

		}

	}

}