package astropl;

public class Books {


    private String tytul;
    private Author author;

    public Books(String tytul, Author author) {

        this.tytul = tytul;
        this.author = author;
    }

    public String getTytul() {
        return tytul;
    }

    public Author getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Books{" +
                "tytul=" + tytul +
                ", author=" + author +
                '}';
    }

}