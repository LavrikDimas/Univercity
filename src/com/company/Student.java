package com.company;

import java.util.EmptyStackException;

public class Student extends Person
{

    public Student(String name, String surname) {
        super(name, surname);
    }

    private float mark;

    public float getMark(){
        return mark;
    }

    public void setMark(float mark) throws Exception {
        if (mark <= 0)
            throw new Exception("It's not incorrect mark");
        this.mark = mark;
    }

    @Override
    public String toString(){
        return  "Studet: " + getName() + " " + getSurname();
    }
}
