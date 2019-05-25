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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author AhmedTalal
 */
public class List_Student_Frame extends javax.swing.JFrame {
    
    public List_Student_Frame() {
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
        tasmee_table = new javax.swing.JLabel();
        table_name1 = new javax.swing.JLabel();
        attendance_table = new javax.swing.JLabel();
        money_table = new javax.swing.JLabel();
        return_table = new javax.swing.JLabel();
        Abs = new javax.swing.JLabel();

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
        ManagerLabel4.setText("صفحه قائمه الطلاب");

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
                .addGap(18, 18, 18)
                .addComponent(MinusLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
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

        table_name1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        table_name1.setForeground(new java.awt.Color(135, 54, 54));
        table_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        table_name1.setText("جدول الاسماء");
        table_name1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        table_name1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_name1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_name1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                table_name1MouseExited(evt);
            }
        });

        attendance_table.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        attendance_table.setForeground(new java.awt.Color(135, 54, 54));
        attendance_table.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attendance_table.setText("جدول الحضور");
        attendance_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        attendance_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendance_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendance_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attendance_tableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attendance_tableMouseExited(evt);
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

        Abs.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Abs.setForeground(new java.awt.Color(135, 54, 54));
        Abs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Abs.setText("جدول الغياب");
        Abs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 86, 94), 3));
        Abs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Abs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AbsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AbsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Desktop_Panel1Layout = new javax.swing.GroupLayout(Desktop_Panel1);
        Desktop_Panel1.setLayout(Desktop_Panel1Layout);
        Desktop_Panel1Layout.setHorizontalGroup(
            Desktop_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manager_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desktop_Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Desktop_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(table_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attendance_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tasmee_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(money_table, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(Abs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(586, 586, 586))
            .addGroup(Desktop_Panel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(return_table, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Desktop_Panel1Layout.setVerticalGroup(
            Desktop_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desktop_Panel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(table_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(attendance_table, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tasmee_table, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(money_table, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Abs, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(return_table, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop_Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void table_name1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_name1MouseEntered
        table_name1.setBackground(Color.GRAY);
        table_name1.setOpaque(true);
    }//GEN-LAST:event_table_name1MouseEntered

    private void table_name1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_name1MouseExited
        table_name1.setBackground(null);
        table_name1.setOpaque(false);
    }//GEN-LAST:event_table_name1MouseExited

    private void tasmee_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasmee_tableMouseEntered
        tasmee_table.setBackground(Color.GRAY);
        tasmee_table.setOpaque(true);
    }//GEN-LAST:event_tasmee_tableMouseEntered

    private void tasmee_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasmee_tableMouseExited
        tasmee_table.setBackground(null);
        tasmee_table.setOpaque(false);
    }//GEN-LAST:event_tasmee_tableMouseExited

    private void attendance_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_tableMouseEntered
        attendance_table.setBackground(Color.GRAY);
        attendance_table.setOpaque(true);
    }//GEN-LAST:event_attendance_tableMouseEntered

    private void attendance_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_tableMouseExited
        attendance_table.setBackground(null);
        attendance_table.setOpaque(false);
    }//GEN-LAST:event_attendance_tableMouseExited

    private void money_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_tableMouseEntered
        money_table.setBackground(Color.GRAY);
        money_table.setOpaque(true);
    }//GEN-LAST:event_money_tableMouseEntered

    private void money_tableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_tableMouseExited
        money_table.setBackground(null);
        money_table.setOpaque(false);
    }//GEN-LAST:event_money_tableMouseExited

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

    private void table_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_name1MouseClicked
        table_names level1 = new table_names();
        this.setVisible(false);
        level1.setVisible(true);
    }//GEN-LAST:event_table_name1MouseClicked

    private void money_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_tableMouseClicked
        table_monye money = new table_monye();
        this.setVisible(false);
        money.setVisible(true);
    }//GEN-LAST:event_money_tableMouseClicked

    private void attendance_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_tableMouseClicked
        Attendance_table att = new Attendance_table();
        this.setVisible(false);
        att.setVisible(true);
    }//GEN-LAST:event_attendance_tableMouseClicked

    private void tasmee_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasmee_tableMouseClicked
        exames_tables ex=  new exames_tables();
        this.setVisible(false);
        ex.setVisible(true);
    }//GEN-LAST:event_tasmee_tableMouseClicked

    private void AbsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbsMouseClicked
       Abcense_tables abs = new Abcense_tables();
       this.setVisible(false);
       abs.setVisible(true);
    }//GEN-LAST:event_AbsMouseClicked

    private void AbsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbsMouseEntered
        Abs.setBackground(Color.GRAY);
        Abs.setOpaque(true);
    }//GEN-LAST:event_AbsMouseEntered

    private void AbsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbsMouseExited
        Abs.setBackground(null);
        Abs.setOpaque(false);
    }//GEN-LAST:event_AbsMouseExited

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
            java.util.logging.Logger.getLogger(List_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_Student_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Abs;
    private javax.swing.JLabel Add_Student_Label;
    private javax.swing.JLabel CloseLabel1;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JPanel Desktop_Panel1;
    private javax.swing.JLabel ManagerLabel4;
    private javax.swing.JPanel Manager_Panel3;
    private javax.swing.JLabel MinusLabel4;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JLabel attendance_table;
    private javax.swing.JLabel money_table;
    private javax.swing.JLabel return_table;
    private javax.swing.JLabel table_name1;
    private javax.swing.JLabel tasmee_table;
    // End of variables declaration//GEN-END:variables
}
