import model.Catalog;
import model.Student;
import service.impl.StudentServiceImpl;

public class Main {


    public static void main(String[] args){

        Catalog catalog = new Catalog();
        catalog.addNote("matematica", 10);
        catalog.addNote("informatica", 8);
        catalog.addNote("informatica", 9);

        Student student = new Student("Student", "Prenume1" , "UniBuc", "123");
        student.setCatalog(catalog);

        //System.out.println(student.getCatalog().toStringNote());

        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.addStudent(student);
       //System.out.println(student.toString());
        studentService.afiseazaStudent();

    }

}
