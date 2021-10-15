package ro.uvt.sabloane;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {

    private final String title;
    protected final List<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "Section{" +
                "title='" + title + '\'' +
                ", elements=" + elements +
                '}';
    }


    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public void add(Element e) {
    elements.add(e);
    }

    @Override
    public void remove(Element e) {
    elements.remove(e);
    }

    @Override
    public Element get(int e) {

        return elements.get(e);
    }

    protected String getTitle() {
        return title;
    }
}
