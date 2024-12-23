package Interface;

public class ChromeDriver implements WebDriverInterface{

	public void initializeDriver() {

		System.out.println("Initializing ChromeDriver");
	}

	public void closeDriver() {

		System.out.println("Closing ChromeDriver");
	}

}
