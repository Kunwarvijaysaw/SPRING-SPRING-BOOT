package com.book.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.sbean.Book;

@RestController
public class BookController {
	static ArrayList<Book> al=new ArrayList<Book>();
	public static ArrayList<Book> dB(Book book){
		al.add(book);
		return al;
	}
	
	@GetMapping("/book")
	public ResponseEntity<Map<String,Object>> getBook() {
		Map<String, Object> map=new HashMap<>();
		map.put("data", al);
		map.put("message", "All books fetched");
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	@GetMapping("/book/{id}")
	public Book getbyId(@PathVariable int id) {
		for(Book book : al) {
			if(book.getId()==id) {
				return book;
			}
		}
		return null;
	}
	@PostMapping("/book")
	public String postbook(@RequestBody Book book) {
		dB(book);
		return "Book added Succesfully .........";
	}
	@PutMapping("/book")
	public String putMapping(@RequestBody Book book) {
		for(Book books: al) {
			if(books.getId()==book.getId()) {
				books.setAuthor(book.getAuthor());
				books.setPrice(book.getPrice());
				return "Book updated";
			}
		}
		return "Book Not Found!!!!!";
	}
	@DeleteMapping("/book/{id}")
	public String delBook(@PathVariable Integer id) {
		Boolean flag=false;
		Iterator<Book> it = al.iterator();
		while(it.hasNext()) {
			Integer id2 = it.next().getId();
			if(id2==id) {
				it.remove();
				flag=true;
			}
		}
		if(flag) {
			return "Book Deleted Succesfully... ";
		}
		return "Book Not Found!!!!!!!!!!";
	}
}
