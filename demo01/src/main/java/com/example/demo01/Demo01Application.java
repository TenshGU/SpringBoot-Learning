package com.example.demo01;

import com.example.beans.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

/**
 * 用于实验@EnableConfigurationProperties+@ConfigurationProperties/@PropertySource注解
 * 以及@Component+@ConfigurationProperties/@PropertySource
 */
@EnableConfigurationProperties(User.class)
@SpringBootApplication(scanBasePackages = "com.example")
public class Demo01Application {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Demo01Application.class, args);
        /**
         * 使用了@EnableConfigurationProperties(User.class)
         * 默认名字不是首字母小写，而是首字母小写+全限定名
         */
        User user01 = (User) run.getBean(User.class);
        User user02 = (User) run.getBean("user-com.example.beans.User");
        System.out.println(user01.getNameInIOC());
        System.out.println(user01==user02?"相等":"不等");
    }

}
