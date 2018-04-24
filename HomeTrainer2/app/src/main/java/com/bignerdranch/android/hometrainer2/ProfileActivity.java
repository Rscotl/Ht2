package com.bignerdranch.android.hometrainer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView mName;
    private TextView mPassword;
    private TextView mEmail;
    private TextView mPhoneNumber;
    private TextView mAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        mName = (TextView) findViewById(R.id.personName);
        mName.setText(0);
        mAddress = (TextView) findViewById(R.id.address);
        mAddress.setText(0);
        mPassword = (TextView) findViewById(R.id.userPassword);
        mPassword.setText(0);
        mEmail = (TextView) findViewById(R.id.email);
        mEmail.setText(0);
        mPhoneNumber = (TextView) findViewById(R.id.phone);
        mPhoneNumber.setText(0);
    }
}
