import java.io.*;
class Student
{
	int rollNo;
	String name;
	float percentage;
	
	Student(int r,String n,float p)
	{
		rollNo=r;
		name=n;
		percentage=p;		

	}
	
	void display()
	{
		System.out.println("RollNo"+rollNo);
		System.out.println("Name"+name);
		System.out.println("Percentage"+percentage);

	}

	public static void main(String args[])
	{
		Student s;
		s=new Student(10,"Vaishnavi",70.00f);
		s.display();
	
	}

}