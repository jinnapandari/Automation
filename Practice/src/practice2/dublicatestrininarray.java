package practice2;

public class dublicatestrininarray {

	public static void main(String[] args) {
		String a= "hellohlh";
		char ch[]=a.toCharArray();
		int count=0;
		
		for(int i=0;i<a.length();i++) 
		{
			for(int j=i+1;j<a.length();j++) 
			{
				if(ch[i]==ch[j]) 
				{
					System.out.println(ch[j]);
					count++;
					
				}
			}
		}
		System.out.println("count of dublicate elements:"+count);
		
	}


	}


