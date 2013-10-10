/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;

public class releaseDateComparator implements Comparator<Content>{
    
    @Override
    public int compare(Content o1, Content o2){
        if(o1.getReleaseDate() > o2.getReleaseDate())
            return 1;
        else if(o1.getReleaseDate() < o2.getReleaseDate())
            return -1;
        else
            return 0;
                    
    }
}
