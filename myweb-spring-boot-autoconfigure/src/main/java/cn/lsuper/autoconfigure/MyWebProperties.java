package cn.lsuper.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ALGiii
 */
@ConfigurationProperties(prefix = MyWebProperties.MYWEB_PREFIX)
public class MyWebProperties {
    public static final String MYWEB_PREFIX = "myweb";

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
