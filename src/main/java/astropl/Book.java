package astropl;

import java.util.Scanner;

public class Book {
    private String tytul;

    Scanner sc = new Scanner(System.in);

    public Book() {
        this.tytul = tytul;
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
}
