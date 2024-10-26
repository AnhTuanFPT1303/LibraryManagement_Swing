/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Book;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.sqlConnect;

/**
 *
 * @author HELLO
 */
public class BookDAO {

    private java.sql.Connection conn;

    public BookDAO() {
        try {
            conn = sqlConnect.getInstance().getConnection();
        } catch (Exception ex) {
            Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int addBook(Book b) {
        String sql = "INSERT INTO Book (Name, Category, Amount, Status) VALUES(?,?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, b.getName());
            ps.setString(2, b.getCategory());
            ps.setInt(3, b.getAmount());
            ps.setString(4, b.getStatus());

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

    public ArrayList<Book> getListBook() {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("Name"));
                b.setCategory(rs.getString("Category"));
                b.setAmount(rs.getInt("Amount"));
                b.setStatus(rs.getString("Status"));

                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Book> getFindBook(String Category) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Category LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Category + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("Name"));
                b.setCategory(rs.getString("Category"));
                b.setAmount(rs.getInt("Amount"));
                b.setStatus(rs.getString("Status"));
                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Book> getFindBook1(String Status) {
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book WHERE Status LIKE ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, Status + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setBookId(rs.getInt("BookId"));
                b.setName(rs.getString("Name"));
                b.setCategory(rs.getString("Category"));
                b.setAmount(rs.getInt("Amount"));
                b.setStatus(rs.getString("Status"));
                list.add(b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        new BookDAO();
    }
}
