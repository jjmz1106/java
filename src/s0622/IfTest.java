package s0622;

public class IfTest {
		
	
	public static void main(String[] args) {
		
		for(int i=0;i<10000;i++) {
		double d = Math.random();
		int num = (int)(d*20) + 1; //20의 숫자중 임의의 숫자 선택
		if(num < 1 || num > 20) {
			System.out.println("검증"); //결과값 없음
		}
		
		}
			
		
		
//		int num1 = 1;
//		int num2 = 10;
//		int num3 = 20;
//		
//		if(num1>1 || num2<20 || num3 ==21) { //||<or 한가지라도 참이라면 true
//			System.out.println("맞아");	
//		if(num1>1 && num2<20 && num3 ==21) { //&&<and 한가지라도 다르면 false
//			System.out.println("아니야");
//		}
//			
//		}	
	}

}
