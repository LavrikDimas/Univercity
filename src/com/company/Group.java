package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Group{

    private Student headmand;

    public Student getHeadmand(){
        return headmand;
    }

    public void setHeadmand(Student headmand){
        this.headmand = headmand;
    }

    private List<Student> students = new ArrayList<Student>();
    private List<Student> presentStudent = new ArrayList<Student>();

    public List<Student> getAllStudentInGroup(){
        return new ArrayList<Student>(students);
    }

    public boolean isStudentPresent(Student student) throws Exception {
        if(!hasStudent(student))
            throw new Exception("The student doesn't belong to the group.");

        return presentStudent.contains(student);
    }

    public void addAsPresent(Student student) throws Exception{
        if (isStudentPresent(student))
            throw new Exception("This student all ready added to present list.");

        presentStudent.add(student);
    }

    public boolean removeFromPresetn(Student student) throws Exception{
        if (!hasStudent(student))
            throw new Exception("The student doesn't belong to the group.");

        return presentStudent.remove(student);
    }

    public List<Student> getAllAbsentStudent() throws Exception {
        List<Student> result = new ArrayList<Student>();

        for (Student student : students) {
            if (!isStudentPresent(student))
                result.add(student);
        }
        return result;
    }

    public List<Student> getAllPresentStudent(){
        return new ArrayList<Student>(presentStudent);
    }

    public void addStudent(Student student) throws Exception{
        if(hasStudent(student))
            throw new Exception("The student it's all ready in the group");

        students.add(student);
    }

    public boolean hasStudent(Student student){
        return students.contains(student);
    }

    public boolean removeStudent(Student student){
        return students.remove(student);
    }

    public void headmand(){
        System.out.println("Headmand : " + choiceOfHeadmand());
    }

    public Student choiceOfHeadmand()
    {
        float maxValue = 0;
        Student bestStudent = null;

        for (Student student : students) {
            if (maxValue < student.getMark()){
                maxValue = student.getMark();
                bestStudent = student;
            }
        }
        return bestStudent;
    }


}