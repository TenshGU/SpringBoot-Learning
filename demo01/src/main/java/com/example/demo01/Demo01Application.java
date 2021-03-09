package com.example.demo01;

import com.example.beans.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * 用于实验@EnableConfigurationProperties+@ConfigurationProperties注解
 */
@EnableConfigurationProperties(User.class)
@SpringBootApplication(scanBasePackages = "com.example")
public class Demo01Application {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Demo01Application.class, args);

        //@EnableConfigurationProperties(User.class)仅与@ConfigurationProperties搭配
        //默认名字不是首字母小写，而是配置文件前缀-全限定名
        User user01 = run.getBean(User.class);
        User user02 = (User) run.getBean(user01.getNameInIOC());
        System.out.println(user01.getNameInIOC());
        System.out.println(user01);
        System.out.println(user01==user02?"相等":"不等");
    }

}
