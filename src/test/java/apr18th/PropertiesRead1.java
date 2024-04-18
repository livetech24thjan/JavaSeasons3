package apr18th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\009LiveTechWS\\JavaSeasons3\\config.properties");

		Properties pr1=new Properties();
		
		pr1.load(fis);
		
		System.out.println(pr1.getProperty("browser"));
		System.out.println(pr1.getProperty("url"));
		System.out.println(pr1.getProperty("username"));
		System.out.println(pr1.getProperty("password"));
		
		
		
	}

}
