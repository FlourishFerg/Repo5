package org.example;

import java.sql.SQLException;

public class StudentController {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Student student1 = new Student("Oliveth","MMS-Software engineering",19);
        Student student2 = new Student("Ken","Web Dev",17);
        Student student3 = new Student("Kate","Java",21);

//        Dao dao = new Dao();
//        dao.saveStudent(student1);
//        dao.saveStudent(student2);
//        dao.saveStudent(student3);
    }
}
