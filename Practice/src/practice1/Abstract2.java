package practice1;
abstract class Animal3
{
	abstract public void animalsound();
	

public void animalage() 
{
	System.out.println("the animal age is 23");
}
}
class Jungle extends Animal3
{
	public void animalsound() 
	{
		System.out.println("the animal sound is different");
	}
}

public class Abstract2 {

	public static void main(String[] args) {
		Jungle j=new Jungle();
		j.animalage();
		j.animalsound();
	}

	
}
