package Online;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList <String> print=new ArrayList <String>();
		print.add("bhanu");
		print.add("gopal");
		print.add("prakhar");
		print.add("nanu");
		print.add("pandu");
		System.out.println(print);
		//System.out.println(print.get(2));
		System.out.println(print.set(3, "anji"));
		System.out.println(print);
		System.out.println(print.remove(2));
		System.out.println(print);
		System.out.println(print.size());
	}

}
