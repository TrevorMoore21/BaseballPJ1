
public class Players
	{

		private String firstName;
		private String lastName;
		private double BA;
		private int PA;
		private int AB;
		private int RBI;
		private int H;
		private int BB;
		private int HR;
		
		public Players(String f, String l, double ba, int p, int a, int r, int h, int bb, int hr)
		{
			firstName = f;
			lastName = l;
			BA = ba;
			PA = p;
			AB = a;
			RBI = r;
			H = h;
			BB = bb;
			HR = hr;
			
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

		public double getBattingAverage()
			{
				return BA;
			}

		public void setBattingAverage(double battingAverage)
			{
				this.BA = battingAverage;
			}

		public int getPA()
			{
				return PA;
			}

		public void setPA(int pA)
			{
				PA = pA;
			}

		
		public int getAB()
			{
				return AB;
			}

		public void setAB(int aB)
			{
				AB = aB;
			}

		public int getRBI()
			{
				return RBI;
			}

		public void setRBI(int rBI)
			{
				RBI = rBI;
			}

		public int getHit()
			{
				return H;
			}

		public void setHit(int hit)
			{
				H = hit;
			}

		public int getBB()
			{
				return BB;
			}

		public void setBB(int bB)
			{
				BB = bB;
			}

		public int getHR()
			{
				return HR;
			}

		public void setHR(int hR)
			{
				HR = hR;
			}
			
			
			
			
		}
		
		
		
	
