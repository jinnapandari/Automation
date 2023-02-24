package practice1;

public class Polyndrom {

	public static void main(String[] args) {
		String s="dad";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) 
		{
			reverse=reverse+s.charAt(i);
			
		}
		System.out.println(reverse);
		if(reverse.equalsIgnoreCase(s)) 
		{
			System.out.println("it is a polyndrom");
		}
		else 
		{
			System.out.println("it is a not polyndrom");
		}
	}

}
