package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian(){
        //Given
        Set<BookA> booksA = new HashSet<>();
        booksA.add(new BookA("Stive Lorin", "Shining", 1975, "139642"));
        booksA.add(new BookA("Arni Boxe", "My story", 1987, "139683"));
        booksA.add(new BookA("Majgul Axellson", "Who is here", 2015, "198754"));
        booksA.add(new BookA("Terry Mugler", "Witches", 2006, "139642"));
        booksA.add(new BookA("Klara Varita", "Riding ", 2010, "139642"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(booksA);
        //Then
        System.out.println(median);
        assertEquals(2006, median, 0);
    }
}
