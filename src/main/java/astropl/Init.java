package astropl;

import java.util.Scanner;

public class Init {
    Book book = new Book();
    Books books = new Books();
    Author author = new Author();

    public Init() {
    }

    public void init() {
        System.out.println("Inicjalizacja");

        makeBook();

    }


    public void makeBook() {



        author.authorInit();

        book.addBook();

        books.addBooks(author.getName(), author.getLastName(), book.getTytul());

        System.out.println("\nAutor \t" + author.getAuthor());
        System.out.println("Tytul \t" + book.getTytul());

        System.out.println(" \n\n Czek z Books\n");

//        for(int x=0;x< 1;x++) {
//            System.out.println(books);
//        }




        wyborMenu();


    }

    public void wyborMenu() {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n*********************");
        System.out.println("1. Dodoaj ksiazke       *");
        System.out.println("2. Prejrzyj ksiazki     *\n\n");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                makeBook();
                break;
            case 2:

                System.out.println("wybrałes 2");
                books.showBooks();
                break;


        }
    }
}
