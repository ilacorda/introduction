package com.spring5.introduction.repositories;

import com.spring5.introduction.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

