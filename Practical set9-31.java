import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        // Add songs
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Playlist: " + playlist);

        // Play first song
        System.out.println("\nPlaying: " + playlist.removeFirst());
        System.out.println("After playing first song: " + playlist);

        // Skip last song
        System.out.println("\nSkipped: " + playlist.removeLast());
        System.out.println("After skipping last song: " + playlist);
    }
}