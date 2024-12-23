package OverRideAPI;

public class Get extends Base{

	@Override
	public void sendRequest(String endpoint) {

		System.out.println("Sending Get Request to " + endpoint);
	}

}
