package com.example.prg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btnok;
        btnok=(Button)findViewById(R.id.btnok);
        btnok.setOnClickListener(RegisterActivity.this);

        }
        public void onClick(View v){
            Intent int1=new Intent(RegisterActivity.this,MainActivity.class);
            startActivity(int1);
        }
    }

