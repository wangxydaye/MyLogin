package com.bwei.mylian.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bwei.mylian.R;
import com.bwei.mylian.model.LoginModelImpl;
import com.bwei.mylian.presenter.LoginPresenterImpl;

public class MainActivity extends AppCompatActivity implements LoginView,View.OnClickListener{
    private EditText name;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }

    private void initview() {
        name = findViewById(R.id.mobile);
        password = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        Button zhuc = findViewById(R.id.reg);
        login.setOnClickListener(this);
        zhuc.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.login:
                LoginPresenterImpl loginPresenter = new LoginPresenterImpl();
                loginPresenter.loginPresenter(new LoginModelImpl(),this);
                break;
            case R.id.reg:
                Intent intent = new Intent(MainActivity.this, LegActivity.class);
                startActivity(intent);
                break;
        }
    }
    @Override
    public String getMobile() {
        return name.getText().toString();
    }

    @Override
    public String getPassWord() {
        return password.getText().toString();
    }

    @Override
    public void LoginSuccess() {
        Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
    }

    @Override
    public void LoginError() {
        Toast.makeText(MainActivity.this,"登录失败，请注册",Toast.LENGTH_LONG).show();
    }
}
