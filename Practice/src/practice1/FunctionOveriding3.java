package practice1;

class a
{
   public void Vechile() 
   {
	   System.out.println("it is a vechile class");
   }
}
class b extends a
{
	public void vechile() 
	{
		System.out.println("it is a bike class");
	}
}
public class FunctionOveriding3 {

	public static void main(String[] args) {
		a obj =new b();
		obj.Vechile();
		
		
		a obj2=new a();
		obj2.Vechile();
	}

}
