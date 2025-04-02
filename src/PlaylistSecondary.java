import java.util.List;

/**
 * Represents a playlist with additional functionalities such as shuffling and
 * displaying songs.
 */
public abstract class PlaylistSecondary implements Playlist {

    /**
     * A list to store the songs in the playlist. It should be initialized by
     * implementing classes.
     */
    List<Song> songs = null;

    /**
     * Randomly shuffles the order of songs in the playlist.
     */
    @Override
    public void shuffle();

    /**
     * Displays all the songs currently in the playlist.
     */
    @Override
    public void displayPlaylist();
}