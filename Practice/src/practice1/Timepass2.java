package practice1;

public class Timepass2 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int res=0;
		try {
		res=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
		
		
		System.out.println(res);
	}

}
