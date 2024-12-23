package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthPage;

public class LoginTest {
    AuthPage authPage = new AuthPage();

    @Test
    public void testLoginWithValidCredentials() {
        var response = authPage.login("azarriju88@gmail.com", "Azar~!@#4");
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertNotNull(response.jsonPath().getString("token"));
    }

    // Add 3 more test cases for invalid credentials, missing fields, etc.
}