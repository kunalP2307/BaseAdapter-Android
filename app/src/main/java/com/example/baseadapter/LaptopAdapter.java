package com.example.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LaptopAdapter extends BaseAdapter {
    Context context;
    ArrayList<Laptop> laptopList;


    public LaptopAdapter(Context context,ArrayList<Laptop> laptopList){
        this.context = context;
        this.laptopList = laptopList;
    }

    @Override
    public int getCount() {
        return laptopList.size();
    }

    @Override
    public Object getItem(int position) {
        return laptopList.get(position);
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

        Laptop currLaptop = (Laptop) getItem(position);
        TextView textViewModel = (TextView)convertView.findViewById(R.id.text_model);
        TextView textViewProcessor = (TextView)convertView.findViewById(R.id.text_processor);
        TextView textViewPrice = (TextView)convertView.findViewById(R.id.text_price);

        textViewModel.setText(currLaptop.getModel());
        textViewProcessor.setText(currLaptop.getProcessor());
        textViewPrice.setText(currLaptop.getPrice());
        return convertView;

    }
}
