package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

 private BookRepository bookRepository;
    private String libraryName;



   // setter
   public void setBookRepository(BookRepository bookRepository){
    this.bookRepository=bookRepository;
   }
   // constructor
    public BookService(String libraryName){
      this.libraryName=libraryName;
    }
   public void saveBook(String bookName){
    System.out.println("Book is going to add in -> "+ libraryName);
    bookRepository.savingBook(bookName);
   }
}
