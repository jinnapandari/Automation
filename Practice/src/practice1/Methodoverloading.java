package practice1;
public class Methodoverloading {
	void sum(int a,int b) 
	{
		System.out.println(a+b);
	}
	void sum(float a,float b) 
	{
		System.out.println(a+b);
	}
	void sum(double a,double b) 
	{
		System.out.println(a+b);
	}
	void sum(String pandu,String bhanu)
	{
		System.out.println(pandu+bhanu);
	}
	public static void main(String[] args) {
		Methodoverloading mo=new Methodoverloading();
		mo.sum(22,33);
		mo.sum(21f,22f);
		mo.sum(23d,24d);
		mo.sum("pandu", "bhanu");
	}

}
