package com.example.demo.entity;


import jakarta.persistence.*;


public class Student{
      private long id;
      private string name;
      private string email;
      private float cgpa;
}

public long getID(){
      return id;

}
 public void setID(){
    this.id=id;
 }

 public string getName(){
    return name;
 }

 public void setName(){
    this.name=name;
 }

 public string getEmail(){
    return email;
 }

 public void setEmail(){
    this.email=email;
 }

public float getCgpa(){
    return cgpa;
}

public void setCgpa(){
    this.cgpa=cgpa;
}