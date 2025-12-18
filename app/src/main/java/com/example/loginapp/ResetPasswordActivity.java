package com.example.loginapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    EditText etNewPasswordRP;
    Button btnUpdatePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        etNewPasswordRP = findViewById(R.id.etNewPasswordRP);
        btnUpdatePassword = findViewById(R.id.btnUpdatePassword);

        btnUpdatePassword.setOnClickListener(v -> {
            String newPassword = etNewPasswordRP.getText().toString();
            Toast.makeText(ResetPasswordActivity.this, "Password updated successfully", Toast.LENGTH_SHORT).show();
            finish(); // go back to login
        });
    }
}
