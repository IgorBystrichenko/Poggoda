package com.example.trainlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onEnterClick(View view)
    {
        startActivity(new Intent(this, ResultActivity.class));
    }

    public void onSettingsClick(View view)
    {
        startActivity(new Intent(this, SettingsActivity.class));
    }

    public void onMenuClick(View view)
    {
        startActivity(new Intent(this, MenuActivity.class));
    }
}