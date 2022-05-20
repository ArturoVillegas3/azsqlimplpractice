package com.azsqlimplpractice.azure.Service.Impl;

import com.azsqlimplpractice.azure.Entity.LibraryLoan;
import com.azsqlimplpractice.azure.Repository.LibraryLoanRepository;
import com.azsqlimplpractice.azure.Service.LibraryLoanService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibraryLoanImpl implements LibraryLoanService {
    private LibraryLoanRepository libraryLoanRepository;

    public LibraryLoanImpl(LibraryLoanRepository libraryLoanRepository) {
        super();
        this.libraryLoanRepository = libraryLoanRepository;
    }
    @Override
    public List<LibraryLoan> getAllLibraryLoans(){
        return libraryLoanRepository.findAll();
    }
    @Override
    public LibraryLoan SaveLibraryLoan(LibraryLoan libraryLoan){
        return libraryLoanRepository.save(libraryLoan);
    }
    @Override
    public LibraryLoan GetLibraryLoanById(Integer id){
        return libraryLoanRepository.findById(id).get();
    }
    @Override
    public LibraryLoan EditLibraryLoan(LibraryLoan libraryLoan){
        return libraryLoanRepository.save(libraryLoan);
    }
    @Override
    public void deleteLibraryLoan(Integer id){
        libraryLoanRepository.deleteById(id);
    }
}
