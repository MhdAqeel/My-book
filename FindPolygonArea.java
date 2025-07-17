import java.util.Scanner;
public class FindPolygonArea
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the width of the Square: ");
		double sw=sc.nextDouble();
		double sa=sw*sw;
		System.out.println("the area of the square: "+sa);
		
		System.out.println("Enter the width of the Rectangle: ");
		double rw=sc.nextDouble();
		System.out.println("Enter the lenth of the Rectangle");
		double rl=sc.nextDouble();
		double ra=rw*rl;
		System.out.println("the area of the Rectangle: "+ra);
		
		System.out.println("Enter the width of the Triangle: ");
		double tw=sc.nextDouble();
		System.out.println("Enter the height of the Triangle");
		double th=sc.nextDouble();
		double ta=tw*th*0.5;
		System.out.println("the area of the Triangle: "+ta);
	}
}