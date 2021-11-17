package exercise_5.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        Song song = findSong(titleOfSong);
        if (findSong(titleOfSong) != null) {
            this.songs.add(song);
            return true;
        }
        return false;
    }

    private Song findSong(String titleOfSong) {
        for (Song song : this.songs) {
            if (!song.equals(titleOfSong)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> songs) {
        if (trackNumber > 0) {
            Song song = songs.get(trackNumber - 1);
            songs.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> songs) {
        Song song = findSong(titleOfSong);
        if (song != null) {
            songs.add(song);
            return true;
        }
        return false;
    }
}
