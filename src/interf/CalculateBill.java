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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Selitha Sasmitha
 */
public class CalculateBill extends javax.swing.JFrame {

    /**
     * Creates new form CalculateBill
     */
    public CalculateBill() {
        initComponents();
        SelectBill();
        SelectJob();
        
       
    }

    Connection conn = null;
    Statement St = null;
    ResultSet Rs = null;
    
        String OrID;
        String Name ;
        String Loc;
        String Dur ;
        String cat ;
        String prc ;
        String pydprc ;
        String blnc ;
    
    public void SelectBill()
    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
            St = conn.createStatement();
            Rs = St.executeQuery("select * from ordertable");
            BillTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
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
    private void GetToday()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
    }       
    
    public void totalBalance()
    {
        int days = Integer.parseInt(UserDays.getText());
        int price = Integer.parseInt(EnteredLocationPrice.getText());
        
        int tot = days * price;
        
        TotalPrice.setText(String.valueOf(tot));
    }
    
    public void Balance2()
    {
        int pay = Integer.parseInt(payedprice.getText());
        int total = Integer.parseInt(TotalPrice.getText());
        
        int bal = pay - total;
        
        Balance.setText(String.valueOf(bal));
    }
 
    public void PrintBill()
    {
        String OrID = OrderID.getText();
        String Name = UserName.getText();
        String Loc = UserLocation.getText();
        String Dur = UserDays.getText();
        String cat  = UserCategory.getText();
        String prc = TotalPrice.getText();
        String pydprc = payedprice.getText();
        String blnc = Balance.getText();
        
        
        BillPage.setText(BillPage.getText() + "\n");
        BillPage.setText(BillPage.getText() + "**************************************************\n");
        BillPage.setText(BillPage.getText() + "                    Store Home Warehouse\n");
        BillPage.setText(BillPage.getText() + "**************************************************\n");
        BillPage.setText(BillPage.getText() + "\n");
        BillPage.setText(BillPage.getText() + "\n");
        BillPage.setText(BillPage.getText() + "  Order ID                                                            " + OrID  +"\n");
        BillPage.setText(BillPage.getText() + "  User Name                                            " + Name  +"\n");
        BillPage.setText(BillPage.getText() + "  Warehouse Locatioin                                 " + Loc  +"\n");
        BillPage.setText(BillPage.getText() + "  Duration                                                        " + Dur  +"\n");
        BillPage.setText(BillPage.getText() + "  Product Category                                 " + cat  +"\n");
        BillPage.setText(BillPage.getText() + "\n");
        BillPage.setText(BillPage.getText() + "\n");
        BillPage.setText(BillPage.getText() + "  Total Price                                             " + prc  +"\n");
        BillPage.setText(BillPage.getText() + "\n");
        BillPage.setText(BillPage.getText() + "\n");
        BillPage.setText(BillPage.getText() + "**************************************************\n");
        BillPage.setText(BillPage.getText() + "  Payed Price                                           " + pydprc  +"\n");
        BillPage.setText(BillPage.getText() + "  Balance                                                    " + blnc  +"\n");
        BillPage.setText(BillPage.getText() + "**************************************************\n");
        BillPage.setText(BillPage.getText() + "\n");
        BillPage.setText(BillPage.getText() + "                              THANK YOU.!\n");
        BillPage.setText(BillPage.getText() + "**************************************************\n");
        BillPage.setText(BillPage.getText() + "**************************************************\n");
        
        
        
    
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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
        Clearbtn = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LocationPrice = new javax.swing.JLabel();
        EnteredLocationPrice = new javax.swing.JTextField();
        LocationPrice1 = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JTextField();
        LocationPrice2 = new javax.swing.JLabel();
        payedprice = new javax.swing.JTextField();
        LocationPrice3 = new javax.swing.JLabel();
        Balance = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        BillPrint = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        OrderID = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        BillPage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(976, 558));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Descendants", 0, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Store Home");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("CPD-1", 1, 14)); // NOI18N
        jLabel2.setText("WAREHOUSE");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Selitha Sasmitha\\Desktop\\New folder\\Edited\\CloseButton.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
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
                        .addContainerGap(344, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
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

        AddStoreJob.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AddStoreJob.setText("Add to Bill");
        AddStoreJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStoreJobMouseClicked(evt);
            }
        });
        AddStoreJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStoreJobActionPerformed(evt);
            }
        });

        Clearbtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Clearbtn.setText("Clear");
        Clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearbtnMouseClicked(evt);
            }
        });

        Home.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

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

        LocationPrice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LocationPrice.setForeground(new java.awt.Color(0, 0, 0));
        LocationPrice.setText("Enter Location Price :");

        EnteredLocationPrice.setBackground(new java.awt.Color(204, 204, 204));
        EnteredLocationPrice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EnteredLocationPrice.setForeground(new java.awt.Color(0, 0, 0));
        EnteredLocationPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EnteredLocationPrice.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                EnteredLocationPriceInputMethodTextChanged(evt);
            }
        });
        EnteredLocationPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnteredLocationPriceActionPerformed(evt);
            }
        });

        LocationPrice1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LocationPrice1.setForeground(new java.awt.Color(255, 0, 0));
        LocationPrice1.setText("Total :");

        TotalPrice.setBackground(new java.awt.Color(255, 255, 255));
        TotalPrice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TotalPrice.setForeground(new java.awt.Color(0, 0, 0));
        TotalPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        TotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalPriceActionPerformed(evt);
            }
        });

        LocationPrice2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LocationPrice2.setForeground(new java.awt.Color(255, 0, 0));
        LocationPrice2.setText("Pay :");

        payedprice.setBackground(new java.awt.Color(255, 255, 255));
        payedprice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        payedprice.setForeground(new java.awt.Color(0, 0, 0));
        payedprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        payedprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payedpriceActionPerformed(evt);
            }
        });

        LocationPrice3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LocationPrice3.setForeground(new java.awt.Color(0, 0, 0));
        LocationPrice3.setText("Balance (Rs) :");

        Balance.setBackground(new java.awt.Color(255, 255, 255));
        Balance.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Balance.setForeground(new java.awt.Color(204, 0, 0));
        Balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceActionPerformed(evt);
            }
        });

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "User Name", "Location", "Duration", "Category", "Price"
            }
        ));
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BillTable);

        BillPrint.setBackground(new java.awt.Color(255, 0, 51));
        BillPrint.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BillPrint.setText("Print Bill");
        BillPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillPrintActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Calculate Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Calculate Balance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Order ID:");

        OrderID.setBackground(new java.awt.Color(204, 204, 204));
        OrderID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OrderID.setForeground(new java.awt.Color(0, 0, 0));
        OrderID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIDActionPerformed(evt);
            }
        });

        BillPage.setBackground(new java.awt.Color(255, 255, 255));
        BillPage.setColumns(20);
        BillPage.setRows(5);
        BillPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(BillPage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(156, 156, 156)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LocationPrice)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(UserDays)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(22, 22, 22)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(UserLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(UserCategory, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(UserID))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(EnteredLocationPrice))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LocationPrice1)
                                        .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LocationPrice3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Balance, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(payedprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addComponent(LocationPrice2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(BillPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(AddStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(UserDays, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(UserLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(LocationPrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(UserCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EnteredLocationPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LocationPrice1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LocationPrice2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payedprice, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LocationPrice3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AddStoreJob, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(25, 25, 25))
                                    .addComponent(OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(BillPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void UserDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserDaysActionPerformed

    private void AddStoreJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStoreJobMouseClicked
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","");
            PreparedStatement add = conn.prepareStatement("Insert into ordertable values(?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(OrderID.getText()));
            add.setString(2, UserName.getText());
            add.setString(3, UserLocation.getText());
            add.setInt(4, Integer.valueOf(UserDays.getText()));
            add.setString(5, UserCategory.getText());
            add.setInt(6, Integer.valueOf(TotalPrice.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Bill Added Successfully!");
            conn.close();
            SelectBill();
            
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddStoreJobMouseClicked

    private void ClearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbtnMouseClicked
        UserID.setText("");
        UserName.setText("");
        UserDays.setText("");
        UserLocation.setText("");
        UserCategory.setText("");
        EnteredLocationPrice.setText("");
        TotalPrice.setText("");
        payedprice.setText("");
        Balance.setText("");
        OrderID.setText("");       
    }//GEN-LAST:event_ClearbtnMouseClicked

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        OperatorMain m5 = new OperatorMain();

        m5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void UserCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserCategoryActionPerformed

    private void EnteredLocationPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnteredLocationPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnteredLocationPriceActionPerformed

    private void TotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalPriceActionPerformed

    private void payedpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payedpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payedpriceActionPerformed

    private void BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceActionPerformed

    private void BillPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillPrintActionPerformed
        PrintBill();
     
    }//GEN-LAST:event_BillPrintActionPerformed

    private void AddStoreJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStoreJobActionPerformed
       
    }//GEN-LAST:event_AddStoreJobActionPerformed

    private void EnteredLocationPriceInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_EnteredLocationPriceInputMethodTextChanged
        
    }//GEN-LAST:event_EnteredLocationPriceInputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Balance2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        totalBalance();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIDActionPerformed

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
//        DefaultTableModel model =(DefaultTableModel)BillTable.getModel();
//        int Myindex = BillTable.getSelectedRow();
//        OrderID.setText(model.getValueAt(Myindex, 0).toString());
//        UserName.setText(model.getValueAt(Myindex, 1).toString());
//        UserLocation.setText(model.getValueAt(Myindex, 2).toString());
//        UserDays.setText(model.getValueAt(Myindex, 3).toString());
//        UserCategory.setText(model.getValueAt(Myindex, 4).toString());
//        UserDays.setText(model.getValueAt(Myindex, 5).toString());
//        TotalPrice.setText(model.getValueAt(Myindex, 6).toString());
    }//GEN-LAST:event_BillTableMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(CalculateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStoreJob;
    private javax.swing.JTextField Balance;
    private javax.swing.JTextArea BillPage;
    private javax.swing.JButton BillPrint;
    private javax.swing.JTable BillTable;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField EnteredLocationPrice;
    private javax.swing.JButton Home;
    private javax.swing.JLabel LocationPrice;
    private javax.swing.JLabel LocationPrice1;
    private javax.swing.JLabel LocationPrice2;
    private javax.swing.JLabel LocationPrice3;
    private javax.swing.JTextField OrderID;
    private javax.swing.JTable StoreJobsTable;
    private javax.swing.JTextField TotalPrice;
    private javax.swing.JTextField UserCategory;
    private javax.swing.JTextField UserDays;
    private javax.swing.JTextField UserID;
    private javax.swing.JTextField UserLocation;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField payedprice;
    // End of variables declaration//GEN-END:variables
}
