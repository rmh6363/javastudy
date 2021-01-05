package kr.co.ezen;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.me7().get(1).getName());
		
		for (int i = 0; i < t1.me7().size(); i++) {
			String name = t1.me7().get(i).getName();
			System.out.println(name);
		}
		for (int i = 0; i < t1.me8().size(); i++) {
			if(i != 0) {
				System.out.println(t1.me8().get(i).getAddr()+
						" : "+t1.me8().get(i).getName());
				
			}
			
		}
		
	}

}
