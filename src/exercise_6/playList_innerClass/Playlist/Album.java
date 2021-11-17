package exercise_6.playList_innerClass.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        return this.songs.add(new Song(titleOfSong, durationOfSong));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {
        Song song = songs.findSong(titleOfSong);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String titleOfSong) {
            for (Song song : this.songs) {
                if (!song.equals(titleOfSong)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}