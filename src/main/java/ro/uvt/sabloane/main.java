package ro.uvt.sabloane;

import java.util.Collection;

public class main {
    public static void main(String[] args) {
        book discoTitanic = new book("Disco Titanic");
        author rpGheo = new author("Radu Pavel Gheo");
        discoTitanic.addauthor(rpGheo);

        Collection <author> a = discoTitanic.getauthors();
        a.add(new author("Mircea Cartarescu"));
        System.out.println("Bogdan");


//        int indexChapterOne = discoTitanic.createchapter("Capitolul 1");
//        chapter chp1 = discoTitanic.getchapter(indexChapterOne);
//        int indexSubChapterOneOne = chp1.createsubchapter("Subcapitolul 1.1");
//        subchapter scOneOne = chp1.getsubchapter(indexSubChapterOneOne);
//        scOneOne.createnewparagraph("Paragraph 1");
//        scOneOne.createnewparagraph("Paragraph 2");
//        scOneOne.createnewparagraph("Paragraph 3");
//        scOneOne.createnewimage("Image 1");
//        scOneOne.createnewparagraph("Paragraph 4");
//        scOneOne.createnewtable("Table 1");
//        scOneOne.createnewparagraph("Paragraph 5");
//        scOneOne.print();
    }
}
