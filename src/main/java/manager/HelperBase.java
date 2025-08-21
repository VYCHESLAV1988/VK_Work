package manager;

import org.openqa.selenium.WebDriver;

public class HelperBase {

    WebDriver wd;
    //Create to Constructor: Click right mice button chose to Generate ==> Constructor ==> wd:WebDriver

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }
}
