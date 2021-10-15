package ro.uvt.sabloane;

public class author {
    private final String nume;

    public author(String nume){
        this.nume=nume;
    }

    public String getNume() {
        return nume;
    }
    @Override
    public String toString() {
        return "author{" +
                "nume='" + nume + '\'' +
                '}';
    }
    public void print(){
        System.out.println(this);
    }



}
