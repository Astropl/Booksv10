package astropl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    Author author = new Author();
    Book book = new Book();
    Books books = new Books();
    String name,lastName,tytul;
    @Test
    public void shouldAnswerWithTrue()
    {
        addBooks();
    }

    public void addBooks ()
    {
        //author.authorInit();

        //book.addBook();
        name = "James";
        lastName = "Coock";
        tytul = "Aparheait";
        books.addBooks(name, lastName, tytul);
        //books.addBooks(author.getName(), author.getLastName(), book.getTytul());
        assertTrue(name =="James");
        assertTrue(lastName =="Coock");
        assertTrue(tytul =="Aparheait");
    }

//    private void addBooks(String name, String lastName, String tytul) {
//    }
}
