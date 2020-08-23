package com.example.android.tora;

import android.widget.ImageView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Movement {

    private int _id;
    private String name;
    private String description;
    private ImageView image;
    private static ArrayList<Tasks> tasks = new  ArrayList<Tasks>();;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = database.getReference();
    DatabaseReference movementRef = myRef.child("Movements");



    public Movement(int _id, String n, String d){
        movementRef.child("id").setValue(_id);
        movementRef.child("id").child("name").setValue(n);
        movementRef.child("id").child("description").setValue(d);

        tasks.add(new Tasks("Article", "Climate change, a beginner's guide!", false, 10));
        tasks.add(new Tasks("Protest", "Join the font lines! Come with us on XX/XX/XXXX as we fight for earth.", false, 50));
        tasks.add(new Tasks("Petition", "Show your support, sign the petition", false, 10));



    }

    public Movement(){

        tasks.add(new Tasks("Article", "Climate change, a beginner's guide!", false, 10));
        tasks.add(new Tasks("Protest", "Join the font lines! Come with us on XX/XX/XXXX as we fight for earth.", false, 50));
        tasks.add(new Tasks("Petition",  "Show your support, sign the petition", false, 10));
    }

    public static void newUser(){

    }

    public static Tasks getTask(int t){
        return tasks.get(t);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }




}
