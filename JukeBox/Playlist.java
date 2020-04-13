import java.util.List;

public class Playlist {
	private List<Song> songs;
	private int current_song_index;
	
	
	public Playlist(List<Song> songs){
		this.songs = songs;
		current_song_index = 0;
	}
	
	public void queueUpSong(Song song){
		songs.add(song);
	}
	
	public void playSong(Song song){
		for(int i = 0; i < songs.size(); i++){
			if(songs.get(i) == song){
				current_song_index = i;
				break;
			}
		}
	}
	
	public Song nextSong(){
		int next_song_index = (current_song_index + 1) % songs.size();
		return songs.get(next_song_index);
	}
}
