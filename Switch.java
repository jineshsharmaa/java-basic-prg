public class Switch
{
	public static void main(String args[])
	{
	// char grade= args[0].chartAt[0],
	char grade='d';
	switch(grade)
	{
	case 'A':
	System.out.println("excellent !");
	break;
	case 'B':
	case 'C':
	System.out.println("well done");
	break;
	case 'D':
	System.out.println("you passed");
	case 'E':
	System.out.println("better try again");
	break;
default:
	System.out.println("Invalid grade");
}
	System.out.println("your grade "+grade);
}
}