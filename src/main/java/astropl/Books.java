package astropl;

import java.util.ArrayList;
import java.util.List;

public class Books
{
   private String name, lastName, tytul;
    List <String> books = new ArrayList <>();

    public Books ()
    {
        this.name = name;
        this.lastName = lastName;
        this.tytul = tytul;
        this.books = books;

    }

    public void addBooks(String name, String lastName, String tytul)
    { books.add(name +" "+ lastName+ " "+ tytul);
    setName(name);
    setLastName(lastName);
    setTytul(tytul);
    setBooks(books);

        return;
    }

    public void showBooks()
    {
        for( int x = 0; x<=books.size()-1;x++) {
            System.out.println("");
            System.out.println((x+1) + ". "+ books.get(x));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public List <String> getBooks() {
        return books;
    }

    public void setBooks(List <String> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tytul='" + tytul + '\'' +
                ", books=" + books +
                '}';
    }
}

