package com.CRUDApp.__RESTApiCRUD.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRUDApp.__RESTApiCRUD.Entity.Book;
import com.CRUDApp.__RESTApiCRUD.Repository.BookRepository;

@Service
public class BookServiceImplement implements BookService {

	private BookRepository repository;
	
	// this is constructor injection 
	public BookServiceImplement(BookRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public String upsertBook(Book book) {
		repository.save(book);
		
		if(book.getBookId() == null) {
			return "record inserted";
		}
		else {
		    return "record updated";
		}
	}

	@Override
	public List<Book> getAllBook() {
		 return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Book deleted";
	}

}
