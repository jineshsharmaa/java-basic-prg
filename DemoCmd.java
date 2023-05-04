import java.io.*;
class DemoCmd1
{
	public static void main(String args[])throws IOException
	{
		

		int a=Integer.parseInt(args[0]);
		
		int b=Integer.parseInt(args[1]);

		int c= Integer.parseInt(args[2]);

		int d= Integer.parseInt(args[3]);
		
		int e= Integer.parseInt(args[4]);
		
		Vector v=new Vector(5);

		v.addElement(a);
		v.addElement(b);
		v.addElement(c);
		v.addElement(d);
		v.addElement(e);

		for(int i=0;i<v.size;i++)
		System.out.println(i+":"+v.elementAt(i));
	}

}