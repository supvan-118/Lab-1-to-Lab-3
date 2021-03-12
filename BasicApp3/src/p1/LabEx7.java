package p1;
import java.util.Scanner;

public class LabEx7 {

private int num;


public int getNum() {
return num;
}

public void setNum(int num) {
this.num = num;
}

static boolean checkNumber(int num) {
boolean p = false;
while (num != 0) {
int num1 = num % 10;
int num2 = num % 100;
num = num / 10;
if (num1 >= num2) {
p = true;
} else {
p = false;
break;
}

}
return p;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();
System.out.println(checkNumber(num));
sc.close();

}

}