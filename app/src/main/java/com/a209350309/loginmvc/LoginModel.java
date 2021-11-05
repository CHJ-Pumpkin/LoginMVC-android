package com.a209350309.loginmvc;

import android.content.Context;

import java.util.UUID;

public class LoginModel {
//    public String check(String etName,String etPassword){
//        if (etName.equals("root") && etPassword.equals("root")){
//            return "1";
//
//        }else {
//            return "0";
//        }
//    }
    public LoginModel(Context context){

    }
    public void login(String name,String password,OnLoginListener listener){
        if (name.equals("209350309") && password.equals("123456")){
            listener.onSucceed(UUID.randomUUID(),"CHJ");
        }else {
            listener.onError("用户名或密码不正确！");
        }
    }
}
