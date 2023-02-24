package practice1;

public class Encapsulation {
	int id;
	String name;
	double salary;
	int age;
     public void setid(int id) 
     {
    	 this.id=id;
     }
     public void setname(String name) 
     {
    	 this.name=name;
     }
     public void setsalary(double salary) 
     {
    	 this.salary=salary;
     }
     public void setage(int age) 
     {
    	 this.age=age;
     }
     int getid()
     {
    	 return id;
     }
     String getname() 
     {
    	 return name;
     }
     double getsalary() 
     {
    	 return salary;
     }
     int getage() 
     {
    	 return age;
     }


	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setid(12);
		e.setname("pandu");
		e.setage(20);
		e.setsalary(22000);
		System.out.println(e.getid());
		System.out.println(e.getname());
		System.out.println(e.getage());
		System.out.println(e.getsalary());
		}

}
