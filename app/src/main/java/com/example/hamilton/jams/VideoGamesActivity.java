package com.example.hamilton.jams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class VideoGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList using the public class Song
        ArrayList<Song> songs = new ArrayList<>();

        // Create a list of songs
        songs.add(new Song("red", "weṭeṭṭi"));
        songs.add(new Song("mustard yellow", "chiwiiṭә"));
        songs.add(new Song("dusty yellow", "ṭopiisә"));
        songs.add(new Song("green", "chokokki"));
        songs.add(new Song("brown", "ṭakaakki"));
        songs.add(new Song("gray", "ṭopoppi"));
        songs.add(new Song("black", "kululli"));
        songs.add(new Song("white", "kelelli"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}