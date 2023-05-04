import  java.util.*;

class  DemoVector
{
	public static void main(Strings args[])
	{
		Vector v=new Vector(5);
		
		Integer a=new Integer(10);
		Integer b=new Integer(15);
		Float c=new Integer(3.7f);
		String s1="hello";
		
		v.addElement(a);
		v.addElement(b);
		v.addElement(c);
		v.addElement(s1);
		
		System.out.println(" after adding elements");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(i+": "+v.elementAt(i));
		}
	}
}