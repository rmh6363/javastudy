package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		WhlieFor wf = new WhlieFor();
		wf.While(6);

	}
}
//생성자
//디폴트 생성자 : 파라미터가 없음
//사용자 생성자 : 파라미터가 있디.
//THIS 해당 클래스의 생성자 호출
//클래스: 설계도의 으ㅡ미.....class 라는 키워드가 있어야 클래스
//클래스는 단독으로 실행된다x...객체를 만들어서 진행
//클래스의 구성 요소 : 멤버변수/상수, 생성사, 메서드
//객체의 생성법을 표편하는 자료 : 생성자
//객체의 기능을 표현하는 자료 : 메서드
//++----------
//type변수명 =조건식?참일떄;거젓일
//type 변수명 = 조건식1? 참일떄의값; 조건식2? 참일때의값; 
//if문(상황에 따라 실행코드를 달리 하고 싶을때, ~면 ~라면 ~이면)
//단순 if : ~면 ~해라
//if~else : ~면 ~해라 ,그렇지 않으면 ~해라
//다중 if문 : ~면 `해라, 그렇지 않고 ~면 ~해라 , 그렇지 않고~면 ~해라, 그렇지않으면 ~해라
//switch ~case : ==연산
