import java.util.Scanner;

public class RandomNumberGuesser {
/*
 RandomNumberGuesser will narrow down the choices according to the users previous guesses, 
 and continue to prompt the user to enter a guess until they guess correctly.  

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);;
		int lowGuess = 0;
		int highGuess = 100;
		int nextGuess = 0;
		int randInt = RNG.rand();
		String rePlay ="y";
		System.out.println("Enter your first guess.");
		nextGuess = sc.nextInt();
		sc.nextLine();
		
		do 
		{
			do {
			
		if(nextGuess<lowGuess || nextGuess>highGuess) 
		{
			nextGuess = sc.nextInt();
			RNG.inputValidation(nextGuess,lowGuess,highGuess);
			System.out.println("you guessed "+RNG.getCount()+" time(s)");
			System.out.println("Guess must be between "+lowGuess+" and "+highGuess);
			sc.nextLine();
			
		}
		else if( nextGuess<randInt) 
		{
			RNG.inputValidation(nextGuess,lowGuess,highGuess);
			System.out.println("your guess was to low");
			lowGuess = nextGuess;
			System.out.println("you guessed "+RNG.getCount()+" time(s)");
			System.out.println("Guess must be between "+lowGuess+" and "+highGuess);
			nextGuess = sc.nextInt();
			sc.nextLine();
			
		}else if(nextGuess>randInt) 
		{
			RNG.inputValidation(nextGuess,lowGuess,highGuess);
			System.out.println("your guess was to high");
			highGuess = nextGuess;
			System.out.println("you guessed "+RNG.getCount()+" time(s)");
			System.out.println("Guess must be between "+lowGuess+" and "+highGuess);
			nextGuess = sc.nextInt();
			
			sc.nextLine();
		}
			}while(nextGuess !=randInt); //while ans isnt right
			System.out.println("you guessed "+RNG.getCount()+" time(s)");
			System.out.println("your guess was right congrats! want to play again? y/n? (by Tobias Hazoume)");
			rePlay = sc.next();
			sc.nextLine();
			lowGuess = 0;
			highGuess = 100;
			RNG.resetCount();
			
			if(rePlay.equals("y")) 
			{
				nextGuess = 0;
				randInt = RNG.rand();
				//nextGuess = 0;
			System.out.println("Enter your first guess!!");
			nextGuess = sc.nextInt();
			}
			
		}while(rePlay.equals("y"));
		
		System.out.println("bye! (by Tobias Hazoume) ");
		System.exit(0);

	}

}
