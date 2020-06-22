package s0622;

public class LoopTest {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for(int i=1;i<=1000;i++) {
			if(i%2==0) {
				num1 += i;
			}else {
	            num2 += i;
			}
     }  System.out.println("짝수의값 : "+ num1);
        System.out.println("홀수의값 : "+ num2);
        System.out.println("전체의합 : "+ (num1+num2));
	}
}