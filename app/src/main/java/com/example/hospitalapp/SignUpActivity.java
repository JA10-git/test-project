package com.example.hospitalapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.add);
        ed3=(EditText) findViewById(R.id.pin);
        ed4=(EditText) findViewById(R.id.mob);
        ed5=(EditText) findViewById(R.id.unam);
        ed6=(EditText) findViewById(R.id.add);
    }
}