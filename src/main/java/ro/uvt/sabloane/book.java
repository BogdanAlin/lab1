package ro.uvt.sabloane;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class book {
    private final String title;
    private Collection<author> autori = new LinkedList<>();
    private List<chapter> chapters = new LinkedList<>();

    public book(String title) {
        this.title = title;
    }

    public void addauthor(author autor) {
        autori.add(autor);
    }

    public void removeauthor(author autor) {
        autori.remove(autor);
    }

    public Collection<author> getauthors() {
        return autori;
    }

    public int createchapter(String s) {
        chapters.add(new chapter(s));
        return 0;
    }

    public chapter getchapter(int indexchapterone) {
        return  chapters.get(indexchapterone);
    }

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", autori=" + autori +
                ", chapters=" + chapters +
                '}';
    }

    public void print(){
        System.out.println(this);
    }

}