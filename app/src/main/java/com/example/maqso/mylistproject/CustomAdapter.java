package com.example.maqso.mylistproject;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by maqso on 10/2/2017.
 */

public class CustomAdapter extends ArrayAdapter<Student> {


    public CustomAdapter(Context context, ArrayList<Student> list) {
        super(context, 0, list);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student std = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item1, parent, false);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.name);
        TextView reg1 = (TextView) convertView.findViewById(R.id.reg);
        textView.setText(std.getName());
        reg1.setText(std.getReg());


        return convertView;
    }
}
