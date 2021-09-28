
public class Hitters
	{

		private String firstName;
		private String lastName;
		private int plateAppearances;
		private int atBats;
		private int runsBattedIn;
		private int hits;
		private int baseOnBalls;
		private int homeRuns;
		
		public Hitters(String f, String l, int p, int a, int r, int h, int bb, int hr)
		{
			firstName = f;
			lastName = l;
			plateAppearances = p;
			atBats = a;
			runsBattedIn = r;
			hits = h;
			baseOnBalls = bb;
			homeRuns = hr;
			
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

		public int getPlateAppearances()
			{
				return plateAppearances;
			}

		public void setPlateAppearances(int plateAppearances)
			{
				this.plateAppearances = plateAppearances;
			}

		public int getAtBats()
			{
				return atBats;
			}

		public void setAtBats(int atBats)
			{
				this.atBats = atBats;
			}

		public int getRunsBattedIn()
			{
				return runsBattedIn;
			}

		public void setRunsBattedIn(int runsBattedIn)
			{
				this.runsBattedIn = runsBattedIn;
			}

		public int getHits()
			{
				return hits;
			}

		public void setHits(int hits)
			{
				this.hits = hits;
			}

		public int getBaseOnBalls()
			{
				return baseOnBalls;
			}

		public void setBaseOnBalls(int baseOnBalls)
			{
				this.baseOnBalls = baseOnBalls;
			}

		public int getHomeRuns()
			{
				return homeRuns;
			}

		public void setHomeRuns(int homeRuns)
			{
				this.homeRuns = homeRuns;
			}

		
			
			
		}
		
		
		
	
