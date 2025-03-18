package org.example.c0928316_assignment_4.Entity;


import jakarta.validation.constraints.*;

public class Student {
    private Integer id;

    @NotNull(message = "Name is required")
    @Size(min = 2, max = 40, message = "Name must be between 2 and 40 characters")
    private String name;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Age must be at least 18")
    private Integer age;

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}