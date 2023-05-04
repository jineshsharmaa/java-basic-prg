import java.io.*;
public class Demo1 
{

    public static void main(String[] args)throws IOException 
{

    	int year;
    	BufferedReader in=new BufferedReader(new InputStreamReader(System.in);
    	System.out.println("Enter any Year:");
    	year =Integer.parseInt(in.readLine());
        boolean isLeap = false;		

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}

