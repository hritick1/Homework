package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText name,fname,mname,mob,email,reg;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
       fname=findViewById(R.id.fname);
        mname=findViewById(R.id.mname);
        mob=findViewById(R.id.mob);
        email=findViewById(R.id.email);
        reg=findViewById(R.id.reg);
        button=findViewById(R.id.submit);
        ArrayList<String> arr=new ArrayList<>();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String father=fname.getText().toString();
                String names=name.getText().toString();
                String mother=mname.getText().toString();
                String mobile=mob.getText().toString();
                String emailId=email.getText().toString();
                String regis=reg.getText().toString();
                arr.add("Name: "+names);
                arr.add("Father Name: "+father);
                arr.add("Mother Name: "+mother);
                arr.add("Mobile No: "+mobile);
                arr.add("Email Id: "+emailId);
                arr.add("Registration No: "+regis);
                Intent intent=new Intent(MainActivity.this,ListViewActivity.class);
                intent.putStringArrayListExtra("hello",arr);
                startActivity(intent);

            }
        });
    }
}