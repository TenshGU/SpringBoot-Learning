package com.example.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/9
 */
@ConfigurationProperties(prefix = "user")
@PropertySource(value = "classpath:",ignoreResourceNotFound = true)
public class User implements BeanNameAware {
    private String nameInIOC;
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNameInIOC() {
        return nameInIOC;
    }

    public void setNameInIOC(String nameInIOC) {
        this.nameInIOC = nameInIOC;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        nameInIOC = s;
    }
}
