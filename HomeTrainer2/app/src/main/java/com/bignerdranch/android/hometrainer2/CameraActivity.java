package com.bignerdranch.android.hometrainer2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {
private ImageButton mImageButton;
private ImageView mImageView;
private Button mCompleteButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

       mImageButton = (ImageButton)findViewById(R.id.imageButton);
       mImageView = (ImageView)findViewById(R.id.image);
       mCompleteButton = (Button)findViewById(R.id.complete);
       mCompleteButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(CameraActivity.this, HomeFragment.class);
               startActivity(intent);
           }
       });
       mImageButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent camInt = new Intent(MediaStore.ACTION_IMAGE_CAPTURE );
               startActivity(camInt);
           }
       });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        mImageView.setImageBitmap(bitmap);
    }
}
