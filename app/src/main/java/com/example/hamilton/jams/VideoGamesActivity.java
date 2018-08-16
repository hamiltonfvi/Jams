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
        songs.add(new Song("Fly Me to The Moon", "Bayoneta", R.drawable.videogames00, R.raw.videogames00));
        songs.add(new Song("Room Theme", "Bubble Bobble", R.drawable.videogames01, R.raw.videogames01));
        songs.add(new Song("Bloody Tears", "Castlevania 2", R.drawable.videogames02, R.raw.videogames02));
        songs.add(new Song("Intro Theme", "Donkey Kong Country", R.drawable.videogames03, R.raw.videogames03));
        songs.add(new Song("Title Screen", "Double Dragon", R.drawable.videogames04, R.raw.videogames04));
        songs.add(new Song("Main Theme", "Excitebike", R.drawable.videogames05, R.raw.videogames05));
        songs.add(new Song("The Instinct", "Killer Instinct", R.drawable.videogames06, R.raw.videogames06));
        songs.add(new Song("Dream Land", "Kirby", R.drawable.videogames07, R.raw.videogames07));
        songs.add(new Song("Title Screen", "Megaman 2", R.drawable.videogames08, R.raw.videogames08));
        songs.add(new Song("Pacman Theme", "Pacman", R.drawable.videogames09, R.raw.videogames09));
        songs.add(new Song("Title Screen", "Punch Out", R.drawable.videogames10, R.raw.videogames10));
        songs.add(new Song("Sonic Heroes", "Sonic Heroes", R.drawable.videogames11, R.raw.videogames11));
        songs.add(new Song("Overworld", "Super Marios Bros 2", R.drawable.videogames12, R.raw.videogames12));
        songs.add(new Song("Main Theme", "Super Mario Bros", R.drawable.videogames13, R.raw.videogames13));
        songs.add(new Song("Overture", "Super Mario Galaxy", R.drawable.videogames14, R.raw.videogames14));
        songs.add(new Song("Title Screen", "Super Mario World", R.drawable.videogames15, R.raw.videogames15));
        songs.add(new Song("BGM A", "Tetris", R.drawable.videogames16, R.raw.videogames16));
        songs.add(new Song("Main Theme", "The Legend of Zelda", R.drawable.videogames17, R.raw.videogames17));
        songs.add(new Song("Calling", "The World Ends With You", R.drawable.videogames18, R.raw.videogames18));
        songs.add(new Song("Gaur Plains", "Xenoblade", R.drawable.videogames19, R.raw.videogames19));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}
