import javax.swing.*;
public class Factorial
{
	public static void main (String args[])
	{
		int no,f=1;
		String input=JOptionPane.showInputDialog("enter the number");
		no=Integer.parseInt(input);
		for(int i=1;i<=no;i++)
		f=f*i;
		System.out.println("factorial="+f);
		System.exit(0);
	}
}