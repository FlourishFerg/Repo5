package org.example;

import java.sql.SQLException;

public class TeacherController {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Teacher teacher1 = new Teacher("James", "Web Dev", 35);
        Teacher teacher2 = new Teacher("Michael", "Java", 101);
        Teacher teacher3 = new Teacher("Jack", "Python", 22);

//        Dao dao = new Dao();
//        dao.saveTeacher(teacher1);
//        dao.saveTeacher(teacher2);
//        dao.saveTeacher(teacher3);
//        }
        Dao dao = new Dao();
        dao.getTeachers(teacher1);
        dao.getTeachers(teacher2);
        dao.getTeachers(teacher3);
    }
}



