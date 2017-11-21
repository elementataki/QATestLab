import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ScriptB {
    public static void main(String[] args) {

        WebDriver driver = initChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("webinar.test@gmail.com");
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();

        WebElement title = (new WebDriverWait(driver, 1)).until(ExpectedConditions.presenceOfElementLocated(By.className("title")));
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement ordersLink = driver.findElement(By.linkText("Заказы"));
        ordersLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement catalogLink = driver.findElement(By.linkText("Каталог"));
        catalogLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement clientsLink = driver.findElement(By.linkText("Клиенты"));
        clientsLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement supportLink = driver.findElement(By.linkText("Служба поддержки"));
        supportLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement statisticsLink = driver.findElement(By.linkText("Статистика"));
        statisticsLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement modulesLink = driver.findElement(By.linkText("Modules"));
        modulesLink.click();
        WebElement categoriesTitle = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.id("categories")));
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        WebElement categoriesTitleRef = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.id("categories")));
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement designLink = driver.findElement(By.linkText("Design"));
        designLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement carriersLink = driver.findElement(By.linkText("Доставка"));
        carriersLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement paymentLink = driver.findElement(By.linkText("Способ оплаты"));
        paymentLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement internationalLink = driver.findElement(By.linkText("International"));
        internationalLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement shopParametersLink = driver.findElement(By.linkText("Shop Parameters"));
        shopParametersLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        WebElement settingsLink = driver.findElement(By.linkText("Конфигурация"));
        settingsLink.click();
        System.out.println(driver.getTitle() + "page is open");
        driver.navigate().refresh();
        System.out.println(driver.getTitle() + "page is refreshed");

        driver.quit();
    }


    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}