import java.util.Scanner;
import java.util.Random;
public class Rock
{
	 public static void main(String[] args)
	 {
	 String personPlay; 		
	 String computerPlay="";	 	
	 int computerInt;
	
	 Scanner scan = new Scanner(System.in);
	 Random generator = new Random();
	 
	 computerInt=generator.nextInt(3) ;
	 
	 System.out.println("LET'S PLAY ROCK,PAPER,SISSORS");
	 System.out.println("press R for Rock ");
	 System.out.println("press P for Paper ");
	 System.out.println("press S for Sissors ");
	 System.out.println("What will be your Move?");
	 personPlay=scan.nextLine().toUpperCase();

	 switch (computerInt) {
            case 0: 
				computerPlay = "R"; 
					break;
            case 1: 
				computerPlay = "P"; 
					break;
            case 2: 
				computerPlay = "S"; 
					break;
        }

	 System.out.println("Computer's Move is: "+ computerPlay);

		if (personPlay.equals("R") && computerPlay.equals("S"))
		{
			System.out.println("you win!!!,Rock crushes Scissors.");
		}
		else if (personPlay.equals("R") && computerPlay.equals("P"))
		{
			System.out.println("you loss!!!,Paper covers Rock.");
		}
		else if (personPlay.equals("P") && computerPlay.equals("S"))
		{
			System.out.println("you loss!!!,Scissors cuts Paper.");
		}
		else if (personPlay.equals("P") && computerPlay.equals("R"))
		{
			System.out.println("you Win!!!,Paper covers Rock.");
		}
		else if (personPlay.equals("S") && computerPlay.equals("R"))
		{
			System.out.println("you loss!!!,Rock crushes Scissors.");
		}
		else if (personPlay.equals("S") && computerPlay.equals("P"))
		{
			System.out.println("you Win!!!,Scissors cuts Paper.");
		}
		else
		{
			System.out.println("It's a Tie,");
			System.out.println("Try again...");
			
		}

	
	 }
}