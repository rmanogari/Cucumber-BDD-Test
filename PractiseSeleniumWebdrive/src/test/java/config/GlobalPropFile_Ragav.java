package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class GlobalPropFile_Ragav {
	
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	static String configFilePath = projectPath+"/src/test/java/config/config.properties";
	
	public static void main(String[] args) throws IOException {
		
		getProperties();
		setProperties();
		
	}

	public static void getProperties() {
		
		try {
			
			//InputStream input = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
			InputStream input = new FileInputStream(configFilePath);
			prop.load(input);
			
			String loginURL = prop.getProperty("url");
			System.out.println(loginURL);
			
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void setProperties() throws IOException {
		
		try {
			
			//OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			OutputStream output = new FileOutputStream(configFilePath);
			prop.setProperty("Application", "MLT");
			prop.store(output, null);
			
			
		} catch (FileNotFoundException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	}
}
