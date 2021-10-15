package ro.uvt.sabloane;

public class table implements Element{

    private final String title;

    public table(String title) {
        this.title = title;
    }

    public String gettitle() {
        return title;
    }

    @Override
    public String toString() {
        return "table{" +
                "title='" + title + '\'' +
                '}';
    }
    public void print(){
        System.out.println(this);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int e) {
        return null;
    }
}
