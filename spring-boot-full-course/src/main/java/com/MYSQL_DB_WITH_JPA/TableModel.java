package com.MYSQL_DB_WITH_JPA;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name="TableNameMysqlDbNewEntityTable")
public class TableModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)//auto increment feild set
    @Column(nullable = false, name="collumPrimaryKeyId")
    private  Integer id;

    @Column(nullable = false,unique = true,length = 25,name="collumUsername")
    private String username;

    @Column(nullable = false,unique = true,length = 25, name="collumPassword")
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
