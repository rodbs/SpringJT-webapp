package io.scalando.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import io.scalando.model.Author;
import io.scalando.model.Book;
import io.scalando.repository.AuthorRepository;
import io.scalando.repository.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		loadData();		
	}
	
	public void loadData() {
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "2323", "Workx");
		eric.addBook(ddd);
		authorRepository.save(eric);
		//bookRepository.save(ddd);
	}

}
