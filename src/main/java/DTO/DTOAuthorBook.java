
package DTO;

import java.util.ArrayList;
import java.util.Collection;


public class DTOAuthorBook {
    
    private String title;
    private String author;
    private Collection<DTOLocation> locations = new ArrayList<>();
    
    public DTOAuthorBook(String title, String author){
        this.title = title;
        this.author = author;
    }

    public DTOAuthorBook(String title) {
        this.title = title;
    }
    
    

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Collection<DTOLocation> getLocations() {
        return locations;
    }
    
    public void setLocations(Collection<DTOLocation> locations){
        this.locations = locations;
    }
    
    
}
