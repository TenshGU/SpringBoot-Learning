package com.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/9
 */
@Component
//PropertySource仅能与SPEL表达式配合使用，不然无法从配置文件中得知是哪个元素，yml文件中也能使用SPEL
@PropertySource("classpath:myconfig.properties")
public class Pet {
    @Value("${name}")
    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
