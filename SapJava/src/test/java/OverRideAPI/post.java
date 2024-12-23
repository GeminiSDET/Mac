package OverRideAPI;

public class post extends Base {

	@Override
	public void sendRequest(String endpoint) {

		System.out.println("Sending POST request to " + endpoint);
	}

}
