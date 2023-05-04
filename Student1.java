import java.io.*;
class Student1
{
	int rollNo;
	String name;
	float percentage;
	
	void getData()throws IOException
	{
		DataInputStream d;
		d=new DataInputStream(System.in);

		System.out.println("Enter Roll No:");
		rollNo=Integer.parseInt(d.readLine());

		System.out.println("Enter Name:");
		name=d.readLine();

		System.out.println("Enter Percentage:");
		percentage=Float.valueOf(d.readLine());

	}
	
	void display()
	{
		System.out.println("RollNo"+rollNo);
		System.out.println("Name"+name);
		System.out.println("Percentage"+percentage);

	}

	public static void main(String args[])throws IOException
	{
		Student s;
		s=new Student();
		s.getData();
		s.display();
	
	}

}