import java.util.Set;

public class Jukebox {
	private CDPlayer cdPlayer;
	private User user;
	private Set<CD> cdCollections;
	private Song current_song;
	private Playlist current_playlist;
	private CD current_CD;
	
	public Jukebox(CDPlayer cdPlayer, User user, Set<CD> cdCollections){
		this.cdPlayer =  cdPlayer;
		this.user = user;
		this.cdCollections = cdCollections;
	}
	
	public void setUser(User u){
		this.user = u;
	}
	
	public void playSongByCD(CD cd, Song song){
		current_CD = cd;
		current_song = song;
		
		current_CD.playSong(song);
	}
	
	public void playSongByPlaylist(Playlist playlist, Song song){
		current_playlist = playlist;
		current_song = song;
		
		current_playlist.playSong(song);
	}
	
	public Song getCurrentSong(){
		return current_song;
	}
}
