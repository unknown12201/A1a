package com.example.prg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
    EditText etDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        etDisplay=(EditText)findViewById(R.id.etDisplay);
        etDisplay.setText(getIntent().getExtras().getString("UserName"));
    }

}
