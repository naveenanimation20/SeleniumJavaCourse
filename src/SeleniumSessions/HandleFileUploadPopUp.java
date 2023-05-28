package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

/*
    UPLOADING FILES: It can be achieved by 4 methods
                        1. sendKeys("absolute path")
                        2. Robot Class (This is a class of java not selenium)
                        3. Skiuli
                        4. AutoIT (Can only be used in Windows OS). In mac either use Parallels/Bootcamp Assistant
 */

public class upload_download {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/mukul/Documents/Testing/Automation/drivers/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://omayo.blogspot.com");

		WebElement upload = driver.findElement(By.id("uploadfile"));
		upload.sendKeys("/Users/mukul/Downloads/CV_MUKUL_SHARMA.docx");     //Give your file path/location


		//USING ROBOT CLASS
		driver.navigate().to("https://ps.uci.edu/~franklin/doc/file_upload.html");

		WebElement file_upload = driver.findElement(By.xpath("//input[@name = 'userfile']"));

		//Getting absolute file path
		String filePath = "/Users/mukul/Downloads/CV_MUKUL_SHARMA.docx";

		//Setting the filepath to clipboard - using StringSelection class from java.awt.datatransfer pkg
		// and Toolkit class from java.awt pkg
        /*
        StringSelection stringSelection = new StringSelection(filePath); -> This line creates a new instance of the StringSelection class,
        which represents a simple text data flavor used for transferring a string of characters.
         It takes the filePath as its argument, which is the absolute path of the file you want to upload.
         */
		StringSelection stringSelection = new StringSelection(filePath);

        /*
        Toolkit.getDefaultToolkit().getSystemClipboard() -> retrieves the system clipboard using the getDefaultToolkit() method of the
        Toolkit class.

        Let's break it down:

        Toolkit: The Toolkit class is part of the java.awt package and provides a set of tools for various system-related operations,
                    such as interacting with the system clipboard, accessing the screen resolution, and more.
        getDefaultToolkit(): This method is a static method of the Toolkit class that returns the default toolkit instance
                                associated with the system. The default toolkit is typically the toolkit used by the underlying operating system for graphical user interface (GUI) operations.
        getSystemClipboard(): Once we have the default toolkit instance, we can call the getSystemClipboard() method on it.
                                This method returns the system clipboard, which is a shared resource that allows data to be transferred between different applications through copy and paste operations.

        By calling Toolkit.getDefaultToolkit().getSystemClipboard(), we are accessing the system clipboard, which is where we
        want to set the file path using the StringSelection object in the next line of code.

        In summary, this line of code retrieves the system clipboard so that we can set the contents of the clipboard to the
        file path using the setContents() method of the clipboard later on. This allows us to simulate the action of copying the
        file path and pasting it into the file input element on the webpage using the Robot class.
         */
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		//Creating a new instance of Robot class
		Robot robot = new Robot();

		// Simulate pressing Ctrl+V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Simulate pressing Enter to perform the file upload
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.quit();






		//NOTE: Sometimes click() method doesn't work then we can take help of JS EXECUTOR.








	}
}
