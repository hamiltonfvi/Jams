package com.example.hamilton.jams;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.media.MediaPlayer;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private boolean flag = true;
    private MediaPlayer mediaPlayer;

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        final Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songName = listItemView.findViewById(R.id.song_name_text_view);
        // Get the version name from the current object and
        // set this text on the name TextView
        songName.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistName = listItemView.findViewById(R.id.artist_name_text_view);
        // Get the version number from the current object and
        // set this text on the number TextView
        artistName.setText(currentSong.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView albumImage = listItemView.findViewById(R.id.album_image_view);
        // Get the version name from the current object and
        // set this text on the name ImageView
        albumImage.setImageResource(currentSong.getAlbumCover());

        // Find the Button in the list_item.xml layout with the ID version_name
        Button tuneSong = listItemView.findViewById(R.id.tune_play);
        // Get the version name from the current object and
        // set this tune on the name ButtonView
        tuneSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer ring = MediaPlayer.create(getContext(), currentSong.getSongTune());
                ring.start();
            }
        });

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
