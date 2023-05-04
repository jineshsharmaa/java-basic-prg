import java.io.*;

class StudentMet
{
	int rollNo;
	float percentage;
	String name;
	
	void accept()throws IOException
	{
		DataInputStream d;
		d=new DataInputStream(System.in);
		
		System.out.println(" eneter roll number");
		rollNo=Integer.parseInt(d.readLine());
		
		System.out.println(" enter name of student");
		name=d.readLine();
		
		System.out.println(" enter percentae of student");
		percentage=Float.valueOf(d.readLine());
	}

	
	void display()
	{
		System.out.println("rollNo="+rollNo);
		System.out.println("name="+name);
		System.out.println("percentage="+percentage);
	}
	public static void main(String args[])throws IOException
	{
		StudentMet s1;
		s1=new StudentMet();
		s1.accept();
		s1.display();
	}
}