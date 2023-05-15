package com.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Book;
import com.ashokit.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		it will give the reference of the ioc container
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
//		get the object of the bean from ioc container
		BookRepo repo= ctx.getBean(BookRepo.class);
		
		//at run time it will create the implimentation class for our interface
		//System.out.println(repo.getClass().getName());
		
		//create the object and set the values for the entity class
		/*
		Book b=new Book();
		
		b.setBookId(119);
		b.setBookName("springboot");
		b.setBookPrice(115.05);
		
		//to save the records into the database table
		repo.save(b);
		*/
		
		//retreve the records based on id
		Optional<Book> findById = repo.findById(119);
		
		System.out.println(findById.get());
		
	}

}
