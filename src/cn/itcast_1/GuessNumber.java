package cn.itcast_1;

import java.util.Scanner;

public class GuessNumber
{
	public static void start() {
		
		int number=(int)(Math.random()*100)+1;
		
		Scanner sc=new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("请输入数字");
		
		
			int s=sc.nextInt();
			
			if(s==number) 
			{
				System.out.println("对了");
				break;}
		 else if(s>number)
			System.out.println("大了");
		 else 
		 System.out.println("小了");
	}

}
}