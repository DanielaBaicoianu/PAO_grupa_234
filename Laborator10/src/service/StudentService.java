package service;

import model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    List<Student> getStudentsByName(String firstName, String lastName);

    String[] convertStudentsInformation(Student student);

    void writeStudentsInCsv(String fileName, List<Student> allStudents);

    int deleteUser(String firstName, String lastName);
}
