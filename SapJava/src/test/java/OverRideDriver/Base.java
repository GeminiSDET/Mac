package OverRideDriver;

public abstract class Base {
	protected WebDriver driver;
	
	public abstract void setUp(driver);
	
	public void tearDown()
	{
		if(driver !=null)
		{
			driver.quit();
		}
	}

}
