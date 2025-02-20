import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a song with a name and an artist.
 */
class Song {
    private String name;
    private String artist;

    /**
     * Constructs a Song with the given name and artist.
     * @param name The name of the song.
     * @param artist The artist of the song.
     */
    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    /**
     * Gets the name of the song.
     * @return The name of the song.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the artist of the song.
     * @return The artist of the song.
     */
    public String getArtist() {
        return this.artist;
    }

    /**
     * Returns a string representation of the song.
     * @return The song name and artist.
     */
    @Override
    public String toString() {
        return this.name + " by " + this.artist;
    }
}

/**
 * Represents a playlist containing multiple songs.
 */
class Playlist {
    private List<Song> songs;

    /**
     * Constructs an empty playlist.
     */
    public Playlist() {
        this.songs = new ArrayList<>();
    }

    /**
     * Adds a song to the playlist.
     * @param s The song to add.
     */
    public void addToPlaylist(Song s) {
        this.songs.add(s);
    }

    /**
     * Removes a song from the playlist.
     * @param s The song to remove.
     */
    public void removeFromPlaylist(Song s) {
        this.songs.remove(s);
    }

    /**
     * Checks if a song is in the playlist.
     * @param s The song to check.
     * @return True if the song is in the playlist, false otherwise.
     */
    public boolean inPlaylist(Song s) {
        return this.songs.contains(s);
    }

    /**
     * Shuffles the songs in the playlist randomly.
     */
    public void shuffle() {
        Collections.shuffle(this.songs);
    }

    /**
     * Displays the songs currently in the playlist.
     */
    public void displayPlaylist() {
        System.out.println("Playlist:");
        for (Song s : this.songs) {
            System.out.println(s);
        }
    }

    /**
     * The main method to demonstrate the functionality of the Playlist class.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

        // Creating sample songs
        Song song1 = new Song("Shape of You", "Ed Sheeran");
        Song song2 = new Song("Blinding Lights", "The Weeknd");
        Song song3 = new Song("Bohemian Rhapsody", "Queen");

        // Adding songs to the playlist
        myPlaylist.addToPlaylist(song1);
        myPlaylist.addToPlaylist(song2);
        myPlaylist.addToPlaylist(song3);

        // Display playlist before shuffling
        System.out.println("Before Shuffle:");
        myPlaylist.displayPlaylist();

        // Shuffle and display playlist after shuffling
        myPlaylist.shuffle();
        System.out.println("After Shuffle:");
        myPlaylist.displayPlaylist();
        myPlaylist.addToPlaylist(song1);
        myPlaylist.addToPlaylist(song2);
        myPlaylist.addToPlaylist(song3);

        // Display playlist before shuffling
        System.out.println("Before Shuffle:");
        myPlaylist.displayPlaylist();

        // Shuffle and display playlist after shuffling
        myPlaylist.shuffle();
        System.out.println("After Shuffle:");
        myPlaylist.displayPlaylist();
    }
}
