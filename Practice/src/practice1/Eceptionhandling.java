package practice1;

public class Eceptionhandling {

	public static void main(String[] args) {
		int a=9;
		int b=0;
		int res=0;
		try {
		 res=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
			throw ae;
		}
		finally 
		{
			System.out.println("final keyword also used in this programme");
		}
				System.out.println(res);
	}

}
