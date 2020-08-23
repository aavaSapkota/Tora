package com.example.android.tora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class movementPage extends AppCompatActivity {

    TextView mName, mDescription, mArticle, articleDescription, mPetition, petitionDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movement_page);

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