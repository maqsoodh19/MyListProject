package com.example.maqso.mylistproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.data;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

          // simple list aray Adapter

//        String data[] = {"Salman","Gohhar","ABC","ZYX","Hassan"};

//        ArrayAdapter<String> list = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
//        listView.setAdapter(list);



        // Custom ArrayAdapter

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("salamn","bcs-0898090"));
        list.add(new Student("gohar","bcs-9855590"));

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new CustomAdapter(this, list));


    }
}
