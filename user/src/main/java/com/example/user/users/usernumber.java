package com.example.user.users;

import com.example.number.gx.userinfo;
import org.springframework.stereotype.Service;

@Service("1.0.0")
public class usernumber implements userinfo {

    @Override
    public void info(String who){
        who = "xxx";
    }
}
