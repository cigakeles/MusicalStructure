package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Muhbir", "Sıla", "4:23", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Üzülmedin mi ?", "Simge", "5:04", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Öyle Kolaysa", "Mabel Matiz", ":4.40", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Yüreğim Davacı", "Çağatay Akman", "2:49", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Gel de Uyu", "Soner Sarıkabadayı", "4:21", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Sinsirella", "Aylin Çoşkun", "3:47", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Kovdum", "Ceylan Ertem", "3:45", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Hiç Işık Yok ", "Melek Mosso", "7:07", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Özledim", "Rafet El Roman", "4:09", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Ben", "Berksan", "3:42", (ImageView) findViewById(R.id.play_song)));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(PopActivity.this, NowPlayingActivity.class);
                //sending the songName with the intent to the NowPlaying activity to display it.
                startActivity(i);


            }


        });


    }
}


