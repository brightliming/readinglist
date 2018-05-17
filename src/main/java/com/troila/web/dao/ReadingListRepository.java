package com.troila.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.troila.web.model.Book;


public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(String reader);
}
