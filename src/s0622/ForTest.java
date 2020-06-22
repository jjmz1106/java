package s0622;

public class ForTest {
	
	public static void main(String[] args) {
		String[] strs = {"any","test","mu"};
//		for(int i=0;i<strs.length;i++) {
			for(String str:strs) {
//			String str = strs[i];
			System.out.println(str);
		}
	}

}
