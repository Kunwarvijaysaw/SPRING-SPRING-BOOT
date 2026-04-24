package com.book.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.book.sbean.Book;

@Service
public class BookService {

	static ArrayList<Book> al=new ArrayList<Book>();
	public static ArrayList<Book> dB(Book book){
		al.add(book);
		return al;
	}


	public ResponseEntity<Map<String,Object>> servGetBook() {
		Map<String, Object> map=new HashMap<>();
		map.put("data", al);
		map.put("message", "All books fetched");
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
}
