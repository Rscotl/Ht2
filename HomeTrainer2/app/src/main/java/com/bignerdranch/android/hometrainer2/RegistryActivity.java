package com.bignerdranch.android.hometrainer2;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.UUID;

public class RegistryActivity extends AppCompatActivity {
    private EditText mName;
    private EditText mPassword;
    private EditText mEmail;
    private EditText mPhoneNumber;
    private EditText mAddress;
    private Button mNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        mName = (EditText)findViewById(R.id.personName);
        mName.getText();
        mAddress = (EditText)findViewById(R.id.address);
        mAddress.getText();
        mPassword = (EditText)findViewById(R.id.userPassword);
        mPassword.getText();
        mEmail = (EditText)findViewById(R.id.email);
        mEmail.getText();
        mPhoneNumber = (EditText)findViewById(R.id.phone);
        mPhoneNumber.getText();
        mNext = (Button)findViewById(R.id.next);
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistryActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

    }
}
