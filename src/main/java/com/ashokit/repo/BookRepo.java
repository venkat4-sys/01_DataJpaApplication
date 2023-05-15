package com.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.Book;

public interface BookRepo extends CrudRepository<Book,Integer>{

}
