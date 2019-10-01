package Utilities;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil {
	public static String getValueForKey(String key) throws Throwable, IOException
	{
		Properties configproperty=new Properties();
		configproperty.load(new FileInputStream(new File("./ConfigFile/Environment.properties")));
		return configproperty.getProperty(key);
		
	}
}
