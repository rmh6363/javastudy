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
