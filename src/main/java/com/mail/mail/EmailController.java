package com.mail.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController {


    private String to;
    private String subject;
    private String text;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Autowired
    private EmailService emailService;

    @Autowired
    private ServiceLearn sl;

    @GetMapping("/send-email")
    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
        emailService.sendSimpleEmail(to, subject, text);
        return "Email sent successfully!";
    }

    @PostMapping("/sendbyme")
    public String sendedbyme(@RequestBody EmailController emailController){
        sl.mailsender(emailController.getTo(),emailController.getSubject(),emailController.getText());
        return  "Success";
    }
}
