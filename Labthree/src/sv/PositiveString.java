package sv;

import java.util.Arrays;
import java.util.Scanner; 

public class PositiveString { 

	
	static boolean ispositiveString(String str) 
	{ 
		
		int n = str.length(); 
	
		char c[] = new char [n]; 
		

		for (int i = 0; i < n; i++) { 
			c[i] = str.charAt(i); 
		} 
	
		Arrays.sort(c); 
		 
		for (int i = 0; i < n; i++) 
			if (c[i] != str.charAt(i)) 
				return false; 
				
		return true;	 
	} 
	
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();

		if (ispositiveString(str)) 
		System.out.println("True"); 
		else
			System.out.println("False"); 
			
	} 
 
} 

