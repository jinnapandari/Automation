package practice1;

interface P
{
	public void show1();
}
interface S
{
	public void show2();
}
class T implements P,S
{

	
	public void show2() {
		System.out.println("it is a b class method");		
	}

	
	public void show1() {
		System.out.println("it is a class method");		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		 T c=new T();
		 c.show1();
		 c.show2();
	}

}
