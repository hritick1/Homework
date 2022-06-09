package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
CheckBox checkBox1;
    public static final String TEXT ="Hello.text";
    CheckBox checkBox2;
Button button;
RadioGroup radioGroup;
RadioButton radioButton;
String [] s={"Select type: ","Veg","Non-Veg"};
Spinner spinner;
int pos=0;

int price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        checkBox1=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        radioGroup=findViewById(R.id.radioGroup);
        spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter aa=new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,s);
        aa.setDropDownViewResource(androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
        ArrayList<String> ar=new ArrayList<String>();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder summary=new StringBuilder();
                ar.add("Item selected:");
                price=0;
                int selectedId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selectedId);

                if(selectedId==-1)
                    ar.add("\nNothing Selected in Crust");
                else
                    ar.add("\nCrust used: "+radioButton.getText());

                if(checkBox1.isChecked()){
                price+=20;
                    ar.add("\nAdded Cheese");

                }
                if(checkBox2.isChecked()){
                    price+=40;
                    ar.add("\nAdded Paneer");

                }
                ar.add("\n"+s[pos]);
//                Toast.makeText(MainActivity.this, summary.toString()+" \nTotal Price: $"+price, Toast.LENGTH_SHORT).show();

                    ar.add("\nTotal Price: "+price);

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putStringArrayListExtra(TEXT,ar);
                startActivity(intent);
            }

        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
pos=i;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}