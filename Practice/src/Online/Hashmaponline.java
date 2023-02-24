package Online;
import java.util.HashMap;
public class Hashmaponline {

	public static void main(String[] args) {
		HashMap <String,String> capitalcities=new HashMap <String,String>();
		capitalcities.put("telangana", "hyderabad");
		capitalcities.put("Andhrapradesh", "Amaravati");
		capitalcities.put("india", "delhi");
		capitalcities.put("jinna", "pandari");
		System.out.println(capitalcities);
		capitalcities.get("telangana");
		System.out.println(capitalcities);
		capitalcities.remove("Andhrapradesh");
		System.out.println(capitalcities);
		for(String i:capitalcities.keySet()) {
		System.out.println(i);
		}
		for(String i:capitalcities.values()) 
		{
			System.out.println(i);
		}
		}

}
