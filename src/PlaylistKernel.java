
import components.standard.Standard;

/**
 * Represents the core functionality of a playlist. Defines methods for managing
 * a collection of songs.
 */
public interface PlaylistKernel extends Standard<Playlist> {

    /**
     * Adds a song to the playlist.
     *
     * @param s
     *            The {@code song} to add to the playlist.
     */
    public void addToPlaylist(Song s);

    /**
     * Removes a random song from the playlist if it exists.
     *
     * @return the {@code Song} removed from {@code this}
     */
    public Song removeAnyFromPlaylist();

    /**
     * Checks whether a song is present in the playlist.
     *
     * @param s
     *            The song to check.
     * @return {@code true} if the song is in the playlist, {@code false}
     *         otherwise.
     */
    public boolean inPlaylist(Song s);

    /**
     * Returns the size of the playlist
     *
     * @return |this|
     */
    public int size();
}
