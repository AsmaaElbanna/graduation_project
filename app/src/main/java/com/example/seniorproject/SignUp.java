package com.example.seniorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class SignUp extends AppCompatActivity {

    private EditText fName, email, pass, confPass;
    private TextView wrongConfPass;
    private boolean passChecker = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        init();
    }

    private void init() {
        fName = findViewById(R.id.edit_text_name_id);
        email = findViewById(R.id.edit_text_email_id);
        pass = findViewById(R.id.edit_text_password_id);
        confPass = findViewById(R.id.edit_text_conf_password_id);
        wrongConfPass = findViewById(R.id.wrong_conf_pass);
        passCnofInit();

    }

    private void passCnofInit() {
        confPass.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {

                if (confPass.getText().toString().equals(pass.getText().toString())) {
                    passChecker = true;
                } else {
                    passChecker = false;
                }
                passConfermTrue(passChecker);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                passChecker = false;
            }
        });
        pass.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {

                if (confPass.getText().toString().equals(pass.getText().toString())) {
                    passChecker = true;
                } else {
                    passChecker = false;
                }
                passConfermTrue(passChecker);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                passChecker = false;
            }
        });
    }

    private void passConfermTrue(boolean flag) {
        if (flag){
            wrongConfPass.setVisibility(View.GONE);
        } else {
            wrongConfPass.setVisibility(View.VISIBLE);
        }
    }

    public void page_two(View view) {
        startActivity(new Intent(SignUp.this, MainActivity.class));
    }
}