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
		Car car1 = new Car("k7", "서울34자1234", 4000);
		// car1.showMePrice();
		Car car2 = new Car("bmw", "서울33사9876", 5000);
		Car car3 = new Car("sm5", "경기31자1234", 4000);

		Dog dog1 = new Dog(1, "happy", new Date(11));
		Dog dog2 = new Dog(2, "merry", new Date());
		Dog dog3 = new Dog(3, "백구", new Date(Calendar.getInstance().getTimeInMillis()));

		Person captain = new Person("p1", "a팀주장", dog1, car1);
		Person member1 = new Person("p2", "김유신", dog2, car2);
		Person member2 = new Person("p3", "이순신", dog3, car3);
		Person captain2 = new Person("p4", "b팀주장", new Dog(1, "sun", new Date()), new Car("k5", "4", 3000));
		Person member3 = new Person("p5", "철수", new Dog(1, "hard", new Date()), new Car("k6", "6", 4000));
		Person member4 = new Person("p6", "노민호", new Dog(1, "soft", new Date()), new Car("spark", "8", 1000));

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
