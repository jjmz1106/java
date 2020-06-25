package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 몇명? : ");
		int cnt = Integer.parseInt(scan.nextLine());
		List<Integer> intList = new ArrayList<>();
		int minNum = 0;
		int mexNum = 0;
		for(int i=0;i<cnt;i++) {
			System.out.print(i + "번째 학생 점수는? : ");
			intList.add(Integer.parseInt(scan.nextLine()));
			if(i==0 || minNum>intList.get(i)) {
				minNum = intList.get(i);
		}
			if(i==0 || mexNum<intList.get(i)) {
				mexNum = intList.get(i);
			}
			
					
				}
			
		System.out.println("가장 높은 점수는 : " + mexNum);
		System.out.println("가장 낮은 점수는 : " + minNum);
		System.out.println(intList);
	}
 
}
