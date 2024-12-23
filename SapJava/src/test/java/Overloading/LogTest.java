package Overloading;

public class LogTest {

	public static void main(String[] args) {

		AllLog lo=new AllLog();
		
		lo.log("Test started");
		lo.log("Test failed",404);
	}

}
