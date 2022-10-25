package project2;

public class WebDriverTester {
    public static void main(String[] args) {

    ChromeDriver chromeDriver=new ChromeDriver();
    chromeDriver.open();
    chromeDriver.navigate();
    System.out.println(chromeDriver.getTitle());
    chromeDriver.close();

    FirefoxDriver firefoxDriver= new FirefoxDriver();
    firefoxDriver.open();
    firefoxDriver.navigate();
    System.out.println(firefoxDriver.getTitle());
    firefoxDriver.close();

    SafariDriver safariDriver=new SafariDriver();
    safariDriver.open();
    safariDriver.navigate();
    System.out.println(safariDriver.getTitle());
    safariDriver.close();



    }


}
