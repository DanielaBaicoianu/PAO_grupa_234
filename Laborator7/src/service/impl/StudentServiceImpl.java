package service.impl;

import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Utile.UtileOperatiuniFisier.afisareInFisier;

public class StudentServiceImpl implements StudentService {

    List<Student> studentList;

    private String NUME_FISIER = "afisareStudenti.txt";

    public StudentServiceImpl(){
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public void afiseazaStudent() {
        System.out.println(studentList.toString());
        afisareInFisier(NUME_FISIER, studentList.toString());
    }

    @Override
    public String toString() {
        return studentList.stream()
                .map(student -> student.toString())
                .collect(Collectors.toList()).toString();
    }
}
