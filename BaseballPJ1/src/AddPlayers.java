import java.util.ArrayList;
import java.util.Scanner;

public class AddPlayers
	{

		static ArrayList<Hitters> mlb = new ArrayList<Hitters>();
		static ArrayList<Pitchers> cheese = new ArrayList<Pitchers>();
		static Scanner userStringInput = new Scanner(System.in);
		
		public static void newHitters()
		{
			mlb.add(new Hitters("Bryce", "Harper", 5459, 4536, 750, 1268, 831, 266));
			mlb.add(new Hitters("Mike", "Trout", 5660, 4656, 816, 1419, 865, 310));			
			mlb.add(new Hitters("Joey", "Votto", 8107, 6703, 1058, 2023, 1292, 328));
			mlb.add(new Hitters("Pete", "Rose", 15890, 14053, 1314, 4256, 1566, 160));
			mlb.add(new Hitters("Babe", "Ruth", 10626, 8399, 2214, 2873, 2062, 714));
		}
		
		
		public static void newPitcher()
		{
			cheese.add(new Pitchers("Nolan", "Ryan", 807, 5386.0, 22575, 3929, 2795, 5714, 158));
			cheese.add(new Pitchers("Greg", "Maddux", 744, 5008.1,20421, 4726, 999, 3371, 137));
			cheese.add(new Pitchers("Randy", "Johnson", 603, 4135.1, 17067, 3346, 1497, 4875, 190));
			cheese.add(new Pitchers("Roger", "Clemens", 709, 4916.2, 20240, 4185, 1580, 4672, 159));
			cheese.add(new Pitchers("Jacob", "deGrom", 198, 1261.2, 4978, 981, 295, 1505, 21));
			
			
		}
		
		public static void userHitter() 
			{
			
			System.out.println("Would you like to play as Bryce Harper, Mike Trout, Joey Votto, Pete Rose, or Babe Ruth?");
			String chosenHitter = userStringInput.nextLine();
			
			if (chosenHitter.equals("Bryce Harper") || chosenHitter.equals("bryce harper"))
				{
					chosenHitter = mlb.get(0);
				}
			else if (chosenHitter.equals("Mike Trout") || chosenHitter.equals("mike trout"))
				{
					chosenHitter = mlb.get(1);
				}
			else if (chosenHitter.equals("Joey Votto") || chosenHitter.equals("joey votto"))
				{
					chosenHitter = mlb.get(2);
				}
			else if (chosenHitter.equals("Pete Rose") || chosenHitter.equals("pete rose"))
				{
					chosenHitter = mlb.get(3);
				}
			else if (chosenHitter.equals("Babe Ruth") || chosenHitter.equals("babe ruth"))
				{
					chosenHitter = mlb.get(4);
				}
			else
				{
					System.out.println("command not recognised");
				}
		
			
			
		}
		
		
		public static void userPitcher()
		{
			
			System.out.println("Would you like to face Rolan Ryan, Greg Maddux, Randy Johnson, Roger Clemens, or Jacob deGrom?");
			String chosenPitcher = userStringInput.nextLine();
			
			
			if (chosenPitcher.equals("Nolan Ryan") || chosenPitcher.equals("nolan ryan"))
				{
					chosenPitcher = cheese.get(0);
				}
			else if (chosenPitcher.equals("Greg Maddux") || chosenPitcher.equals("greg maddux"))
				{
					chosenPitcher = cheese.get(1);
				}
			else if (chosenPitcher.equals("Randy Johnson") || chosenPitcher.equals("randy johnson"))
				{
					chosenPitcher = cheese.get(2);
				}
			else if (chosenPitcher.equals("Roger Clemens") || chosenPitcher.equals("roger clemens"))
				{
					chosenPitcher = cheese.get(3);
				}
			else if (chosenPitcher.equals("Jacob deGrom") || chosenPitcher.equals("jacob degrom") || chosenPitcher.equals("Jacob Degrom"));
				{
					chosenPitcher = cheese.get(4);
				}
			else
				{
					System.out.println("command not recognised");
				}
		
			
		}

		
		public static void playGame()
		{
			
			System.out.println("Would you like to have an at bat with your hitter?");
			String answer = userStringInput.nextLine();
			
			double battingAA = mlb.get
			
			
			
			if(answer.equals("Yes") || answer.equals("yes"))
				{
					
					
					
					
					
					
				}
			
			
			
			
			
			
			
			else if(answer.equals("No") || answer.equals("no"))
				{
					System.out.println("Go Away");
				}
			else 
				{
					System.out.println("command not recognised");
				}
				
		}
		
	}
