
public class CDPlayer {
	private Playlist playlist;
	private CD cd;
	
	public CDPlayer(CD cd, Playlist playlist){
		this.setPlaylist(playlist);
		this.setCd(cd);
	}
	public CDPlayer(CD cd){
		this.setCd(cd);
	}
	public CDPlayer(Playlist playlist){
		this.setPlaylist(playlist);
	}
	
	public Playlist getPlaylist() {
		return playlist;
	}
	
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	public CD getCd() {
		return cd;
	}
	
	public void setCd(CD cd) {
		this.cd = cd;
	}
	
	
}
