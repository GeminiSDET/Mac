package JavaSapi;

public class TryCatchFinally {

	public static void main(String[] args) {

		try
		{
			System.out.println("Try block executed");
			int result = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block executed:" + e.getMessage());
			
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		
	}

}
