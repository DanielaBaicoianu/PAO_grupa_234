package service.impl;

import exceptions.StudentNotFoundException;
import model.Student;
import repository.StudentRepository;
import service.StudentService;
import util.FileUtils;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import static constants.Constants.LOGGER;
import static constants.Constants.STUDENT_NOT_FOUND;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public void setStudentRepository(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        try {
            return studentRepository.getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return null;
    }

    @Override
    public List<Student> getStudentsByName(String firstName, String lastName) {
        try {
            return studentRepository.getStudentsByName(firstName, lastName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return  null;
    }

    @Override
    public String[] convertStudentsInformation(Student student) {
        String[] studentInfo = new String[6];
        studentInfo[0] = student.getFirstName();
        studentInfo[1] = student.getLastName();
        studentInfo[2] = student.getUniversity().getUniversityName();
        studentInfo[3] = student.getUniversity().getAddress();
        studentInfo[4] = student.getGroupId();
        studentInfo[5] = student.getYearStart();
        return studentInfo;
    }

    @Override
    public void writeStudentsInCsv(String fileName, List<Student> allStudents) {
        List<String[]> convertedStudents = allStudents.stream()
                .map(item -> convertStudentsInformation(item))
                .collect(Collectors.toList());
        try {
            FileUtils.writeToCsv(fileName, convertedStudents);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int deleteUser(String firstName, String lastName) {
        LOGGER.info(String.format("Method deleteUser called with parameters: firstName = %s ; lastName = %s ", firstName, lastName ));
        try {
           int isDeleted = studentRepository.deleteStudent(firstName, lastName);
           if(isDeleted == 0)
               throw new StudentNotFoundException(String.format(STUDENT_NOT_FOUND, firstName + " " + lastName));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        catch (StudentNotFoundException exception){
            LOGGER.warning(exception.getMessage());
        }
        return 0;
    }
}
