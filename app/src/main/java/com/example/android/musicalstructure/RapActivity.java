package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class RapActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Gömün Beni Çukura", "Eypio", "3:16", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Heyecanı Yok", "Gazapizm", "3:37", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Kalbim Çukurda", "Gazapizm & Cem Adrian", "3:01", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Kısır Döngü", "Allame", "2:43", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Organize Oluyoruz", "Allame", "4:17", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Onuncu Köy", "Ceza", "4:20", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Pavyon", "Ezhel", "3:45", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Oyun", "Hayki ,Patron,Saian", "2:36", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Mola", "Tankurt Manas", "3:30", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Ne kadar Umrunda ?", "Sansar Salvo", "3:58", (ImageView) findViewById(R.id.play_song)));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(RapActivity.this, NowPlayingActivity.class);
                //sending the songName with the intent to the NowPlaying activity to display it.
                startActivity(i);


            }


        });


    }
}