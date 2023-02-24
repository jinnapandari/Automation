package practice1;

public class ConsucutiveNumber {

	public static void main(String[] args) {
		int a[]= {15,16,43,44};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length-1;j++) 
			{
				if(a[i+1]-a[j]==1) 
				{
					System.out.println("it is consucutive number"+a[i+1]+"and"+a[j]);
					
				}
				else 
				{
					System.out.println("it is  not consucutive number");
				}			}
		}
	}
	

}
