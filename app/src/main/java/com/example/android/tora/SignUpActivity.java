package com.example.android.tora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {


    EditText email, name, dOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = findViewById(R.id.email);
        name = findViewById(R.id.name);
        dOB = findViewById(R.id.dOB);
    }

    public void continueProcess(View view) {
        Intent intent = new Intent(this, SignUpActivity2.class);
        intent.putExtra("email", email.getText().toString());
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("dOB", dOB.getText().toString());
        startActivity(intent);
    }

    public void goBackToLogIn(View view) {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }
}