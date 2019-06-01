package astropl;

public class Book {
    public String tytul;
    public String autor;


    public Book(String tytul, String autor)
        {
            this.tytul=tytul;
            this.autor=autor;
        }

        public void printbook()
        {
            //System.out.println("Tytuł "+tytul+" autor "+autor);
            Books books = new Books(tytul,autor);
        }

//        public void book ()
//        {
//            System.out.println("cos wywsietla");
//        }

    }
