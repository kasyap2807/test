package com.mail.mail.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    JavaMailSender javaMailSender;

    public EmailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String Sendmail(String to,String name){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setText("Welcome to My World "+name);
        message.setSubject("Welcome Message From My World!!");

        javaMailSender.send(message);

        return "Success";
    }
}
