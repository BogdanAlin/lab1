package ro.uvt.sabloane;

public class tableofcontents implements Element{
    private final String contents;

    public tableofcontents(String contents){
        this.contents=contents;
    }

    public String getcontentsume() {
        return contents;
    }

    @Override
    public String toString() {
        return "tableofcontents{" +
                "contents='" + contents + '\'' +
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
