package com.mail.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ServiceLearn {
    @Autowired
    public JavaMailSender mailsender;



    public void mailsender(String to, String subject, String text){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        mailsender.send(message);

    }


}
