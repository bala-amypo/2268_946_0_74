package com.example.demo.entity;

import jakarta.persistence.*; // JPA annotations

@Entity
@Table(name = "students") // Optional: specify table name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private int id;

    @Column(nullable = false, length = 100) // Name cannot be null
    private String name;

    @Column(nullable = false, unique = true, length = 150) // Email must be unique
    private String email;

    @Column(nullable = false)
    private float cgpa;

    // Default constructor (required by JPA)
    public Student() {}

    // Parameterized constructor
    public Student(String name, String email, float cgpa) {
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    // Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
