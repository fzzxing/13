package cn.itcast_1;

public class StringDemo3
{
	public static void main(String[] args)
	{
		String s="helloworld";
		String s2="hello";
		System.out.println(s.contains(s2));
		
		String s3="helloWORLD";
		
		System.out.println(s.equalsIgnoreCase(s3));
		
		System.out.println(s.startsWith(s2));
		
		String s4="world";
		System.out.println(s.endsWith(s4));
		
		
		String s5="";
		String s6=null;
		
		System.out.println(s5.isEmpty());
//		System.out.println(s6.isEmpty());
		System.out.println(s.isEmpty());
	
	}

}
