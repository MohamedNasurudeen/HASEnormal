package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		Properties p =new Properties();
		p.load(fis);
		
		//Write data to properties file
		p.put("Password","trainee");
		
		//save data in properties file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/commonData.properties");
		p.store(fos,"password modified");
		
		

	}

}
