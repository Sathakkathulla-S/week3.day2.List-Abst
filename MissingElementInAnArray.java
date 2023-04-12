package week3.day2.homeAssignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {1,2,3,4,7,6,8};
		List <Integer> value= new ArrayList <Integer>();
		for(int i=0;i<data.length;i++)
		{
			value.add(data[i]);
		}
		
		int size = value.size();
		Collections.sort(value);
		System.out.println(value);
	for (int i = 0; i < size; i++) {	
		int j = i+1;
		if (value.get(i)!=j) {
			System.out.println("Missing element is : "+j);
			break;
		}
	}
	}

}
