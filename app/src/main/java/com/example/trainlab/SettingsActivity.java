package com.example.trainlab;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);
    }

}