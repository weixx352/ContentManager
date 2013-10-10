/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Comparator;
        
public class titleComparator implements Comparator<Content>{
    
    @Override
    public int compare(Content o1, Content o2){
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
