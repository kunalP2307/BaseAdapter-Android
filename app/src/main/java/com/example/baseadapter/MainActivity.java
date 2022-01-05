    package com.example.baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class
MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    LaptopAdapter laptopAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Laptop> arrayList = new ArrayList<Laptop>();

        arrayList.add(new Laptop("Lenovo IdeaPad 330s","Core i3","34,000"));
        arrayList.add(new Laptop("HP 15s","Dual Core","27,000"));
        arrayList.add(new Laptop("Acer Aspire","Ryzen 7","49,00"));
        arrayList.add(new Laptop("Asus VivoBook 15","i3 11th Gen","37,000"));
        arrayList.add(new Laptop("Lenovo Legion Y540","i5 9th Gen","59,000"));
        arrayList.add(new Laptop("Lenovo IdeaPad 330s","Core i5","44,000"));



        ListView listView = findViewById(R.id.list);
        laptopAdapter = new LaptopAdapter(this,arrayList);
        listView.setAdapter(laptopAdapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Laptop laptop = (Laptop) laptopAdapter.getItem(position);
        Toast.makeText(this, "You clicked "+laptop.getModel(), Toast.LENGTH_SHORT).show();

    }
}