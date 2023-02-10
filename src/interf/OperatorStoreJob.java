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
public class OperatorStoreJob extends javax.swing.JFrame {

    /**
     * Creates new form OperatorStoreJob
     */
    public OperatorStoreJob() {
        initComponents();
        SelectJob();
    }

    Connection conn = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectJob()
    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
            St = conn.createStatement();
            Rs = St.executeQuery("select * from addstorejob");
            StoreJobsTable.setModel(DbUtils.resultSetToTableModel(Rs));
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
        StoreJobsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UserLocation = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UserCategory = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        UserDays = new javax.swing.JTextField();
        AddStoreJob = new javax.swing.JButton();
        EditStoreJobs = new javax.swing.JButton();
        DeleteStoreJob = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 57, Short.MAX_VALUE))))
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

        StoreJobsTable.setBackground(new java.awt.Color(204, 204, 204));
        StoreJobsTable.setForeground(new java.awt.Color(0, 0, 0));
        StoreJobsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "User Name", "Location", "Category", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        StoreJobsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoreJobsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StoreJobsTable);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("User ID :");

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
        jLabel4.setText("User Name :");

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
        jLabel5.setText("Location :");

        UserLocation.setBackground(new java.awt.Color(204, 204, 204));
        UserLocation.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserLocation.setForeground(new java.awt.Color(0, 0, 0));
        UserLocation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLocationActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Category :");

        UserCategory.setBackground(new java.awt.Color(204, 204, 204));
        UserCategory.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserCategory.setForeground(new java.awt.Color(0, 0, 0));
        UserCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserCategoryActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Duration (Days) :");

        UserDays.setBackground(new java.awt.Color(204, 204, 204));
        UserDays.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserDays.setForeground(new java.awt.Color(0, 0, 0));
        UserDays.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UserDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserDaysActionPerformed(evt);
            }
        });

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
        EditStoreJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStoreJobsActionPerformed(evt);
            }
        });

        DeleteStoreJob.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DeleteStoreJob.setText("Close Store Job");
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A1", "Rs.2000"},
                {"A2", "Rs.2000"},
                {"A3", "Rs.2000"},
                {"A4", "Rs.2000"},
                {"A5", "Rs.2000"},
                {"B1", "Rs.3000"},
                {"B2", "Rs.3000"},
                {"B3", "Rs.3000"},
                {"B4", "Rs.3000"},
                {"B5", "Rs.3000"},
                {"C1", "Rs.5000"},
                {"C2", "Rs.5000"},
                {"C3", "Rs.5000"},
                {"C4", "Rs.5000"},
                {"C5", "Rs.5000"},
                {"D1", "Rs.7000"},
                {"D2", "Rs.7000"},
                {"D3", "Rs.7000"},
                {"D4", "Rs.70000"},
                {"D5", null}
            },
            new String [] {
                "Place", "Price(Per Day)"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(UserDays, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(UserLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(UserID, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditStoreJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(DeleteStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addComponent(UserLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserDays, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EditStoreJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
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

    private void StoreJobsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoreJobsTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)StoreJobsTable.getModel();
        int Myindex = StoreJobsTable.getSelectedRow();
        UserID.setText(model.getValueAt(Myindex, 0).toString());
        UserName.setText(model.getValueAt(Myindex, 1).toString());
        UserLocation.setText(model.getValueAt(Myindex, 2).toString());
        UserCategory.setText(model.getValueAt(Myindex, 3).toString());
        UserDays.setText(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_StoreJobsTableMouseClicked

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void UserLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserLocationActionPerformed

    private void UserCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserCategoryActionPerformed

    private void UserDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserDaysActionPerformed

    private void AddStoreJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStoreJobMouseClicked
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
            PreparedStatement add = conn.prepareStatement("Insert into addstorejob values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(UserID.getText()));
            add.setString(2, UserName.getText());
            add.setString(3, UserLocation.getText());
            add.setString(4, UserCategory.getText());
            add.setInt(5, Integer.valueOf(UserDays.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Store Job Added Successfully!");
            conn.close();
            SelectJob();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddStoreJobMouseClicked

    private void EditStoreJobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStoreJobsMouseClicked
        if (UserID.getText().isEmpty()||UserName.getText().isEmpty()||UserLocation.getText().isEmpty()||UserCategory.getText().isEmpty()||UserDays.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Informatioin");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
                String UpdateQuery = "update warehouse.addstorejob set Name ='"+UserName.getText()+"'"+", Location = '"+UserLocation.getText()+"' "+",Category = '"+UserCategory.getText()+"' "+",Duration = '"+UserDays.getText()+"'"+" where ID="+UserID.getText();
                Statement Add = conn.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Job Updated Succesfully.");
                SelectJob();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditStoreJobsMouseClicked

    private void DeleteStoreJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteStoreJobMouseClicked
        if (UserID.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Enter the StoreJob to be Deleted.!");
        } else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
                String Id = UserID.getText();
                String Query = "Delete from warehouse.addstorejob where ID ="+Id;
                Statement Add = conn.createStatement();
                Add.executeUpdate(Query);
                SelectJob();
                JOptionPane.showMessageDialog(this, "Store Job Closed Successfully.!");

            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteStoreJobMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        OperatorMain m5 = new OperatorMain();

        m5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void EditStoreJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStoreJobsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditStoreJobsActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        UserID.setText("");
        UserName.setText("");
        UserLocation.setText("");
        UserCategory.setText("");      
        UserDays.setText("");        
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(OperatorStoreJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperatorStoreJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperatorStoreJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperatorStoreJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorStoreJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStoreJob;
    private javax.swing.JButton DeleteStoreJob;
    private javax.swing.JButton EditStoreJobs;
    private javax.swing.JTable StoreJobsTable;
    private javax.swing.JTextField UserCategory;
    private javax.swing.JTextField UserDays;
    private javax.swing.JTextField UserID;
    private javax.swing.JTextField UserLocation;
    private javax.swing.JTextField UserName;
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
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
