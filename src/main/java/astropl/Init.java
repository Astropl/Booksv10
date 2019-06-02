package astropl;

public class Init {

    String tytul,author;
    public Init() {
    }

    public void init() {
        System.out.println("Inicjalizacja");
        makeBook();

    }


    public void makeBook()
    {
        Book book = new Book();
        book.addBook();

        System.out.println("Tytuł "+ book.getTytul() + " autor "+ book.getAuthor());

    }
}
