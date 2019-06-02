package astropl;

import java.util.Scanner;

public class Author {

    private String name, lastName, tytul;

    Scanner sc = new Scanner(System.in);
    private Author author;
    //private Object Author;

    public Author() {
    }

    public void authorInit(String tytul) {
        System.out.println(" Podaj imię autora: ");
        name = sc.nextLine();
        System.out.println(" Podaj nazwisko autora: ");
        lastName = sc.nextLine();
        addAuthor(tytul,name,lastName);
        //return;
        //addAuthor(name, lastName);
    }


    public Author(String tytul,String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.tytul = tytul;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author addAuthor(String tytul, String name, String lastName) {
        this.tytul = tytul;
        this.name = name;
        this.lastName = lastName;
Book book = new Book();
book.setAuthor()= ;
        return author;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +

                ", author=" + author +
                '}';
    }
}
