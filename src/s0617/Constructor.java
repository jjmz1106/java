package s0617;

public class Constructor {
	
	int a;
	Constructor(){ //생성자는 데이터 타입이 없다 , 클래스 열과 대소문자까지 같다
		System.out.println("나 쉬운 클래스 아니다!");
	}
	
	public static void main(String[] arsg) {
		Constructor c;
		System.out.println("c에 메모리 생성해서 대입하자!");
		c = new Constructor();
		System.out.println("c에 메모리 생성해서 대입했다!");
	}

}
