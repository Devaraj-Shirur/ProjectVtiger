package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyLib extends Constants {
	
	public static String readDataFromPropertyFile(String propfile) {
		
		
	FileInputStream fis = null;
	try {
		Properties pfile = new Properties();
		pfile.load(fis);;
		fis = new FileInputStream(propertyPath);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return propfile ;
		
		
	}
	
	

}
