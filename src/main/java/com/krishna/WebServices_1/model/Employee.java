package com.krishna.WebServices_1.model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Employee {
    @NotNull(message = "id can't be null")
    private Long id;

    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    public Employee(String name, Long id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
