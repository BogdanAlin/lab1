package ro.uvt.sabloane;

public class chapter {
    private final String name;
    private final Collection<String> subchapters = new LinkedList<String>();

    public chapter(String name) {
        this.name = name;
    }

    public static void add(String s) {

    }

    public int createSubChapter(String s) {
        subchapters.add(s);
        return 0;
    }

    public subchapter getsubchapter(int indexsubchapteroneone) {
        return (subchapter) subchapters;
    }
}
}
