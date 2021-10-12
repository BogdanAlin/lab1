package ro.uvt.sabloane;

public class subchapter {
    private final String name;
    private final Collection<String> images = new LinkedList<String>();
    private final Collection<String> paragraphs = new LinkedList<String>();
    private final Collection<String> tables = new LinkedList<String>();



    public subchapter(String name) {
        this.name = name;
    }

    public String getsubchapter() {
        return name;
    }

    public void createnewparagraph(String s) {
        paragraphs.add(s);
    }

    public void createnewimage(String s) {
        images.add(s);
    }

    public void createnewtable(String s) {
        tables.add(s);
    }

    public void print() {
        System.out.println("Subchapter: " + name + "\nParagraph: " + paragraphs + "\nImage with name: " + images + "\nTible with Title" + tables);
    }
}
