package com.spring5.introduction.repositories;

import com.spring5.introduction.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
