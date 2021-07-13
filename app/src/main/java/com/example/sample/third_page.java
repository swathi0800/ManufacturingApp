package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class third_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
    }

    public void btnadd(View view) {
        Intent intent=new Intent(this,frst_page.class);
        startActivity(intent);

    }

    public void btninput(View view) {
        Intent intent=new Intent(this,customer_login.class);
        startActivity(intent);

    }
}