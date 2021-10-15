package ro.uvt.sabloane;

public class image implements Element {
    private final String imageName;

    public image(String imageName) {
        this.imageName = imageName;
    }

    public String getimageName() {
        return imageName;
    }

    @Override
    public String toString() {
        return "image{" +
                "imageName='" + imageName + '\'' +
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
