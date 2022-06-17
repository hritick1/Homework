package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;

public class ConfirmActivity extends AppCompatActivity {
AutoCompleteTextView name1,gender1,mob12,reg12;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        String name=getIntent().getStringExtra("Hello1");
        String gender=getIntent().getStringExtra("Hello4");
        String regNo=getIntent().getStringExtra("Hello2");
        String mobNo1=getIntent().getStringExtra("Hello3");
//        Long mob1=Long.parseLong(mobNo1);
//                Long reg1=Long.parseLong(regNo);

               name1=findViewById(R.id.name);
               gender1=findViewById(R.id.gender1);
               mob12=findViewById(R.id.mobile);
               reg12=findViewById(R.id.regis);
        ArrayList<String> list=new ArrayList<>();
        list.add(name);
        list.add(gender);
        list.add(regNo);
        list.add(mobNo1);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.select_dialog_item,list);
        name1.setThreshold(1);
        gender1.setThreshold(1);
        mob12.setThreshold(1);
        reg12.setThreshold(1);

        name1.setAdapter(adapter);
        gender1.setAdapter(adapter);
        mob12.setAdapter(adapter);
        reg12.setAdapter(adapter);

       button=findViewById(R.id.confirm);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(ConfirmActivity.this,ListViewActivity.class);
               intent.putExtra("Hii1",name);
               intent.putExtra("Hii2",gender);
               intent.putExtra("Hii3",regNo);
               intent.putExtra("Hii4",mobNo1);
               startActivity(intent);
           }
       });

    }
}