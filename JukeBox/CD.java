import java.util.List;

public class CD {
	private long ID;
	private List<Song> songs;
	private Artist artist;
	private int current_song_index;
	
	public CD(long ID, List<Song> songs, Artist artist){
		this.setID(ID);
		this.setSongs(songs);
		this.setArtist(artist);
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}
	
	public void playSong(Song song){
		for(int i = 0; i < songs.size(); i++){
			if(songs.get(i) == song){
				current_song_index = i;
				break;
			}
		}
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	
	
}
