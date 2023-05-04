import java.io.*;
class DemoLarge
{
	public static void main(String args[])throws IOException
	{
	DataInputStream dis;
	int a,b,c;

	dis=new DataInputStream(System.in);

	System.out.println("enter value of a:");
	a=Integer.parseInt(dis.readLine());
	
	System.out.println("enter value of b:");
	b=Integer.parseInt(dis.readLine());
	
	System.out.println("enter value of c");
	c=Integer.parseInt(dis.readLine());

	if(a>b)
	{
	if(a>c)
	System.out.println("A is large");
	else
	System.out.println("C is large");
	}
	else
	{
	if(b>c)
	System.out.println("b is large");
	else
	System.out.println("c is large");
	}
	}
}