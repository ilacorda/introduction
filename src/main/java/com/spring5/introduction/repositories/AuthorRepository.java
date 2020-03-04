package com.spring5.introduction.repositories;

import com.spring5.introduction.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
