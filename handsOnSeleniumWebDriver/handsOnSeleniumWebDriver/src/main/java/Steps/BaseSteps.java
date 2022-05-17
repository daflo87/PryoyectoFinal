package Steps;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
    WebDriver _webDriver;
    final String urlMyStore = "http://automationpractice.com/index.php";

    public BaseSteps(WebDriver webDriver) {
        System.out.println("Constructor del BaseSteps.java");
        this._webDriver = webDriver;
    }

    public void openMyStore() {
        System.out.println("openMyStore metodo en BaseSteps.java");
        _webDriver.get(urlMyStore);
        _webDriver.manage().window().maximize();
        System.out.println("El navegador ha abierto la URL: " + urlMyStore);
    }
}
