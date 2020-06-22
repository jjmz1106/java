package s0619.sub;

public class SubTest {
	
	public int num1; //public 접근 제한이 없음 *
	protected int num2; //protected 같은 패키지에 존재하거나 파생클래스 에서만 접근 가능 
	int num3; //default 아무런 접근 제한자를 명시하지 않으면 default 값이 적용, 동일한 패키지 내에서만 접근 가능
	private int num4; //private 같은 클래스 내에서 접근 가능 *
	

}
