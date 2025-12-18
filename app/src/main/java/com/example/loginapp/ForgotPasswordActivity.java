package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    EditText etUsernameFP;
    Button btnResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        etUsernameFP = findViewById(R.id.etUsernameFP);
        btnResetPassword = findViewById(R.id.btnResetPassword);

        btnResetPassword.setOnClickListener(v -> {
            String username = etUsernameFP.getText().toString();
            Toast.makeText(ForgotPasswordActivity.this, "Reset link sent for " + username, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(ForgotPasswordActivity.this, ResetPasswordActivity.class));
        });
    }
}
