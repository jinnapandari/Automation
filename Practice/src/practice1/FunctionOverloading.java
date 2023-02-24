package practice1;

public class FunctionOverloading {
	public void method(int a,int b) 
	{
		System.out.println(a+b);
	}
	void method(double a,double b) 
	{
		System.out.println(a+b);
	}
	void method(String name) 
	{
		System.out.println(name);
	}
     void method(boolean pandu) 
     {
    	 System.out.println(pandu);
     }
	public static void main(String[] args) {
		FunctionOverloading fo=new FunctionOverloading();
		fo.method(20, 21);
		fo.method(22000, 150000);
		fo.method("jinna pandari");
		fo.method(true);
	}

}
