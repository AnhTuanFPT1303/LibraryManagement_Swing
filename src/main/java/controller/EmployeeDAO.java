/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Employee;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.sqlConnect;

/**
 *
 * @author HELLO
 */
public class EmployeeDAO {

    private java.sql.Connection conn;

    public EmployeeDAO() {
        try {
            conn = sqlConnect.getInstance().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int addEmployee(Employee b) {
        String sql = "INSERT INTO employee (Name, Gender, Age, PhoneNum, Address, Salary) VALUES(?,?,?,?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, b.getName());
            ps.setString(2, b.getGender());
            ps.setString(3, b.getAge());
            ps.setString(4, b.getPhoneNum());
            ps.setString(5, b.getAddress());
            ps.setFloat(6, b.getSalary());

            int affectedRows = ps.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        return rs.getInt(1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0; // Return 0 if insertion fails
    }

    public ArrayList<Employee> getListEmployee() {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpId(rs.getInt("EmpId"));
                e.setName(rs.getString("Name"));
                e.setGender(rs.getString("Gender"));
                e.setAge(rs.getString("Age"));
                e.setPhoneNum(rs.getString("PhoneNum"));
                e.setAddress(rs.getString("Address"));
                e.setSalary(rs.getFloat("Salary"));

                list.add(e);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Employee> getFindEmployee(String Name) {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee WHERE Name LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Name + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpId(rs.getInt("EmpId"));
                e.setName(rs.getString("Name"));
                e.setGender(rs.getString("Gender"));
                e.setAge(rs.getString("Age"));
                e.setPhoneNum(rs.getString("PhoneNum"));
                e.setAddress(rs.getString("Address"));
                e.setSalary(rs.getFloat("Salary"));

                list.add(e);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Employee> getFindEmployee1(String Gender) {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee WHERE Gender LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Gender + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpId(rs.getInt("EmpId"));
                e.setName(rs.getString("Name"));
                e.setGender(rs.getString("Gender"));
                e.setAge(rs.getString("Age"));
                e.setPhoneNum(rs.getString("PhoneNum"));
                e.setAddress(rs.getString("Address"));
                e.setSalary(rs.getFloat("Salary"));

                list.add(e);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        new EmployeeDAO();
    }
}
