import java.util.Scanner;
public class MovieDriver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Create a new movie object
		Movie info = new Movie();
		
		String answer = "";
		int ticks = 0;
		String reply = "";
		
		
		Scanner sc = new Scanner(System.in);
		do 
		{
		System.out.println("Enter the title of a movie");
		answer = sc.nextLine();
		//set to title
		info.setTitle(answer);
		
		System.out.println("Enter the rating of a movie");
		answer = sc.nextLine();
		//set to rating
		info.setRating(answer);
		
		System.out.println("Enter the number of tickets sold at Rockville theater");
		ticks = sc.nextInt();
		//set to tickets
		info.setSoldTickets(ticks);
		sc.nextLine(); // lets to read the nextline this heres is b/c i did nextInt before
		
		//Print out the information using the movie’s toString method
		System.out.println(info.toString()+"\n");
		System.out.println("do you want to ad another? yes or no?");
		reply = sc.nextLine();
		}while(reply.equals("yes"));
		 System.out.println("Goodbye.");
		 


	}

}
