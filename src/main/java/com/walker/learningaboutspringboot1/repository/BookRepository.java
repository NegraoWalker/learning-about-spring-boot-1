package com.walker.learningaboutspringboot1.repository;

import com.walker.learningaboutspringboot1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
