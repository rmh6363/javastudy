package kr.com.ezen;


import com.google.GetMoney;
import com.naver.MethodTest2;
import com.naver.MethodTest3;

public class MainEx {
	public static <getTest2> void main(String[] args) {

		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		MethodTest mt3 = new MethodTest();

		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		mt3.sayHello();

		mt2.sitDown();
		mt2.callName("kim");
		mt2.callName("lee");
		mt2.printDan(5);
		mt2.printScore("ȫ�浿", 100);
		mt2.printScore("������", 55);
		mt2.menu("���");
		mt2.menu("���");
		mt2.menu("ȸ");
		mt2.score("���ȣ", "A");
		mt2.score("������", "B");
		mt2.score("ȫ�浿", "C");
		mt2.test("aa", 'b');
		mt3.testsub("���ȣ", true);
		mt3.testsub("������", false);
		mt3.testsub("ȫ�浿", true);
		mt3.music("������", "gone");
		mt3.error("error");
		mt3.pizza("hot sauce");
		mt3.pizza("cheese");
		mt3.chiken("�Ķ��̵�ġŲ", 20000);
		mt3.chiken("���ġŲ", 22000);
		mt3.chiken("������ġŲ", 26000);
		System.out.println("##############");
		mt3.score2();
		Test12 tcb = new Test12();
		tcb.sayHello();
		tcb.printScore("ȫ�浿", 100);
		Test13 dan = new Test13();
		dan.printDan(5);

		MethodTest2 mt5 = new MethodTest2();
		int re1 = mt5.giveMeTheMoney();

		MethodTest2 mt6 = new MethodTest2();
		int re2 = mt6.giveMeTheMoney();

		int re3 = mt5.giveMeTheMoney();

		re2 = mt6.giveMeTheMoney();

		MethodTest3 gt12 = new MethodTest3();
		Test12 re4 = gt12.getTest12();

		


		GetMoney gm = new GetMoney();

		char ���ȣ3 = gm.b();
		System.out.println(���ȣ3);

		byte ���ȣ4 = gm.c();
		System.out.println(���ȣ4);

		int ���ȣ5 = gm.d();
		System.out.println(���ȣ5);

		long ���ȣ6 = gm.e();
		System.out.println(���ȣ6);

		short ���ȣ7 = gm.f();
		System.out.println(���ȣ7);

		float ���ȣ8 = gm.g();
		System.out.println(���ȣ8);

		double ���ȣ9 = gm.h();
		System.out.println(���ȣ9);
		

		
		
		


	}
}
