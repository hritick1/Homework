package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView=findViewById(R.id.listView);
        String name=getIntent().getStringExtra("Hii1");
        String gender=getIntent().getStringExtra("Hii2");
        String regNo=getIntent().getStringExtra("Hii3");
        String mobNo1=getIntent().getStringExtra("Hii4");
        Long mob1=Long.parseLong(mobNo1);
        Long reg1=Long.parseLong(regNo);
      ArrayList<Data> list=new ArrayList<>();
      list.add(new Data(name,reg1,mob1,gender));
      Adapter adapter=new Adapter(getApplicationContext(),list);
        listView.setAdapter(adapter);
    }
}