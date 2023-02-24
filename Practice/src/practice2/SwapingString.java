package practice2;

public class SwapingString {
	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		s1=s1+s2;
		s2=s1.substring(0, 5);
		s1=s1.substring(5);
		System.out.println(s1);
		System.out.println(s2);
	}

}
