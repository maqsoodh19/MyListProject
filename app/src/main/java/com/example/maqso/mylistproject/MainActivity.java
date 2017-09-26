package com.example.maqso.mylistproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.btn1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = (EditText) findViewById(R.id.uName);
                pass = (EditText) findViewById(R.id.password);

                String name1 = name.getText().toString();
                final String password = pass.getText().toString();

                if (name1.equals("") && password.equals("")) {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();

                } else if (name1.equals(password)) {

                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,welcome.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "UserName or Password is incorrect", Toast.LENGTH_SHORT).show();


                }
            }
        });

    }
}
