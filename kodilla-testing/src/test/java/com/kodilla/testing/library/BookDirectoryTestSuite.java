package com.kodilla.testing.library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


/**
 * Created by Iga on 22.07.2017.
 */
public class  BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title"  + n, "Author " + n, "1970" + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", "2008");
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", "2012");
        	Book book3 = new Book("Secrete life of programmers", "Steve Wolkowitz", "2016");
         	Book book4 = new Book("Secrets of Java", "Ian Tenewitch", "2010");
            resultListOfBooks.add(book1);
         	resultListOfBooks.add(book2);
         	resultListOfBooks.add(book3);
           	resultListOfBooks.add(book4);
           	when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
    assertEquals(4,theListOfBooks.size());
    }
    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3(){
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOf(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUser0 = new LibraryUser("Marek","Kowalski", "31028403423523");
        LibraryUser libraryUser1 = new LibraryUser("Janek","Nowak", "31057403423523");
        LibraryUser libraryUser2 = new LibraryUser("Gosia","Kozak", "310098343523");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks0 = new ArrayList<Book>();
        List<Book> resultListOfBooks1 = generateListOfNBooks(1);
        List<Book> resultListOfBooks5 = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksInHandsOff(libraryUser0)).thenReturn(resultListOfBooks0);
        when(libraryDatabaseMock.listBooksInHandsOff(libraryUser1)).thenReturn(resultListOfBooks1);
        when(libraryDatabaseMock.listBooksInHandsOff(libraryUser2)).thenReturn(resultListOfBooks5);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBookInHandsOf(libraryUser0);
        List<Book> theListOfBooks1 = bookLibrary.listBookInHandsOf(libraryUser1);
        List<Book> theListOfBooks5 = bookLibrary.listBookInHandsOf(libraryUser2);
        //Then
        assertEquals(0,theListOfBooks0.size());
        assertEquals(1,theListOfBooks1.size());
        assertEquals(5,theListOfBooks5.size());
    }
}
