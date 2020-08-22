package com.example.android.tora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity2 extends AppCompatActivity {

    private String email, name, usernameS, passwordS, confirmPasswordS;
    private String [] dOB;
    private EditText username, password, confirmPassword;
    private FirebaseAuth mAuth;
    private static final String LOG_TAG = SignUpActivity2.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirm_password);
        usernameS = username.getText().toString();
        passwordS = password.getText().toString();
        confirmPasswordS = confirmPassword.getText().toString();

        Intent intent = getIntent();
        email = intent.getStringExtra("email");
        name = intent.getStringExtra("name");
        dOB = intent.getStringArrayExtra("dOB");
        mAuth = FirebaseAuth.getInstance();

    }

    public void goBackToLogIn(View view) {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }

    public void continueProcess(View view) {
        if(confirmPasswordS.equals(passwordS)){
            mAuth.createUserWithEmailAndPassword(email, passwordS)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d(LOG_TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                updateUI(user);
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w(LOG_TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(SignUpActivity2.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                                updateUI(null);
                            }

                            // ...
                        }
                    });
        }else{
            Toast.makeText(SignUpActivity2.this, " The Passwords Entered do not match. Try Again.",
                    Toast.LENGTH_SHORT).show();
        }



    }


    private void updateUI(FirebaseUser user) {
        if(user!=null){
            Intent intent = new Intent(this, preferencesScreen.class);
            startActivity(intent);
        }
    }
}