package com.SAMPLE_DEPENDANCY_INJECTION.ABC;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDatabase {
    private static Map<Integer, StudentEntityTableModel> dataSet;

     static {
        dataSet = new HashMap<Integer, StudentEntityTableModel>() {
            {
            put(1,new StudentEntityTableModel(1,"savindu","sde"));
            put(2,new StudentEntityTableModel(2,"pasintha","sde"));
            put(3,new StudentEntityTableModel(3,"lakmal","sde"));
            }
        };
    }

    public Collection<StudentEntityTableModel> getAllFromStudentDatabase(){
         return this.dataSet.values();
    }

    public StudentEntityTableModel getByIdFromStudentDatabase(int id){
         return this.dataSet.get(id);
    }

    public void removeByIdFromStudentDatabase(int id) {
         this.dataSet.remove(id);
    }

    public void  putByIdFromStudentDatabase(StudentEntityTableModel data) {
       //for update
         StudentEntityTableModel st= dataSet.get(data.getId());
         st.setCourse(data.getCourse());
         st.setName(data.getName());
         dataSet.put(data.getId(),data);
    }
    public void  insertByIdFromStudentDatabase(StudentEntityTableModel data) {
        dataSet.put(data.getId(),data);
    }
}
