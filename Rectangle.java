class Rectangle
{
	int len,wid;
	void getData(int a,int b)
	{
	len=a;
	wid=b;
	}
	int rectArea()
	{
	int area=len * wid;
	return(area);
	}
}

 class RectArea
{
	public static void main(String args[ ])
	{
	int area1,area2;
	Rectangle rect1= new Rectangle0
	Rectangle rect2= new Rectangle();
	rect1.len =15;
	rect1.wid =10;
	area1 = rect1.len * rect1.wid;
	rect2.getData (20,12);
	area2 = rect2.rectArea();
	System.out.println("area1 ="+area1);
	System.out.println("area2 ="+area2);
	}
}