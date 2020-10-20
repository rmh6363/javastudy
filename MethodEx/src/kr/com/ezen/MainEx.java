package kr.com.ezen;

public class MainEx {
	public static void main(String[] args) {

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
		mt2.printScore("È«±æµ¿", 100);
		mt2.printScore("±èÀ¯½Å", 55);
		mt2.menu("±è¹ä");
		mt2.menu("¶ó¸é");
		mt2.menu("È¸");
		mt2.score("³ë¹ÎÈ£", "A");
		mt2.score("±èÀ±½Å", "B");
		mt2.score("È«±æµ¿", "C");
		mt2.test("aa", 'b');
		mt3.testsub("³ë¹ÎÈ£", true);
		mt3.testsub("Á¶ÀçÁØ", false);
		mt3.testsub("È«±æµ¿", true);
		mt3.music("Àú½ºµğ½º", "gone");
		mt3.error("error");
		mt3.pizza("hot sauce");
		mt3.pizza("cheese");
		mt3.chiken("ÈÄ¶óÀÌµåÄ¡Å²", 20000);
		mt3.chiken("¾ç³äÄ¡Å²", 22000);
		mt3.chiken("½º³ëÀ®Ä¡Å²", 26000);
		System.out.println("##############");
		
		if (false) {
			System.out.println("result : true");
		} else if(false){
			System.out.println("result : false");
		} else if(false){
			System.out.println("result : false ");
		} else {
			System.out.println("result :ture");
		
		}
}
}
