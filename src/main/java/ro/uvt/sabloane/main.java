package ro.uvt.sabloane;

import java.util.Collection;

public class main {
    //public static void main(String[] args) {
//        book discoTitanic = new book("Disco Titanic");
//        author rpGheo = new author("Radu Pavel Gheo");
//        discoTitanic.addauthor(rpGheo);
//
//        Collection <author> a = discoTitanic.getauthors();
//        a.add(new author("Mircea Cartarescu"));
//        System.out.println("Bogdan");
//
//
//        int indexChapterOne = discoTitanic.createchapter("Capitolul 1");
//        chapter chp1 = discoTitanic.getchapter(indexChapterOne);
//        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
//       subchapter scOneOne = chp1.getsubchapter(indexSubChapterOneOne);
//       scOneOne.createnewparagraph("Paragraph 1");
//       scOneOne.createnewparagraph("Paragraph 2");
//       scOneOne.createnewparagraph("Paragraph 3");
//       scOneOne.createnewimage("Image 1");
//       scOneOne.createnewparagraph("Paragraph 4");
//        scOneOne.createnewtable("Table 1");
//        scOneOne.createnewparagraph("Paragraph 5");
//        scOneOne.print();
        public static void main(String[] args) {
            book noapteBuna = new book("Noapte buna, copii!");
            author rpGheo = new author("Radu Pavel Gheo");
            noapteBuna.addauthor(rpGheo);
            Section cap1 = new Section("Capitolul 1");
            Section cap11 = new Section("Capitolul 1.1");
            Section cap111 = new Section("Capitolul 1.1.1");
            Section cap1111 = new Section("Subchapter 1.1.1.1");
            noapteBuna.add(new paragraph("Multumesc celor care ..."));
            noapteBuna.add(cap1);
            cap1.add(new paragraph("Moto capitol"));
            cap1.add(cap11);
            cap11.add(new paragraph("Text from subchapter 1.1"));
            cap11.add(cap111);
            cap111.add(new paragraph("Text from subchapter 1.1.1"));
            cap111.add(cap1111);
            cap1111.add(new image("Image subchapter 1.1.1.1"));
            noapteBuna.print();
        }
    }

