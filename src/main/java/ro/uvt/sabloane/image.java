package ro.uvt.sabloane;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class image implements Element, Picture{
    private String imageName;
    private PictureContent imageContent;

    public image(String imageName){

        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PictureContent content(){
        return imageContent;
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
