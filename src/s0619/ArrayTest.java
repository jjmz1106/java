package s0619;

public class ArrayTest {
	String[] strs;
	
	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();

		at.strs = new String[3];		
		at.strs[0] = "12";		
		System.out.println(at.strs[0]);
		at.strs = new String[4];
		System.out.println(at.strs[0]);
		
		
	}

}
