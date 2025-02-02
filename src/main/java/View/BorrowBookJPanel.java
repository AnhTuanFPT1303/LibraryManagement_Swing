/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.BorrowBook;
import controller.BorrowBookDAO;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import util.sqlConnect;
/**
 *
 * @author HELLO
 */
public class BorrowBookJPanel extends javax.swing.JFrame {

    private ArrayList<BorrowBook> list;
    DefaultTableModel model;

    /**
     * Creates new form LopHocJPanel
     */
    public BorrowBookJPanel() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        list = new BorrowBookDAO().getListBorrowBook();
        model = (DefaultTableModel) tbl2.getModel();

        model.setColumnIdentifiers(new Object[]{
            "BookId", "CusId", "Name", "Amount", "BorrowDate", "PayDate"
        });

        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSortbyname = new javax.swing.JButton();
        btnSortbyamount = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBookid = new javax.swing.JTextField();
        txtCusid = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtBorrowdate = new javax.swing.JTextField();
        txtPaydate = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtReset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtUpdate = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        txtFind = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Borrow Book Management");

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSortbyname.setBackground(new java.awt.Color(153, 153, 153));
        btnSortbyname.setText("ASC Amount");
        btnSortbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortbynameActionPerformed(evt);
            }
        });

        btnSortbyamount.setBackground(new java.awt.Color(153, 153, 153));
        btnSortbyamount.setText("DESC Amount");
        btnSortbyamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortbyamountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSortbyname)
                .addGap(100, 100, 100)
                .addComponent(btnSortbyamount)
                .addGap(256, 256, 256)
                .addComponent(btnBack)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSortbyamount, btnSortbyname});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnSortbyname)
                            .addComponent(btnSortbyamount)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSortbyamount, btnSortbyname});

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("BookId:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("CusId:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Amount:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("BorrowDate:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("PayDate:");

        txtBookid.setEditable(false);
        txtBookid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtCusid.setEditable(false);
        txtCusid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtBorrowdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPaydate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtReset.setBackground(new java.awt.Color(153, 153, 153));
        txtReset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtReset.setText(" Reset");
        txtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetActionPerformed(evt);
            }
        });

        txtUpdate.setBackground(new java.awt.Color(153, 153, 153));
        txtUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUpdate.setText("Update");
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });

        txtDelete.setBackground(new java.awt.Color(153, 153, 153));
        txtDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDelete.setText("Delete");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        txtFind.setBackground(new java.awt.Color(153, 153, 153));
        txtFind.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFind.setText("Find");
        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCusid)
                                    .addComponent(txtAmount)
                                    .addComponent(txtPaydate, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(txtBookid)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(txtReset))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(txtBorrowdate, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCusid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBorrowdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReset)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdate)
                    .addComponent(txtFind))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDelete)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDelete, txtFind, txtUpdate});

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookId", "CusId", "Name", "Amount", "BorrowDate", "PayDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<BorrowBook> Borrowlist3() {
        ArrayList<BorrowBook> Borrowlist3 = new ArrayList<>();

        try {
            java.sql.Connection conn = sqlConnect.getInstance().getConnection();
            String query1 = "SELECT * FROM borrowBook ORDER BY Amount ASC ";
            java.sql.Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            BorrowBook BorrowBook;
            while (rs.next()) {
                BorrowBook = new BorrowBook(rs.getInt("BookId"), rs.getInt("CusId"), rs.getString("Name"), rs.getInt("Amount"), rs.getString("BorrowDate"), rs.getString("PayDate"));
                Borrowlist3.add(BorrowBook);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Borrowlist3;
    }

    public ArrayList<BorrowBook> Borrowlist1() {
        ArrayList<BorrowBook> Borrowlist1 = new ArrayList<>();

        try {
            java.sql.Connection conn = sqlConnect.getInstance().getConnection();
            String query1 = "SELECT * FROM borrowBook ORDER BY Amount DESC ";
            java.sql.Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            BorrowBook BorrowBook;
            while (rs.next()) {
                BorrowBook = new BorrowBook (rs.getInt("BookId"), rs.getInt("CusId"), rs.getString("Name"), rs.getInt("Amount"), rs.getString("BorrowDate"), rs.getString("PayDate"));
                Borrowlist1.add(BorrowBook);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Borrowlist1;
    }

    public void show_oderby33() {
        ArrayList<BorrowBook> list = Borrowlist3();
        DefaultTableModel model = (DefaultTableModel) tbl2.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getBookId();
            row[1] = list.get(i).getCusId();
            row[2] = list.get(i).getName();
            row[3] = list.get(i).getAmount();
            row[4] = list.get(i).getBorrowDate();
            row[5] = list.get(i).getPayDate();
            model.addRow(row);
        }
    }

    public void show_oderby11() {
        ArrayList<BorrowBook> list = Borrowlist1();
        DefaultTableModel model = (DefaultTableModel) tbl2.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getBookId();
            row[1] = list.get(i).getCusId();
            row[2] = list.get(i).getName();
            row[3] = list.get(i).getAmount();
            row[4] = list.get(i).getBorrowDate();
            row[5] = list.get(i).getPayDate();
            model.addRow(row);
        }
    }
    private void txtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetActionPerformed
        txtBookid.setText("");
        txtCusid.setText("");
        txtName.setText("");
        txtAmount.setText("");
        txtBorrowdate.setText("");
        txtPaydate.setText("");
    }//GEN-LAST:event_txtResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainJFrame m = new MainJFrame();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
        try {
            java.sql.Connection conn = sqlConnect.getInstance().getConnection();
            int row = tbl2.getSelectedRow();
            String value = (tbl2.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM borrowBook WHERE BookId=" + value;
            java.sql.PreparedStatement pst = conn.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tbl2.getModel();
            model.removeRow(row);
            JOptionPane.showMessageDialog(null, "Delete Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select 'ROW' before click Delete !!!");

        }
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        String input = JOptionPane.showInputDialog(this, "Enter Book Name to search");
        if (input.length() > 0) {
            list = new controller.BorrowBookDAO().getFindBorrowBook(input);
            model.setRowCount(0);
            list.forEach((h) -> {
                model.addRow(new Object[]{h.getBookId(), h.getCusId(), h.getName(), h.getAmount(), h.getBorrowDate(), h.getPayDate()
                });
            });
        } else
            JOptionPane.showMessageDialog(this, "You have not entered 'Name' !!!");
    }//GEN-LAST:event_txtFindActionPerformed

    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateActionPerformed
        try {
            java.sql.Connection conn = sqlConnect.getInstance().getConnection();
            int row = tbl2.getSelectedRow();
            String value = (tbl2.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE borrowBook SET BookId=?, CusId=?, Name=?, Amount=?, BorrowDate=?, PayDate=? where BookId = " + value;
            java.sql.PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(txtBookid.getText()));
            ps.setInt(2, Integer.parseInt(txtCusid.getText()));
            ps.setString(3, txtName.getText());
            ps.setInt(4, Integer.parseInt(txtAmount.getText()));
            ps.setString(5, txtBorrowdate.getText());
            ps.setString(6, txtPaydate.getText());

            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tbl2.getModel();
            model.setRowCount(0);
            this.setLocationRelativeTo(null);
            list = new BorrowBookDAO().getListBorrowBook();
            model = (DefaultTableModel) tbl2.getModel();

            model.setColumnIdentifiers(new Object[]{
                "BookId", "CusId", "EmpId", "Name", "Amount", "BorrowDate", "PayDate"
            });

            showTable();
            JOptionPane.showMessageDialog(null, "Update Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Update Faill ...");
        }
    }//GEN-LAST:event_txtUpdateActionPerformed

    private void tbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)tbl2.getModel();
        
        String tbl1BookId = tblModel.getValueAt(tbl2.getSelectedRow(),  0).toString();
        String tbl1CusId = tblModel.getValueAt(tbl2.getSelectedRow(),  1).toString();
        String tbl1Name = tblModel.getValueAt(tbl2.getSelectedRow(),  2).toString();
        String tbl1Amount = tblModel.getValueAt(tbl2.getSelectedRow(),  3).toString();
        String tbl1BorrowDate = tblModel.getValueAt(tbl2.getSelectedRow(),  4).toString();
        String tbl1PayDate = tblModel.getValueAt(tbl2.getSelectedRow(),  5).toString();
        
        txtBookid.setText(tbl1BookId);
        txtCusid.setText(tbl1CusId);
        txtName.setText(tbl1Name);
        txtAmount.setText(tbl1Amount);
        txtBorrowdate.setText(tbl1BorrowDate);
        txtPaydate.setText(tbl1PayDate);
    }//GEN-LAST:event_tbl2MouseClicked

    private void btnSortbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortbynameActionPerformed
        tbl2.setModel(new DefaultTableModel(null, new String[]{"BookId", "CusId", "Name", "Amount", "BorrowDate", "PayDate"}));
        show_oderby33();
    }//GEN-LAST:event_btnSortbynameActionPerformed

    private void btnSortbyamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortbyamountActionPerformed
        tbl2.setModel(new DefaultTableModel(null, new String[]{"BookId", "CusId", "Name", "Amount", "BorrowDate", "PayDate"}));
        show_oderby11();
    }//GEN-LAST:event_btnSortbyamountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MainJFrame mainFrame = new MainJFrame();
       mainFrame.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void showTable() {
        for (BorrowBook h : list) {
            model.addRow(new Object[]{
                h.getBookId(), h.getCusId(), h.getName(), h.getAmount(), h.getBorrowDate(), h.getPayDate()
            });
        }
    }

    public void showResult() {
        BorrowBook h = list.get(list.size() - 1);
        model.addRow(new Object[]{
            h.getBookId(), h.getCusId(), h.getName(), h.getAmount(), h.getBorrowDate(), h.getPayDate()
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BorrowBookJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBookJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBookJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBookJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowBookJPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSortbyamount;
    private javax.swing.JButton btnSortbyname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbl2;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBookid;
    private javax.swing.JTextField txtBorrowdate;
    private javax.swing.JTextField txtCusid;
    private javax.swing.JButton txtDelete;
    private javax.swing.JButton txtFind;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPaydate;
    private javax.swing.JButton txtReset;
    private javax.swing.JButton txtUpdate;
    // End of variables declaration//GEN-END:variables
}
