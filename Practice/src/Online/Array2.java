package Online;
import java.util.ArrayList;
import java.util.Collections;
public class Array2 {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(16);
		Collections.sort(obj);
		for(int i:obj) 
		{
			System.out.println(i);
		}
	}

}
