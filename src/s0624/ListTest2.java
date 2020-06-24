package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
	
	public static void main(String[] args) {
	    List<String> strList = new ArrayList<>();
	    strList.add("아무");
	    strList.add("거나");
	    strList.add("그냥");
	    int idx = strList.indexOf("거 나");
	    System.out.println(idx);
	}

}
