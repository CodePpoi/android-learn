package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.util.ToastUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnLogin;

    private EditText mEtUser;

    private EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        mBtnLogin = findViewById(R.id.btn_login);

        mEtUser = findViewById(R.id.et_1);

        mEtPassword = findViewById(R.id.et_2);

        //实现跳转
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SlideActivity.class);
                startActivity(intent);
            }
        });
        mBtnLogin.setOnClickListener(this);
    }

    public void onClick(View view) {
        String username = mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();
        // 弹出的内容社会中

        String ok = "登陆成功";
        String fail = "账号或者密码错误";
        Intent intent = null;
//        if(username.equals("tang") && password.equals("123456")) {
            Toast.makeText(getApplicationContext(), ok, Toast.LENGTH_SHORT).show();
            ToastUtil.showMsg(MainActivity.this, ok);
            intent = new Intent(MainActivity.this, SlideActivity.class);
            startActivity(intent);
//        } else {
//            Toast toastCenter = Toast.makeText(getApplicationContext(), fail, Toast.LENGTH_SHORT);
//            toastCenter.setGravity(Gravity.CENTER, 0, 0);
//            toastCenter.show();
//        }
    }
}
