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
public class OperatorAcc extends javax.swing.JFrame {

    /**
     * Creates new form OperatorAcc
     */
    public OperatorAcc() {
        initComponents();
        SelectOperator();
    }
    Connection conn = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public void SelectOperator()
    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
            St = conn.createStatement();
            Rs = St.executeQuery("select * from operatoraccount");
            OperatorsTable.setModel(DbUtils.resultSetToTableModel(Rs));
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
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OperatorsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        OID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        OFN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OLN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        OEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AddOperators = new javax.swing.JButton();
        EditOperators = new javax.swing.JButton();
        DeleteOperators = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        OAddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        OPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        OPassword = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Descendants", 0, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Store Home");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("CPD-1", 1, 14)); // NOI18N
        jLabel2.setText("WAREHOUSE");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Selitha Sasmitha\\Desktop\\New folder\\Edited\\CloseButton.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        OperatorsTable.setBackground(new java.awt.Color(204, 204, 204));
        OperatorsTable.setForeground(new java.awt.Color(0, 0, 0));
        OperatorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Phone", "Password", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        OperatorsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperatorsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OperatorsTable);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID :");

        OID.setBackground(new java.awt.Color(204, 204, 204));
        OID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OID.setForeground(new java.awt.Color(0, 0, 0));
        OID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("First Name:");

        OFN.setBackground(new java.awt.Color(204, 204, 204));
        OFN.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OFN.setForeground(new java.awt.Color(0, 0, 0));
        OFN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Last Name:");

        OLN.setBackground(new java.awt.Color(204, 204, 204));
        OLN.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OLN.setForeground(new java.awt.Color(0, 0, 0));
        OLN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OLNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email :");

        OEmail.setBackground(new java.awt.Color(204, 204, 204));
        OEmail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OEmail.setForeground(new java.awt.Color(0, 0, 0));
        OEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OEmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Address :");

        AddOperators.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AddOperators.setText("Add");
        AddOperators.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOperatorsMouseClicked(evt);
            }
        });

        EditOperators.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EditOperators.setText("Edit");
        EditOperators.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditOperatorsMouseClicked(evt);
            }
        });

        DeleteOperators.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DeleteOperators.setText("Delete ");
        DeleteOperators.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteOperatorsMouseClicked(evt);
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

        OAddress.setBackground(new java.awt.Color(204, 204, 204));
        OAddress.setColumns(20);
        OAddress.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OAddress.setForeground(new java.awt.Color(0, 0, 0));
        OAddress.setRows(5);
        jScrollPane2.setViewportView(OAddress);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Phone :");

        OPhone.setBackground(new java.awt.Color(204, 204, 204));
        OPhone.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OPhone.setForeground(new java.awt.Color(0, 0, 0));
        OPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPhoneActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Password :");

        OPassword.setBackground(new java.awt.Color(204, 204, 204));
        OPassword.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OPassword.setForeground(new java.awt.Color(0, 0, 0));
        OPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPasswordActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OEmail)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(OLN)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(OFN)
                            .addComponent(jLabel3)
                            .addComponent(OID)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel8)
                            .addComponent(OPhone)
                            .addComponent(OPassword))
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddOperators, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditOperators, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(DeleteOperators, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OFN, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OLN, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteOperators, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditOperators, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddOperators, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OperatorsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperatorsTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)OperatorsTable.getModel();
        int Myindex = OperatorsTable.getSelectedRow();
        OID.setText(model.getValueAt(Myindex, 0).toString());
        OFN.setText(model.getValueAt(Myindex, 1).toString());
        OLN.setText(model.getValueAt(Myindex, 2).toString());
        OEmail.setText(model.getValueAt(Myindex, 3).toString());
        OPhone.setText(model.getValueAt(Myindex, 4).toString());
        OPassword.setText(model.getValueAt(Myindex, 5).toString());
        OAddress.setText(model.getValueAt(Myindex, 6).toString());
        
    }//GEN-LAST:event_OperatorsTableMouseClicked

    private void OIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OIDActionPerformed

    private void OFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OFNActionPerformed

    private void OLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OLNActionPerformed

    private void OEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OEmailActionPerformed

    private void AddOperatorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOperatorsMouseClicked
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
            PreparedStatement add = conn.prepareStatement("Insert into operatoraccount values(?,?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(OID.getText()));
            add.setString(2, OFN.getText());
            add.setString(3, OLN.getText());
            add.setString(4, OEmail.getText());
            add.setString(5, OPhone.getText());
            add.setString(6, OPassword.getText());
            add.setString(7, OAddress.getText());
            
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Operator Added Successfully!");
            conn.close();
            SelectOperator();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddOperatorsMouseClicked

    private void EditOperatorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditOperatorsMouseClicked
        if (OID.getText().isEmpty()||OFN.getText().isEmpty()||OLN.getText().isEmpty()||OEmail.getText().isEmpty()||OPhone.getText().isEmpty()||OPassword.getText().isEmpty()||OAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Informatioin");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
                String UpdateQuery = "update warehouse.operatoraccount set First_Name ='"+OFN.getText()+"'"+", Last_Name = '"+OLN.getText()+"' "+",Email = '"+OEmail.getText()+"' "+",Phone = '"+OPhone.getText()+"'"+",Password = '"+OPassword.getText()+"' "+",Address = '"+OAddress.getText()+"' "+" where ID="+OID.getText();
                Statement Add = conn.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Operator Updated Succesfully.");
                SelectOperator();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditOperatorsMouseClicked

    private void DeleteOperatorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteOperatorsMouseClicked
        if (OID.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Enter the Operator to be Deleted.!");
        } else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
                String Id = OID.getText();
                String Query = "Delete from warehouse.operatoraccount where ID ="+Id;
                Statement Add = conn.createStatement();
                Add.executeUpdate(Query);
                SelectOperator();
                JOptionPane.showMessageDialog(this, "User Deleted Successfully.!");

            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteOperatorsMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ManagerMain m6 = new ManagerMain();

        m6.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void OPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OPhoneActionPerformed

    private void OPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OPasswordActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
       OID.setText("");
       OFN.setText("");
       OLN.setText("");
       OEmail.setText("");
       OPhone.setText("");
       OPassword.setText("");
       OAddress.setText("");      
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
            java.util.logging.Logger.getLogger(OperatorAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperatorAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperatorAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperatorAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOperators;
    private javax.swing.JButton DeleteOperators;
    private javax.swing.JButton EditOperators;
    private javax.swing.JTextArea OAddress;
    private javax.swing.JTextField OEmail;
    private javax.swing.JTextField OFN;
    private javax.swing.JTextField OID;
    private javax.swing.JTextField OLN;
    private javax.swing.JTextField OPassword;
    private javax.swing.JTextField OPhone;
    private javax.swing.JTable OperatorsTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
