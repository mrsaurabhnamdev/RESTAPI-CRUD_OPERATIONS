package com.CRUDApp.__RESTApiCRUD.Service;

import java.util.List;

import com.CRUDApp.__RESTApiCRUD.Entity.Book;

public interface BookService {
  
	//upSert methods is nothing but it is used for inserting the data as well as updating the data  
	public String upsertBook(Book book);
	
	public List<Book> getAllBook();
	
	// public String insertBook(Book book);
	// public String updateBook(Book book);
	
	public String deleteBook(Integer bookId);
	
}
