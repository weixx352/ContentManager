public class Book extends Content {
	
	public Book(){
		setRead(false);
	}
	
	public void readBook(){
		setRead(true);
	}
	
	public Book(String a, String p, int pa){
		author = a;
		publisher = p;
		pages = pa;
	}
		
	public String getAuthor(){
    	return author;
    }
    
    public String getPublisher(){
    	return publisher;
    }
    
    public int getPages(){
    	return pages;
    }
    
    public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}
    
    public void setAuthor(String a){
    	author = a;
    }
    
    public void setPublisher(String p){
    	publisher = p;
    }
    
    public void setPages(int pa){
    	pages = pa;
    }
    
	public void print(){
		System.out.println("title: " + getTitle());
		System.out.println("genre: " + getGenre());
		System.out.println("release date: " + getReleaseDate());
		System.out.println("author: " + getAuthor());
		System.out.println("publisher: " + getPublisher());
		System.out.println("pages: " + getPages());
	}

	private String author;
	private String publisher;
	private int pages;
	private boolean read;
}
