import java.io.*;
class DemoFactorial
{
	public static void main(String args[])throws IOException
	{
	DataInputStream dis;
	int n,fact=1;

	dis=new DataInputStream(System.in);

	System.out.println("enter any number");
	n=Integer.parseInt(dis.readLine());
	for(int i=1;i<=n;i++)
	fact=fact*i;

	System.out.println("factorial of " +n+ "is" +fact);
	}
}