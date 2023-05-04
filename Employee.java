class Employee
{
	int empid;
	String name;
	float salary;

	Employee(int eid,String nm,float s)
	{
	empid=eid;
	name=nm;
	salary=s;
	}
void display()
{
	System.out.println("employee id"+empid);
	System.out.println("name"+name);
	System.out.println("salary"+salary);
}
	public static void main(String args[])
	{
	Employee e=new Employee(111,"abc",458.65f);
	e.display();
	}
}