import java.util.Scanner;
public class dog
{
	public static void main(String [] args)
	{
		//create Scanner instance
		Scanner sc=new Scanner(System.in);
		
		System.out.println("type which day you were born");
		String day=sc.nextLine();
		
		System.out.println("type which month you were born");
        String month=sc.nextLine();
		
		System.out.println("type which year you were born");
		String year=sc.nextLine();
		
		System.out.println("you wre born on "+day+'/'+month+'/'+year);

	}
}