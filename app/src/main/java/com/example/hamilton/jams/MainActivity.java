package com.example.hamilton.jams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Get a handle to all user interface elements
        final TextView latino = findViewById(R.id.latino);
        final TextView anime = findViewById(R.id.anime);
        final TextView dance = findViewById(R.id.dance);
        final TextView old_school = findViewById(R.id.old_school);
        final TextView films = findViewById(R.id.films);
        final TextView videogames = findViewById(R.id.video_games);

        // Setup event handler latino category
        latino.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when latino category is clicked on.
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LatinoActivity.class);
                startActivity(i);
            }
        });


        // Setup event handler anime category
        anime.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when anime category is clicked on.
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AnimeActivity.class);
                startActivity(i);
            }
        });

        // Setup event handler dance category
        dance.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when dance category is clicked on.
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DanceActivity.class);
                startActivity(i);
            }
        });

        // Setup event handler OldSchool category
        old_school.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when OldSchool category is clicked on.
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), OldSchoolActivity.class);
                startActivity(i);
            }
        });

        // Setup event handler TV & Films category
        films.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when TV & Films category is clicked on.
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FilmsActivity.class);
                startActivity(i);
            }
        });

        // Setup event handler VideoGames category
        videogames.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when VideoGames category is clicked on.
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), VideoGamesActivity.class);
                startActivity(i);
            }
        });
    }
}
