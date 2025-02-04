package java.E1Test.ClassesTest;

import E1Test.ClassesTest.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void testLibraryNotNull() {
        Library library = new Library();
        assertNotNull(library.getBookCollection(), "Book Collection should not be null");
    }

    @Test
    void testLibrarySizeAfterAddingBooks() {

        Library library = new Library();

        library.addBook("El Principito");
        library.addBook("1984");
        library.addBook("Don Quijote");

        assertEquals(3, library.getBookCollection().size(), "List size is not the expected one after adding books");
    }

    @Test
    void testBookIsInCorrectPosition() {

        Library library = new Library();

        library.addBook("1984");
        library.addBook("El Principito");
        library.addBook("Don Quijote");

        assertEquals("1984", library.getBook(0), "The book at index 0 is not the one expected");
        assertEquals("Don Quijote", library.getBook(1), "The book at index 1 is not the one expected");
        assertEquals("El Principito", library.getBook(2), "The book at index 2 is not the one expected");
    }

    @Test
    void testNoDuplicateTitles() {

        Library library = new Library();

        library.addBook("1984");
        library.addBook("1984");

        assertEquals(1, library.getBookCollection().size(), "A duplicate book has been added");
    }
    @Test
    void testLibrarySizeIsCorrect() {

        Library library = new Library();

        library.addBook("1984");
        library.addBook("1985");

        assertEquals(2, library.getBookCollection().size(), "The library size is not the expected one after adding books");
    }

    @Test
    void testGetBookByIndex() {

        Library library = new Library();

        library.addBook("1984");
        library.addBook("El Principito");
        library.addBook("Don Quijote");

        assertEquals("Don Quijote", library.getBook(1), "The book at index 0 is not the one expected");
    }

    @Test
    void testLibrarySizeIsCorrectAfterDeletingBooks() {

        Library library = new Library();

        library.addBook("1984");
        library.addBook("El Principito");
        library.removeBook("1984");

        assertEquals(1, library.getBookCollection().size(), "The library size is not the expected one after adding books");
    }
    @Test
    void testLibraryIsSortedAddingBooks() {

        Library library = new Library();

        library.addBook("El Principito");
        library.addBook("ABC");


        assertEquals("ABC", library.getBook(0), "The library is not ordered correctly");
        assertEquals("El Principito", library.getBook(1), "The library is not ordered correctly");
    }
}


