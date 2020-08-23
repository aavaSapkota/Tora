package com.example.android.tora;

import java.util.List;

public class Tasks {

    private String type;
    private String description;
    private boolean completed;
    private int energy_point_value;



    public Tasks(String t, String d, boolean c, int ev){
        type = t;
        description = d;
        completed = c;
        energy_point_value = ev;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEnergy_point_value() {
        return energy_point_value;
    }

    public void setEnergy_point_value(int energy_point_value) {
        this.energy_point_value = energy_point_value;
    }
}
