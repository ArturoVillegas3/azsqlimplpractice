package com.azsqlimplpractice.azure.Repository;

import com.azsqlimplpractice.azure.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
