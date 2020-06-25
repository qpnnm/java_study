package s0625;

import java.util.ArrayList;
import java.util.List;

public class MinNum {
public static void main(String[] args) {
	List<Integer> numList = new ArrayList<>();
	numList.add(10);
	numList.add(20);
	numList.add(100);
	numList.add(50);
	numList.add(5);
	int minNum= 100;
	int idx = -1;
	for(int i= 0;i<numList.size();i++) {
		if(i==0||minNum>numList.get(i)) {
			minNum = numList.get(i);
			idx=i;
		}
		
	}
	System.out.println((idx+1)+"번째 있는 사람이 꼴등! 점수는:"+minNum+"점");
}
}
