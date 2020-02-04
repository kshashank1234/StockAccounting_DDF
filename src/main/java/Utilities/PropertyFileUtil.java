package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil {
	
	
	public static String getValueForKey(String Key) throws Exception{
		
		Properties configProperties=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\sashank.QEDGE\\Desktop\\Batch81\\StockAccounting_Hybrid_MVN\\PropertiesFile\\Environment.properties");
		
		configProperties.load(fis);
		
		return configProperties.getProperty(Key);
		
	}

}
