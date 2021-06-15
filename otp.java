package com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.EditText;

import com.example.eventplanner.R;
import com.razorpay.OTP;

public class otp extends AppCompatActivity {
    EditText editText_otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        editText_otp = findViewById(R.id.editText_otp);
        requestPermissions();




    }

    private void setEditText_otp(EditText editText_otp) {
    }

    private void requestPermissions() {
        if(ContextCompat.checkSelfPermission(com.otp.this, Manifest.permission.RECEIVE_SMS)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(com.otp.this,new String[]{
                    Manifest.permission.RECEIVE_SMS
            },100);
        }
    }
}