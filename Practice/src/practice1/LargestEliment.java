package practice1;

public class LargestEliment {

	public static void main(String[] args) {
		int a[]= {5,3,7,2,9,6};
		int temp=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j]) 
				{
					//System.out.println(a[j]);
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;					
				}
			}
			
			
		}
		System.out.println(a[0]);
	}

}
