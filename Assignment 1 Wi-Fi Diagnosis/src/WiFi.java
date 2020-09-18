import java.util.Scanner;
public class WiFi 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String answer = ""; //changed to lower case
		Scanner sc = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("First step: reboot your computer\r\n" + 
				"Are you able to connect with the internet? (yes or no)\r\n");
		
		answer = sc.nextLine();
		if(answer.equals("no")) //step 1
		{
			System.out.println("Second step: reboot your router\r\n" + 
					"Now are you able to connect with the internet? (yes or no)\r\n");
			answer = sc.nextLine();
			if(answer.equals("no")) 
			{
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\r\n" + 
						"Now are you able to connect with the internet? (yes or no)\r\n");
				answer = sc.nextLine();
				if(answer.equals("no"))
				{
					System.out.println("Fourth step: move your computer closer to your router\r\n" + 
							"Now are you able to connect with the internet? (yes or no)\r\n");
					answer = sc.nextLine();
					if(answer.equals("no"))
					{
						System.out.println("Fifth step: contact your ISP\r\n" + 
								"Make sure your ISP is hooked up to your router.(By Tobias Hazoume)\r\n");
						System.exit(0);
					}
					else
					{
						System.out.println("Moving your computer closer to the router seemed to work.(By Tobias Hazoume)");
						System.exit(0);
					}	
				}
				else
				{
					System.out.println("Plugging in your cables firmly seemed to work.(By Tobias Hazoume)");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("rebooting your router seemed to work. (By Tobias Hazoume)");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("rebooting your computer seemed to work.(By Tobias Hazoume)");
			System.exit(0);
		}
	}
}
