class RectangleCon
{
	int height,width;
	
	RectangleCon(int h,int w)
	{
		height=h;
		width=w;
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
	public static void main(String args[])
	{
		RectangleCon r1;
		r1=new RectangleCon(3,7);
		r1.display();
		r1.calculate();
	}
}	