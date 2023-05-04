public class IfElseIf

{
	public static void main(String args[])
	{
	int num=1234;
	if(num<100 && num>=1)
	{
		System.out.println("its a two digit number");
}
		else 
			if(num <1000 && num >=100)
		{
			System.out.println("its a three number digit number");
		}
		else if(num<10000 && num>=1000)
		{
			System.out.println("its a four digit number");
		}
		else if(num<100000 && num>=10000)
		{
			System.out.println("its a five digit number");
		}
	}
}
