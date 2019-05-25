/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author AhmedTalal
 */
public class emeregency_frame extends javax.swing.JFrame {
    
    public emeregency_frame() {
        initComponents();
        this.setLocationRelativeTo(null);
          ShowDate();
          ShowTime();
    }
    
    void ShowDate(){
       Date d = new Date();
       SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
       Date_Label1.setText(s.format(d));
   }
   void ShowTime(){
       new Timer(0, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Date d = new Date();
               SimpleDateFormat s = new SimpleDateFormat("hh : mm : ss a");
                Time_Label1.setText(s.format(d));
           }
       }
       ).start();
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop_Panel1 = new javax.swing.JPanel();
        Manager_Panel3 = new javax.swing.JPanel();
        Add_Student_Label = new javax.swing.JLabel();
        MinusLabel4 = new javax.swing.JLabel();
        CloseLabel1 = new javax.swing.JLabel();
        ManagerLabel4 = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        Time_Label1 = new javax.swing.JLabel();
        return_table = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        tasmee_table = new javax.swing.JLabel();
        money_table = new javax.swing.JLabel();
        attendance_table1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);

        Desktop_Panel1.setBackground(new java.awt.Color(1, 50, 67));

        Manager_Panel3.setBackground(new java.awt.Color(22, 160, 133));

        Add_Student_Label.setBackground(new java.awt.Color(235, 151, 78));
        Add_Student_Label.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        Add_Student_Label.setForeground(new java.awt.Color(51, 36, 36));
        Add_Student_Label.setText("تطبيق الطالب");

        MinusLabel4.setBackground(new java.awt.Color(235, 151, 78));
        MinusLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MinusLabel4.setForeground(new java.awt.Color(51, 36, 36));
        MinusLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinusLabel4.setText("-");
        MinusLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinusLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinusLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinusLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinusLabel4MouseExited(evt);
            }
        });

        CloseLabel1.setBackground(new java.awt.Color(235, 151, 78));
        CloseLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        CloseLabel1.setForeground(new java.awt.Color(51, 36, 36));
        CloseLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseLabel1.setText("x");
        CloseLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseLabel1MouseExited(evt);
            }
        });

        ManagerLabel4.setBackground(new java.awt.Color(235, 151, 78));
        ManagerLabel4.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        ManagerLabel4.setForeground(new java.awt.Color(51, 36, 36));
        ManagerLabel4.setText("صفحه حذف الجداول");

        Date_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(51, 36, 36));
        Date_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Time_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Time_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_Label1.setForeground(new java.awt.Color(51, 36, 36));
        Time_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Manager_Panel3Layout = new javax.swing.GroupLayout(Manager_Panel3);
        Manager_Panel3.setLayout(Manager_Panel3Layout);
        Manager_Panel3Layout.setHorizontalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel3Layout.createSequentialGroup()
                .addComponent(Add_Student_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(ManagerLabel4)
                .addGap(18, 18, 18)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(MinusLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CloseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Manager_Panel3Layout.setVerticalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Date_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CloseLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Manager_Panel3Layout.createSequentialGroup()
                .addGroup(Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManagerLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Student_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(MinusLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        return_table.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        return_table.setForeground(new java.awt.Color(135, 54, 54));
        return_table.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        return_table.setText("الرجوع-->");
        return_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        return_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                return_tableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                return_tableMouseExited(evt);
            }
        });

        name_label.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        name_label.setForeground(new java.awt.Color(135, 54, 54));
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("جدول الاسماء");
        name_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        name_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        name_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                name_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                name_labelMouseExited(evt);
            }
        });

        tasmee_table.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        tasmee_table.setForeground(new java.awt.Color(135, 54, 54));
        tasmee_table.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tasmee_table.setText("جدول الدرجات");
        tasmee_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        tasmee_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tasmee_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasmee_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tasmee_tableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tasmee_tableMouseExited(evt);
            }
        });

        money_table.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        money_table.setForeground(new java.awt.Color(135, 54, 54));
        money_table.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        money_table.setText("جدول  الفلوس");
        money_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        money_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        money_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                money_tableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                money_tableMouseExited(evt);
            }
        });

        attendance_table1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        attendance_table1.setForeground(new java.awt.Color(135, 54, 54));
        attendance_table1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attendance_table1.setText("جدول الحضور");
        attendance_table1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        attendance_table1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendance_table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendance_table1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attendance_table1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attendance_table1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Desktop_Panel1Layout = new javax.swing.GroupLayout(Desktop_Panel1);
        Desktop_Panel1.setLayout(Desktop_Panel1Layout);
        Desktop_Panel1Layout.setHorizontalGroup(
            Desktop_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manager_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Desktop_Panel1Layout.createSequentialGroup()
                .addGroup(Desktop_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desktop_Panel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(return_table, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Desktop_Panel1Layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addGroup(Desktop_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(money_table, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(tasmee_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(attendance_table1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Desktop_Panel1Layout.setVerticalGroup(
            Desktop_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desktop_Panel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(attendance_table1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(tasmee_table, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(money_table, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(return_table, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinusLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel4MouseClicked
        // TODO add your handling code here:
        this.setState(Login_Frame.ICONIFIED);
    }//GEN-LAST:event_MinusLabel4MouseClicked

    private void CloseLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLabel1MouseClicked

    private void CloseLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabel1MouseEntered
       CloseLabel1.setBackground(Color.RED);
       CloseLabel1.setOpaque(true);
    }//GEN-LAST:event_CloseLabel1MouseEntered

    private void CloseLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabel1MouseExited
        CloseLabel1.setBackground(null);
        CloseLabel1.setOpaque(false);
    }//GEN-LAST:event_CloseLabel1MouseExited

    private void MinusLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel4MouseEntered
       MinusLabel4.setBackground(Color.WHITE);
       MinusLabel4.setOpaque(true);
    }//GEN-LAST:event_MinusLabel4MouseEntered

    private void MinusLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel4MouseExited
        MinusLabel4.setBackground(null);
        MinusLabel4.setOpaque(false);
    }//GEN-LAST:event_MinusLabel4MouseExited

    private void return_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_tableMouseEntered
        return_table.setBackground(Color.GRAY);
        return_table.setOpaque(true);
    }//GEN-LAST:event_return_tableMouseEntered

    private void return_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_tableMouseExited
        return_table.setBackground(null);
        return_table.setOpaque(false);
    }//GEN-LAST:event_return_tableMouseExited

    private void return_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_tableMouseClicked
        Main_Page_Frame main = new Main_Page_Frame();
        this.setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_return_tableMouseClicked

    private void name_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_labelMouseClicked
                String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
                String url = "jdbc:mysql://localhost/";
                String db = "teacher";
                Connection conn = null;
                ResultSet re = null;
                PreparedStatement pr = null;
                PreparedStatement pr1 = null;
                PreparedStatement pr2 = null;
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "DELETE FROM `name_level1`";
                    String Query1 = "DELETE FROM `name_level2`";
                    String Query2 = "DELETE FROM `name_level3`";
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query1);
                    pr2 = conn.prepareStatement(Query2);
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم حذف جدول الاسماء بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
    }//GEN-LAST:event_name_labelMouseClicked

    private void name_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_labelMouseEntered
        name_label.setBackground(Color.GRAY);
        name_label.setOpaque(true);
    }//GEN-LAST:event_name_labelMouseEntered

    private void name_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_labelMouseExited
        name_label.setBackground(null);
        name_label.setOpaque(false);
    }//GEN-LAST:event_name_labelMouseExited

    private void tasmee_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasmee_tableMouseClicked
                String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
                String url = "jdbc:mysql://localhost/";
                String db = "teacher";
                Connection conn = null;
                ResultSet re = null;
                PreparedStatement pr = null;
                PreparedStatement pr1 = null;
                PreparedStatement pr2 = null;
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "DELETE FROM `exam_level1`";
                    String Query1 = "DELETE FROM `exam_level2`";
                    String Query2 = "DELETE FROM `exam_level3`";
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query1);
                    pr2 = conn.prepareStatement(Query2);
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم حذف جدول الدرجات بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
    }//GEN-LAST:event_tasmee_tableMouseClicked

    private void tasmee_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasmee_tableMouseEntered
        tasmee_table.setBackground(Color.GRAY);
        tasmee_table.setOpaque(true);
    }//GEN-LAST:event_tasmee_tableMouseEntered

    private void tasmee_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasmee_tableMouseExited
        tasmee_table.setBackground(null);
        tasmee_table.setOpaque(false);
    }//GEN-LAST:event_tasmee_tableMouseExited

    private void money_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_tableMouseClicked
                String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
                String url = "jdbc:mysql://localhost/";
                String db = "teacher";
                Connection conn = null;
                ResultSet re = null;
                PreparedStatement pr = null;
                PreparedStatement pr1 = null;
                PreparedStatement pr2 = null;
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "DELETE FROM `money_level1`";
                    String Query1 = "DELETE FROM `money_level2`";
                    String Query2 = "DELETE FROM `money_level3`";
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query1);
                    pr2 = conn.prepareStatement(Query2);
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم حذف جدول الفلوس بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
    }//GEN-LAST:event_money_tableMouseClicked

    private void money_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_tableMouseEntered
        money_table.setBackground(Color.GRAY);
        money_table.setOpaque(true);
    }//GEN-LAST:event_money_tableMouseEntered

    private void money_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_tableMouseExited
        money_table.setBackground(null);
        money_table.setOpaque(false);
    }//GEN-LAST:event_money_tableMouseExited

    private void attendance_table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_table1MouseClicked
       String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
                String url = "jdbc:mysql://localhost/";
                String db = "teacher";
                Connection conn = null;
                ResultSet re = null;
                PreparedStatement pr = null;
                PreparedStatement pr1 = null;
                PreparedStatement pr2 = null;
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "DELETE FROM `attendance_level1`";
                    String Query1 = "DELETE FROM `attendance_level2`";
                    String Query2 = "DELETE FROM `attendance_level3`";
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query1);
                    pr2 = conn.prepareStatement(Query2);
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم حذف جدول الحضور بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
    }//GEN-LAST:event_attendance_table1MouseClicked

    private void attendance_table1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_table1MouseEntered
       attendance_table1.setBackground(Color.GRAY);
        attendance_table1.setOpaque(true);
    }//GEN-LAST:event_attendance_table1MouseEntered

    private void attendance_table1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_table1MouseExited
        attendance_table1.setBackground(null);
        attendance_table1.setOpaque(false);
    }//GEN-LAST:event_attendance_table1MouseExited

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
            java.util.logging.Logger.getLogger(emeregency_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emeregency_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emeregency_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emeregency_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emeregency_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Student_Label;
    private javax.swing.JLabel CloseLabel1;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JPanel Desktop_Panel1;
    private javax.swing.JLabel ManagerLabel4;
    private javax.swing.JPanel Manager_Panel3;
    private javax.swing.JLabel MinusLabel4;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JLabel attendance_table1;
    private javax.swing.JLabel money_table;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel return_table;
    private javax.swing.JLabel tasmee_table;
    // End of variables declaration//GEN-END:variables
}
