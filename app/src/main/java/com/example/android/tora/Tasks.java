package com.example.android.tora;

public class Tasks {

    public String name;
    public int type;
    public String description;
    public boolean completed;
    public int energy_point_value;
    public Movement movement;

    public Tasks(String n, int t, String d, boolean c, int ev){
        name = n;
        type = t;
        description = d;
        completed = c;
        energy_point_value = ev;
    }

    public void setEnergy_point_value(int ev){
        energy_point_value = ev;
    }

}
