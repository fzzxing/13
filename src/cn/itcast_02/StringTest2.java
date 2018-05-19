package cn.itcast_02;


import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {

//		String str = "hasfjSA145645512GD";
		int numberCount = 0;
		int bigCount = 0;
		int smallCount = 0;
		Scanner sc=new Scanner(System.in);
			System.out.println("enter");
			
			String str=sc.nextLine();
            
			
        
		for (int x = 0; x < str.length(); x++) {
			char c = str.charAt(x);
			
			if (c >= '0' && c <= '9') { 
				numberCount++;

			} else if (c >= 'A' && c <= 'Z') {
				bigCount++;
			} else if (c >= 'a' && c <= 'z')
				smallCount++;

		}
		System.out.println("数字" + numberCount);
		System.out.println("大写字母" + bigCount);
		System.out.println("小写字母" + smallCount);

	}
}
