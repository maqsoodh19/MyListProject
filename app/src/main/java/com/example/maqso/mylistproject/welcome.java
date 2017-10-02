package com.example.maqso.mylistproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.attr.data;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String data[] = {"Salman","Gohhar","ABC","ZYX","Hassan"};

        ListView listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> list = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(list);

    }
}
