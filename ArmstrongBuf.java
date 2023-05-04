import java.io.*;
class ArmstrongBuf
{
	public static void main(String args[]) throws IOException
	{
	int a,arm=0,n,temp;
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the number");
	n=Integer.parseInt(in.readLine());
	temp=n;
	while(n!=0)
	{
	a=n %10;
	arm=arm+(a*a*a);
	n=n/10;
	}
	if(arm==temp)
	{
	System.out.println(temp +"is a armstrong numbers");
	}
	else
	{
	System.out.println(temp+"is a not armstrong numbers");
	}
	}
	
}