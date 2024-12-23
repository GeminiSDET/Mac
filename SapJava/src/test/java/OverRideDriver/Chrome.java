package OverRideDriver;

public class Chrome extends Base{

	@Override
	public void setUp() {

		driver=new ChromeDriver();
	}

}
