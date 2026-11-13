/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WinterSchoolBooking;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.sql.ConnectionEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;


/**
 *
 * @author 27730
 */
public class WinterSchoolBooking extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "yourPassword";
    private static final String dataConn = "jdbc:mysql://localhost:3306/fa3_assessment";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deletItem;
    
    

    public WinterSchoolBooking() {
        initComponents();
    }

    public void upDateDB() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn , username , password);
            pst = sqlConn.prepareStatement("Select * FROM fa3_assessment.student_booking ");
             
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
             RecordTable.setRowCount(0);      

            while (rs.next()) {
                Vector columnData = new Vector();

   
                {
                    columnData.add(rs.getString("FName"));
                    columnData.add(rs.getString("LName"));
                    columnData.add(rs.getString("Email"));
                    columnData.add(rs.getString("Phone"));
                    columnData.add(rs.getString("Subject"));
                }
                RecordTable.addRow(columnData);
            }
            {
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(WinterSchoolBooking.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
        }
    }
//=============================End Function=================================================

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtFName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtSubject = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JbtnInsert = new javax.swing.JButton();
        JbtnExit = new javax.swing.JButton();
        JbtnView = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("Winter School Booking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 920, 80));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("FName");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, -1));

        jtxtFName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFNameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 690, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("LName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jtxtLName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLNameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 690, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Subject");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jtxtSubject.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubjectActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 690, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jtxtEmail.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 690, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jtxtPhone.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtxtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 690, -1));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Surname", "Subject", "Email", "Phone"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 840, 190));

        JbtnInsert.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JbtnInsert.setText("Insert");
        JbtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 120, -1));

        JbtnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JbtnExit.setText("Exit");
        JbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 850, 40));

        JbtnView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JbtnView.setText("View");
        JbtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnViewActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 130, -1));

        btnReset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 110, -1));

        jButtondelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtondelete.setText("Delete");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPhoneActionPerformed
      
    }//GEN-LAST:event_jtxtPhoneActionPerformed

    private void JbtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnInsertActionPerformed
       DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
       int SelectedRows = jTable1.getSelectedRow();
 try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    sqlConn = DriverManager.getConnection(dataConn, username, password);
    pst = sqlConn.prepareStatement("INSERT INTO fa3_assessment.student_booking (FName, LName, Subject, Email, Phone) VALUES (?, ?, ?, ?, ?)");

    pst.setString(1, jtxtFName.getText());
    pst.setString(2, jtxtLName.getText());
    pst.setString(3, jtxtSubject.getText());
    pst.setString(4, jtxtEmail.getText());
    pst.setString(5, jtxtPhone.getText());

    pst.executeUpdate();
    JOptionPane.showMessageDialog(this, "Record Added");
    upDateDB();
} catch (SQLException | ClassNotFoundException ex) {
    Logger.getLogger(WinterSchoolBooking.class.getName()).log(Level.SEVERE, null, ex);
}


    }//GEN-LAST:event_JbtnInsertActionPerformed
    private JFrame frame;
    private void JbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnExitActionPerformed

        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "WinterSchoolBooking",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
            System.exit(0);
        
       
    }//GEN-LAST:event_JbtnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // code to delete/ reset
        jtxtFName.setText("");
        jtxtLName.setText("");
        jtxtSubject.setText("");
        jtxtEmail.setText("");
        jtxtPhone.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    private void jtxtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFNameActionPerformed
        
    }//GEN-LAST:event_jtxtFNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
 
     int SelectedRows = jTable1.getSelectedRow();
     if (SelectedRows == -1){
         return;
     }
      jtxtFName.setText(RecordTable.getValueAt(SelectedRows,0).toString());
      jtxtLName.setText(RecordTable.getValueAt(SelectedRows,1).toString());
      jtxtSubject.setText(RecordTable.getValueAt(SelectedRows,2).toString());
      jtxtEmail.setText(RecordTable.getValueAt(SelectedRows,3).toString());
      jtxtPhone.setText(RecordTable.getValueAt(SelectedRows,4).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jtxtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLNameActionPerformed
       
    }//GEN-LAST:event_jtxtLNameActionPerformed

    private void jtxtSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubjectActionPerformed

    }//GEN-LAST:event_jtxtSubjectActionPerformed

    private void jtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmailActionPerformed
      
    }//GEN-LAST:event_jtxtEmailActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
         {
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a record in the table to delete");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete this record?", "Delete",
            JOptionPane.YES_NO_OPTION);

    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst = sqlConn.prepareStatement("DELETE FROM fa3_assessment.student_booking "
                + "WHERE FName = ? AND LName = ? AND Email = ? AND Phone = ? AND Subject = ? LIMIT 1");

        pst.setString(1, jTable1.getValueAt(selectedRow, 0).toString());
        pst.setString(2, jTable1.getValueAt(selectedRow, 1).toString());
        pst.setString(3, jTable1.getValueAt(selectedRow, 2).toString());
        pst.setString(4, jTable1.getValueAt(selectedRow, 3).toString());
        pst.setString(5, jTable1.getValueAt(selectedRow, 4).toString());

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Record Deleted");

        upDateDB();   // refresh the table

        jtxtFName.setText("");
        jtxtLName.setText("");
        jtxtSubject.setText("");
        jtxtEmail.setText("");
        jtxtPhone.setText("");
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(WinterSchoolBooking.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex);
    }
}
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void JbtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnViewActionPerformed
       {
    try {
        upDateDB();   
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(WinterSchoolBooking.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex);
    }
}
    }//GEN-LAST:event_JbtnViewActionPerformed

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
            java.util.logging.Logger.getLogger(WinterSchoolBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinterSchoolBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinterSchoolBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinterSchoolBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinterSchoolBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnExit;
    private javax.swing.JButton JbtnInsert;
    private javax.swing.JButton JbtnView;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFName;
    private javax.swing.JTextField jtxtLName;
    private javax.swing.JTextField jtxtPhone;
    private javax.swing.JTextField jtxtSubject;
    // End of variables declaration//GEN-END:variables

    
}
