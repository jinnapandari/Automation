package practice1;

interface pandu
{
	public void pandu();
	public void bhanu();
	
}
interface bhanuprasad
{
	public void Anji();
	public void gopal();
}
class Multi implements pandu,bhanuprasad
{

	
	public void Anji() {
		System.out.println("Anji is doing anytime chat with his girl friend");		
	}

	
	public void gopal() {
				System.out.println("gopal doing work in dubai ");
	}

	
	public void pandu() {
				System.out.println("pandu learning coaching in magneq software solutions");
	}

	
	public void bhanu() {
				System.out.println("Bhanu is doing his work he gives company to anji");
	}
	}
public class Multipleinterfaces {

	public static void main(String[] args) {
		Multi m=new Multi();
		m.Anji();
		m.bhanu();
		m.gopal();
		m.pandu();
		
	}

}
