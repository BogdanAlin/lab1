package ro.uvt.sabloane;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class book extends Section{
    private Collection<author> autori = new LinkedList<>();
    private List<chapter> chapters = new LinkedList<>();

    public book(String title) {
        super(title);
    }

    @Override
    public void add(Element e) {
        super.add(e);
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
                "title='" + super.getTitle() + '\'' +
                ", autori=" + autori +

                '}';
    }

    public void print(){
        System.out.println(this);


        elements.forEach(Element::print);
    }

}