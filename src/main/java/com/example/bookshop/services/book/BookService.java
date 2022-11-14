package com.example.bookshop.services.book;


import com.example.bookshop.domain.dto.BookInformation;
import com.example.bookshop.domain.entities.Book;
import com.example.bookshop.domain.enums.EditionType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface BookService {

    boolean isDataSeeded();

    void seedBooks(List<Book> books);

    List<Book> findAllByReleaseDateAfter(LocalDate localDate);

    List<Book> findAllByAuthorFirstNameAndAuthorLastNameOrderByReleaseDateDescTitleAsc(String firstName, String lastName);

    List<Book> findAllByAgeRestriction(String restriction);

    List<Book> findAllByEditionTypeAndCopiesLessThan(EditionType type, Integer copiesNumber);

    List<Book> findAllByPriceLessThanOrPriceGreaterThan(BigDecimal low, BigDecimal high);

    List<Book> findAllByReleaseDateNot(String date);

    List<Book> findAllByReleaseDateBefore(LocalDate date);

    List<Book> findAllByTitleContaining(String contains);

    List<Book> findAllByAuthorLastNameStartingWith(String prefix);

    Integer findCountOfBooksByBookTitleLongerThen(Integer length);

    BookInformation findFirstByTitle(String title);

    int increaseBookCopies(LocalDate date, int copies);

    int deleteAllByCopiesLessThan(Integer copies);

    int getBooksWrittenBy(String name);

}