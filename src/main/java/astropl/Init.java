package astropl;

public class Init {

    String tytul, author;

    public Init() {
    }

    public void init() {
        System.out.println("Inicjalizacja");
        makeBook();

    }


    public void makeBook() {
        Author author = new Author();


        author.authorInit();
        Book book = new Book();
        book.addBook();


        System.out.println("Autor " + author.getAuthor());
        System.out.println("Tytul " + book.getTytul());

    }
}
