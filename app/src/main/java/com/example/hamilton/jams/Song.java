package com.example.hamilton.jams;

import android.media.Image;

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
     * Image Resource id for the Album Cover
     */
    private int mAlbumCover;

    /**
     * Tune for selected song
     */
    private int mSongTune;

    /**
     * Create a new Song object.
     *
     * @param songName   is the song title
     * @param artistName is the name of the Artist
     * @param albumCover is the resource id of the album's image
     */

    public Song(String songName, String artistName, int albumCover, int songTune) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumCover = albumCover;
        mSongTune = songTune;
    }

    /**
     * Get the resource id of the album's image.
     */
    public int getAlbumCover() { return mAlbumCover; }

    /**
     * Get the Song name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Artist Name.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the Song's Tune.
     */
    public int getSongTune() {
        return mSongTune;
    }
}
