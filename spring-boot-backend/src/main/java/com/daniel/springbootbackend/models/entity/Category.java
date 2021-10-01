package com.daniel.springbootbackend.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="category", uniqueConstraints = {@UniqueConstraint(columnNames = { "id" })})
public class Category implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    //GET METHOD

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //SET METHOD

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static final long serialVersionUID = 1L;

}
