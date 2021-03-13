/*package p1;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex2 {

	public static void main(String[] args) {
	// int s[40];
		        Scanner sc = new Scanner(System.in);
		         
		        System.out.print("Enter number of strings: ");
		        int count = sc.nextInt();
		         
		        String strarr[] = new String[count];
		        Scanner sc1 = new Scanner(System.in);
		         
		        System.out.println("Enter the Strings :");
		        for(int i = 0; i < count; i++)
		        {
		            strarr[i] = sc1.nextLine();
		        }
		       // sc.close();
		       // sc1.close();
		        Arrays.sort(strarr);
		     
		        System.out.print("Strings in Sorted Order: " + Arrays.toString(strarr));
		    
	          for(int i=0;i<count;i++)
	           {
	        	   s[i]=strarr[i].length;
	        	   
	        		   
	        	
	           }
		}
}*/
package p1;

import java.util.Arrays;

public class Lab2Ex2 {
public static void sortString(String arr[]) {
String uc;
String lc;
String a[] = new String[arr.length];
for(int i=0;i<arr.length;i++) {
String str = arr[i];
if(str.length() %2==0) {
uc = str.substring(0, str.length() / 2);
lc = str.substring((str.length() / 2) , str.length());
}
else {
uc = str.substring(0, (str.length() / 2) + 1);
lc = str.substring((str.length() / 2)+1 , str.length());

}
   a[i]=uc.toUpperCase()+lc.toLowerCase();

}
for(int i=0;i<a.length;i++) {
System.out.println(" "+a[i]);
}

}

public static void main(String[] args) {
String arr[]= {"xyzlmnop","navursh","uthiesh","knevihtu","nayaya"};
Arrays.sort(arr);
sortString(arr);

}

}
