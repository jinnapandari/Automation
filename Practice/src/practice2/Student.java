package practice2;
import java.util.ArrayList;
import java.util.*;
public class Student {
	String name;
	int age;
	double salary;
	Student(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	

	public static void main(String[] args) {
		/*
		ArrayList<Integer> pandu=new ArrayList<Integer>();
		pandu.add(21);
		pandu.add(22);
		pandu.add(23);
		pandu.add(24);
		pandu.add(25);
		System.out.println(pandu);
		*/
		Student s1=new Student("pandu",56,23000);
		Student s2=new Student("anji",56,23000);
		Student s3=new Student("bhanu",56,23000);
		Student s4=new Student("gopal",56,23000);
		ArrayList <Student> pandu=new ArrayList <Student>();
		pandu.add(s1);
		pandu.add(s2);
		pandu.add(s3);
		pandu.add(s4);
		Iterator itr=pandu.iterator();
		while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.salary+" "+st.name+" "+st.age);  
		  }

	}

}
