package com.SAMPLE_DEPENDANCY_INJECTION.ABC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class StudentController {
    @Autowired
   private StudentService studentService;

    @GetMapping(value="/student")
    public Collection<StudentEntityTableModel> getAllFromController(){
        return studentService.getAllFromStudentService();
    }

    @GetMapping(value="/student/{id}")
    public StudentEntityTableModel getIdFromController(@PathVariable("id") int idValue){
        return studentService.getByIdFromStudentService(idValue);
    }

    @DeleteMapping(value="/student/del/{id}")
    public void deleteIdFromController(@PathVariable("id") int idValue){
         studentService.removeByIdFromStudentService(idValue);
    }

    @PutMapping(value="/student/put/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void putIdFromController(@RequestBody StudentEntityTableModel smValue){
        studentService.putByIdFromStudentService(smValue);

        /*
        RequestBody should be a like this
        //MediaType should be like : APPLICATION_JSON_VALUE
        {
        "id":1,
        "name":"yourname",
        "course":"coursename"
        }
         */
    }
    @PostMapping(value="/student/post", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void postIdFromController(@RequestBody StudentEntityTableModel smValue){
        studentService.insertStudentService(smValue);

        /*
        RequestBody should be a like this
        //MediaType should be like : APPLICATION_JSON_VALUE
        {
        "id":1,
        "name":"yourname",
        "course":"coursename"
        }
         */
    }

}
