package com.example.hamilton.jams;

public class Song {
    /**
     * Song Name
     */
    private String mSongName;

    /**
     * Artist Name
     */
    private String mArtistName;

    /**
     * Create a new Song object.
     *
     * @param songName   is the song title
     * @param artistName is the name of the Artist
     */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Get the default translation of the word.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getArtistName() {
        return mArtistName;
    }
}
