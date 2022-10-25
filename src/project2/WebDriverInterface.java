package project2;

public interface WebDriverInterface {

    /*
    Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.
     */

    void open();
    void close();
    String getTitle();

}

interface RemoteWebDriver extends WebDriverInterface{

    void navigate();

}

interface TakesScreenshot extends RemoteWebDriver {

    void getScreenshot();

}


class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("open chrome");
    }

    @Override
    public void close() {
        System.out.println("close chrome");
    }

    @Override
    public String getTitle() {
        return"get title chrome";
    }

    @Override
    public void navigate() {
        System.out.println("navigate chrome");
    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("open firefox");
    }

    @Override
    public void close() {
        System.out.println("close firefox");
    }

    @Override
    public String getTitle() {
        return "get title firefox";
    }

    @Override
    public void navigate() {
        System.out.println("navigate firefox");
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("open safari");

    }

    @Override
    public void close() {
        System.out.println("close safari");
    }

    @Override
    public String getTitle() {
        return "get title safari";
    }

    @Override
    public void navigate() {
        System.out.println("navigate safari");

    }
}



