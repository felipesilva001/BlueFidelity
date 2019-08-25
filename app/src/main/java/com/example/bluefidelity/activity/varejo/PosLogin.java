package com.example.bluefidelity.activity.varejo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bluefidelity.R;
import com.example.bluefidelity.activity.LoginActivity;
import com.example.bluefidelity.activity.MainActivity;
import com.example.bluefidelity.activity.cliente.TripAdvisor;

public class PosLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pos_login);
    }
    public void irparatrip(View view) {
        Intent intent = new Intent(PosLogin.this, TripAdvisor.class);
        startActivity(intent);
    }
}
