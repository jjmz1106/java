package s0618;

public class Son extends Father{
	Son(){
		System.out.println("난 나중이지!");
	}
	
	int money = 100000000;
	
	public static void main(String[] args) {
		new Son();


//		Son s = new Son();
//		s.name = "손흥민"; //Father클래스껄 사용(허용할때)
//		System.out.println(s.name + "이 가진 돈은 "+
//		s.money + "원 입니다.");
		
//		Father f = new Son(); 
//		Son s2 = (Son)f; 
//		System.out.println("아빠가 가진돈은" + s2.money);
		
	}

}

/*
 * 자료형 변수;
 * 정수 실수 문자 문자열 논리형
 * 정해져 있는것 : 원시형
 * 정해져 있지 않은것 : 레퍼런스형
 * 클래스
 * 메소드
 * 데이터타입을 리턴 하는것과
 * 리턴하지 않는것(void)
 * 오버로딩
 * 생성자 -클래스명과 대소문자가 같아야 한다
 * 상속
 * extends
 */
