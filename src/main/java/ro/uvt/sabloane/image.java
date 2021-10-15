package ro.uvt.sabloane;

public class image {
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
}
