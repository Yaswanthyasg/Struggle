package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>
{
	

}
