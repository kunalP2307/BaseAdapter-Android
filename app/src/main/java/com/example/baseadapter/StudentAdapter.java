package com.example.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    Context context;
    ArrayList<Employee> employeeList;


    public StudentAdapter(Context context,ArrayList<Employee> employeeList){
        this.context = context;
        this.employeeList = employeeList;
    }
    @Override
    public int getCount() {
        return employeeList.size();
    }

    @Override
    public Object getItem(int position) {
        return employeeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_laptop_list,parent,false);
        }
        Employee currEmployee = (Employee)getItem(position);
        TextView textViewRoll = (TextView)convertView.findViewById(R.id.text_model);
       // TextView textViewName = (TextView)convertView.findViewById(R.id.text_name);
        textViewRoll.setText(Integer.toString(currEmployee.getId()));
     //   textViewName.setText(currEmployee.getName());
        return convertView;
    }
}
