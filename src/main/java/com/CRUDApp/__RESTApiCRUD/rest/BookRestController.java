package com.CRUDApp.__RESTApiCRUD.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRUDApp.__RESTApiCRUD.Entity.Book;
import com.CRUDApp.__RESTApiCRUD.Service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService service;
	
	@PostMapping("/book")
	public ResponseEntity<String> addBBook(@RequestBody Book book){
		
	   String msg = service.upsertBook(book);
	   
	   return new ResponseEntity<String>(msg ,HttpStatus.CREATED);
	}
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllbooks(){
		
		List<Book> allBooks = service.getAllBook();
		
		return new ResponseEntity<List<Book>>(allBooks,HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		
		String msg = service.upsertBook(book);
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer BookId){
		
		String msg = service.deleteBook(BookId);
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
