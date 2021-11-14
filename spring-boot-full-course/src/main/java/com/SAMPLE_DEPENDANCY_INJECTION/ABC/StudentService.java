package com.SAMPLE_DEPENDANCY_INJECTION.ABC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private StudentDatabase database;

    public Collection<StudentEntityTableModel> getAllFromStudentService(){
        return this.database.getAllFromStudentDatabase();
    }

    public StudentEntityTableModel getByIdFromStudentService(int id){
        return this.database.getByIdFromStudentDatabase(id);
    }

    public void removeByIdFromStudentService(int id){
        this.database.removeByIdFromStudentDatabase(id);

    }

    public void putByIdFromStudentService(StudentEntityTableModel sm){
        this.database.putByIdFromStudentDatabase(sm);

    }

    public void insertStudentService(StudentEntityTableModel sm){
        this.database.insertByIdFromStudentDatabase(sm);

    }

}
