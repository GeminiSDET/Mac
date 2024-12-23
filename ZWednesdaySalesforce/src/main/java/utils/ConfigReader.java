package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;
    private final String propertiesFilePath = "src/main/resources/config.properties"; // Path to the properties file

    public ConfigReader() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(propertiesFilePath);
            properties.load(fileInputStream);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }
    public String getUsername1() {
        return properties.getProperty("username");
    }
    public String getPassword() {
        return properties.getProperty("password");
    }
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}
