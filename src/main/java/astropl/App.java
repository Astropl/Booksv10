package astropl;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Podaj tytuł ksiązki");
        String title = sc.nextLine();

        System.out.println("Podaj autora ksiązki");
        String author = sc.nextLine();
        System.out.println("Hello World!");
        //Book book = new Book(title, author);
        //book.printbook();
        Books books = new Books(title,author);
        System.out.println (books);

    }
}
