package com.soc.flowerspeciesusingpatternrecognitionandneuralnetworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    EditText edtEmail,edtPassword,edtRePassword;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        setTitle("Join Our Community");

        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtRePassword = findViewById(R.id.edtRePassword);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtEmail.getText().toString().trim().equals("")){
                    if (!edtPassword.getText().toString().equals("") && edtPassword.getText().toString().length()>5){
                        if (!edtRePassword.getText().toString().equals(edtPassword.getText().toString())){
                            startActivity(new Intent(Registration.this,MainActivity.class));
                        }else{
                            edtRePassword.setError("Password Don't Match");
                        }
                    }else{
                        edtPassword.setError("Enter Your 6 Digit Password");
                    }
                }else{
                    edtEmail.setError("Enter Your Email Address");
                }
            }
        });
    }
}