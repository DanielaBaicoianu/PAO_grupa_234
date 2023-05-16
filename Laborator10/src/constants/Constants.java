package constants;

import util.LoggerUtils;

import java.util.logging.Logger;

public class Constants {

    public static final String QUERY_GET_ALL_STUDENTS = "select * from lab9.student";

    public static final String QUERY_GET_ALL_STUDENTS_JOIN_UNIVERSITY = "SELECT * FROM lab9.student JOIN lab9.university ON student.universityId = university.universityId";

    public static final String QUERY_GET_STUDENT_JOIN_UNIVERSITY_BY_NAME
            = "SELECT * FROM lab9.student JOIN lab9.university ON student.universityId = university.universityId WHERE (student.firstName = ? AND student.lastName = ?)";

    public static final String CSV_FILE_WRITER_NAME = "students.csv";

    public static final String DELETE_USER_QUERY = "DELETE FROM lab9.student WHERE student.firstName = ? AND student.lastName = ?";

    public static final String STUDENT_NOT_FOUND = "Student %s not found.";
    public static final String LOGS_FILE_NAME = "student_logs.log";
    public static final Logger LOGGER = LoggerUtils.getLogger();


}
