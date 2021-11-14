package com.MYSQL_DB_WITH_JPA;

import com.SAMPLE_DEPENDANCY_INJECTION.ABC.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {
    @Autowired
    private TableService tableService;
/*
    @GetMapping(value="/table")
    public Iterable<TableModel> getTableData(){
        return tableService.getAllDataFromService();
    }


 */

}
