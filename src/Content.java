public class Content {
    public Content() {};
    public Content(String t, String g, int d)
    {
    	title = t;
    	genre = g;
    	releaseDate = d;
    }
    
    public String getTitle(){
    	return title;
    }
    
    public String getGenre(){
    	return genre;
    }
    
    public int getReleaseDate(){
    	return releaseDate;
    }
    
    public void setTitle(String t){
    	title = t;
    }
    
    public void setGenre(String g){
    	genre = g;
    }
    
    public void setReleaseDate(int d){
    	releaseDate = d;
    }
    
    public String title;
    public String genre;
    public int releaseDate;
    
    
}
