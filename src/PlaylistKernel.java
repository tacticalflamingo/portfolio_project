import java.util.List;

import components.standard.Standard;

/**
 * Represents the core functionality of a playlist. Defines methods for managing
 * a collection of songs.
 */
public interface PlaylistKernel extends Standard<Playlist> {

    /**
     * A list to store the songs in the playlist. It should be initialized by
     * implementing classes.
     */
    List<Song> songs = null;

    /**
     * Initializes an empty playlist.
     */
    void Playlist();

    /**
     * Adds a song to the playlist.
     *
     * @param s
     *            The song to add to the playlist.
     */
    void addToPlaylist(Song s);

    /**
     * Removes a song from the playlist if it exists.
     *
     * @param s
     *            The song to remove from the playlist.
     */
    void removeFromPlaylist(Song s);

    /**
     * Checks whether a song is present in the playlist.
     *
     * @param s
     *            The song to check.
     * @return {@code true} if the song is in the playlist, {@code false}
     *         otherwise.
     */
    boolean inPlaylist(Song s);
}
