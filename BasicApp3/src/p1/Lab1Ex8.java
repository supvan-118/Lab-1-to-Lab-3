package p1;

import java.util.Scanner;

public class Lab1Ex8 {

	static boolean checkNumber(int n)
	{
		boolean ans;
		if(n==0)
		return false;

	ans=(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	return ans;
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(checkNumber(n))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
	}


