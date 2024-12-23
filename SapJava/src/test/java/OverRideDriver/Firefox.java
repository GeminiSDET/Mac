package OverRideDriver;

public class Firefox<driver> extends Base{

	@Override
	public void setUp() {

		driver= new FirefoxDriver();
	}

}
