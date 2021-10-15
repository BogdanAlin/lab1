package ro.uvt.sabloane;

public class table {

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
}
