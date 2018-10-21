package com.company;

import java.util.List;

public class Professor extends Person
{
    public Professor(String name, String surname){
        super(name, surname);
    }

    public void rollCallPresentStudent(List<Student> listStudent){
        System.out.println("Student in the group");
        for (Student student : listStudent)
            System.out.println(student);
    }

    public void getAllAbsentStudent(List<Student> listStudent){
        System.out.println("Student absent in group");
        for (Student student : listStudent)
            System.out.println(student);
    }

    @Override
    public String toString() {
        return "Professor: " + getName() + " " + getSurname();
    }


}
