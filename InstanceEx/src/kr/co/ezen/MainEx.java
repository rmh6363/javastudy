package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import javax.swing.Spring;
import javax.swing.SpringLayout;

import com.nate.Team;
import com.naver.Car;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		Car car1 = new Car("k7", "����34��1234", 4000);
		// car1.showMePrice();
		Car car2 = new Car("bmw", "����33��9876", 5000);
		Car car3 = new Car("sm5", "���31��1234", 4000);

		Dog dog1 = new Dog(1, "happy", new Date(11));
		Dog dog2 = new Dog(2, "merry", new Date());
		Dog dog3 = new Dog(3, "�鱸", new Date(Calendar.getInstance().getTimeInMillis()));

		Person captain = new Person("p1", "a������", dog1, car1);
		Person member1 = new Person("p2", "������", dog2, car2);
		Person member2 = new Person("p3", "�̼���", dog3, car3);
		Person captain2 = new Person("p4", "b������", new Dog(1, "sun", new Date()), new Car("k5", "4", 3000));
		Person member3 = new Person("p5", "ö��", new Dog(1, "hard", new Date()), new Car("k6", "6", 4000));
		Person member4 = new Person("p6", "���ȣ", new Dog(1, "soft", new Date()), new Car("spark", "8", 1000));

		Team aTeam = new Team(captain, member1, member2);
		Team bTeam = new Team(captain2, member3, member4);

		aTeam.fight(bTeam);
		bTeam.fightMem1(aTeam);
		aTeam.fightmem2Dog(bTeam);
		aTeam.racingCap(bTeam);
		bTeam.racingMem2(aTeam);
		System.out.println(dog3);
		
		

	}

}
