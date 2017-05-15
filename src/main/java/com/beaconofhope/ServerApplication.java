package com.beaconofhope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;
import org.springframework.hateoas.config.EnableEntityLinks;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@ComponentScan("com.beaconofhope")
@SpringBootApplication

//@EnableEntityLinks// dint remmber what is th purpose of this one

public class ServerApplication {

    public static void main(String[] args) {
        System.out.println("Spring Boot begins...");
        ApplicationContext ctx = SpringApplication.run(ServerApplication.class, args);

//        printBeansFromContext(ctx);

    }

    static void printBeansFromContext(ApplicationContext ctx) {
        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();

        //Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        System.out.println("Spring Boot started...");
    }

    @Bean
    ProjectionFactory projectionFactory() {
        return new SpelAwareProxyProjectionFactory();
    }


}
