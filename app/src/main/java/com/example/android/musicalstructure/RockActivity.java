package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Yaşıyorum Sil Baştan", "Ari Barokas", "3:19", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Tuzak ", "Fikret Ertan", "3:59", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Mevsimler Geçerken", "Umut Kaya", "3:19", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Hatıran Yeter", "Zakkum", "3:46", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Ne Güzel Güldün", "Pinhani", "4:44", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Salaksın", "Ari Barokas", "5:12", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("İstanbul", "Pamela", "4:12", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Bir Derdim Var", "Mor Ve Ötesi", "3:24", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Tuzak", "Teoman", "3:47", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Yalan", "Athena", "4:46", (ImageView) findViewById(R.id.play_song)));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(RockActivity.this, NowPlayingActivity.class);
                //sending the songName with the intent to the NowPlaying activity to display it.
                startActivity(i);


            }


        });


    }
}