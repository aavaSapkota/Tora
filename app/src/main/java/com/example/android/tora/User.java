package com.example.android.tora;

import android.media.Image;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.common.util.Strings;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class User {
    private String user_id;
    private ImageView profilePicture;
    private String userName;
    private String password;
    private int yearOfBirth;
    private List<Movement> movementsJoined;
    private List<Tasks> tasksList;
    private int energyLevel;
    private String aboutMe;

    public User ( FirebaseUser user, String yB, String uN){
        user_id = user.getUid();
        userName = uN;
        String [] birthday = yB.split("/");
        yearOfBirth = Integer.parseInt(birthday[birthday.length-1]);
        movementsJoined = new ArrayList<Movement>();
        tasksList = new ArrayList<Tasks>();
        aboutMe = "";
        profilePicture = null;
        energyLevel=0;
    }

    public User(){

    }

    public String getUser_id(){
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
