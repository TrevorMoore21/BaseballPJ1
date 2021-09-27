import java.util.ArrayList;

public class AddPlayers
	{

		static ArrayList<Players> mlb = new ArrayList<Players>();
		
		
		public static void newPlayers()
		{
			mlb.add(new Players("Bryce", "Harper", .280, 5459, 4536, 750, 1268, 831, 266));
			mlb.add(new Players("Mike", "Trout", .305, 5660, 4656, 816, 1419, 865, 310));			
			mlb.add(new Players("Joey", "Votto", .302, 8107, 6703, 1058, 2023, 1292, 328));
			mlb.add(new Players("Pete", "Rose", .303, 15890, 14053, 1314, 4256, 1566, 160));
			
		}
		
		
		
		
		
		
	}
