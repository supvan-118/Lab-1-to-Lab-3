package p1;

public class Lab2Ex3 {

public static void getSorted(int arr[]) {
int[] a = new int[arr.length];
   int j = arr.length;
   for (int i = 0; i < arr.length; i++) {
       a[j - 1] = arr[i];
       j = j - 1;
   }

   System.out.println("Reversed array is: \n");
   for (int k = 0; k < arr.length; k++) {
       System.out.println(" "+a[k]);
   }

}

public static void main(String[] args) {
int arr[]= {45,67,38,96,64};
getSorted(arr);
}
}