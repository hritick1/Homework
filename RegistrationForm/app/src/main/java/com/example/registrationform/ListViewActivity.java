package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

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
        ArrayList <String> list=getIntent().getStringArrayListExtra("hello");
        listView=findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }
}