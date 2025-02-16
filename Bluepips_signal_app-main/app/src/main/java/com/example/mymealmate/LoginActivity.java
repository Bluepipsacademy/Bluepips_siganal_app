package com.example.mymealmate;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {


    EditText email;
    TextInputLayout pass;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        auth = FirebaseAuth.getInstance();
        
        email = findViewById(R.id.editText2);
        pass = findViewById(R.id.editText14);

    }

    public void Register(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

    }

    public void main(View view) {
        String userEmail = email.getText().toString();
        String userPassword = Objects.requireNonNull(pass.getEditText()).getText().toString();


        if (TextUtils.isEmpty(userEmail)){
            Toast.makeText(LoginActivity.this, "Enter Email!", Toast.LENGTH_SHORT).show();

        }

        if (TextUtils.isEmpty(userPassword)){
            Toast.makeText(LoginActivity.this, "Enter password!", Toast.LENGTH_SHORT).show();
            return;


        }


        if (userPassword.length()<8){
            Toast.makeText(LoginActivity.this, "Password too short, enter minimum 8 character", Toast.LENGTH_SHORT).show();
            return;
        }

        auth.signInWithEmailAndPassword(userEmail,userPassword)
                .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){

                            Toast.makeText(LoginActivity.this, "Login Successfully!", Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(LoginActivity.this, MainActivity.class));

                            finish();

                        }else {
                            Toast.makeText(LoginActivity.this, "Error!"+task.getException(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });

    }
}