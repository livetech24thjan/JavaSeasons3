package apr17th;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		//File f=new File("D:\\009LiveTechWS\\JavaSeasons3\\Screenshots\\file3.txt");
		
		File f=new File(System.getProperty("user.dir")+"\\Screenshots\\file4.txt");
		
		f.createNewFile();
		
		System.out.println("End of Program..");

	}

}
