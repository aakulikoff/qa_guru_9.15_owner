package qa.guru.owner.config;

import java.net.*;
import java.util.Objects;

public class BigWebDriverConfig {

    public URL getRemoteUrl(){
        String remoteUrl = System.getProperty("remoteUrl");
        if (Objects.nonNull(remoteUrl)){
            try {
                return new URL(remoteUrl);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Bad url");
            }
        }
        return null;
    }

    public Browser getBrowser(){
        String browserString = System.getProperty("browser");
        if (Objects.isNull(browserString)){
            return Browser.CHROME;
        }
        return Browser.valueOf(browserString);
    }

    public String getBaseUrl() {
        String baseUrlString = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrlString)){
            return "https://github.com";
        }
        return baseUrlString;
    }
}
