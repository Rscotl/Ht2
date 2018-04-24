package com.bignerdranch.android.hometrainer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
private Button mLoginButton;
private Button mRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = (TextView)findViewById(R.id.username);
        username.getText();
        TextView password = (TextView)findViewById(R.id.password);
        password.getText();
        mLoginButton = (Button) findViewById(R.id.login);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start HomeActivity
                Intent intent = new Intent(LoginActivity.this, NavActivity.class);
                startActivity(intent);
            }
        });
        mRegisterButton = (Button) findViewById(R.id.register);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start RegistryActivity
                Intent intent = new Intent(LoginActivity.this,RegistryActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
