public class EvenOdd
	{
	public static void main(String args[])throws IOException
	{
	DataInputStream dis;
	int no;
	dis=new DataInputStream(System.In);
	System.out.println("Enter any Number");
	no=Integer.parseInt(dis.readLine());
	if(no%2==0)
	System.out.println("Number Is Even");
	else
	System.out.println("Number Is Odd");
	}
}