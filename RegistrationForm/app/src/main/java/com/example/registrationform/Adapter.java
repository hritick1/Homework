package com.example.registrationform;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Data> {
    public Adapter(@NonNull Context context, ArrayList<Data> list) {
        super(context, 0,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item=convertView;
        if(item==null){
            item= LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }
        TextView name=item.findViewById(R.id.name);
        TextView regNo=item.findViewById(R.id.regNo);
        TextView mobNo=item.findViewById(R.id.mobileNo);
        TextView gender=item.findViewById(R.id.gender);
        Data obj=getItem(position);
        name.setText("Name: "+obj.getName());
        regNo.setText("Registration No: "+obj.getRegNo());
        mobNo.setText("Mobile No: "+obj.getMobNo());
        gender.setText("Gender: "+obj.getGender());
        return item;
    }
}
