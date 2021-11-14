package com.MYSQL_DB_WITH_JPA;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface TableRepository extends CrudRepository<TableModel,Integer> {
}
