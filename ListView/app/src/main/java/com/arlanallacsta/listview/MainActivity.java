package com.arlanallacsta.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSimpleList, btnCustomList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpleList = findViewById(R.id.btn_simplelist);
        btnCustomList = findViewById(R.id.btn_customlist);

        btnSimpleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent simpleListIntent = new Intent(MainActivity.this, SimpleListView.class);
                startActivity(simpleListIntent);
                Toast.makeText(MainActivity.this, "Simple List Activity", Toast.LENGTH_SHORT).show();
            }
        });

        btnCustomList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customListIntent = new Intent(MainActivity.this, CustomListView.class);
                startActivity(customListIntent);
                Toast.makeText(MainActivity.this, "Custom List Activity", Toast.LENGTH_SHORT).show();
            }
        });
    }
}