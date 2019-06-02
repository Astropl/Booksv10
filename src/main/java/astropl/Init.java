package astropl;

public class Init {


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
        Books books = new Books();
        books.addBooks(author.getName(), author.getLastName(), book.getTytul());

        System.out.println("\nAutor \t" + author.getAuthor());
        System.out.println("Tytul \t" + book.getTytul());

        System.out.println(" Czek z Books");

//        for(int x=0;x< 1;x++) {
//            System.out.println(books);
//        }

        
        books.showBooks();
        makeBook();

    }
}
