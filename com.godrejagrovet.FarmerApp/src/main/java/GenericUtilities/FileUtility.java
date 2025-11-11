package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *@author DivyaPrakashAmar
 */
public class FileUtility {
	
	/**
	 *This method is use to fecth data from property file
	 *@param key , here key is passed to call the value 
	 */
	public static String getDataFromProperty(String key) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\testing.engineer\\git\\repository3\\Agrovet.Samadhan.Operator\\testData\\ConfigrationFile.property");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
}
