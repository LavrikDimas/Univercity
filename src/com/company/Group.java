package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Group{

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

    public void headman(){
        System.out.println("Headman : " + choiceHeadman(student -> student.getMark()));
    }

    public Student choiceHeadman(Function<Student, Float > functionToChooseWith) {
        float maxValue = 0;
        Student bestStudent = null;

        for (Student student : students) {
            Float evalution = functionToChooseWith.apply(student);
            if (maxValue < evalution){
                maxValue = evalution;
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}