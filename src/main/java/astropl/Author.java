package astropl;

import java.util.Scanner;

public class Author {

    private String name, lastName;

    Scanner sc = new Scanner(System.in);
    private String author;


    public Author() {
    }

    public void authorInit() {
        System.out.println(" Podaj imię autora: ");
        name = sc.nextLine();
        System.out.println(" Podaj nazwisko autora: ");
        lastName = sc.nextLine();
        addAuthor(name, lastName);

    }

    public String addAuthor(String name, String lastName) {


        setName(name);
        setLastName(lastName);
        setAuthor(name+" "+lastName);
        return name + " " + lastName;

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




    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

