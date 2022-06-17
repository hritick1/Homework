package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText name,fname,mname,mob,email,reg;
Button button;
Spinner spinner;
int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
       fname=findViewById(R.id.fname);
        spinner=findViewById(R.id.spinner);
        mob=findViewById(R.id.mob);
        email=findViewById(R.id.email);
        reg=findViewById(R.id.reg);
        button=findViewById(R.id.submit);
//        ArrayList<String> arr=new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();
        list.add("none");
        list.add("male");
        list.add("female");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,list);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               value=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String father=fname.getText().toString();
                String names=name.getText().toString();
//                String mother=mname.getText().toString();
                String mobile=mob.getText().toString();
                String emailId=email.getText().toString();
                String regis=reg.getText().toString();
//                Long mob1=Long.parseLong(mobile);
//                Long reg1=Long.parseLong(regis);
//                arr.add("Name: "+names);
//                arr.add("Father Name: "+father);
//                arr.add("Mother Name: "+mother);
//                arr.add("Mobile No: "+mobile);
//                arr.add("Email Id: "+emailId);
//                arr.add("Registration No: "+regis);

                Intent intent=new Intent(MainActivity.this,ConfirmActivity.class);
                intent.putExtra("Hello1",names);
                intent.putExtra("Hello2",regis);
                intent.putExtra("Hello3",mobile);
                intent.putExtra("Hello4",list.get(value));
                startActivity(intent);

            }
        });
    }

}