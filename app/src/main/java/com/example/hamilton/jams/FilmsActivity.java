package com.example.hamilton.jams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FilmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList using the public class Song
        ArrayList<Song> songs = new ArrayList<>();

        // Create a list of songs
        songs.add(new Song("Cups", "Pitch Perfect", R.drawable.films00));
        songs.add(new Song("Boogie Wonderland", "Happy Feet", R.drawable.films01));
        songs.add(new Song("Somebody to Love", "Happy Feet", R.drawable.films02));
        songs.add(new Song("Something Triggered", "3 Metros Sobre el Cielo", R.drawable.films03));
        songs.add(new Song("All That Jazz", "Chicago", R.drawable.films04));
        songs.add(new Song("Dreamgirls", "Dreamgirls", R.drawable.films05));
        songs.add(new Song("I'll Be There For You", "Friends", R.drawable.films06));
        songs.add(new Song("Don't Stop Believing", "Glee", R.drawable.films07));
        songs.add(new Song("Season of Love", "Glee", R.drawable.films08));
        songs.add(new Song("You Can't Stop The Beat", "Hairspray", R.drawable.films09));
        songs.add(new Song("Breaking Free", "High School Musical", R.drawable.films10));
        songs.add(new Song("Start of Something New", "High School Musical", R.drawable.films11));
        songs.add(new Song("You're The One That I Want", "Greese", R.drawable.films12));
        songs.add(new Song("Life is a Cabaret", "Cabaret", R.drawable.films13));
        songs.add(new Song("Mamma Mia", "Mamma Mia", R.drawable.films14));
        songs.add(new Song("Mission Imposible Theme", "Mission Impossible", R.drawable.films15));
        songs.add(new Song("Under Pressure", "Happy Feet 2", R.drawable.films16));
        songs.add(new Song("Do-Re-Mi", "Sound of Music", R.drawable.films17));
        songs.add(new Song("Star Wars Theme", "Star Wars", R.drawable.films18));
        songs.add(new Song("Hakuna Matata", "The Lion King", R.drawable.films19));

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
