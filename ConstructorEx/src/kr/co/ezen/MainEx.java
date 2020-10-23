package kr.co.ezen;

public class MainEx {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		Test1 t2 = new Test1();
		
		Test1 t3 = new Test1(34L);
		
		Test1 t4 = new Test1(3,4);
		
		Person kim0 = new Person();
		
		kim0.setSsn("s01");
		kim0.setName("kim");
		kim0.setAdress("seoul");
		kim0.setBirth(33);
		
		System.out.println(kim0.getAdress());
		System.out.println(kim0.getBirth());
		System.out.println(kim0.getName());
		System.out.println(kim0.getSsn());
		System.out.println(kim0.getDog());
		System.out.println(kim0.getCar());
		
		Person kim1 = new Person("a", "kim", 44, "서울", 
				"job",new Dog("123", 3, "happy", 2632),new Car("소나타"));
		Car c1 = new Car();
		System.out.println("#########");
		
		String c2 = c1.getName();
		System.out.println(c2);
		System.out.println(kim1.getSsn());
		System.out.println(kim1.getName());
		System.out.println(kim1.getBirth());
		System.out.println(kim1.getAdress());
		System.out.println(kim1.getJob());
		System.out.println(kim1.getDog());
		System.out.println(kim1.getCar());
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		Dog happy = new Dog("1122", 3, "happy", 2632);
		System.out.println(happy.getAge());
		System.out.println(happy.getBirth());
		System.out.println(happy.getName());
		System.out.println(happy.getTel());
		System.out.println(1!=2);
		System.out.println(2>=2);
		Stone s1 = new Stone("화강암","서울", "big");
		System.out.println(s1.getLocate());
		System.out.println(s1.getName());
		System.out.println(s1.getSize());
		
		Stone s2 = new Stone();
		s2.setLocate("seoul");
		s2.setName("화강암");
		s2.setSize("big");
		System.out.println(s2.getLocate());
		System.out.println(s2.getName());
		System.out.println(s2.getSize());
		

	}

}
