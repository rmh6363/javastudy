package kr.com.ezen;

public class MethodTest {

	// public, protected, ����Ʈ, private(��������� ������)

	int a;
	boolean b = true;

	public MethodTest() {

	}

	public void stand() {
		System.out.println("����ȯ ���Ķ�");
	}

	public void sleep() {
		System.out.println("public: ���������ڷ� ������Ʈ ��ü����  sleep�޼��尡 ȣ��� �� ������ �ǹ���");
		System.out.println("void: ��ȯ���̶� �ϰ�, �̴� ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�.void�� ��ȯ�Ǵ� �����Ͱ� ���ٴ� ���� �ǹ��Ѵ�.");
		System.out.println("sleep: �޼����� �̸��̰�, ���߿� �޼��带 ȣ���� �� �� �̸��� ���� ������ �� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ� ��.");
		System.out.println("():�Ķ����, �Ű����� ��ġ ������ �����ϵ� �ۼ��ϸ� ��. �Ķ���Ͱ� �� �� �̻��� ���� ,�� �����ڷ� �ؼ� ������ ����.");
		System.out.println("{}: �޼����� ����.. �޼��� ȣ�� �� �����ϰ� ���� �ڵ带 �ۼ�����.");
		System.out.println("�޼��� ȣ��: �޼��带 ����ϴ� ���� �ǹ� ������ �޼��� ���� ���� �Ұ�ȣ�� Ĩ�ϴ�. �׸��� �� �Ұ�ȣ �ȿ� �Ķ������ �ڷ����� �´� ���� �־��ݴϴ�.");
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public void sitDown() {
		System.out.println("�� �ڸ��� ��� ����");
		sayHello();
	}

	public void callName(String c) {
		System.out.println("�ȳ��ϼ���," + c);

	}

	public void printDan(int d) {
		System.out.println(d * 1);
		System.out.println(d * 2);
		System.out.println(d * 3);
		System.out.println(d * 4);
		System.out.println(d * 5);
		System.out.println(d * 6);
		System.out.println(d * 7);
		System.out.println(d * 8);
		System.out.println(d * 9);

	}

	public void printScore(String name, int score) {
		System.out.println(name + " " + score + "��");

	}

	public void menu(String cook) {
		System.out.println(cook);

	}

	public void score(String name, String s) {
		System.out.println(name + s);

	}

	public void test(String a, char b) {
		System.out.println(a + b);
	}

	public void testsub(String a, boolean b) {
		System.out.println(a + b);
	}

	public void music(String a, String b) {
		System.out.println(a + b);

	}

	public void error(String a) {
		System.out.println(a);
	}

	public void pizza(String a) {
		System.out.println(a);
	}

	public void chiken(String b, int a) {
		System.out.println(b + a + "��");

	}

	public void score2() {
		System.out.println("asdf");
	}
}
