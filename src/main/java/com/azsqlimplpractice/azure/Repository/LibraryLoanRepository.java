package com.azsqlimplpractice.azure.Repository;

import com.azsqlimplpractice.azure.Entity.LibraryLoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryLoanRepository extends JpaRepository<LibraryLoan,Integer> {
}
