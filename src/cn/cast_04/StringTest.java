package cn.cast_04;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		String s = "[";

		for (int x = 0; x < arr.length; x++) {

			s += arr[x];
			if (x < arr.length - 1) {
				s += ',';
			} else
				s += ']';
		}
		System.out.println(s);
		
		int[] arr2= {5,4,8,45,14};
		String s2=StringTest.arrToString(arr2);
		System.out.println(s2);

	}

	public static String arrToString(int[] arr) {
		String s = "[";
		for (int x = 0; x < arr.length; x++) {

			s += arr[x];
			if (x < arr.length - 1) {
				s += ',';
			} else
				s += ']';
		}

		return s;
	}

}
