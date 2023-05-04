class StudentCon
{
	int rollNo;
	float percentage;
	String name;
	
	StudentCon(int r,float p,String s)
	{
		rollNo=r;
		percentage=p;
		name=s;
	}
	void display()
	{
		System.out.println("rollNo="+rollNo);
		System.out.println("name="+name);
		System.out.println("percentage="+percentage);
	}
	public static void main(String args[])
	{
		StudentCon s1;
		s1=new StudentCon(10,82.00f,"Nikhil");
		s1.display();
	}
}