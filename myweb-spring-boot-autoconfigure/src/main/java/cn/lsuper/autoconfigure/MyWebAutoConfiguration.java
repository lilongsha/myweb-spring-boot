package cn.lsuper.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author ALGiii
 */
@Configuration
@EnableConfigurationProperties({MyWebProperties.class})
public class MyWebAutoConfiguration {
    private final MyWebProperties myWebProperties;

    public MyWebAutoConfiguration(MyWebProperties myWebProperties) {
        this.myWebProperties = myWebProperties;
    }
}
