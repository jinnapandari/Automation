package Online;
import java.util.LinkedList;
public class Linkedlistonline {

	public static void main(String[] args) {
		LinkedList <String> pandu=new LinkedList<String>();
		pandu.add("anji");
		pandu.add("gopal");
		pandu.add("bhanu");
		pandu.add("palthu");
		pandu.add("vamshi");
		System.out.println(pandu);
		pandu.addFirst("kalo");
		System.out.println(pandu);
		pandu.addLast("manohar");
		System.out.println(pandu);
		pandu.removeFirst();
		System.out.println(pandu);
		pandu.removeLast();
		System.out.println(pandu);
		pandu.getFirst();
		System.out.println(pandu);
		pandu.getLast();
		System.out.println(pandu);
	}

}
