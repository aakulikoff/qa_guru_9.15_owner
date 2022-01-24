package qa.guru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface SmallWebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("Chrome")
    Browser getBrowser();

    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("version.browser")
    @DefaultValue("96")
    String versionBrowser();
}
