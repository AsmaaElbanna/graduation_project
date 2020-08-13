package com.example.seniorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void page_two(View view) {
        startActivity(new Intent(Login.this, MainActivity.class));
    }

    public void openSignUpActivity(View view) {
        startActivity(new Intent(Login.this, SignUp.class));
    }
}
