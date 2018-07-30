package com.example.hamilton.jams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class AnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        // Create an ArrayList using the public class Song
        ArrayList<Song> songs = new ArrayList<>();

        // Create a list of songs
        songs.add(new Song("History Maker", "Yuri on Ice", R.drawable.anime00));
        songs.add(new Song("Teenage Mutant Ninja Turtles Theme", "Teenage Mutant Ninja Turtles", R.drawable.anime01));
        songs.add(new Song("Cha-La Head-Cha-La", "Dragon Ball Z", R.drawable.anime02));
        songs.add(new Song("DuckTales", "DuckTales", R.drawable.anime03));
        songs.add(new Song("Believe", "One Piece", R.drawable.anime04));
        songs.add(new Song("Yakan Yikou", "Hajime No Ippo", R.drawable.anime05));
        songs.add(new Song("Hare Hare Yukai", "Haruhi", R.drawable.anime06));
        songs.add(new Song("Jem Is My Name", "Jem and The Holograns", R.drawable.anime07));
        songs.add(new Song("Silhouette", "Naruto", R.drawable.anime08));
        songs.add(new Song("Over", "Boruto", R.drawable.anime09));
        songs.add(new Song("Looney Toones Theme", "Looney Toones", R.drawable.anime10));
        songs.add(new Song("Battle Music", "Naruto", R.drawable.anime11));
        songs.add(new Song("A Cruel Angel's Thesis", "Neon Genesis Evangelion", R.drawable.anime12));
        songs.add(new Song("Gotta Catch'em All", "Pokemon", R.drawable.anime13));
        songs.add(new Song("That's All Folks", "Porky Pig", R.drawable.anime14));
        songs.add(new Song("Powerpuff Girls Theme", "Powerpuff Girls", R.drawable.anime15));
        songs.add(new Song("Guren no Yumi", "Attack of Titans", R.drawable.anime16));
        songs.add(new Song("The Pink Panther Theme", "The Pink Panther", R.drawable.anime17));
        songs.add(new Song("Heart of Sword", "Samurai X", R.drawable.anime18));
        songs.add(new Song("Lupin The Third Theme", "Lupin The Third", R.drawable.anime19));

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
