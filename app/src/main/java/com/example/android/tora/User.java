package com.example.android.tora;

import android.widget.ImageView;

import com.google.android.gms.common.util.Strings;
import com.google.android.gms.tasks.Task;

import java.util.List;

public class User {
    private int user_id;
    private ImageView profilePicture;
    private String userName;
    private String password;
    private int yearOfBirth;
    private List<Movement> movementsJoined;
    private List<Tasks> tasksList;

    private int energyLevel;
    private String description;

    public User ( String yB, String uN){
        userName = uN;
        String [] birthday = yB.split("/");
        yearOfBirth = Integer.parseInt(birthday[birthday.length-1]);
    }

    public int getUser_id(){
        return user_id;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String p){
        password=p;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void addMovement(Movement m){
        movementsJoined.add(m);
    }

    public void deleteMovement(Movement m){
        movementsJoined.remove(m);
    }

    public Movement getMovement(Movement m){
        return m;
    }




}
