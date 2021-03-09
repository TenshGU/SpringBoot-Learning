package com.example.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/9
 */
//properties和yml文件中：不能用user前缀，不然会输出电脑用户名
@ConfigurationProperties(prefix = "user01")
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
