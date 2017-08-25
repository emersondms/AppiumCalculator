package pageobject;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorPageObject {

    private AppiumDriver driver;

    private String appPkg = "com.android2.calculator3:id/";
    private By zero = By.xpath("//android.widget.Button[@text='0']");
    private By add = By.id(appPkg + "op_add");
    private By sub = By.id(appPkg + "op_sub");
    private By mult = By.id(appPkg + "op_mul");
    private By div = By.id(appPkg + "op_div");
    private By formula = By.id(appPkg + "formula");
    private By result = By.id(appPkg + "result");

    public CalculatorPageObject(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement zeroButton() {
        return driver.findElement(zero);
    }

    public WebElement digitButton(int number) {
        return driver.findElement(By.id(appPkg + "digit_" + number));
    }

    public WebElement sumButton() {
        return driver.findElement(add);
    }

    public WebElement subButton() {
        return driver.findElement(sub);
    }

    public WebElement multButton() {
        return driver.findElement(mult);
    }

    public WebElement divButton() {
        return driver.findElement(div);
    }

    public WebElement formulaEditText() {
        return driver.findElement(formula);
    }

    public WebElement resultView() {
        return driver.findElement(result);
    }
}
