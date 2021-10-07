package ro.uvt.sabloane;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class book {
    private final String title;
    private Collection<author> autori = new LinkedList<>();

    public book(String title){
        this.title=title;
    }
    public void addauthor(author autor){
        autori.add(autor);
    }
    public void removeauthor(author autor){
        autori.remove(autor);
    }
    public Collection<author> getauthors() {
        return Collections.unmodifiableCollection(autori);
    }
}
