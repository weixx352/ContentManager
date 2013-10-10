 public class Song extends Content {
	
	public Song(){
		playCount = 0;
	}
	
	public void playSong(){
		playCount++;
	}
	
	public void playSong(int count){
		playCount = playCount + count;
	}
	
	public Song(String ar, int le, int pc){
		artist = ar;
		length = le;
		playCount = pc;
	}
		
	public String getArtist(){
    	return artist;
    }
    
    public int getLength(){
    	return length;
    }
    
    public int getPlayCount(){
    	return playCount;
    }
    
    public void setArtist(String ar){
    	artist = ar;
    }
    
    public void setLength(int le){
    	length = le;
    }
    
    public void setPlayCount(int pc){
    	playCount = pc;
    }
    
    public void print(){
    	System.out.println("title: " + getTitle());
		System.out.println("genre: " + getGenre());
		System.out.println("release date: " + getReleaseDate());
		System.out.println("artist: " + getArtist());
		System.out.println("song length: " + getLength());
		System.out.println("play count: " + getPlayCount());
    }
	
	private String artist;
	private int length;
	private int playCount;

}
