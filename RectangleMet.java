import java.io.*;

class RectangleMet
{
	int height,width;
	
	void accept()throws IOException
	{
		DataInputStream d;
		d=new DataInputStream(System.in);
		
		System.out.println(" enter value for height");
		height=Integer.parseInt(d.readLine());

		System.out.println(" enter value for width");
		width=Integer.parseInt(d.readLine());
	}
	void display()
	{
		System.out.println("Height="+height);
		System.out.println("Width="+width);
	}
	void calculate()
	{
		int a;
		a=height*width;
		System.out.println("Area="+a);
	}
	public static void main(String args[])throws IOException
	{
		RectangleMet r1;
		r1=new RectangleMet();
		r1.accept();
		r1.display();
		r1.calculate();
	}
}	