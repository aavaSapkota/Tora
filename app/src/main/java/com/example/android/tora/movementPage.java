package com.example.android.tora;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class movementPage extends AppCompatActivity {

    private TextView mName, mDescription;
    private FirebaseUser user;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = database.getReference();
    DatabaseReference movementRef = myRef.child("Movements");
    private static final String LOG_TAG = movementPage.class.getSimpleName();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movement_page);

        mName = (TextView) findViewById(R.id.movementName);
        mDescription = (TextView) findViewById(R.id.description);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                showData(snapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    public void showData(DataSnapshot snapshot){
        mName.setText(snapshot.child("Movements/id").getValue(Movement.class).getName());
        mDescription.setText(snapshot.child("Movements/id").getValue(Movement.class).getDescription());

    }


    public void updateUI(View view, String text){

    }

    public void goToResource(View view) {

    }

    public void goToTasks(View view) {
        Intent intent = new Intent(this, MovementTasks.class);
        startActivity(intent);
    }

    public void AddMovement(View view) {
    }
}