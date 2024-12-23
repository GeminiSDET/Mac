package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties properties;
	
	static {
		try {
			FileInputStream fis=new FileInputStream("src/test/resources/config.properties");
			properties =new Properties();
			properties.load(fis);
		}
		catch(IOException e)
		{
			throw new RuntimeException("Configuration file is not found");
		}
	}
	public static String get (String key)
	{
		return properties.getProperty(key);
	}
}