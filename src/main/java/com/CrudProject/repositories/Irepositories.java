package com.CrudProject.repositories;

import com.CrudProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Irepositories extends JpaRepository<Student,Long> {
}
