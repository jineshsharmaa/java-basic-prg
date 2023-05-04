import java.io.*;
class DemoReverse
{
	public static void main(String args[])throws IOException
	{
		DataInputStream dis;
	int no,no1,rem,rev=0;
	dis=new DataInputStream(System.in);	
	System.out.println("enter any number");
	no=Integer.parseInt(dis.readLine());
	no1=no;
	while(no>0)
	{
		rem=no%10;
	rev=rev*10+rem;
	no=no/10;
	}
	System.out.println("Reverse of" +no1+ "is" +rev);
	}
}