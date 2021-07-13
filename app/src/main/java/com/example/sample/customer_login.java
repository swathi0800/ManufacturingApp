package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

import org.w3c.dom.Text;

public class customer_login extends AppCompatActivity {
    private EditText courseNameEdt;
    private EditText courseTracksEdt;
    private EditText courseDurationEdt;
    private EditText courseDescriptionEdt;
    private EditText Cus_id;
    private Button addCourseBtn, readCourseBtn,display;
    private TextView cus_name,partno,quantity;
    private DBHandler dbHandler;
    private  SQLiteDatabase sqLiteDatabase;
    String cus_id;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);
        courseNameEdt = findViewById(R.id.idEdtCourseName);
        courseTracksEdt = findViewById(R.id.idEdtCourseTracks);
        courseDurationEdt = findViewById(R.id.idEdtCourseDuration);
        courseDescriptionEdt = findViewById(R.id.idEdtCourseDescription);
        addCourseBtn = findViewById(R.id.idBtnAddCourse);
        readCourseBtn = findViewById(R.id.idBtnReadCourse);
        display = findViewById(R.id.display);
        Cus_id= (EditText) findViewById(R.id.cus_id);
        cus_name = (TextView) findViewById(R.id.cus_name);
        partno = (TextView) findViewById(R.id.partno);
        quantity = (TextView) findViewById(R.id.quantity);
        cus_name.setVisibility(View.GONE);
        partno.setVisibility(View.GONE);
        quantity.setVisibility(View.GONE);
        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(customer_login.this);





    }
    public void searchdetails(View view){
        cus_id=Cus_id.getText().toString();

       dbHandler=new DBHandler(getApplicationContext());
    sqLiteDatabase =  dbHandler.getReadableDatabase();
        Cursor cursor=dbHandler.getdetails(cus_id,sqLiteDatabase);
        if(cursor.moveToFirst()){
            String Name=cursor.getString(0);
            String Partno=cursor.getString(1);
            String Quantity=cursor.getString(2);
            cus_name.setText(Name);
            partno.setText(Partno);
            quantity.setText(Quantity);
            cus_name.setVisibility(View.VISIBLE);
            partno.setVisibility(View.VISIBLE);
            quantity.setVisibility(View.VISIBLE);
        }
    }
}