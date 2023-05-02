package practise;

public class JavascriptExecutor {

	public static void main(String[] args) 
	{
		chromedriver driver=new ChromeDriver();
		driver.get(url);
		driver.switchTo().newWindow(WindowType.TAB);
		(or)
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(url);
		
	WebElement ele=	driver.findElement(By.xpath(""));
	JavascriptExecutor js=driver;
	js.exexuteScript("arguments[0].click();",ele);
	js.executeScript("arguments[0].setAttribute('value','supraja')",ele);
	js.executeScript("arguments[0].scrollIntoView();",ele);
	
	//without webelement
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	js.executeScript("window.scrollBy(0,3000)","");	
	
	WebElement ele=	driver.findElement(By.xpath(""));
	

	}

}
