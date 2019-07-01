package astropl;

import astropl.OperationText.SaveText;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Init {
    Book book = new Book();
    Books books = new Books();
    Author author = new Author();

    public Init() throws FileNotFoundException {
    }

    public void init() throws FileNotFoundException {
        System.out.println("Inicjalizacja");

        makeBook();

        //saveText(author.getName());
    }


    public void makeBook() throws FileNotFoundException {


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

    public void wyborMenu() throws FileNotFoundException {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n*********************");
        System.out.println("1. Dodoaj ksiazke       *");
        System.out.println("2. Prejrzyj ksiazki     *\n\n");
        System.out.println("3. Zapisz               *");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                makeBook();
                break;
            case 2:

                System.out.println("wybrałes 2");
                books.showBooks();
                break;
            case 3:

                saveText1();
                break;


        }

    }

    public void saveText1() throws FileNotFoundException {
        //
        {
            SaveText saveText2 = new SaveText(books);
            //saveText2(books);
        }

//    private void saveText(Books books) {
//        saveText(books);
//    }

//        @Override
//        public String toString () {
//            return "Init{" +
//                    "book=" + book +
//                    ", books=" + books +
//                    ", author=" + author +
//                    '}';
//        }
    }


    }



