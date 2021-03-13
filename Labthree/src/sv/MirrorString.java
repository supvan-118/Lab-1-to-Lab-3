package sv;

import java.util.Scanner;

public class MirrorString {
	public static void main(String[] args)
	{
		String str = "EARTH";

		StringBuffer sbr = new StringBuffer(str);
	
		sbr.reverse();
		System.out.println(str+"|"+(sbr));
		
	}
}

