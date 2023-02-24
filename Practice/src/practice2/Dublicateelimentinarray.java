package practice2;

public class Dublicateelimentinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,3,4,2};
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
					sum+=a[j];
				}
			}
		}
		System.out.println("count of dublicate elements:"+count);
		System.out.println("sum of the dubicate elements:"+sum);
	}

}
