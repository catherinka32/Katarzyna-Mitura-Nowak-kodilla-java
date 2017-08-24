package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Science fiction library");

        library.getBooks().add(new Book("Alice","John Smith", LocalDate.of(1990, Month.APRIL, 12)));
        library.getBooks().add(new Book("Monique","Andy White", LocalDate.of(1999, Month.JANUARY, 18)));
        library.getBooks().add(new Book("Lighht","Garry Wool", LocalDate.of(2012, Month.FEBRUARY, 13)));
        library.getBooks().add(new Book("Night","Amy ", LocalDate.of(2019, Month.MARCH, 19)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Science Fiction Library clone1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Science Fiction Library clone2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(new Book("Alice","John Smith", LocalDate.of(1990, Month.APRIL, 12)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        System.out.println("Amounts of book in " + library.getName() + " amounts " + library.getBooks().size());
        System.out.println("Amounts of book in " + clonedLibrary.getName() + " amounts " + clonedLibrary.getBooks().size());
        System.out.println("Amounts of book in " + clonedLibrary.getName() + " amounts " + deepClonedLibrary.getBooks().size());
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
