package s0625;

import java.util.ArrayList;
import java.util.List;

public class MaxNum {
public static void main(String[] args) {
	List<Integer>numList = new ArrayList<>();
	numList.add(10);
	numList.add(30);
	numList.add(50);
	numList.add(70);
	numList.add(90);
	int maxNum= 0;
	int idx= -1;
	for(int i=0;i<numList.size();i++) {
		if(maxNum<numList.get(i));
		idx= i;
	}
	System.out.println((idx+1)+"번째 있는 사람이 1등! 점수는 ~");
}

}
