package apartmentmanagementsystem;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class userDetailsMain extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst =null;
    ResultSetImpl rs = null;
    
    
    
    public userDetailsMain() {
        initComponents();
        conn = ApartmentDBconnect.connect();
        DBtableLoad();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new java.awt.Panel();
        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ftable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        nextwindow = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        fsearchbox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        updateBtn1 = new javax.swing.JButton();
        fnamebox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        foccupationbox = new javax.swing.JTextField();
        fphonebox = new javax.swing.JTextField();
        fvehicleNobox = new javax.swing.JTextField();
        fidbox = new javax.swing.JTextField();
        fnicbox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        insertBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        fmCount = new javax.swing.JComboBox<>();
        fapartmentNo = new javax.swing.JComboBox<>();
        frentedDate = new com.toedter.calendar.JDateChooser();
        fleavingDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        panel3.setBackground(new java.awt.Color(71, 78, 108));
        panel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        panel3.setForeground(new java.awt.Color(255, 255, 255));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(51, 50, 75));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftable1.setBackground(new java.awt.Color(102, 102, 102));
        ftable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        ftable1.setForeground(new java.awt.Color(255, 255, 255));
        ftable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "NIC", "Job", "Phone Num", "Vehicle Num", "Member count", "Apartment Num", "Acquisition date", "Leaving date"
            }
        ));
        ftable1.setAutoscrolls(false);
        ftable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ftable1.setDragEnabled(true);
        ftable1.setGridColor(new java.awt.Color(51, 51, 51));
        ftable1.setSelectionBackground(new java.awt.Color(0, 102, 153));
        ftable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftable1MouseClicked(evt);
            }
        });
        ftable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ftable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ftable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 910, 290));

        panel3.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 930, 320));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Householder's name");
        panel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        panel2.setBackground(new java.awt.Color(77, 66, 86));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextwindow.setBackground(new java.awt.Color(153, 153, 153));
        nextwindow.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        nextwindow.setText("Check apartments availability");
        nextwindow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        nextwindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextwindowActionPerformed(evt);
            }
        });
        panel2.add(nextwindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, -1));

        deleteBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        panel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 70, -1));

        exitBtn.setBackground(new java.awt.Color(51, 51, 51));
        exitBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("EXIT");
        exitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        panel2.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 70, 30));

        fsearchbox.setToolTipText("Search by NIC , ID or Name");
        fsearchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearchboxActionPerformed(evt);
            }
        });
        fsearchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fsearchboxKeyReleased(evt);
            }
        });
        panel2.add(fsearchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Search ");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        panel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 30));

        updateBtn1.setBackground(new java.awt.Color(153, 153, 153));
        updateBtn1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        updateBtn1.setText("UPDATE");
        updateBtn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });
        panel2.add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 70, -1));

        panel3.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 310, 240));
        panel3.add(fnamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIC");
        panel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Occupation");
        panel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone number");
        panel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vehicle number");
        panel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total member count");
        panel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apartment number");
        panel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rent acquisition date");
        panel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Leaving date");
        panel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        panel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        foccupationbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foccupationboxActionPerformed(evt);
            }
        });
        panel3.add(foccupationbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, -1));
        panel3.add(fphonebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 120, -1));
        panel3.add(fvehicleNobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 120, -1));
        panel3.add(fidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 110, -1));
        panel3.add(fnicbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TENANTS DETAILS");
        panel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        insertBtn.setBackground(new java.awt.Color(153, 153, 153));
        insertBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        insertBtn.setText("INSERT");
        insertBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });
        panel3.add(insertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 70, -1));

        clearBtn.setBackground(new java.awt.Color(153, 153, 153));
        clearBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        panel3.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 70, -1));

        fmCount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        panel3.add(fmCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        fapartmentNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39" }));
        panel3.add(fapartmentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 110, -1));

        frentedDate.setDateFormatString("y-MM-d");
        panel3.add(frentedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 110, -1));

        fleavingDate.setDateFormatString("y-MM-d");
        panel3.add(fleavingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foccupationboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foccupationboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foccupationboxActionPerformed

    
     public void DBtableLoad(){
        
        try {
            
            String sql = "SELECT  id,householdersName,NIC,occupation,phoneNumber,vehicleNumber,totalMemberCount,apartmentNumber,rentAcquisitionDate,leavingDate FROM tenantstbl";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = (ResultSetImpl) pst.executeQuery();
            ftable1.setModel(DbUtils.resultSetToTableModel(rs));
              
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void tableDataToForm(){
        
        //if click table row,,,add the row data to form
        int row = ftable1.getSelectedRow();
        TableModel model =ftable1.getModel();
        //storing the selected row - user data
        String id = ftable1.getValueAt(row,0).toString();
        String name = ftable1.getValueAt(row,1).toString();
        String nicbox = ftable1.getValueAt(row,2).toString();
        String occupationbox = ftable1.getValueAt(row,3).toString();
        String phonebox = ftable1.getValueAt(row,4).toString();
        String vehicleNobox = ftable1.getValueAt(row,5).toString();
        String mCount =ftable1.getValueAt(row,6).toString();
        String apartmentNo = ftable1.getValueAt(row,7).toString();
       // String rentedDate = ftable1.getModel().getValueAt(row,8).toString();
        //String leavingDate = ftable1.getModel().getValueAt(row,9).toString();
        
       
        try {
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 8).toString());
        frentedDate.setDate(date1);
        Date date2;
        date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 9).toString());
        fleavingDate.setDate(date2);
        } catch (ParseException ex) {
            Logger.getLogger(userDetailsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
       
        
        
        
       
       // setting  user details to the form box
        fidbox.setText(id);
        fnamebox.setText(name);
        fnicbox.setText(nicbox);
        foccupationbox.setText(occupationbox);
        fphonebox.setText(phonebox);
        fvehicleNobox.setText(vehicleNobox);
        fmCount.setSelectedItem(mCount);
        fapartmentNo.setSelectedItem(apartmentNo);
//        frentedDate.setDate(date1);
//        fleavingDate.setDate(date2);
       // frentedDate.setDateFormatString(rentedDate);
        //fleavingDate.setDateFormatString(leavingDate);
        
        
    }
    
    
    public void search() {
        
        try {
            
        String searchWord = fsearchbox.getText();
        String sql = " SELECT * FROM tenantstbl WHERE id LIKE '%"+searchWord+"%' OR  NIC LIKE '%"+searchWord+"%' OR householdersName LIKE '%"+searchWord+"%' ";
        pst = (PreparedStatement) conn.prepareStatement(sql);
        rs = (ResultSetImpl) pst.executeQuery();
        ftable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e);
        
        }
        
        
    }
    
    public void clear(){
      
        fidbox.setText("ID");
        fnamebox.setText("");
        fnicbox.setText("");
        foccupationbox.setText("");
        fphonebox.setText("");
        fvehicleNobox.setText("");
        fmCount.setSelectedItem("");
        fapartmentNo.setSelectedItem("");
        frentedDate.setDateFormatString(null);
        fleavingDate.setDateFormatString(null);
        fsearchbox.setText("");
       
    }
    
    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
      
        
        String name ;
        String nicbox ;
        String occupationbox ;
        String phonebox ;
        String vehicleNobox ;
        int mCount ;
        int apartmentNo ;
        String rentedDate ;
        String leavingDate ;
        
       
        name = fnamebox.getText();
        nicbox = fnicbox.getText();
        occupationbox = foccupationbox.getText();
        phonebox = fphonebox.getText();
        vehicleNobox = fvehicleNobox.getText();
        mCount =Integer.parseInt((String)fmCount.getSelectedItem());
        apartmentNo = Integer.parseInt((String)fapartmentNo.getSelectedItem());
        rentedDate =((JTextField)frentedDate.getDateEditor().getUiComponent()).getText();
        leavingDate =((JTextField)fleavingDate.getDateEditor().getUiComponent()).getText();
        
   
        
        
        try {
            
            String sql1 = "INSERT INTO tenantstbl(householdersName,NIC,occupation,phoneNumber,vehicleNumber,totalMemberCount,apartmentNumber,rentAcquisitionDate,leavingDate) VALUES ('"+name+"','"+nicbox+"','"+occupationbox+"','"+phonebox+"','"+vehicleNobox+"','"+ mCount+"','"+apartmentNo+"','"+rentedDate+"','"+leavingDate+"')";
            pst = (PreparedStatement) conn.prepareStatement(sql1);
            pst.execute() ;
            JOptionPane.showMessageDialog(null,"Successfully added data !!!");
            
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e);
        }
        
        DBtableLoad();
       
    }//GEN-LAST:event_insertBtnActionPerformed

    
    
    
    
    public void update(){
        
        String id;
        String name ;
        String nicbox ;
        String occupationbox ;
        String phonebox ;
        String vehicleNobox ;
        int mCount ;
        int apartmentNo ;
        String rentedDate ;
        String leavingDate ;
        
        id = fidbox.getText();
        name = fnamebox.getText();
        nicbox = fnicbox.getText();
        occupationbox = foccupationbox.getText();
        phonebox = fphonebox.getText();
        vehicleNobox = fvehicleNobox.getText();
        mCount =Integer.parseInt((String)fmCount.getSelectedItem());
        apartmentNo = Integer.parseInt((String)fapartmentNo.getSelectedItem());
        rentedDate =((JTextField)frentedDate.getDateEditor().getUiComponent()).getText();
        leavingDate =((JTextField)fleavingDate.getDateEditor().getUiComponent()).getText();
         
        try {
        String sql = "UPDATE  tenantstbl SET householdersName='"+name+"',NIC ='"+nicbox+"', occupation='"+occupationbox+"',phoneNumber='"+phonebox+"',vehicleNumber='"+vehicleNobox+"',totalMemberCount='"+mCount+"',apartmentNumber='"+apartmentNo+"',rentAcquisitionDate='"+rentedDate+"',leavingDate='"+leavingDate+"' WHERE id ='"+id+"'";
        
        pst = (PreparedStatement) conn.prepareStatement(sql);
        pst.execute();
             
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void ftable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftable1MouseClicked
        
        tableDataToForm();
        
    }//GEN-LAST:event_ftable1MouseClicked

    private void ftable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftable1KeyReleased
        
        tableDataToForm();
        
    }//GEN-LAST:event_ftable1KeyReleased

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       
        clear();   
    }//GEN-LAST:event_clearBtnActionPerformed

    private void fsearchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearchboxActionPerformed
        
        search();
        
        
    }//GEN-LAST:event_fsearchboxActionPerformed

    private void fsearchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fsearchboxKeyReleased
       search();
    }//GEN-LAST:event_fsearchboxKeyReleased

    private void nextwindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextwindowActionPerformed

       availableApartments aa1 = new availableApartments();
        aa1.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_nextwindowActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       
        int isDelete = JOptionPane.showConfirmDialog(null,"Do you need to delete this?");
        if (isDelete == 0){

             try{
             String id = fidbox.getText();
             String sql = "DELETE FROM tenantstbl WHERE id = '"+id+"'";
             pst = (PreparedStatement) conn.prepareStatement(sql);
             pst.execute();
             DBtableLoad();
             JOptionPane.showMessageDialog(null,"Successfully Deleted!");

              }catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
         }

        }
       
           
             

        
        
        
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        update();
       DBtableLoad();
    }//GEN-LAST:event_updateBtn1ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JComboBox<String> fapartmentNo;
    private javax.swing.JTextField fidbox;
    private com.toedter.calendar.JDateChooser fleavingDate;
    private javax.swing.JComboBox<String> fmCount;
    private javax.swing.JTextField fnamebox;
    private javax.swing.JTextField fnicbox;
    private javax.swing.JTextField foccupationbox;
    private javax.swing.JTextField fphonebox;
    private com.toedter.calendar.JDateChooser frentedDate;
    private javax.swing.JTextField fsearchbox;
    private javax.swing.JTable ftable1;
    private javax.swing.JTextField fvehicleNobox;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextwindow;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables
}
