package com.example.hamilton.jams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class OldSchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList using the public class Song
        ArrayList<Song> songs = new ArrayList<>();

        // Create a list of songs
        songs.add(new Song("Dancing Queen", "ABBA", R.drawable.oldschool00, R.raw.oldschool00));
        songs.add(new Song("Highway To Hell", "ACDC", R.drawable.oldschool01, R.raw.oldschool01));
        songs.add(new Song("The Sign", "Ace of Base", R.drawable.oldschool02, R.raw.oldschool02));
        songs.add(new Song("I Don't Want Miss a Thing", "Aerosmith", R.drawable.oldschool03, R.raw.oldschool03));
        songs.add(new Song("Everything I Do", "Bryan Adams", R.drawable.oldschool04, R.raw.oldschool04));
        songs.add(new Song("I'm Coming Out", "Diana Ross", R.drawable.oldschool05, R.raw.oldschool05));
        songs.add(new Song("Hot Stuff", "Donna Summer", R.drawable.oldschool06, R.raw.oldschool06));
        songs.add(new Song("September", "Earth, Wind & Fire", R.drawable.oldschool07, R.raw.oldschool07));
        songs.add(new Song("Jailhouse Rock", "Elvis Presley", R.drawable.oldschool08, R.raw.oldschool08));
        songs.add(new Song("New York, New York", "Frank Sinatra", R.drawable.oldschool09, R.raw.oldschool09));
        songs.add(new Song("Any Way You Want it", "Journey", R.drawable.oldschool10, R.raw.oldschool10));
        songs.add(new Song("The End", "Linkin Park", R.drawable.oldschool11, R.raw.oldschool11));
        songs.add(new Song("Thriller", "Michael Jackson", R.drawable.oldschool12, R.raw.oldschool12));
        songs.add(new Song("Don't Speak", "No Doubt", R.drawable.oldschool13, R.raw.oldschool13));
        songs.add(new Song("Wonderwall", "Oasis", R.drawable.oldschool14, R.raw.oldschool14));
        songs.add(new Song("Losing My Religion", "R.E.M.", R.drawable.oldschool15, R.raw.oldschool15));
        songs.add(new Song("Signed, Sealed, Delivered", "Stevie Wonder", R.drawable.oldschool16, R.raw.oldschool16));
        songs.add(new Song("I'll Stand By You", "The Pretenders", R.drawable.oldschool17, R.raw.oldschool17));
        songs.add(new Song("500 Miles", "The Proclaimers", R.drawable.oldschool18, R.raw.oldschool18));
        songs.add(new Song("Disco Inferno", "The Trammps", R.drawable.oldschool19, R.raw.oldschool19));

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
