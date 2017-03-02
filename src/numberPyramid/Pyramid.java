package numberPyramid;

import java.util.Arrays;
import java.util.Scanner;

public class Pyramid {
	
	private static int height;
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter pyramid height: ");
		int num = s.nextInt();
		height = num;
		print(1);
		s.close();
	}
	
	
	
	private static void print(int num){
		if (num <= height){
			String[] str = new String[height];
			Arrays.fill(str, 0, height-num, ".");
			Arrays.fill(str, (height-num), height, Integer.toString(num));
			System.out.println(Arrays.toString(str).
					replace("[",  "").
					replace("]", "").
					replaceAll(", ",  ""));
			num++;
			print(num);
		}
	}
}
