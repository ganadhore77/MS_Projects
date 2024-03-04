package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.BookEntity;

@RepositoryRestResource(path = "books")
public interface BookRepo extends JpaRepository<BookEntity, Integer> {

}
