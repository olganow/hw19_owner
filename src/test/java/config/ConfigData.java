package config;

import org.aeonbits.owner.Config;

import static com.codeborne.selenide.Browsers.CHROME;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface ConfigData extends Config {

    @Key("browser")
    @DefaultValue(CHROME)
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("126")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://british-bakery.ru")
    String getBaseUrl();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteUrl")
    String remoteUrl();
}
