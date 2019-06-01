package astropl;

import java.util.Scanner;

public class Author {

    private String name, lastName;

    Scanner sc = new Scanner(System.in);
    private Author author;

    public Author() {
    }

    public void authorInit() {
        System.out.println(" Podaj imię autora: ");
        name = sc.nextLine();
        System.out.println(" Podaj nazwisko autora: ");
        lastName = sc.nextLine();
        addAuthor(name, lastName);
    }


    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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

    public Author addAuthor(String name, String lastName) {
        author.setName(name);
        author.setLastName(lastName);
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
