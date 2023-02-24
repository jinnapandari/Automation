package practice1;
class pavan
{
	 void show1() {
		System.out.println("it is pandu class method");
	}
}
class Anji extends pavan
{
	void show1() 
	{
		int a=10;
		int b=20;
		int res=0;
		res=a+b;
		System.out.println(res);
		
	}
	void display() 
	{
		System.out.println("it is anji display method");
	}
}
class Bhanu extends pavan
{
void show1() 
{
	System.out.println("it is bhanu class method");
}
}

public class FunctionOveriding {
	
public static void main(String[] args) {
		pavan p=new pavan();
		p.show1();
		
		Anji a=new Anji();
		a.show1();
		a.display();
		
		
		Bhanu b=new Bhanu();
		b.show1();
		
	}

}
