package practice1;

public class DublicateElimentArray {

	public static void main(String[] args) {
		int a[]= {5,4,3,6,7,5,4,3};
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println(a[j]);
					count++;
					sum=sum+a[j];
				}
			}
		}
		System.out.println("count of the dublic"+count);
		System.out.println("sum of the dublicate elements:"+sum);
	}

}
