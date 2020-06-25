package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point3 {
	
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<5;i++) {
			Student s = new Student();
			int point = r.nextInt(101);
			s.setName("이름" + i);
			s.setPoint(point);
			stList.add(s);
			
		}
		int max = 0;                               //
		int min = 0;                               //
		String maxName = "";                       //Student maxStudent = null;
		String minName = "";                       //Student minStudent = null;
		for(int i=0;i<stList.size();i++) {
			Student st = stList.get(i);
			if(i==0) {                              //if(i==0 || minStudent.getPoint()>st.getPoint())
				min = st.getPoint();
				max = st.getPoint();
				maxName = st.getName();
				minName = st.getName();
			}
			if(min>st.getPoint()) {                  //if(i==0 || maxStudent.getPoint()>st.getPoint())
				min = st.getPoint();
				minName = st.getName(); 
			}
			if(max<st.getPoint()) {
				max = st.getPoint();
				maxName = st.getName();
			}
		}
		
		System.out.println(stList);
		System.out.println("1등 : " + maxName +" 점수는 : " + max);         // maxStudent
		System.out.println("꼴등 : " + minName +" 점수는 : " + min);         // minStudent
	}

}
