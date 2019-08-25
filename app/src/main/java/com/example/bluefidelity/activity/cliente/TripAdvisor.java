package com.example.bluefidelity.activity.cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bluefidelity.R;
import com.example.bluefidelity.activity.loginvarejo;

public class TripAdvisor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_advisor);
    }

    public void irparapremio(View view) {
        Intent intent = new Intent(TripAdvisor.this, Premio.class);
        startActivity(intent);
    }
}

