package com.example.android.tora;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class movementPage extends AppCompatActivity {

    private TextView mName, mDescription, mArticle, articleDescription, mPetition, petitionDescription;
    private FirebaseUser user;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = database.getReference();
    DatabaseReference movementRef = myRef.child("Movements");





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movement_page);
//        movementRef.child("1").setValue(Movement("Climate Change", "Advocating for greener commercial practices, reduced waste and a \nbetter tomorrow with the local municipal community",  );

        mName = (TextView) findViewById(R.id.movementName);
        mDescription = (TextView) findViewById(R.id.description);
        mArticle = (TextView) findViewById(R.id.article);
        mPetition = (TextView) findViewById(R.id.petition);
        articleDescription = (TextView) findViewById(R.id.article_description);
        petitionDescription = (TextView) findViewById(R.id.petition_description);
    }

    public void goToResource(View view) {
    }

    public void AddMovement(View view) {

    }

    public void goToTasks(View view) {
    }
}