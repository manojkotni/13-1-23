package collections;

import java.util.Iterator;

public class findduplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,2,3,4,5,8,4,3,2,1};
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			if ((array[i] == array[j]) &&(i !=j)) {
				System.out.println("Duplicate array element :"+array[j]);
			}
			
		}
		
	}
	}

}
