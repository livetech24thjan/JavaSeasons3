package apr16th;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxLaunch {
	
	@Test
	public void launchBrowserTest()
	{
		new FirefoxDriver();
	}

}
