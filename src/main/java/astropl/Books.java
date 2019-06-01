package astropl;

import java.util.ArrayList;
import java.util.List;

public class Books {


    private final Object tytul;
    private final Object author;
    List <Object> books = new ArrayList <>();

//    public Books(List <Book> books) {

//    "}

    public Books(Object tytul, Object autor) {
        //this.books = books;
        this.tytul = tytul;
        this.author = autor;
        books.add(autor+" "+tytul);
        return ;
    }

    @Override
    public String toString() {
        return "Books{" +
                "tytul=" + tytul +
                ", author=" + author +
                ", books=" + books +
                '}';
    }
    //public Books
}