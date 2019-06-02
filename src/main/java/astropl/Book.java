package astropl;

import java.util.Scanner;

public class Book {
    private String tytul;
    //private String author;
    Scanner sc = new Scanner(System.in);

    public Book() {
        this.tytul = tytul;
       // this.author = author;
    }

    public void addBook() {
        System.out.println("Podaj tytuł ksiązki: ");
        this.tytul = sc.nextLine();
        setTytul(tytul);

    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }

//    public Book(String tytul, Author author) {
//        this.tytul = tytul;
//        this.author = author;
//    }
//
//    public Book() {
//    }
//
//    public void addBook() {
//        System.out.println("Podaj tytuł ksiązki: ");
//        this.tytul = sc.nextLine();
//
//        Author author = new Author();
//        author.authorInit(tytul);
//
//
//    }
//
//    public String getTytul() {
//        return tytul;
//    }
//
//    public void setTytul(String tytul) {
//        this.tytul = tytul;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }


}
