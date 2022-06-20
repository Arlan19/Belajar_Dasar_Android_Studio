package com.arlanallacsta.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SimpleListView extends AppCompatActivity {

    private static final String TAG = "SimpleListViewActivity";

    private ListView simpleList;
    private ArrayList ar_nama_mahasiswa;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);

        simpleList = findViewById(R.id.SimpleListView);

        ar_nama_mahasiswa = new ArrayList<String>();
        ar_nama_mahasiswa.add("Marquise Parrish");
        ar_nama_mahasiswa.add("Pedro Andrade");
        ar_nama_mahasiswa.add("Braedon Dillon");
        ar_nama_mahasiswa.add("Donte Dean");
        ar_nama_mahasiswa.add("Ashanti Rice");
        ar_nama_mahasiswa.add("Darius Marks");
        ar_nama_mahasiswa.add("Janelle Ross");
        ar_nama_mahasiswa.add("Kamryn Fritz");
        ar_nama_mahasiswa.add("Stella Booth");
        ar_nama_mahasiswa.add("Jaslene Chase");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ar_nama_mahasiswa);
        simpleList.setAdapter(adapter);
    }
}