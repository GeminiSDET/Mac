package OverRiding;

public class TestPOM {

	public static void main(String[] args) {

		Page page=new LoginPage();
		page.clickElement();
		
		page = new HomePage();
		page.clickElement();
	}

}
