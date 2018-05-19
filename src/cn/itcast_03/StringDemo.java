package cn.itcast_03;

public class StringDemo {
	public static void main(String[] args) {
		
		String str="SDHJKS";
		String str2="JFJSfdjk";
		
		 byte[] arr=str.getBytes();
		 for(int x=0;x<arr.length;x++) {
			 System.out.println(arr[x]);
		 }
		 char[] cha=str.toCharArray();
		 for(int x=0;x<cha.length;x++)
			 System.out.println(cha[x]);
		 int number=53151;
		 String s=String.valueOf(number);
		 System.out.println(s);
		 
		 String ss=String.valueOf(cha);
		 System.out.println(ss);
		 
		 System.out.println(str.toLowerCase());
		 
		 System.out.println(str2.toUpperCase());
		 
		 System.out.println(str.concat(str2));
		 
	}

}
