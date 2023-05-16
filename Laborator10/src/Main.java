import config.DatabaseConfiguration;
import repository.StudentRepository;
import service.StudentService;
import service.impl.StudentServiceImpl;

import static constants.Constants.CSV_FILE_WRITER_NAME;

public class Main {
    public static void main(String[] args) {
        DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration();
        StudentRepository studentRepository = new StudentRepository(databaseConfiguration);
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.setStudentRepository(studentRepository);

        System.out.println(studentService.getAllStudents());

        //System.out.println(studentService.getStudentsByName("Andreea", "Panait"));

        studentService.writeStudentsInCsv(CSV_FILE_WRITER_NAME ,studentService.getAllStudents());

        System.out.println(studentService.deleteUser("Catalina", "Mihai"));
    }
}