package s0619.sub;

import s0619.sub.SubTest;

public class AccessTest extends SubTest{
	
	public void test() {
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public static void main(String[] args) {
		SubTest st = new SubTest();
		st.num1 = 10;  //패키지가 다르면 public를 제외 사용x
		st.num2 = 10;
		st.num3 = 11;
		
	}
	
}
