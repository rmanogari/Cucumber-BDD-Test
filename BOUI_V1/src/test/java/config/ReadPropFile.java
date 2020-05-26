package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropFile  {
	
	
	protected Properties prop = null;
	
	public String projectPath = System.getProperty("user.dir");
	public String gblDataFilePath = projectPath+"/src/test/java/config/globalData.properties";
	protected InputStream input = new FileInputStream(gblDataFilePath);;
	
	public ReadPropFile() throws Exception{
		
		prop = new Properties();
		prop.load(input);
	}
	
	public String getMLTUrl() 
	{
		return prop.getProperty("MLTUrl");
		
	}
	
	public String getMLTUserName()
	{
		return prop.getProperty("MLTUserName");
	}
	
	public String getMLTPwd() 
	{
		return prop.getProperty("MLTPwd");
	}
	
	public String getpractiseUrl()
	{
		return prop.getProperty("practiseUrl");
	}
	
}
