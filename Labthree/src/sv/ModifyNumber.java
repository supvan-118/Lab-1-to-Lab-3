package sv;

import java.util.Scanner;

public class ModifyNumber {

	public int modifyNumber(int num) {

		String intToStr = Integer.toString(num);
		StringBuffer str = new StringBuffer();
		char[] strToCharArr = intToStr.toCharArray();
		for (int i = 0; i < strToCharArr.length - 1; i++) {
			int num1 = Integer.parseInt(String.valueOf(strToCharArr[i]));
			int num2 = Integer.parseInt(String.valueOf(strToCharArr[i + 1]));
			int diff = Math.abs(num1 - num2);

			String str1 = Integer.toString(diff);

			str.append(str1);
		
		}
		str.append(strToCharArr[strToCharArr.length - 1]);
		String strBufToStr = str.toString();
		int modifyNum = Integer.parseInt(strBufToStr);

		return modifyNum;

	}

	public static void main(String[] args) {

		ModifyNumber obj = new ModifyNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer:");
		int num = sc.nextInt();
		System.out.println(obj.modifyNumber(num));
		sc.close();

	}

}