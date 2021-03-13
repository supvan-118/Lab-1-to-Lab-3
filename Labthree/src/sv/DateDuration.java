package sv;

import java.time.*;
import java.util.Scanner;
public class DateDuration {

	   public static void main(String[] args)
	    {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter the year ");
		   int yyyy=sc.nextInt();
		   System.out.println("enter the month ");
		   int mm=sc.nextInt();
		   System.out.println("enter the date ");
		   int dd=sc.nextInt();
		   
		   
	        LocalDate pdate = LocalDate.of(yyyy, mm, dd);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("Difference is %d years, %d months and %d days old ", diff.getYears(), diff.getMonths(), diff.getDays());
	  }
	}

