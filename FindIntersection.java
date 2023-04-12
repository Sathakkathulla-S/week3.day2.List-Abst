package week3.day2.homeAssignment1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num = new ArrayList<Integer>();
		
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(4);
		num.add(6);
		num.add(7);

		
		List<Integer> num1 = new ArrayList<Integer>();
		
		num1.add(1);
		num1.add(2);
		num1.add(8);
		num1.add(4);
		num1.add(9);
		num1.add(7);
		
		
		for(int i=0; i<num.size(); i++) {
			for(int j=0; j<num1.size(); j++) {
				
				if(num.get(i)==num1.get(j)) {
					
					System.out.println(num.get(j));
				}
			}
		}
		
	}
	

}
