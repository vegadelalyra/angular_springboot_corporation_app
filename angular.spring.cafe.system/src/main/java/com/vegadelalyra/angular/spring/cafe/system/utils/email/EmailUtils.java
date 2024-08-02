package com.vegadelalyra.angular.spring.cafe.system.utils.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailUtils {

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(String to, String subject, String text, List<String> list) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("98dvega@gmail.com");
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);
            if (list != null && !list.isEmpty()) {
                message.setCc(getCcArray(list));
            }
            emailSender.send(message);
        } catch (Exception e) {
            // Handle the exception (e.g., log it)
            e.printStackTrace();
        }
    }

    private String[] getCcArray(List<String> ccList) {
        String[] cc = new String[ccList.size()];
        for (int i = 0; i < ccList.size(); i++) {
            cc[i] = ccList.get(i);
        }
        return cc;
    }
}
