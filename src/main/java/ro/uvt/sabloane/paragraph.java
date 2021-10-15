package ro.uvt.sabloane;

public class paragraph implements Element {

    private final String text;

    public paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "paragraph{" +
                "text='" + text + '\'' +
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