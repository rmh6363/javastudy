package kr.co.ezen;

import com.naver.Inter1;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;
import com.naver.Test6;

public class MainEx {

	public static void main(String[] args) {
		Test2.MemberClass mc1 = new Test2().new MemberClass();
		mc1.mc1();
		Test3.StatiInnerClass sc = new Test3.StatiInnerClass();
		sc.name1();
		Test5 t5 = new Test5();
		t5.ano.me1();
		Test6 t6 =new Test6();
		System.out.println(t6);
				

	}

}
