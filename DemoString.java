class DemoString
{
	public static void main(String args[])
	{
		String s1,s2,s3;

		s1="abc";
		s2="abd";
		int n=s1.compareTo(s2);
		if(n>0)
		System.out.println("s1 is large");
		else if (n<0)
		System.out.println("s2 is large");
		else
		System.out.println("Both are same");
	}
}