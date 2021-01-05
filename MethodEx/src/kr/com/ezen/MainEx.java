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
		mt2.printScore("»´±Êµø", 100);
		mt2.printScore("±Ë¿ØΩ≈", 55);
		mt2.menu("±Ëπ‰");
		mt2.menu("∂Û∏È");
		mt2.menu("»∏");
		mt2.score("≥ÎπŒ»£", "A");
		mt2.score("±Ë¿±Ω≈", "B");
		mt2.score("»´±Êµø", "C");
		mt2.test("aa", 'b');
		mt3.testsub("≥ÎπŒ»£", true);
		mt3.testsub("¡∂¿Á¡ÿ", false);
		mt3.testsub("»´±Êµø", true);
		mt3.music("¿˙Ω∫µΩ∫", "gone");
		mt3.error("error");
		mt3.pizza("hot sauce");
		mt3.pizza("cheese");
		mt3.chiken("»ƒ∂Û¿ÃµÂƒ°≈≤", 20000);
		mt3.chiken("æÁ≥‰ƒ°≈≤", 22000);
		mt3.chiken("Ω∫≥Î¿Æƒ°≈≤", 26000);
		System.out.println("##############");
		mt3.score2();
		Test12 tcb = new Test12();
		tcb.sayHello();
		tcb.printScore("»´±Êµø", 100);
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

		char ≥ÎπŒ»£3 = gm.b();
		System.out.println(≥ÎπŒ»£3);

		byte ≥ÎπŒ»£4 = gm.c();
		System.out.println(≥ÎπŒ»£4);

		int ≥ÎπŒ»£5 = gm.d();
		System.out.println(≥ÎπŒ»£5);

		long ≥ÎπŒ»£6 = gm.e();
		System.out.println(≥ÎπŒ»£6);

		short ≥ÎπŒ»£7 = gm.f();
		System.out.println(≥ÎπŒ»£7);

		float ≥ÎπŒ»£8 = gm.g();
		System.out.println(≥ÎπŒ»£8);

		double ≥ÎπŒ»£9 = gm.h();
		System.out.println(≥ÎπŒ»£9);
		

		
		
		


	}
}
