package JavaSapi;

public class HighestAndSecondHighest {

	public static void main(String[] args) {

		int[] numbers = {12,34,54,233,655,876,999,987};
		
		int highest= Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		
		for(int num:numbers)
		{
			if(num>highest)
			{
				secondHighest=highest;
				highest=num;
			}
			else if (num>secondHighest && num!=highest)
			{
				secondHighest=num;
			}
		}
		System.out.println("Highest Number : " + highest);
		System.out.println("Second Highest Number: " + secondHighest);
		
	}

}
