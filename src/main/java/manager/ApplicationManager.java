package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    //Create to driver
    WebDriver wd;

    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://vk.ru/");
    }

    public void stop(){

    }

}
