package cn.itcast_02;

public class StringTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str ="helloworld";
		
		for(int x=0;x<str.length();x++) {
//			String c;
//			c=str.substring(x, x+1);
//			System.out.println(c);
			
//			String[] arr=new String[str.length()];
			char[] arr=new char[str.length()];
			
//			arr[x]=str.substring(x, x+1);
			arr[x]=str.charAt(x);
			
			System.out.print(arr[x]+"  ");
		}

	}

}
