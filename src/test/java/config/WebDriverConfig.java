package config;

import com.codeborne.selenide.Configuration;

public class WebDriverConfig {
    private final ConfigData configData;

    public WebDriverConfig(ConfigData configData) {
        this.configData = configData;
    }

    public void configData() {
        Configuration.baseUrl = configData.getBaseUrl();
        Configuration.browser = configData.getBrowser();
        Configuration.browserVersion = configData.getBrowserVersion();
        if (configData.isRemote()) {
            Configuration.remote = configData.remoteUrl();
        }
    }
}