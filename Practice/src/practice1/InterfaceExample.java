package practice1;

interface Animal// Animal is cannot be create the object 
{
	public void Animalsound();
	public void Animalage();
}
class Animal2 implements Animal{//it is used to the create object

	
	public void Animalsound() {
				System.out.println("the Animal sound is different");
	}

	
	public void Animalage() {
				System.out.println("the animal age is 5");
	}}
public class InterfaceExample {

	public static void main(String[] args) {
		Animal2 a=new Animal2();
		a.Animalsound();
		a.Animalage();
		
		
	}

}
