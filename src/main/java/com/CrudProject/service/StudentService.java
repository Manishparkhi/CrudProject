package com.CrudProject.service;

import com.CrudProject.model.Student;
import com.CrudProject.repositories.Irepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private Irepositories irepositories;

    public List<Student> getAllData() {
       return irepositories.findAll();
    }

    public String postData(Student student) {
        irepositories.save(student);
        return "Successfully Update Data";
    }

    public String updateInfo(Long id, Student student) {
        if(irepositories.findById(id).isPresent()){
           irepositories.save(student);
           return "Successfully update Info..!!!!";
        }
        return "Id Not Found";

    }

    public String deleteId(Long id) {
        if(irepositories.findById(id).isPresent()){
            irepositories.deleteById(id);
            return "Successfully Deleted Id...!!!!";
        }
        return "Id Not Found";
    }
}
