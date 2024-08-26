package com.mail.mail.Controller;

import com.mail.mail.Model.User;
import com.mail.mail.Service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/savedata")

    public String Savedata(@RequestBody User user){
        return userService.SaveData(user);
    }

    @GetMapping("/getbyname/{Username}")
    public User getname(@PathVariable String Username){
        return userService.getdata(Username);
    }
}
