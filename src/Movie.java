public class Movie extends Content{
	
	public Movie(){
		setWatched(false);
	}
	
	public void watchMovie(){
		setWatched(true);
	}
	
	public Movie(String di, String pr, int rt){
		director = di;
		producer = pr;
		runTime = rt;
	}
		
	public String getDirector(){
    	return director;
    }
    
    public String getProducer(){
    	return producer;
    }
    
    public int getRunTime(){
    	return runTime;
    }
    
    public boolean isWatched() {
		return watched;
	}

	public void setWatched(boolean watched) {
		this.watched = watched;
	}

	public void setDirector(String di){
    	director = di;
    }
    
    public void setProducer(String pr){
    	producer = pr;
    }
    
    public void setRunTime(int rt){
    	runTime = rt;
    }
    
    public void print(){
		System.out.println("title: " + getTitle());
		System.out.println("genre: " + getGenre());
		System.out.println("release date: " + getReleaseDate());
		System.out.println("director: " + getDirector());
		System.out.println("producer: " + getProducer());
		System.out.println("runTime: " + getRunTime());
	}
	
    private String director;
	private String producer;
	private int runTime;
	private boolean watched;
}
