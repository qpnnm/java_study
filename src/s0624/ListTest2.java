package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("아무무 ");
		strList.add("엄준식");
		strList.add("야호 ");
     int idx=  strList.indexOf(" 엄준식");
		System.out.println(idx);
       
		
	}
}

		
