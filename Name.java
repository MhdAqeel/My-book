import java.util.Scanner;
public class Name
{
	public static void main (String [] args)
	
	{
		//create Scanner instance
	    Scanner sc=new Scanner(System.in);
	
		System.out.println("enter your name ");
		String name=sc.nextLine();
		
		System.out.println("Wellcome Mr."+name);
		System.out.println("Now fuck off");
	}
}