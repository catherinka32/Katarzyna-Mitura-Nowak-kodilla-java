package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookB> books = bookASet.stream()
                .collect(Collectors.toMap(bookA -> new BookSignature(bookA.getSignature()),
                        bookA ->new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear())));

        return medianPublicationYear(books);
    }
}
//public class MedianAdapter extends MedianAdaptee implements Classifier {
//    @Override
//    public int publicationYearMedian(Set<BookA> bookASet) {
//        Map<BookSignature, BookA> books = bookASet.stream()
//                .collect(Collectors.toMap(book ->book.getSignature(), book->new BookB()));
//
//        return books.medianPublicationYear();
//    }
//}
