package p1;
import java.util.Arrays;
import java.util.Scanner;
public class Lab2Ex1{

	
	public int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String[] args) {
	
		Lab2Ex1 obj=new Lab2Ex1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=obj.getSecondSmallest(arr);
		System.out.println("the answer is "+key);
	}

}
