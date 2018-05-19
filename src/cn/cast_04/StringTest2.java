package cn.cast_04;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
//		for(int x=0;x<arr.length/2;x++) {
//			char cha=arr[x];
//			arr[x]=arr[arr.length-1-x];
//			arr[arr.length-1-x]=cha;
//		}
//		for(int x=0;x<arr.length;x++) {
//			System.out.print(arr[x]);
//		}
		String result="";
		for(int x=arr.length-1;x>=0;x--) {
			result+=arr[x];
		}
		System.out.println(result);
	}

}
