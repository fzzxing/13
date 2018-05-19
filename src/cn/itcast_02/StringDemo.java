package cn.itcast_02;

public class StringDemo
{
	public static void main(String[] args)
	{
		String str = "HealloWorlda";
		System.out.println(str.length());
		
		System.out.println(str.charAt(1));
		
		System.out.println(str.indexOf(97));
		
		System.out.println(str.indexOf('a'));
		
		System.out.println(str.indexOf('a',3));
		
		System.out.println(str.indexOf("all",4));
		
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5, 7));
	}
}
