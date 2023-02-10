/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Selitha Sasmitha
 */
public class Users extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
    public Users() {
        initComponents();
        SelectUser();
    }

    Connection conn = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectUser()
    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
            St = conn.createStatement();
            Rs = St.executeQuery("select * from usertable");
            usertable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UserEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UserPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AddStoreJob = new javax.swing.JButton();
        EditStoreJobs = new javax.swing.JButton();
        DeleteStoreJob = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserAddress = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 530));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Descendants", 0, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Store Home");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("CPD-1", 1, 14)); // NOI18N
        jLabel2.setText("WAREHOUSE");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Selitha Sasmitha\\Desktop\\New folder\\Edited\\CloseButton.png")); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        usertable.setBackground(new java.awt.Color(204, 204, 204));
        usertable.setForeground(new java.awt.Color(0, 0, 0));
        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Email", "Phone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        usertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usertable);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID :");

        UserID.setBackground(new java.awt.Color(204, 204, 204));
        UserID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserID.setForeground(new java.awt.Color(0, 0, 0));
        UserID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Name :");

        UserName.setBackground(new java.awt.Color(204, 204, 204));
        UserName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserName.setForeground(new java.awt.Color(0, 0, 0));
        UserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email :");

        UserEmail.setBackground(new java.awt.Color(204, 204, 204));
        UserEmail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserEmail.setForeground(new java.awt.Color(0, 0, 0));
        UserEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Phone Number :");

        UserPhone.setBackground(new java.awt.Color(204, 204, 204));
        UserPhone.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserPhone.setForeground(new java.awt.Color(0, 0, 0));
        UserPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPhoneActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Address :");

        AddStoreJob.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AddStoreJob.setText("Add");
        AddStoreJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStoreJobMouseClicked(evt);
            }
        });

        EditStoreJobs.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EditStoreJobs.setText("Edit");
        EditStoreJobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditStoreJobsMouseClicked(evt);
            }
        });

        DeleteStoreJob.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DeleteStoreJob.setText("Delete User");
        DeleteStoreJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStoreJobMouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        UserAddress.setBackground(new java.awt.Color(204, 204, 204));
        UserAddress.setColumns(20);
        UserAddress.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserAddress.setForeground(new java.awt.Color(0, 0, 0));
        UserAddress.setRows(5);
        jScrollPane2.setViewportView(UserAddress);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(UserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(AddStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(EditStoreJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditStoreJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertableMouseClicked
        DefaultTableModel model =(DefaultTableModel)usertable.getModel();
        int Myindex = usertable.getSelectedRow();
        UserID.setText(model.getValueAt(Myindex, 0).toString());
        UserName.setText(model.getValueAt(Myindex, 1).toString());
        UserEmail.setText(model.getValueAt(Myindex, 2).toString());
        UserPhone.setText(model.getValueAt(Myindex, 3).toString());
        UserAddress.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_usertableMouseClicked

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void UserEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserEmailActionPerformed

    private void UserPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPhoneActionPerformed

    private void AddStoreJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStoreJobMouseClicked
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
            PreparedStatement add = conn.prepareStatement("Insert into usertable values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(UserID.getText()));
            add.setString(2, UserName.getText());
            add.setString(3, UserEmail.getText());
            add.setString(4, UserPhone.getText());
            add.setString(5, UserAddress.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer Added Successfully!");
            conn.close();
            SelectUser();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddStoreJobMouseClicked

    private void EditStoreJobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStoreJobsMouseClicked
        if (UserID.getText().isEmpty()||UserName.getText().isEmpty()||UserEmail.getText().isEmpty()||UserPhone.getText().isEmpty()||UserAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Informatioin");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
                String UpdateQuery = "update warehouse.usertable set Name ='"+UserName.getText()+"'"+", Email = '"+UserEmail.getText()+"' "+",Phone_Number = '"+UserPhone.getText()+"' "+",Address = '"+UserAddress.getText()+"'"+" where ID="+UserID.getText();
                Statement Add = conn.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "User Updated Succesfully.");
                SelectUser();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditStoreJobsMouseClicked

    private void DeleteStoreJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteStoreJobMouseClicked
        if (UserID.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Enter the User to be Deleted.!");
        } else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
                String Id = UserID.getText();
                String Query = "Delete from warehouse.usertable where ID ="+Id;
                Statement Add = conn.createStatement();
                Add.executeUpdate(Query);
                SelectUser();
                JOptionPane.showMessageDialog(this, "User Deleted Successfully.!");

            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteStoreJobMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ManagerMain m6 = new ManagerMain();

        m6.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        UserID.setText("");
        UserName.setText("");
        UserEmail.setText("");
        UserPhone.setText("");
        UserAddress.setText("");
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStoreJob;
    private javax.swing.JButton DeleteStoreJob;
    private javax.swing.JButton EditStoreJobs;
    private javax.swing.JTextArea UserAddress;
    private javax.swing.JTextField UserEmail;
    private javax.swing.JTextField UserID;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField UserPhone;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
