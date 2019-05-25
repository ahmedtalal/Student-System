/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;

import GUIpackage.List_Student_Frame;
import GUIpackage.Login_Frame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author AhmedTalal
 */
public class Attendance_table extends javax.swing.JFrame {

    /**
     * Creates new form search_secretary_frame
     */
    public Attendance_table() {
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

        jPanel1 = new javax.swing.JPanel();
        Manager_Panel3 = new javax.swing.JPanel();
        Add_Student_Label = new javax.swing.JLabel();
        MinusLabel4 = new javax.swing.JLabel();
        CloseLabel1 = new javax.swing.JLabel();
        ManagerLabel4 = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        Time_Label1 = new javax.swing.JLabel();
        return_lable = new javax.swing.JLabel();
        left_panel = new javax.swing.JPanel();
        level3 = new javax.swing.JLabel();
        level2 = new javax.swing.JLabel();
        level1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendace_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Manager_Panel3.setBackground(new java.awt.Color(22, 160, 133));

        Add_Student_Label.setBackground(new java.awt.Color(235, 151, 78));
        Add_Student_Label.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        Add_Student_Label.setForeground(new java.awt.Color(67, 19, 19));
        Add_Student_Label.setText("تطبيق الطالب");

        MinusLabel4.setBackground(new java.awt.Color(235, 151, 78));
        MinusLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MinusLabel4.setForeground(new java.awt.Color(67, 19, 19));
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
        CloseLabel1.setForeground(new java.awt.Color(67, 19, 19));
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
        ManagerLabel4.setForeground(new java.awt.Color(67, 19, 19));
        ManagerLabel4.setText("جدول حضور الطلاب");

        Date_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Date_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Time_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Time_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Time_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        return_lable.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        return_lable.setForeground(new java.awt.Color(67, 19, 19));
        return_lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        return_lable.setText("<-");
        return_lable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_lable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                return_lableMouseMoved(evt);
            }
        });
        return_lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_lableMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                return_lableMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Manager_Panel3Layout = new javax.swing.GroupLayout(Manager_Panel3);
        Manager_Panel3.setLayout(Manager_Panel3Layout);
        Manager_Panel3Layout.setHorizontalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel3Layout.createSequentialGroup()
                .addComponent(return_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(Add_Student_Label)
                .addGap(84, 84, 84)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(ManagerLabel4)
                .addGap(98, 98, 98)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinusLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CloseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Manager_Panel3Layout.setVerticalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MinusLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CloseLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Date_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManagerLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Manager_Panel3Layout.createSequentialGroup()
                .addGroup(Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(return_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Student_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        left_panel.setBackground(new java.awt.Color(4, 75, 76));

        level3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        level3.setForeground(new java.awt.Color(135, 54, 54));
        level3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        level3.setText(" تالته الثانوي");
        level3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        level3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        level3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                level3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level3MouseExited(evt);
            }
        });

        level2.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        level2.setForeground(new java.awt.Color(135, 54, 54));
        level2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        level2.setText(" تانيه الثانوي");
        level2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        level2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        level2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                level2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level2MouseExited(evt);
            }
        });

        level1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        level1.setForeground(new java.awt.Color(135, 54, 54));
        level1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        level1.setText(" اولي الثانوي");
        level1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        level1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        level1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                level1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout left_panelLayout = new javax.swing.GroupLayout(left_panel);
        left_panel.setLayout(left_panelLayout);
        left_panelLayout.setHorizontalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGroup(left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(level1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(level2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(level3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        left_panelLayout.setVerticalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_panelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(level1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(level2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(level3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        attendace_table.setBackground(new java.awt.Color(204, 204, 204));
        attendace_table.setForeground(new java.awt.Color(135, 54, 54));
        attendace_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "code", "lec1", "lec2", "lec3", "lec4", "lec5", "lec6", "lec7", "lec8", "lec9", "lec10", "lec11", "lec12"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        attendace_table.setEnabled(false);
        attendace_table.setRowHeight(25);
        attendace_table.setRowMargin(8);
        jScrollPane1.setViewportView(attendace_table);
        if (attendace_table.getColumnModel().getColumnCount() > 0) {
            attendace_table.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(Manager_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(left_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(left_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void return_lableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_lableMouseClicked
        // TODO add your handling code here:
        List_Student_Frame manager = new List_Student_Frame();
        this.setVisible(false);
        manager.setVisible(true);
    }//GEN-LAST:event_return_lableMouseClicked

    private void return_lableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_lableMouseMoved
        // TODO add your handling code here:
        return_lable.setForeground(Color.cyan);
        return_lable.setOpaque(true);
    }//GEN-LAST:event_return_lableMouseMoved

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

    private void return_lableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_lableMouseExited
        return_lable.setForeground(null);
        return_lable.setOpaque(false);
    }//GEN-LAST:event_return_lableMouseExited

    private void level3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level3MouseClicked
        show_level1_list2();
    }//GEN-LAST:event_level3MouseClicked

    private void level3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level3MouseEntered
        level3.setBackground(Color.GRAY);
        level3.setOpaque(true);
    }//GEN-LAST:event_level3MouseEntered

    private void level3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level3MouseExited
        level3.setBackground(null);
        level3.setOpaque(false);
    }//GEN-LAST:event_level3MouseExited

    private void level2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level2MouseClicked
        show_level1_list1();
    }//GEN-LAST:event_level2MouseClicked

    private void level2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level2MouseEntered
        level2.setBackground(Color.GRAY);
        level2.setOpaque(true);
    }//GEN-LAST:event_level2MouseEntered

    private void level2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level2MouseExited
        level2.setBackground(null);
        level2.setOpaque(false);
    }//GEN-LAST:event_level2MouseExited

    private void level1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1MouseClicked
        show_level1_list();
    }//GEN-LAST:event_level1MouseClicked

    private void level1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1MouseEntered
        level1.setBackground(Color.GRAY);
        level1.setOpaque(true);
    }//GEN-LAST:event_level1MouseEntered

    private void level1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1MouseExited
        level1.setBackground(null);
        level1.setOpaque(false);
    }//GEN-LAST:event_level1MouseExited

     public Connection getConnection() {
        String unicode = "?useUnicode=yes&characterEncoding=UTF-8";
        String url = "jdbc:mysql://localhost/";
        String db = "teacher";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url + db + unicode, "root", "");
            return conn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", 1);
        }
        return null;
    }
    public void show_level1_list()
    {
        try {
            Connection conn = getConnection();
            String Query  = "SELECT * FROM `attendance_level1`";
            PreparedStatement stmt;
            stmt = conn.prepareStatement(Query);
            ResultSet re;
            re = stmt.executeQuery();
            attendace_table.setModel(DbUtils.resultSetToTableModel(re));
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        }
    }
    public void show_level1_list1()
    {
        try {
            Connection conn = getConnection();
            String Query  = "SELECT * FROM `attendance_level2`";
            PreparedStatement stmt;
            stmt = conn.prepareStatement(Query);
            ResultSet re;
            re = stmt.executeQuery();
            attendace_table.setModel(DbUtils.resultSetToTableModel(re));
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        }
    }
    public void show_level1_list2()
    {
        try {
            Connection conn = getConnection();
            String Query  = "SELECT * FROM `attendance_level3`";
            PreparedStatement stmt;
            stmt = conn.prepareStatement(Query);
            ResultSet re;
            re = stmt.executeQuery();
            attendace_table.setModel(DbUtils.resultSetToTableModel(re));
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
        }
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
            java.util.logging.Logger.getLogger(Attendance_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Student_Label;
    private javax.swing.JLabel CloseLabel1;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JLabel ManagerLabel4;
    private javax.swing.JPanel Manager_Panel3;
    private javax.swing.JLabel MinusLabel4;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JTable attendace_table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel left_panel;
    private javax.swing.JLabel level1;
    private javax.swing.JLabel level2;
    private javax.swing.JLabel level3;
    private javax.swing.JLabel return_lable;
    // End of variables declaration//GEN-END:variables
}
