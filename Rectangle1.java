import java.io.*;
class Rectangle1
{

	int height,width;
	
	void getData()throws IOException
	{
		DataInputStream d;
		d=new DataInputStream(System.in);
		
		System.out.println("Enter Height:");
		height=Integer.parseInt(d.readLine());

		System.out.println("Enter width:");
		width=Integer.parseInt(d.readLine());		
		
	}
	
	void display()
	{
		System.out.println("Height"+height);
		System.out.println("Width"+width);

	}

	void calculate()
	{
		int a;
		a=height*width;
		System.out.println("Area"+a);

	}
	
	public static void main(String args[])throws IOException
	{
		Rectangle r;
		r=new Rectangle();
		r.getData();
		r.display();
		r.calculate();

	}
}