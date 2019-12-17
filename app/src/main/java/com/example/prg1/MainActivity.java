package com.example.prg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btLogin;
    Button btRegister;
    EditText etUser;
    EditText etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btLogin=(Button)findViewById(R.id.btLogin);
        btRegister=(Button)findViewById(R.id.btRegister);
        etUser=(EditText)findViewById(R.id.etUser);
        etPass=(EditText)findViewById(R.id.etPass);
        btRegister.setOnClickListener(MainActivity.this);
        btLogin.setOnClickListener(MainActivity.this);

    }
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btLogin:
                Intent in=new Intent(MainActivity.this,HomeActivity.class);
                in.putExtra("UserName",etUser.getText().toString());
                startActivity(in);
                break;
            case R.id.btRegister:
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }
}
