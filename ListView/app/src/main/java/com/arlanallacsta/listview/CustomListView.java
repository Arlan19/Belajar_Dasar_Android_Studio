package com.arlanallacsta.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {

    private static final String TAG = "CustomListView";

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView = findViewById(R.id.customListView);

        ArrayList<ModelMahasiswa> listMahasiswa = new ArrayList<>();

        ModelMahasiswa m1, m2, m3, m4, m5, m6, m7, m8, m9, m10;
        m1 = new ModelMahasiswa(R.drawable.carlie_hansen, "Carlie Hansen", "2007111111");
        m2 = new ModelMahasiswa(R.drawable.dominique_mack, "Dominique Mack", "2007111112");
        m3 = new ModelMahasiswa(R.drawable.jaden_church, "Jaden Church", "2007111113");
        m4 = new ModelMahasiswa(R.drawable.kaylynn_villa, "Kaylynn Villa", "2007111114");
        m5 = new ModelMahasiswa(R.drawable.jaidyn_villanueva, "Jaidyn Villanueva", "2007111115");
        m6 = new ModelMahasiswa(R.drawable.marshall_oconnell, "Marshal Oconell", "2007111116");
        m7 = new ModelMahasiswa(R.drawable.pranav_bryant, "Pranav Bryant", "2007111117");
        m8 = new ModelMahasiswa(R.drawable.shamar_joseph, "Shamar Josept", "2007111118");
        m9 = new ModelMahasiswa(R.drawable.shyann_ball, "Shyann Ball", "2007111119");
        m10 = new ModelMahasiswa(R.drawable.valentina_hickman, "Valentina Hickman", "2007111110");


        listMahasiswa.add(m1);
        listMahasiswa.add(m2);
        listMahasiswa.add(m3);
        listMahasiswa.add(m4);
        listMahasiswa.add(m5);
        listMahasiswa.add(m6);
        listMahasiswa.add(m7);
        listMahasiswa.add(m8);
        listMahasiswa.add(m9);
        listMahasiswa.add(m10);

        listView.setAdapter(new CustomAdapter(this, R.layout.single_list, listMahasiswa));
    }

}