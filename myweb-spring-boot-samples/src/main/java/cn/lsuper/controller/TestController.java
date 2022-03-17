package cn.lsuper.controller;

import cn.lsuper.autoconfigure.MyWebProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ALGiii
 */
@RestController
@RequestMapping("test")
public class TestController {
    private final MyWebProperties myWebProperties;

    public TestController(MyWebProperties myWebProperties) {
        this.myWebProperties = myWebProperties;
    }

    @GetMapping
    public String get() {
        return myWebProperties.getConfig();
    }
}
