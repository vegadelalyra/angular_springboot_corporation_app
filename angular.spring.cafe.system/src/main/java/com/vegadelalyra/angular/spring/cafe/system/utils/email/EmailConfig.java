package com.vegadelalyra.angular.spring.cafe.system.utils.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class EmailConfig {

    @Value("${spring.mail.host}")
    private String host;

    @Value("${spring.mail.port}")
    private int port;

    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.password}")
    private String password;

    @Value("${spring.mail.properties.mail.smtp.starttls.enable}")
    private String isEnabled;

    @Value("${spring.mail.properties.mail.smtp.starttls.required}")
    private String isRequired;

    @Value("${spring.mail.properties.mail.smtp.auth}")
    private String shallAuth;

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(host);
        mailSender.setPort(port);

        mailSender.setUsername(username);
        mailSender.setPassword(password);

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", shallAuth);
        props.put("mail.smtp.starttls.enable", isEnabled);
        props.put("mail.smtp.starttls.required", isRequired);
        props.put("mail.debug", "true");

        return mailSender;
    }
}
