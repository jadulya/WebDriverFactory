import configs.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Logger;

public class WebDriverFactoryTest {
    private final static Logger log = Logger.getLogger(WebDriverFactoryTest.class.getName());
    private Configuration cfg = ConfigFactory.create(Configuration.class);
    @Test

    public void testWebFactory() throws Exception {
        log.info(System.getProperty("browser"));

        String browser = System.getProperty("browser");
        WebDriver driver = WebDriverFactory.createNewDriver(browser);
        driver.get(cfg.url());
        driver.quit();
    }

    @Test

    public void testWithOptions() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setHeadless(true);
        log.info(System.getProperty("browser"));

        String browser = System.getProperty("browser");

        WebDriver driver = WebDriverFactory.createNewDriver(browser, options);
        driver.get(cfg.url());
        driver.quit();

    }

}

