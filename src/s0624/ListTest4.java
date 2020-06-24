package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(10);
		
		Person p2 = p1;   // p2->p1->new Person
//		p1 = new Person();
		p1.setName("일동");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		
		
		
//		List<Person> pList = new ArrayList<>();
//		Person p = new Person();
//		pList.add(p);
//		p.setName("민");
//		pList.get("e").setName("동")
//		System.out.println(p.getName());
	}

}
