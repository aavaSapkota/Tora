package com.example.android.tora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MovementTasks extends AppCompatActivity {

    private TextView mArticle, articleDescription, mPetition, petitionDescription, mProtest, protestDescription;
    FirebaseAuth mAuth = FirebaseAuth.getInstance();
    FirebaseUser user = mAuth.getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movement_tasks);


        mArticle = (TextView) findViewById(R.id.article);
        mPetition = (TextView) findViewById(R.id.petition);
        articleDescription = (TextView) findViewById(R.id.article_description);
        petitionDescription = (TextView) findViewById(R.id.petition_description);
        mProtest = (TextView) findViewById(R.id.protest);
        protestDescription = (TextView) findViewById(R.id.protest_description);

        mArticle.setText(Movement.getTask(user,0).getType());
        mPetition.setText(Movement.getTask(user,2).getType());
        articleDescription.setText(Movement.getTask(user,0).getDescription());
        petitionDescription.setText(Movement.getTask(user,2).getDescription());
        mProtest.setText(Movement.getTask(user, 1).getType());
        protestDescription.setText(Movement.getTask(user, 1).getDescription());

    }

    public void findLocation(View view) {
        String loc = "Queen's Park, Toronto Ontario";
        Uri addressUri = Uri.parse("geo:0,0?q="+loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }

    }

    public void goToResource(View view) {
        // Parse the URI and create the intent.
        Uri webpage = Uri.parse("https://www.bbc.com/news/science-environment-24021772");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void signPetition(View view) {
        // Parse the URI and create the intent.
        Uri webpage = Uri.parse("https://www.change.org/p/united-nations-stop-bolsonaro-from-destroying-the-amazon");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}