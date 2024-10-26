/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Customer;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.sqlConnect;

/**
 *
 * @author HELLO
 */
public class CustomerDAO {

    private java.sql.Connection conn;

    public CustomerDAO() {
        try {
            conn = sqlConnect.getInstance().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int addCustomer(Customer b) {
        String sql = "INSERT INTO customer (Name, Gender, Age, PhoneNum, IdentityNum, Address) VALUES(?,?,?,?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, b.getName());
            ps.setString(2, b.getGender());
            ps.setString(3, b.getAge());
            ps.setString(4, b.getPhoneNum());
            ps.setString(5, b.getIdentityNum());
            ps.setString(6, b.getAddress());

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

    public ArrayList<Customer> getListCustomer() {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "SELECT * FROM customer";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setCusId(rs.getInt("CusId"));
                c.setName(rs.getString("Name"));
                c.setGender(rs.getString("Gender"));
                c.setAge(rs.getString("Age"));
                c.setPhoneNum(rs.getString("PhoneNum"));
                c.setIdentityNum(rs.getString("IdentityNum"));
                c.setAddress(rs.getString("Address"));

                list.add(c);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Customer> getFindCustomer(String Name) {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "SELECT * FROM customer WHERE Name LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Name + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setCusId(rs.getInt("CusId"));
                c.setName(rs.getString("Name"));
                c.setGender(rs.getString("Gender"));
                c.setAge(rs.getString("Age"));
                c.setPhoneNum(rs.getString("PhoneNum"));
                c.setIdentityNum(rs.getString("IdentityNum"));
                c.setAddress(rs.getString("Address"));

                list.add(c);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Customer> getFindCustomer1(String Gender) {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "SELECT * FROM customer WHERE Gender LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Gender + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setCusId(rs.getInt("CusId"));
                c.setName(rs.getString("Name"));
                c.setGender(rs.getString("Gender"));
                c.setAge(rs.getString("Age"));
                c.setPhoneNum(rs.getString("PhoneNum"));
                c.setIdentityNum(rs.getString("IdentityNum"));
                c.setAddress(rs.getString("Address"));

                list.add(c);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Customer> getFindCustomer2(String Address) {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "SELECT * FROM customer WHERE Address LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Address + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setCusId(rs.getInt("CusId"));
                c.setName(rs.getString("Name"));
                c.setGender(rs.getString("Gender"));
                c.setAge(rs.getString("Age"));
                c.setPhoneNum(rs.getString("PhoneNum"));
                c.setIdentityNum(rs.getString("IdentityNum"));
                c.setAddress(rs.getString("Address"));

                list.add(c);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        new CustomerDAO();
    }

}
