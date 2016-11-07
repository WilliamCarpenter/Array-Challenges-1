
public class arrayChallenges1
	{

		public static void main(String[] args)
			{
				challengeOne();
				System.out.println();
				challengeTwo();
				System.out.println();
				challengeThree();
				System.out.println();
				challengeFour();
			}
		public static void challengeOne()
		{
			String [] myArray = new String [5];
				myArray[0] = "Cookies";
				myArray[1] = "Cake";
				myArray[2] = "Brownies";
				myArray[3] = "Cheesecake";
				myArray[4] = "Ice Cream";
				System.out.println(myArray[2]);
		}
		public static void challengeTwo()
		{
			int [] myArray = new int [5];
				myArray[0] = 34;
				myArray[1] = 64;
				myArray[2] = 45;
				myArray[3] = 81;
				myArray[4] = 3;
				System.out.println(myArray[myArray.length-1]);
		}
		public static void challengeThree()
		{
			int [] myArray = new int [5];
			myArray[0] = 34;
			myArray[1] = 64;
			myArray[2] = 45;
			myArray[3] = 81;
			myArray[4] = 3;
			for ( int i = 0; i < myArray.length; i++)
				{
					System.out.println(myArray[i]);
				}
		}
		public static void challengeFour()
		{
			double myArrayTotal = 0;
			double [] myArray = new double [5];
			myArray[0] = 34;
			myArray[1] = 64;
			myArray[2] = 45;
			myArray[3] = 81;
			myArray[4] = 3;
			for (int i = 0; i < myArray.length; i++)
				{
					myArrayTotal += myArray[i];
				}
			System.out.println(myArrayTotal / myArray.length);
			
		}


	}
