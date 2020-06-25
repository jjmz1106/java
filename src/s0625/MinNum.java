package s0625;

import java.util.ArrayList;
import java.util.List;

public class MinNum {
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.add(100);
		numList.add(70);
		numList.add(15);
		 
		int minNum = 0;
		int idx = 0;
		for(int i=0;i<numList.size();i++) {
			if(i==0 || minNum>numList.get(i)) {
				minNum = numList.get(i);
				
				idx = i;
				
				System.out.println( idx + "번째 " + minNum + "점이 가장 낮은 점수 입니다.");
			}
		}
	}

}
