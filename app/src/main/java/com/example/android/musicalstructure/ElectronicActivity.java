package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ElectronicActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(" Bad At Love", "Halsey ", "3:04", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("The Middle", "Zedd, Maren Morris, Grey", "3:05", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Mi Gente", "J Balvin, Willy William", "3:06", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Silence ", " Marshmello ft. Khalid", "3:07", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Next To Me", " Imagine Dragons", "3:50", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Alone", "Marshmello", "3:20", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Blue", "Eifel 65", "4:13", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Nicky Jam", "El Amante", "4:37", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Rockabye", "Clean Bandit - Sean Paul & Anne-Marie", "3:20", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("You Owe Me", "The Chainsmokers", "3:49", (ImageView) findViewById(R.id.play_song)));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ElectronicActivity.this, NowPlayingActivity.class);
                //sending the songName with the intent to the NowPlaying activity to display it.
                startActivity(i);


            }


        });


    }
}



