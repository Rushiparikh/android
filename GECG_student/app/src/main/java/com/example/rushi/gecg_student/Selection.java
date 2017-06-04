package com.example.rushi.gecg_student;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selection extends AppCompatActivity {
    Button button_student;
    Button button_faculty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        buttonOnClick();
    }
    public void buttonOnClick(){
        button_student=(Button)findViewById(R.id.btn_student);
        button_faculty=(Button)findViewById(R.id.btn_faculty);
        button_student.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rushi.gecg_student.Login");
                        startActivity(intent);
                    }
                }
        );
        button_faculty.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rushi.gecg_student.Login");
                        startActivity(intent);
                    }
                }
        );
    }
}
