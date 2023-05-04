import java.io.*;
public class Addition
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two number");
	int x=Integer.parseInt(in.readLine());
	int y=Integer.parseInt(in.readLine());
	
	System.out.println("addition=" +(x+y));
	}
}