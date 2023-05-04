import java. swing.*;
public class Fact
{
	public static void main(String args[])
	{
	int no,f=1;
	String Input=JOptionPane.ShowInputDialog
	("enter the number");
	no=Integer.parseInt(input);
	for(int i=1;i<=no;i++)
	f=f*i;
	System.out.println("fact ="+f);
	System.exit(0);
	}
}