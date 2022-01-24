package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.SmallWebDriverConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTest {

    @Test
    public void webLocaleTest() {
        System.setProperty("environment", "locale");

        SmallWebDriverConfig webConfig = ConfigFactory.create(SmallWebDriverConfig.class, System.getProperties());
        assertThat(webConfig.getBrowser()).isEqualTo("chrome");
        assertThat(webConfig.versionBrowser()).isEqualTo("96");
    }

    @Test
    public void webRemoteTest() {
        System.setProperty("environment", "remote");

        SmallWebDriverConfig webConfig = ConfigFactory.create(SmallWebDriverConfig.class, System.getProperties());
        assertThat(webConfig.getBrowser()).isEqualTo("chrome");
        assertThat(webConfig.versionBrowser()).isEqualTo("95");
        assertThat(webConfig.getRemoteUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }


}
