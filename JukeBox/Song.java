import java.time.LocalTime;

public class Song {
	private long ID;
	private Artist artist;
	private String title;
	private LocalTime length;
	
	public Song(long ID, Artist artist, String title, LocalTime length){
		this.ID = ID;
		this.artist = artist;
		this.title = title;
		this.length = length;
	}
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalTime getLength() {
		return length;
	}
	public void setLength(LocalTime length) {
		this.length = length;
	}
}