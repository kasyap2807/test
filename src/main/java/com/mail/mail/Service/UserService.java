package com.mail.mail.Service;

import com.mail.mail.EmailService;
import com.mail.mail.Model.User;
import com.mail.mail.Repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepo userRepo;

    EmailSender emailSender;

    public UserService(UserRepo userRepo, EmailSender emailSender) {
        this.userRepo = userRepo;
        this.emailSender = emailSender;
    }

    public String SaveData(User user){
        userRepo.save(user);
        emailSender.Sendmail(user.getEMail(),user.getName());
        return "Saved Successfully";
    }

    public User getdata(String Name){
        return userRepo.findByName(Name);
//        return userRepo.getById(id);
    }
}
