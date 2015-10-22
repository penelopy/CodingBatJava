package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class MusicCollection {
    private List<Album> albums = new ArrayList<Album>();

    public void add(Album album) {
        albums.add(album);
    }

    public void remove(Album album) {
        albums.remove(album);
    }

    @Override
    public String toString() {
        return albums.toString();
    }
}

class Album {
    final String title;
    private List<Song> songs = new ArrayList<Song>();

    public Album(String title) {
        this.title = title;
    }

    public void add(Song song) {
        songs.add(song);
    }

    public void shuffle() {
        Collections.shuffle(songs);
    }

    public void remove(Song victim) {
        songs.remove(victim);
    }

    @Override
    public String toString() {
        return songs.toString();
    }
}

class Artist {
    final String name;

    public Artist(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;

        Artist artist = (Artist) o;

        if (name != null ? !name.equals(artist.name) : artist.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

class Song {

    final SongTitle title;
    final Artist name;

    public Song(String name, String title) {
        this(new Artist(name), new SongTitle(title));
    }

    public Song(Artist name, SongTitle title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return title + ", " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;

        Song song = (Song) o;

        if (name != null ? !name.equals(song.name) : song.name != null) return false;
        if (title != null ? !title.equals(song.title) : song.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

class SongTitle {
    final String title;

    public SongTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SongTitle)) return false;

        SongTitle songTitle = (SongTitle) o;

        if (title != null ? !title.equals(songTitle.title) : songTitle.title != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}