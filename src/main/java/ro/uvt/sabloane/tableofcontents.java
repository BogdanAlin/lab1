package ro.uvt.sabloane;

public class tableofcontents {
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
}
