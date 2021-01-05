package kr.co.ezen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 =new Test();
		t1.me3();
		t1.me5();
		t1.me6();
		t1.me7("hello world");
		t1.me8();
		t1.me9();
		t1.me10();
		t1.me11();
		t1.me12();
		t1.me13();
		t1.me14(16);
		t1.me15();
		t1.me16();
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1,10);
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		}

}
