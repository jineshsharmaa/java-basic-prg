import java.io.*;
class DemoEvenOdd
{
	public static void main(String args[])throws IOException
	{
	DataInputStream dis;
	int no;
	dis=new DataInputStream(System.in);
	System.out.println("Enter any number:");
	no=Integer.parseInt(dis.readLine());
	if(no%2==0)
	System.out.println("number is even:");
	else
	System.out.println("number is odd:");
	}
}