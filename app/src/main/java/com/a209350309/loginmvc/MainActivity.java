package com.a209350309.loginmvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.UUID;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText etName;
    private EditText etPassword;
    private LoginModel loginModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        etPassword=findViewById(R.id.etPassword);
        loginModel=new LoginModel(this);
        findViewById(R.id.btLogin)
                .setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btLogin:
                attemptLogin();
                break;
        }
    }

    private void  attemptLogin(){
        String name=etName.getText().toString();
        String password=etPassword.getText().toString();
        loginModel.login(name,password,listener);
    }

    private OnLoginListener listener=new OnLoginListener() {
        @Override
        public void onSucceed(UUID uid, String username) {
            Toast.makeText(MainActivity.this,"Login Succeed!"+username,Toast.LENGTH_LONG).show();
        }

        @Override
        public void onError(String error) {
            Toast.makeText(MainActivity.this,error,Toast.LENGTH_LONG).show();
        }
    };
}