package week3.day2.homeAssignment1;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>data= new ArrayList <Integer>();
		data.add(3); data.add(2);
		data.add(11); data.add(4);
		data.add(6); data.add(7);
		int size = data.size();
		Collections.sort(data);	
		System.out.println(data);
		for (int i = 0; i < size; i++) {
			
		}
		
		System.out.println("The second largest number is : "+data.get(size-2));
}
	

}
