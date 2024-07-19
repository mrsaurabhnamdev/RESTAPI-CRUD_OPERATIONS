package com.CRUDApp.__RESTApiCRUD.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUDApp.__RESTApiCRUD.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{
   
}
