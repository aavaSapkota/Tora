package com.example.android.tora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class preferencesScreen extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences_screen);
        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        //populating titles for preference screen
        titles.add("Environment and Sustainability");
        titles.add("Policy Reform");
        titles.add("Labour Laws");
        titles.add("Peace and Equity");
        titles.add("Inclusive Design");
        titles.add("Health Care");

        //images.add(R.drawable.environmentalism_icon.png);




    }
}