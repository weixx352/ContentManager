/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
        
public class genreComparator implements Comparator<Content>{
    
    @Override
    public int compare(Content o1, Content o2){
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
