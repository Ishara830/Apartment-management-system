
package apartmentmanagementsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class availableApartments extends javax.swing.JFrame {

    
    Connection conn = null;
    PreparedStatement pst =null;
    ResultSetImpl rs = null;
    
   
    public availableApartments() {
        initComponents();
          conn = ApartmentDBconnect.connect();
          //table2Load();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        exitbtn2 = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 51, 102));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apartments availability");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 350, 50));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Apartment No", "Floor Num", "Tenant's name", "Contact No", "Leaving date"
            }
        ));
        jScrollPane1.setViewportView(table2);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 440, 310));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CHECK");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 120, 40));

        exitbtn2.setBackground(new java.awt.Color(102, 102, 102));
        exitbtn2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        exitbtn2.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn2.setText("EXIT");
        exitbtn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtn2ActionPerformed(evt);
            }
        });
        panel1.add(exitbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 90, 30));

        backbtn.setBackground(new java.awt.Color(102, 102, 102));
        backbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        panel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartmentmanagementsystem/images/image.jpg"))); // NOI18N
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 640, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        table2Load();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtn2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtn2ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        
        userDetailsMain ud2 = new userDetailsMain();
        ud2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

   public void table2Load(){
        
        try {
            
            String sql = """
                         SELECT apartmentscheck.apartmentNum,apartmentscheck.floorNum,tenantstbl.householdersName,tenantstbl.phoneNumber,tenantstbl.leavingDate
                         FROM tenantstbl
                         RIGHT JOIN apartmentscheck ON apartmentscheck.apartmentNum = tenantstbl.apartmentNumber;""";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = (ResultSetImpl) pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
              
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new availableApartments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton exitbtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
