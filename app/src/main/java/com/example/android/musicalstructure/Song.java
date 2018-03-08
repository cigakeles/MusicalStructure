package com.example.android.musicalstructure;

import android.widget.ImageView;

/**
 * Created by cigak on 5.03.2018.
 */

public class Song {
    private ImageView mPlay;
    private String mName;
    private String mArtist;
    private String mDuration;


    public Song(String name, String artist, String duration, ImageView play) {
        mPlay = play;
        mName = name;
        mArtist = artist;
        mDuration = duration;

    }

    public ImageView getPlay() {
        return mPlay;
    }

    public String getName() {
        return mName;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getDuration() {
        return mDuration;
    }


}