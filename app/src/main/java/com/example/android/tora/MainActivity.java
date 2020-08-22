package com.example.android.tora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private static int LOGGED_ON = 0; //put in savedOnInstance method
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(savedInstanceState!=null){

            LOGGED_ON = savedInstanceState.getInt("logged-on");
            Log.d(LOG_TAG, "loggedOn: "+LOGGED_ON);
        }

        Log.d(LOG_TAG, "loggedOn------------------------------------------------------: "+LOGGED_ON);


    }

    @Override
    public void onStart() {
        super.onStart();
        if(LOGGED_ON==0){
            LOGGED_ON=1;
            Log.d(LOG_TAG, "ON START: "+LOGGED_ON);
//            Intent intent = new Intent(this, loginActivity.class);
//            startActivity(intent);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(LOG_TAG, "ON SAVED INSTANCE: "+LOGGED_ON);
        outState.putInt("logged-on", LOGGED_ON);
    }
}