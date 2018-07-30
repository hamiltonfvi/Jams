package com.example.hamilton.jams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList using the public class Song
        ArrayList<Song> songs = new ArrayList<>();

        // Create a list of songs
        songs.add(new Song("Can't Stop Me", "Afrojack & Shermanology", R.drawable.dance00));
        songs.add(new Song("Mr. Saxo Beat", "Alexandra Stan", R.drawable.dance01));
        songs.add(new Song("Addicted To You", "Avicii", R.drawable.dance02));
        songs.add(new Song("Wake Me Up", "Avicii", R.drawable.dance03));
        songs.add(new Song("Cinema", "Benny Benassi & Gary Go", R.drawable.dance04));
        songs.add(new Song("World, Hold On", "Bob Sinclar", R.drawable.dance05));
        songs.add(new Song("Summer", "Calvin Harris", R.drawable.dance06));
        songs.add(new Song("How Deep Is Your Love", "Calvin Harris & Disciples", R.drawable.dance07));
        songs.add(new Song("Blame", "Calvin Harris & John Newman", R.drawable.dance08));
        songs.add(new Song("One Love", "David Guetta & Estelle", R.drawable.dance09));
        songs.add(new Song("Hey Mama", "David Guetta & Nicki Minaj & Afrojack", R.drawable.dance10));
        songs.add(new Song("Flames", "David Guetta & Sia", R.drawable.dance11));
        songs.add(new Song("Titanium", "David Guetta & Sia", R.drawable.dance12));
        songs.add(new Song("It's My Life", "Dr. Alban", R.drawable.dance13));
        songs.add(new Song("Barbra Streisand", "Duck Sauce", R.drawable.dance14));
        songs.add(new Song("Tonight (I'm Lovin' You)", "Enrique Iglesias & Ludacris", R.drawable.dance15));
        songs.add(new Song("You Spin Me Round", "Gigi D'Agostino", R.drawable.dance16));
        songs.add(new Song("What is Love", "Haddaway", R.drawable.dance17));
        songs.add(new Song("Just Be", "Tiesto", R.drawable.dance18));
        songs.add(new Song("The Fox (What Does The Fox Say)", "Ylvis", R.drawable.dance19));

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
