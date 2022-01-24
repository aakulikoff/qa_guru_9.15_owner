package qa.guru.owner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import qa.guru.owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private  WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGitHubTitleChrome() {
        assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testGitHubTitleFirefox() {
        assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
        driver.quit();
    }



}
