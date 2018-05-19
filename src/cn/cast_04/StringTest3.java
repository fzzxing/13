package cn.cast_04;

public class StringTest3 {
	public static void main(String[] args) {
		String str="sssss";
		String s="s";
		int count=0;
		while(str.contains(s)){
				count++;
				
				
				str=str.substring(str.indexOf('s')+s.length());
			
		
		}
		System.out.println(count);
		}

}
