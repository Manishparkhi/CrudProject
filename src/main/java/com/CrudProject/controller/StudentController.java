package com.CrudProject;

import com.CrudProject.model.Student;
import com.CrudProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @GetMapping()
    public List<Student> getAllData(){
        return studentService.getAllData();
    }
    @PostMapping()
    public String postData(@RequestBody Student student){
        return studentService.postData(student);
    }
    @PutMapping("/{id}")
    public String updateInfo(@PathVariable Long id , @RequestBody Student student){
        return studentService.updateInfo(id,student);
    }
    @DeleteMapping()
    public  String deleteId(@PathVariable Long id){
       return studentService.deleteId(id);
    }
}
