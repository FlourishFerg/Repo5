package org.example;

import java.sql.*;

import static java.lang.Class.forName;

public class Jdbc {
  //  static void connect(){}
        public void getData() throws ClassNotFoundException, SQLException {
            forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "opuruiche");
            Statement obj = connect.createStatement();
        }
        public void createTable() throws SQLException, ClassNotFoundException {
            String sql= "create table students(" +
                    "name varchar(20)," +
                    " course varchar(20))";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "opuruiche");
            PreparedStatement statement = connect.prepareStatement(sql);
            statement.execute();
        }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Jdbc jdbc = new Jdbc();
        jdbc.createTable();

    }

    }

