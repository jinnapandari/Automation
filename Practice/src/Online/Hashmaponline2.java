package Online;

import java.util.HashMap;

public class Hashmaponline2 {

	public static void main(String[] args) {
		HashMap <String,Integer> project=new HashMap <String,Integer>();
		project.put("pandu", 20);
		project.put("anji", 21);
		project.put("bhanu", 20);
		project.put("gopal", 19);
		System.out.println(project);
		for(String i:project.keySet()) {
		System.out.println(i);
		
		}
		for(int i:project.values()) 
		{
			System.out.println(i);
		}
	}

}
