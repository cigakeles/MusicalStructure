package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView genrePop = findViewById(R.id.popTextView);
        genrePop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genrePop = new Intent(MainActivity.this, PopActivity.class);
                startActivity(genrePop);
            }
        });

        final TextView genreRock = findViewById(R.id.rockTextView);
        genreRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreRock = new Intent(MainActivity.this, RockActivity.class);
                startActivity(genreRock);
            }
        });

        final TextView genreHipHop = findViewById(R.id.rapTextView);
        genreHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreHipHop = new Intent(MainActivity.this, RapActivity.class);
                startActivity(genreHipHop);
            }
        });

        final TextView genreElectronic = findViewById(R.id.electronicTextView);
        genreElectronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreElectronic = new Intent(MainActivity.this, ElectronicActivity.class);
                startActivity(genreElectronic);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
