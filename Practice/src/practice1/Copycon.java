package practice1;
class copyconn{
int a,b;
copyconn(int x)
{
	a=x;
	System.out.println("it is a value:"+a);
}
copyconn(copyconn pandu)
{
	b=pandu.a;
	System.out.println("it is b value:"+b);
}
}
 public class Copycon {
	


	public static void main(String[] args) {
		copyconn c=new copyconn(21);
		//System.out.println(c.a);
		copyconn cc=new copyconn(c);
	}}
	