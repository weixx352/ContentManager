package yahuiProj1;

import java.util.ArrayList;   // for ArrayList   
import java.util.*;

public class Library {
    
    private ArrayList<Content> contentArray = new ArrayList<>();
    
    public Library(){
        // so now your have an arraylist to store any content
    }
    
    public void addContent(Content c){
        contentArray.add(c);
    }
    
    public Content getContentByTitle(String title){
        int arrayLength = contentArray.size();
        boolean found = false;
        for(int i=0;i<arrayLength;i++){
            if(title.equals(contentArray.get(i).getTitle())){
                found = true;
                return contentArray.get(i);
            }
        }
        System.out.println("There is no such content titled "+title);
        return null;
    }
    
    public Content getContentByType(String type){
        
        return null;
    }
    
    public void sort(String sortBy){
        // sort = "title", "genre", OR "release date"
        if(sortBy.equals("title")){
            Collections.sort(contentArray, new titleComparator());
            
        }else if(sortBy.equals("genre")){
            Collections.sort(contentArray, new genreComparator());
            
        }else if(sortBy.equals("release date")){
            Collections.sort(contentArray, new releaseDateComparator());
            
        }else{
            System.out.println("ERROR! your input has to be exact same as the given sortable strings.");
        }
        /*
         * you need to do research on ArrayList and Collection
         * Learn how to take the advantage of ArrayList and Collection to do sorting.
         *      topics are
         *          Collection.sort(a,b);
         *          implements Comparator<T>;
         *          compareTo & compare
         * Command on this will help you to do sorting more efficiently, and save your coding time.
         * These topics will definitely be on your exam and interview questions.
        */
    }
    
    public Content getRandomContent(){
        
        return null;
    }
    
    public ArrayList<Book> getUnreadBooks(){
        
        return null;
    }
    
    public ArrayList<Movie> getUnwatchedMovies(){
        
        return null;
    }
    
    public Content getMostPlayed(int count){
        
        return null;
    }
    
    // additional methods    
    public String print(){
        String print = "";
        int length = contentArray.size();
        Content temp;
        for(int i=0;i<length;i++){
            temp = contentArray.get(i);
            print += temp.getTitle()+"\n\t"+temp.getGenre()+"\n\t"+temp.getReleaseDate()+"\n\n";
        }
        return print;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("***********THis is only for test***********");
        Library newLib = new Library();
        
        String author = "Yahui Wei";
        String publisher = "Addison Wesley";
        int numOfPages = 250;
        Book newBook1 = new Book(author,publisher,numOfPages);
        newBook1.setTitle("How to get GPA 4.0");
        newBook1.setGenre("Study");
        newBook1.setReleaseDate(2013);//You need to change the type of ReleaseDate!
        
        String director = "Lizi Chen";
        String producer = "Disney";
        int runTime = 120;//minutes i guess
        Movie newMovie1 = new Movie(director, producer, runTime);
        newMovie1.setTitle("How to entertain Yahui Wei");
        newMovie1.setGenre("Relationship");
        newMovie1.setReleaseDate(2014);
        
        String artist = "Yahui's partner";
        int length = 3;//WRONG TYPE!
        int playCount = 10;
        Song newSong1 = new Song(artist,length, playCount);
        newSong1.setTitle("Escaping Group Study");
        newSong1.setGenre("Study");
        newSong1.setReleaseDate(2012);
        
        System.out.println("Testing Library's AddContent Function...");
        newLib.addContent(newBook1);
        newLib.addContent(newMovie1);
        newLib.addContent(newSong1);
        
        System.out.println("Testing Library's getContentByTitle Function...");
        System.out.println("Please enter the title...");
        String search = input.nextLine();
        Content searchResult = newLib.getContentByTitle(search);
        if(searchResult!=null){
            System.out.print(searchResult.getTitle()+"\n"+searchResult.getGenre()+"\n"+searchResult.getReleaseDate()+"\n");
            if(searchResult instanceof Book){
                Book temp = (Book)searchResult;
                System.out.println(temp.getAuthor()+"\n"+temp.getPublisher()+"\n"+temp.getPages());
                
            }
        }
        
        System.out.println("\nTesting Library's Sort Function...\n");
        System.out.println("Sorting by title");
        newLib.sort("title");
        System.out.println(newLib.print());
        System.out.println("Sorting by genre");
        newLib.sort("genre");
        System.out.println(newLib.print());
        System.out.println("Sorting by release date");
        newLib.sort("release date");
        System.out.println(newLib.print());
    }
}
