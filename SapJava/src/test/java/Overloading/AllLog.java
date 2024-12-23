package Overloading;

public class AllLog {

	public void log(String message)
	{
		System.out.println("Info: " + message);
	}
	public void log(String message,int ErrorCode)
	{
		System.out.println("Error: " + message +"(Error Code: " + message+")");
	}
}
