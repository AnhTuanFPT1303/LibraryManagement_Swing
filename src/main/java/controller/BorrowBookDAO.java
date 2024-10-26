/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.BorrowBook;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.sqlConnect;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HELLO
 */
public class BorrowBookDAO {

    private java.sql.Connection conn;

    public BorrowBookDAO() {
        try {
            conn = sqlConnect.getInstance().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(BorrowBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean addBorrowBook(BorrowBook b) {
        LocalDate currentDate = LocalDate.now();
        LocalDate payDate = currentDate.plusDays(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String borrowDateString = currentDate.format(formatter);
        String payDateString = payDate.format(formatter);

        String sql = "INSERT INTO borrowBook (BookId, CusId, Name, Amount, BorrowDate, PayDate) "
                + "VALUES(?,?,?,?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, b.getBookId());
            ps.setInt(2, b.getCusId());
            ps.setString(3, b.getName());
            ps.setInt(4, b.getAmount());
            ps.setString(5, borrowDateString); 
            ps.setString(6, payDateString);   

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<BorrowBook> getListBorrowBook() {
        ArrayList<BorrowBook> list = new ArrayList<>();
        String sql = "SELECT * FROM borrowBook";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BorrowBook b = new BorrowBook();
                b.setBookId(rs.getInt("BookId"));
                b.setCusId(rs.getInt("CusId"));
                b.setName(rs.getString("Name"));
                b.setAmount(rs.getInt("Amount"));
                b.setBorrowDate(rs.getString("BorrowDate"));
                b.setPayDate(rs.getString("PayDate"));

                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<BorrowBook> getFindBorrowBook(String Name) {
        ArrayList<BorrowBook> list = new ArrayList<>();
        String sql = "SELECT * FROM borrowBook WHERE Name LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Name + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BorrowBook b = new BorrowBook();
                b.setBookId(rs.getInt("BookId"));
                b.setCusId(rs.getInt("CusId"));
                b.setName(rs.getString("Name"));
                b.setAmount(rs.getInt("Amount"));
                b.setBorrowDate(rs.getString("BorrowDate"));
                b.setPayDate(rs.getString("PayDate"));

                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        new BorrowBookDAO();
    }
}
