package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cigak on 5.03.2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        parent.findViewById(R.id.list);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentSong.getName());

        TextView artistTextView = listItemView.findViewById(R.id.song_artist);
        artistTextView.setText(currentSong.getArtist());

        TextView durationTextView = listItemView.findViewById(R.id.duration_time);
        durationTextView.setText(currentSong.getDuration());

        return listItemView;
    }
}
