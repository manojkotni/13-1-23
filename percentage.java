package collections;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,total = 0,percentage;
		Scanner s = new Scanner(System.in);
		 System.out.println("enter no of subjects:");
			n= s.nextInt();
			int marks[ ]=new int[n];
			System.out.println(" Enter marks out of 100:");
			for (int i = 0; i < marks.length; i++) {
				marks[i]=s.nextInt();
				total =total+marks[i];
						
			}
			percentage = total/n;
			System.out.println("sum:"+total);
			System.out.println("percentage:"+percentage);
	}

}
