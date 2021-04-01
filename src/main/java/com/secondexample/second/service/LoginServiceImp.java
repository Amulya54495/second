package com.secondexample.second.service;

import com.secondexample.second.model.User;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    User u1;
    User u2;

    @Override
    public String login(String uname, String password) {
         init();

        if (uname.equals(u1.getname()) && password.equals(u1.getpwd())) {
            return "It's me";
        }
        else if(uname.equalsIgnoreCase(u2.getname()) && password.equals(u2.getpwd())){
            return "Done";
        }
                else {
            return "who are you?";
        }
    }


private void init(){
        u1=new User();
        u1.setname("saibaba");
        u1.setpwd("s@i");
        u2=new User();
        u2.setname("amulya_@mu");
        u2.setpwd("Nopassword");
   }
    }


