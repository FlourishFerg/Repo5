package org.example;

import java.sql.*;
import java.util.ArrayList;

public class Dao {
    Connection connection;

    public Dao(Connection connection) {
        this.connection = connection;
    }

    public Dao() {

    }

    //this block of code is for retrieving data from a table in mysql
    public void getTeachers(Teacher teacher) throws SQLException {
        ArrayList<Teacher> teachers = new ArrayList<>();

        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            preparedStatement = connection.prepareStatement("Select * from teachers");
//            ResultSet results = prepareStatement.getResultSet();
            result = preparedStatement.executeQuery();


            while (result.next()) {
                String name = result.getString("name");
                String course = result.getString("course");
                int age = result.getInt("age");

                teacher = new Teacher(name, course, age);
                teachers.add(teacher);

            }

        } finally {
            // Close ResultSet and PreparedStatement in finally block to ensure they're closed even if an exception occurs
            if (result != null) {
                result.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }
    }

    public void Dao() throws SQLException, ClassNotFoundException {

    }

    public static void main(String[] args) {

    }
}











//
//    public void saveStudent(Student student) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","opuruiche"
//    PreparedStatement statement = connection.prepareStatement("insert into students(name,course,age)"+ "values(?,?,?)");
//        statement.setString(1,student.getName());
//        statement.setString(2,student.getCourse());
//    statement.setInt(3,student.getAge());
//
//        statement.execute();
//
//
//
