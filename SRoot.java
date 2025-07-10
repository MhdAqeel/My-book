import java.util.Scanner;
public class SRoot {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
		System.out.print("Enter the number you need to find the square root of : ");
        double a = scan.nextDouble(); 
        
		System.out.print("Enter a a number what you think is the square root of " + a + ": ");
        double x0 = scan.nextDouble();
		if(a>0)
		{	
			do
			{
				x0=(x0+(a/x0))/2.0;
			}
			while((x0-(x0+a/x0)/2) >0.000001);
				System.out.print("SquareRoot of "+a+" is "+x0);
		}
		else
		{
			System.out.print("Number should greater than 0");
		}
	}
}