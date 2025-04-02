/**
 * Represents a playlist with additional functionalities such as shuffling and
 * displaying songs.
 */
public interface Playlist extends PlaylistKernel {

    /**
     * Randomly shuffles the order of songs in the playlist.
     */
    void shuffle();

    /**
     * Displays all the songs currently in the playlist.
     */
    void displayPlaylist();
}
