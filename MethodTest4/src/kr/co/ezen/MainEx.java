package kr.co.ezen;

import com.naver.CarRegistManagementService;
import com.naver.CatService;
import com.naver.DogRegistManagementService;

public class MainEx {
	public static void main(String[] args) {
		CarRegistManagementService crms = new CarRegistManagementService();
		crms.setCarNme("k7");
		
		String carName = crms.getCarName();
		System.out.println(carName);
		CarRegistManagementService crms2 = new CarRegistManagementService();
		long result = crms2.add(210000000, 500000000);
		System.out.println(result);
		
	
	DogRegistManagementService drms = new DogRegistManagementService();
	Dog d1 = drms.makeDog("¥Û¥Û¿Ã",5);
	System.out.println(d1.getName()+d1.getAge());
	Cat c = new Cat();
	String a = c.getName();
	int b = c.getAge();
	System.out.println(a+b);
	CatService cs = new CatService();
	Cat cute = cs.makeCat("∞ÌæÁ¿Ã", 3);
	System.out.println(cute.getAge()+cute.getName());
	}
	

		
	
}	

