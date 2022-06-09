package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView=findViewById(R.id.listView);
        ArrayList<String> data=getIntent().getExtras().getStringArrayList(MainActivity.TEXT);
        ArrayAdapter<String > adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
listView.setAdapter(adapter);
    }
}