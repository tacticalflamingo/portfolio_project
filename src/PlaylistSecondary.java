
/**
 * Represents a playlist with additional functionalities such as shuffling and
 * displaying songs.
 */
public abstract class PlaylistSecondary implements Playlist {

    /**
     * Randomly shuffles the order of songs in the playlist.
     */
    @Override
    public void shuffle() {

    }

    /**
     * Compresses and returns the entirety of the playlist as a string with ":"
     * seperating each {@code Song}
     */
    @Override
    public String savePlaylist() {

        return "";
    }

    /**
     * Askes the user for a {@code String} and populate {@code this} with the
     * provided playlist
     */
    @Override
    public void loadPlaylist(String playlist) {

    }
}