package com.example.android.tora;

import com.google.android.gms.tasks.Task;

import java.util.List;

public class User {
    private int user_id;
    private String userName;
    private String password;
    private int yearOfBirth;
    private List<Movement> movementsJoined;
    private List<Tasks> tasksList;

    private int energyLevel;
    private String description;

    public User (int id, int yB, String p, String uN){
        user_id = id;
        userName = uN;
        password = p;
        yearOfBirth = yB;
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


    /*
    * This Method needs to make a copy of the Task objects found on the
    * Movements page and copy it to the user's Tasks List*/
    public void getTaskList(List<Tasks> tL){
//
//        class TaskCopy implements Cloneable
//        {
//
//            public Tasks clone() throws
//                    CloneNotSupportedException
//            {
//                return super.clone();
//            }
//        }
    }


}