package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Scrrenshot extends TestBase {
	
public static void scshot() throws IOException {
	
	File scnfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(scnfile, new File("C:\\Users\\kiran\\eclipse-workspace\\project1\\res\\error123.png"));
	
}
	
	
	

}
