package com.example.bluefidelity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bluefidelity.R;
import com.example.bluefidelity.activity.cliente.PosLoginVarejo;

public class loginvarejo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginvarejo);
    }

    public void irparaposloginvarejo(View view) {
        Intent intent = new Intent(loginvarejo.this, PosLoginVarejo.class);
        startActivity(intent);
    }
}
