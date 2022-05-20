package com.azsqlimplpractice.azure.Repository;

import com.azsqlimplpractice.azure.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
