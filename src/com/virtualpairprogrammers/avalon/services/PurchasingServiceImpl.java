package com.virtualpairprogrammers.avalon.services;

import com.virtualpairprogrammers.avalon.domain.Book;

public class PurchasingServiceImpl implements PurchasingService {

	public PurchasingServiceImpl(){
		System.out.println("PurchasingServiceImpl object is created");
	}
	//below causes coupling and 
	//AccountsService account = new AccountsServiceImpl();
	//BookService book = new BookServiceMockImpl();
	
	//to remove coupling we do 3 steps:
	//Step1: declare the Class names
	private AccountsService accounts;
	private BookService books; 
	
	//Step2: write setter method so Spring container creates the objects
	public void setAccountService(AccountsService accounts){
		this.accounts = accounts;
	}
	
	public void setBookService(BookService books){
		this.books = books;
	}
	
	//Step3: use the objects and make changes in the xml
	@Override
	public void buyBook(String isbn) {
		Book bookByIsbn = books.getBookByIsbn(isbn);
		accounts.raiseVoice(bookByIsbn);
	}

}
