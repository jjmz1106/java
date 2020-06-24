package s0624;

public class StringArray3 {
	
	public static void main(String[] args) {
		String str = "1,234,25,5,36,7,9,10,74,64";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for(int i=0;i<strs.length;i++) {
			int num = Integer.parseInt(strs[i]);
            if(num%2==0) {
				nums[i] = num;
		}
				
			}

		for(int num:nums) {
			System.out.println(num);
		}
	}

}
