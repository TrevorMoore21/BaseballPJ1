import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;

//import jdk.internal.misc.FileSystemOption;

import java.text.DecimalFormat;


public class AddPlayers
	{

		
		//mlb.get(hitterIndex)
		
		
		
		static ArrayList<Hitters> mlb = new ArrayList<Hitters>();
		static ArrayList<Pitchers> cheese = new ArrayList<Pitchers>();
		static Scanner userStringInput = new Scanner(System.in);
		
		
		static int hitterIndex = 0;
		static int pitcherIndex = 0;
		
		
		
		
		public static void newHitters()
		{
			mlb.add(new Hitters("Bryce", "Harper", 5459, 4536, 750, 1268, 831, 266));
			mlb.add(new Hitters("Mike", "Trout", 5660, 4656, 816, 1419, 865, 310));			
			mlb.add(new Hitters("Joey", "Votto", 8107, 6703, 1058, 2023, 1292, 328));
			mlb.add(new Hitters("Pete", "Rose", 15890, 14053, 1314, 4256, 1566, 160));
			mlb.add(new Hitters("Babe", "Ruth", 10626, 8399, 2214, 2873, 2062, 714));
		}
		
		
		public static void newPitchers()
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
					hitterIndex = 0;
				}
			else if (chosenHitter.equals("Mike Trout") || chosenHitter.equals("mike trout"))
				{
					hitterIndex = 1;
				}
			else if (chosenHitter.equals("Joey Votto") || chosenHitter.equals("joey votto"))
				{
					hitterIndex = 2;
				}
			else if (chosenHitter.equals("Pete Rose") || chosenHitter.equals("pete rose"))
				{
					hitterIndex = 3;
				}
			else if (chosenHitter.equals("Babe Ruth") || chosenHitter.equals("babe ruth"))
				{
					hitterIndex = 4;
				}
			else
				{
					System.out.println("command not recognised");
				}
		
			
			
		}
		
		
		public static void userPitcher()
		{
			
			System.out.println("Would you like to face Nolan Ryan, Greg Maddux, Randy Johnson, Roger Clemens, or Jacob deGrom?");
			String chosenPitcher = userStringInput.nextLine();
			
			
			if (chosenPitcher.equals("Nolan Ryan") || chosenPitcher.equals("nolan ryan"))
				{
					pitcherIndex = 0;
				}
			else if (chosenPitcher.equals("Greg Maddux") || chosenPitcher.equals("greg maddux"))
				{
					pitcherIndex = 1;
				}
			else if (chosenPitcher.equals("Randy Johnson") || chosenPitcher.equals("randy johnson"))
				{
					pitcherIndex = 2;
				}
			else if (chosenPitcher.equals("Roger Clemens") || chosenPitcher.equals("roger clemens"))
				{
					pitcherIndex = 3;
				}
			else if (chosenPitcher.equals("Jacob deGrom") || chosenPitcher.equals("jacob degrom") || chosenPitcher.equals("Jacob Degrom"))
				{
					pitcherIndex = 4;
				}
				else
				{
					System.out.println("command not recognised"); 
				}
		  
			
			
			
		}

		
		public static void playGame()
		{
			
			double battingAv = (double) mlb.get(hitterIndex).getHits() / (double) mlb.get(hitterIndex).getAtBats(); 
			double battingAvA = ((double) cheese.get(pitcherIndex).getHitsAllowed()) / ((double) cheese.get(pitcherIndex).getBattersFaced() - (double) cheese.get(pitcherIndex).getWalks() - (double) cheese.get(pitcherIndex).getHitByPitch());
			
			Random generator = new Random();
			double rando = ((generator.nextDouble()* .010)+0.015);
			
			
			 DecimalFormat d = new DecimalFormat("0.000");

             
			System.out.println("Your hitter's career batting average is: " + (d.format(battingAv)));
			System.out.println("Your pitcher's career batting average against is: " + (d.format(battingAvA)));
			
			
			
			System.out.println("Would you like your hitter to have 1000 AtBats against your pitcher?");
			String answer = userStringInput.nextLine();
			
			
			
			if(answer.equals("Yes") || answer.equals("yes"))
				{
					
							double newHits = ((((battingAv + battingAvA)/2) - rando));
							newHits = newHits * 1000;
					
							double newWalks = (((double) cheese.get(pitcherIndex).getWalks() / (double) cheese.get(pitcherIndex).getBattersFaced()) * 1000);
							
							double newHitByPitch = (((double) cheese.get(pitcherIndex).getHitByPitch() / (double) cheese.get(pitcherIndex).getBattersFaced()) * 1000);
							
	
							
							
							double newBattingAv = ((double) mlb.get(hitterIndex).getHits() + newHits) / ((double) mlb.get(hitterIndex).getAtBats() + 1000);
							
							double newBattingAvA = ((double) cheese.get(pitcherIndex).getHitsAllowed() + newHits) / ((double) (cheese.get(pitcherIndex).getBattersFaced() + 1000) - (double) (cheese.get(pitcherIndex).getWalks() + newWalks) - (double) (cheese.get(pitcherIndex).getHitByPitch() + newHitByPitch));
							
							
							System.out.println("Your hitter's new career batting average is: " + (d.format(newBattingAv)));
							System.out.println("Your pitcher's new career batting average against is: " + (d.format(newBattingAvA)));
					
							
							System.out.println("What's up Mr. McGuire?"); 
							
							
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
			
		public static void asciiBaseball()
		{
            System.out.println("                                            _--_     dMb");
            System.out.println("                                         __(._  )   d0P");
            System.out.println("                                           <  (D)  .MP");
            System.out.println("                                        .~ \\ /~```M-.");
            System.out.println("                                       .~    V    Mo_ \\");
            System.out.println();
            System.out.println("                                        (   (___. {:)-./");
            System.out.println("-------============((((}{)               ~._____.(:}");
            System.out.println("                                           /    .M\\");
            System.out.println("                                          /        \\");
            System.out.println("                                          |    /\\   |");
            System.out.println("                                          /   /  \\   \\");
            System.out.println("                                         /   /    \\   \\");
            System.out.println("                                         \\__/      \\__/");
            System.out.println("                                         / /        | |");
            System.out.println("                                        .^V^.      .^V^.");
            System.out.println("                                         +-+        +-+");
          
            
		}
		
	}
