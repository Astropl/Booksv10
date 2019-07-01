package astropl.OperationText;

import astropl.Author;
import astropl.Book;
import astropl.Books;

import java.io.*;

public class SaveText {
    Book book = new Book();
    Books books = new Books();
    Author author = new Author();
    public String zapis;

    //PrintWriter zapis = new PrintWriter("AlaMaKota1.txt");


    public SaveText(Books books) throws IOException {
        Writer zapis = new BufferedWriter(new FileWriter("AlaMaKota1.txt",true));
        zapis.append(books.toString());
        System.out.println("zapis");
        zapis.close();
    }

    public SaveText() throws IOException {

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
