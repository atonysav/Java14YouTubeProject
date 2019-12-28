package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.properties")
public interface IProjectConfig extends Config {

    @Key("baseURL")
    String baseURL();

    @Key("apiKey")
    String apiKey();
}
