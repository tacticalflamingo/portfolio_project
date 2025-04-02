/**
 * Represents a playlist with additional functionalities such as shuffling and
 * displaying songs.
 */
public interface Playlist extends PlaylistKernel {

    /**
     * Randomly shuffles the order of songs in the playlist.
     */
    public void shuffle();

    /**
     * Compresses and returns the entirety of the playlist as a string with ":"
     * seperating each {@code Song}
     */
    public String savePlaylist();

    /**
     * Askes the user for a {@code String} and populate {@code this} with the
     * provided playlist
     */
    public void loadPlaylist(String playlist);
}
