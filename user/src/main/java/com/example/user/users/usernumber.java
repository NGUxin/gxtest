package com.example.user.users;

import com.example.number.gx.userinfo;
import org.springframework.stereotype.Service;


@Service
public class usernumber implements userinfo {

    @Override
    public void info(String who){
        who = "xxx";
    }
}
