package ro.uvt.sabloane;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class chapter {
    private final String name;
    private final List<subchapter> subchapters = new LinkedList<>();

    public chapter(String name) {
        this.name = name;
    }


    public int createSubChapter(String s) {
        subchapters.add(new subchapter(s));
        return 0;
    }

    public subchapter getsubchapter(int indexsubchapteroneone) {
        return  subchapters.get(indexsubchapteroneone);
    }

    @Override
    public String toString() {
        return "chapter{" +
                "name='" + name + '\'' +
                ", subchapters=" + subchapters +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}

