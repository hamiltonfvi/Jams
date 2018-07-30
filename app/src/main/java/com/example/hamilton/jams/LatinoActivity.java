package com.example.hamilton.jams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LatinoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList using the public class Song
        ArrayList<Song> songs = new ArrayList<>();

        // Create a list of songs
        songs.add(new Song("Obsesion", "Aventura", R.drawable.latino00));
        songs.add(new Song("Mayores", "Becky G & Bad Bunny", R.drawable.latino01));
        songs.add(new Song("Bailando", "Enrique Iglesias & Gente de Zona", R.drawable.latino02));
        songs.add(new Song("Mi Gente", "J Balvin & Willy William", R.drawable.latino03));
        songs.add(new Song("Bonito", "Jarabe de Palo", R.drawable.latino04));
        songs.add(new Song("Ojala Que Llueva Cafe", "Juan Luis Guerra", R.drawable.latino05));
        songs.add(new Song("Dia Cero", "La Ley", R.drawable.latino06));
        songs.add(new Song("La Playa", "La Oreja De Van Gogh", R.drawable.latino07));
        songs.add(new Song("Sueños Rotos", "La Quinta Estacion", R.drawable.latino08));
        songs.add(new Song("Asereje", "Las Ketchup", R.drawable.latino09));
        songs.add(new Song("Amores Extraños", "Laura Pausini", R.drawable.latino10));
        songs.add(new Song("Macarena", "Los Del Rio", R.drawable.latino11));
        songs.add(new Song("Lamento Boliviano", "Los Enanitos Verdes", R.drawable.latino12));
        songs.add(new Song("Despacito", "Luis Fonsi & Daddy Yankee", R.drawable.latino13));
        songs.add(new Song("Aguanile", "Marc Anthony ", R.drawable.latino14));
        songs.add(new Song("Corazon Sin Cara", "Prince Roy", R.drawable.latino15));
        songs.add(new Song("Livin' La Vida Loca", "Ricky Martin", R.drawable.latino16));
        songs.add(new Song("Donde Estas Corazon", "Shakira", R.drawable.latino17));
        songs.add(new Song("Loca", "Shakira & El Cata", R.drawable.latino18));
        songs.add(new Song("Micalea", "Sonora Carruseles", R.drawable.latino19));

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
