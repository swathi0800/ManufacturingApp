package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnsuppliers(View view) {
        Intent intent=new Intent(this,Login_page.class);
        startActivity(intent);
    }

    public void btncustomers(View view) {
        Intent intent=new Intent(this,customer_login.class);
        startActivity(intent);
    }
}