package s0624;

import java.util.Random;
import java.util.Scanner;

public class GBB {
	
	public static void main(String[] args) {
		String[] strs = {"가위","바위","보"};
		Random r = new Random();
		int rNum = r.nextInt(3);
		System.out.print("가위바위보! : ");
		Scanner s = new Scanner(System.in);
		String mine = s.nextLine();
		System.out.println(strs[rNum]+","+ mine);
		if(strs[rNum].equals(mine)){
			System.out.println("비김");
		}else {
			if("가위".equals(strs[rNum])) {
				if("바위".equals(mine)) {
					System.out.println("이김");
		}else {
			if("바위".equals(strs[rNum])) {
				if("보".equals(mine)) {
					System.out.println("이김");
		}else {
			if("보".equals(strs[rNum])) {
				if("가위".equals(mine)) {
					System.out.println("이김");
				}
			}	
				}
			}
		}
			}
		}
			}
		}