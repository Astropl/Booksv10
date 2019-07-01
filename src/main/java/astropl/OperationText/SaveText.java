package astropl.OperationText;

import astropl.Author;
import astropl.Book;
import astropl.Books;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveText {
    Book book = new Book();
    Books books = new Books();
    Author author = new Author();

    PrintWriter zapis = new PrintWriter("AlaMaKota1.txt");


    public SaveText(Books books) throws FileNotFoundException {
        zapis.println(books);
        System.out.println("zapis");
        zapis.close();
    }

    public SaveText() throws FileNotFoundException {

    }

    @Override
    public String toString() {
        return "SaveText{" +
                "book=" + book +
                ", books=" + books +
                ", author=" + author +
                ", zapis=" + zapis +
                '}';
    }
}
