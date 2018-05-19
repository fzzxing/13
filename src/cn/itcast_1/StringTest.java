package cn.itcast_1;

import java.util.Scanner;

public class StringTest
{
	public static void main(String[] args)
	{
		String name = "fzzx";
		String mm = "abcds";
		for (int x = 0; x <= 2; x++)
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("enter name");
			String s = sc.nextLine();

			System.out.println("enter mm");
			String s2 = sc.nextLine();

			if (mm.equals(s2) && name.equals(s))
			{
				System.out.println("true");
				
				
				
				break;
			} else
			{
				System.out.println("false");
			}
			
		}

	}

}
