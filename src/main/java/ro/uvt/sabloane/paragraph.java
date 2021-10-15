package ro.uvt.sabloane;

public class paragraph {

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
}