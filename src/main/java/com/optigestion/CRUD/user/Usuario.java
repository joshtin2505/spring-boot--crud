package com.optigestion.CRUD.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Usuario {
    @Id
    private int id;
    private String name;
    private String password;
    private String departament;

    public Usuario(int id, String name, String password, String departament) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.departament = departament;
    }

    public Usuario(String name, String password, String departament) {
        this.name = name;
        this.password = password;
        this.departament = departament;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    
}
