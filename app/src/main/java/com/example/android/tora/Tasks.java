package com.example.android.tora;

import java.util.List;

public class Tasks {

    public String name;
    public String title;
    public String description;
    public boolean completed;
    public int energy_point_value;
    public Movement movement;

    public Tasks(String n, int t, String d, boolean c, int ev, Movement m){
        name = n;
//        type = t;
        description = d;
        completed = c;
        energy_point_value = ev;
        movement = m;
    }

    public void setEnergy_point_value(int ev){
        energy_point_value = ev;
    }



}
