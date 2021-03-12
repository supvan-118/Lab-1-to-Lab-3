package p1;

import java.util.Scanner;

public class LabEx6 {

	static int calculateDifference(int n){ 

		int l, k, sum; 
		
			l = (n * (n + 1) * (2 *(n + 1))) / 6; 
			
			k = (n * (n + 1)) / 2; 


			k = k * k; 
			
			sum = Math.abs(l - k); 
			
			return sum; 

		} 

	
		public static void main(String s[]) 
		{ 
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter N value");
			int n=sc.nextInt();
			System.out.println(calculateDifference(n));	 
			
		} 
		} 
 
