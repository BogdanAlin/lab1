package ro.uvt.sabloane;

import java.util.Collection;
import java.util.LinkedList;
public class subchapter {
    private final String name;
    private final Collection<image> images = new LinkedList<>();
    private final Collection<paragraph> paragraphs = new LinkedList<>();
    private final Collection<table> tables = new LinkedList<>();



    public subchapter(String name) {
        this.name = name;
    }

    public String getsubchapter() {
        return name;
    }

    public void createnewparagraph(String s) {
        paragraphs.add(new paragraph(s));
    }

    public void createnewimage(String s) {
        images.add(new image(s));
    }

    public void createnewtable(String s) {
        tables.add(new table(s));
    }

    @Override
    public String toString() {
        return "subchapter{" +
                "name='" + name + '\'' +
                ", images=" + images +
                ", paragraphs=" + paragraphs +
                ", tables=" + tables +
                '}';
    }

    public void print() {
       System.out.println(this);
    }
}
