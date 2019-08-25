package com.example.bluefidelity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bluefidelity.R;
import com.example.bluefidelity.activity.cliente.PosLoginVarejo;
import com.example.bluefidelity.activity.varejo.PosLogin;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void irparaposlogin(View view) {
        Intent intent = new Intent(LoginActivity.this, PosLogin.class);
        startActivity(intent);
    }

}
