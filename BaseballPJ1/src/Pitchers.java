
public class Pitchers
	{

		private String firstName;
		private String lastName;
		private int gamesPlayed; 
		private double inningsPitched;
		private int battersFaced;
		private int hitsAllowed;
		private int walks;
		private int strikeOut;
		private int hitByPitch;
		
		public Pitchers(String f, String l, int g, double i, int bf, int h, int w, int s, int hbp)
		{
			firstName = f;
			lastName = l;
			gamesPlayed = g;
			inningsPitched = i;
			battersFaced = bf;
			hitsAllowed = h; 
			walks = w;
			strikeOut = s;
			hitByPitch = hbp;
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public int getGamesPlayed()
			{
				return gamesPlayed;
			}

		public void setGamesPlayed(int gamesPlayed)
			{
				this.gamesPlayed = gamesPlayed;
			}

		public double getInningsPitched()
			{
				return inningsPitched;
			}

		public void setInningsPitched(double inningsPitched)
			{
				this.inningsPitched = inningsPitched;
			}

		public int getBattersFaced()
			{
				return battersFaced;
			}

		public void setBattersFaced(int battersFaced)
			{
				this.battersFaced = battersFaced;
			}

		public int getHitsAllowed()
			{
				return hitsAllowed;
			}

		public void setHitsAllowed(int hitsAllowed)
			{
				this.hitsAllowed = hitsAllowed;
			}

		public int getWalks()
			{
				return walks;
			}

		public void setWalks(int walks)
			{
				this.walks = walks;
			}

		public int getStrikeOut()
			{
				return strikeOut;
			}

		public void setStrikeOut(int strikeOut)
			{
				this.strikeOut = strikeOut;
			}

		public int getHitByPitch()
			{
				return hitByPitch;
			}

		public void setHitByPitch(int hitByPitch)
			{
				this.hitByPitch = hitByPitch;
			}

		
		
		
		
	}
