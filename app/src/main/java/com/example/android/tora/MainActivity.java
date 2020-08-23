package com.example.android.tora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private static int LOGGED_ON = 0; //put in savedOnInstance method
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //          BOTTOM NAVIGATION PANEL
        //Intialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.profileNav);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.dashboardNav:
                        return true;
                    case R.id.searchNav:
                        startActivity(new Intent(getApplicationContext(),SearchPage.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profileNav:
                        startActivity(new Intent(getApplicationContext(),userPage.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        }); // END OF BOTTOM NAVIGATION CODE


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