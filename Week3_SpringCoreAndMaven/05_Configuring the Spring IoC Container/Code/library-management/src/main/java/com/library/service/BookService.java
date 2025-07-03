package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

 private BookRepository bookRepository;

   // setter
   public void setBookRepository(BookRepository bookRepository){
    this.bookRepository=bookRepository;
   }
   public void saveBook(String bookName){
    System.out.println("Book is going to add in Library");
    bookRepository.savingBook(bookName);
   }
}
