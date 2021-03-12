package p1;
import java.util.Scanner;

public class Lab1Ex5 {

private int num;

public int getNum() {
return num;
}

public void setNum(int num) {
this.num = num;
}

static int calculateSum(int num) {
int finalSum = 0;
for (int i = 1; i <= num; i++) {
if (i % 3 == 0 || i % 5 == 0) {
finalSum += i;
}
}

return finalSum;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();
System.out.println(calculateSum(num));
sc.close();

}
}