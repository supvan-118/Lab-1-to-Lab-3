package p1;

import java.util.Scanner;

public class LabEx1 {

	public static void main(String[] args) {
		int m,count=0;
		
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter number");
	       int N=sc.nextInt();
	       int cube=(N*N*N);
	       System.out.println("cube of the number is :" +cube);
	       while(cube!=0)
	       {
	    	  m=cube%10;
	    	  System.out.println(+m);
	    	   count=count+m;
	    	   System.out.println(+count);
	    	   cube=cube/10;
	    	   System.out.println(+N);
	       }
	     //count=count+N;
	       System.out.println("sum of the digits of a cube of a number is : " + count);
	}

}
