package kr.co.ezen;

public class Person {
	private String ssn;
	private String name;
	private int birth;
	private String adress;
	private String job;
	private Dog dog;
	private Car car;
	
	public Person() {
		
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Person(String ssn, String name, int birth, String adress, String job, Dog dog, Car car) {
		this.ssn = ssn;
		this.name = name;
		this.birth = birth;
		this.adress = adress;
		this.job = job;
		this.dog = dog;
		this.car = car;
	}
	
	

}
