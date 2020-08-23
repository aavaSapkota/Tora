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

public class loginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    EditText mEmail, mPassword;
    private static final String LOG_TAG = loginActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        mEmail = findViewById(R.id.emailInput);
        mPassword = findViewById(R.id.passwordInput);

//        // Restore the state.
//        if (savedInstanceState != null) {
//            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
//            if (isVisible) {
//                mEmail.setVisibility(View.VISIBLE);
//                mReplyTextView.setText(savedInstanceState.getString("reply_text"));
//                mReplyTextView.setVisibility(View.VISIBLE);
//            }
//        }
    }


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        if(currentUser!=null){
//            Log.d(LOG_TAG, "User has logged in: "+currentUser);
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
//        }

    }

    public void signUp(View view) {
        Intent createAccount = new Intent(this, SignUpActivity.class);
        startActivity(createAccount);
    }

    public void logIn(View view) {
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(LOG_TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(LOG_TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(loginActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                            // ...
                        }

                        // ...
                    }
                });

    }

    public void updateUI(FirebaseUser user){
        if(user!=null){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("logged-on", 1);
            intent.putExtra("userId", mAuth.getUid());
            startActivity(intent);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (mEmail.getVisibility() == View.VISIBLE&&mPassword.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("email",mEmail.getText().toString());
            outState.putString("password",mPassword.getText().toString());
        }
    }


}