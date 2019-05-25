/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;

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

/**
 *
 * @author AhmedTalal
 */
public class Delete_Student_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Delete_Student_Frame
     */
    // function Date And Time >>>
    public Delete_Student_Frame() {
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

        malhash_Lazma = new javax.swing.JPanel();
        Desktop_Panel = new javax.swing.JPanel();
        Search_TextField1 = new javax.swing.JTextField();
        Group_number_Lable1 = new javax.swing.JLabel();
        group_Number_TextField2 = new javax.swing.JTextField();
        code_Number_Lable3 = new javax.swing.JLabel();
        Number_Code_TextField3 = new javax.swing.JTextField();
        Phone_Number_Lable2 = new javax.swing.JLabel();
        Number_phone_TextField4 = new javax.swing.JTextField();
        Class_Number_TextField3 = new javax.swing.JTextField();
        class_number_Lable3 = new javax.swing.JLabel();
        First_Name_Lable1 = new javax.swing.JLabel();
        Firsst_Name_TextField2 = new javax.swing.JTextField();
        Delete_Button3 = new javax.swing.JButton();
        Reeturn_Button2 = new javax.swing.JButton();
        Search_Button4 = new javax.swing.JButton();
        Manager_Panel2 = new javax.swing.JPanel();
        MinusLabel3 = new javax.swing.JLabel();
        CloseLabel = new javax.swing.JLabel();
        ManagerLabel3 = new javax.swing.JLabel();
        Add_Secretary_Label = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        Time_Label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        malhash_Lazma.setBackground(new java.awt.Color(1, 50, 67));

        Desktop_Panel.setBackground(new java.awt.Color(1, 50, 67));

        Search_TextField1.setBackground(new java.awt.Color(51, 110, 123));
        Search_TextField1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Search_TextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Group_number_Lable1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Group_number_Lable1.setForeground(new java.awt.Color(135, 54, 54));
        Group_number_Lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Group_number_Lable1.setText("المجموعه:");
        Group_number_Lable1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        group_Number_TextField2.setEditable(false);
        group_Number_TextField2.setBackground(new java.awt.Color(51, 110, 123));
        group_Number_TextField2.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        group_Number_TextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        group_Number_TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group_Number_TextField2ActionPerformed(evt);
            }
        });

        code_Number_Lable3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        code_Number_Lable3.setForeground(new java.awt.Color(135, 54, 54));
        code_Number_Lable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code_Number_Lable3.setText("رقم الكود  :");

        Number_Code_TextField3.setEditable(false);
        Number_Code_TextField3.setBackground(new java.awt.Color(51, 110, 123));
        Number_Code_TextField3.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Number_Code_TextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Number_Code_TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_Code_TextField3ActionPerformed(evt);
            }
        });

        Phone_Number_Lable2.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Phone_Number_Lable2.setForeground(new java.awt.Color(135, 54, 54));
        Phone_Number_Lable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phone_Number_Lable2.setText("رقم التليفون:");

        Number_phone_TextField4.setEditable(false);
        Number_phone_TextField4.setBackground(new java.awt.Color(51, 110, 123));
        Number_phone_TextField4.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Number_phone_TextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Number_phone_TextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_phone_TextField4ActionPerformed(evt);
            }
        });

        Class_Number_TextField3.setEditable(false);
        Class_Number_TextField3.setBackground(new java.awt.Color(51, 110, 123));
        Class_Number_TextField3.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Class_Number_TextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Class_Number_TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_Number_TextField3ActionPerformed(evt);
            }
        });

        class_number_Lable3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        class_number_Lable3.setForeground(new java.awt.Color(135, 54, 54));
        class_number_Lable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        class_number_Lable3.setText("الصف     :");
        class_number_Lable3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        First_Name_Lable1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        First_Name_Lable1.setForeground(new java.awt.Color(135, 54, 54));
        First_Name_Lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        First_Name_Lable1.setText("الاسم :");

        Firsst_Name_TextField2.setEditable(false);
        Firsst_Name_TextField2.setBackground(new java.awt.Color(51, 110, 123));
        Firsst_Name_TextField2.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Firsst_Name_TextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Delete_Button3.setBackground(new java.awt.Color(51, 110, 123));
        Delete_Button3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Delete_Button3.setForeground(new java.awt.Color(135, 54, 54));
        Delete_Button3.setText("حذف");
        Delete_Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Delete_Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Delete_Button3MouseExited(evt);
            }
        });
        Delete_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Button3ActionPerformed(evt);
            }
        });

        Reeturn_Button2.setBackground(new java.awt.Color(51, 110, 123));
        Reeturn_Button2.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Reeturn_Button2.setForeground(new java.awt.Color(135, 54, 54));
        Reeturn_Button2.setText("الرجوع");
        Reeturn_Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reeturn_Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Reeturn_Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Reeturn_Button2MouseExited(evt);
            }
        });
        Reeturn_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reeturn_Button2ActionPerformed(evt);
            }
        });

        Search_Button4.setBackground(new java.awt.Color(51, 110, 123));
        Search_Button4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Search_Button4.setForeground(new java.awt.Color(135, 54, 54));
        Search_Button4.setText("البحث :");
        Search_Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search_Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_Button4MouseExited(evt);
            }
        });
        Search_Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Desktop_PanelLayout = new javax.swing.GroupLayout(Desktop_Panel);
        Desktop_Panel.setLayout(Desktop_PanelLayout);
        Desktop_PanelLayout.setHorizontalGroup(
            Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desktop_PanelLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Search_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Number_phone_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Class_Number_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(group_Number_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Desktop_PanelLayout.createSequentialGroup()
                        .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desktop_PanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Phone_Number_Lable2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desktop_PanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(code_Number_Lable3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(First_Name_Lable1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(class_number_Lable3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Group_number_Lable1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search_Button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Desktop_PanelLayout.setVerticalGroup(
            Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desktop_PanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Search_TextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(Search_Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(First_Name_Lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(code_Number_Lable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number_phone_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Phone_Number_Lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Class_Number_TextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(class_number_Lable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Group_number_Lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(group_Number_TextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(Desktop_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );

        Manager_Panel2.setBackground(new java.awt.Color(4, 132, 108));

        MinusLabel3.setBackground(new java.awt.Color(235, 151, 78));
        MinusLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MinusLabel3.setForeground(new java.awt.Color(67, 19, 19));
        MinusLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinusLabel3.setText("-");
        MinusLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinusLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinusLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinusLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinusLabel3MouseExited(evt);
            }
        });

        CloseLabel.setBackground(new java.awt.Color(235, 151, 78));
        CloseLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        CloseLabel.setForeground(new java.awt.Color(67, 19, 19));
        CloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseLabel.setText("x");
        CloseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseLabelMouseExited(evt);
            }
        });

        ManagerLabel3.setBackground(new java.awt.Color(235, 151, 78));
        ManagerLabel3.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        ManagerLabel3.setForeground(new java.awt.Color(67, 19, 19));
        ManagerLabel3.setText("صفحه حذف طالب");

        Add_Secretary_Label.setBackground(new java.awt.Color(235, 151, 78));
        Add_Secretary_Label.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        Add_Secretary_Label.setForeground(new java.awt.Color(67, 19, 19));
        Add_Secretary_Label.setText("تطبيق الطالب");

        Date_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Date_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Time_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Time_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Time_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Manager_Panel2Layout = new javax.swing.GroupLayout(Manager_Panel2);
        Manager_Panel2.setLayout(Manager_Panel2Layout);
        Manager_Panel2Layout.setHorizontalGroup(
            Manager_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel2Layout.createSequentialGroup()
                .addComponent(Add_Secretary_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManagerLabel3)
                .addGap(78, 78, 78)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(MinusLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Manager_Panel2Layout.setVerticalGroup(
            Manager_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MinusLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManagerLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
            .addComponent(Date_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Add_Secretary_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout malhash_LazmaLayout = new javax.swing.GroupLayout(malhash_Lazma);
        malhash_Lazma.setLayout(malhash_LazmaLayout);
        malhash_LazmaLayout.setHorizontalGroup(
            malhash_LazmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manager_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Desktop_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        malhash_LazmaLayout.setVerticalGroup(
            malhash_LazmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(malhash_LazmaLayout.createSequentialGroup()
                .addComponent(Manager_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desktop_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(malhash_Lazma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(malhash_Lazma, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLabelMouseClicked

    private void MinusLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(Login_Frame.ICONIFIED);
    }//GEN-LAST:event_MinusLabel3MouseClicked

    private void Reeturn_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reeturn_Button2ActionPerformed
        // TODO add your handling code here:
        Main_Page_Frame another =  new Main_Page_Frame();
        this.setVisible(false);
        another.setVisible(true);
    }//GEN-LAST:event_Reeturn_Button2ActionPerformed

    private void Class_Number_TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_Number_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Class_Number_TextField3ActionPerformed

    private void Number_phone_TextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_phone_TextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Number_phone_TextField4ActionPerformed

    private void Number_Code_TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_Code_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Number_Code_TextField3ActionPerformed

    private void group_Number_TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group_Number_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_group_Number_TextField2ActionPerformed

    private void Search_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Button4ActionPerformed
        // TODO add your handling code here:
         if(Search_TextField1.getText().equals(""))
        {
             resetTextField();
            JOptionPane.showMessageDialog(null, "يجب ان تقوم بكتابه رقم الكود قبل ان تضغط علي ذر البحث!");
        }else
        {
            String result =Search_TextField1.getText();
            int res = Integer.parseInt(result);
           ResultSet re = null;
           String name =  "name";
           String phone = "phone";
           String clas = "class";
           String group = "group";
           String code = "code";
       if(res >= 1000 && res < 2000)
       {
           function f = new function();
           re = f.find(result);
           try {
               if(re.next())
               {
                   Firsst_Name_TextField2.setText(re.getString(name));
                   Number_Code_TextField3.setText(re.getString(code));
                   Number_phone_TextField4.setText(re.getString(phone));
                    group_Number_TextField2.setText(re.getString(group));
                    Class_Number_TextField3.setText(re.getString(clas));
               }else
               {
                    JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                     resetTextField();
                   
               }
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
           }
        }else if(res >= 2000 && res <3000)
        {
            function1 f = new function1();
            re = f.find(result);
           try {
               if(re.next())
               {
                   Firsst_Name_TextField2.setText(re.getString(name));
                   Number_phone_TextField4.setText(re.getString(phone));
                    group_Number_TextField2.setText(re.getString(group));
                   Number_Code_TextField3.setText(re.getString(code));
                   Class_Number_TextField3.setText(re.getString(clas));
               }else
               {
                    JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                     resetTextField();
                    return;
               }
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
           }
        }else if(res >= 3000)
        {
          function2 f = new function2();
           re = f.find(result);
           try {
               if(re.next())
               {
                   Firsst_Name_TextField2.setText(re.getString(name));
                   Number_phone_TextField4.setText(re.getString(phone));
                    group_Number_TextField2.setText(re.getString(group));
                   Number_Code_TextField3.setText(re.getString(code));
                   Class_Number_TextField3.setText(re.getString(clas));
               }else
               {
                    JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                     resetTextField();
               }
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
           }
        }
        }
    }//GEN-LAST:event_Search_Button4ActionPerformed

    private void Delete_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Button3ActionPerformed
        // TODO add your handling code here:
        if(Search_TextField1.getText().equals(""))
        {
             resetTextField();
            JOptionPane.showMessageDialog(null, "يجب ان تقوم بكتابه رقم الكود قبل ان تضغط علي ذر البحث!");
        }else{
                String result =Search_TextField1.getText();
                int res = Integer.parseInt(result);
                String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
                String url = "jdbc:mysql://localhost/";
                String db = "teacher";
                Connection conn = null;
                ResultSet re = null;
                PreparedStatement pr = null;
                PreparedStatement pr1 = null;
                PreparedStatement pr2 = null;
                PreparedStatement pr3 = null;
            if(res >=1000 && res <2000)
            {
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "DELETE FROM `name_level1` WHERE code ="+result;
                    String Query1 = "DELETE FROM `money_level1` WHERE code ="+result;
                    String Query2 = "DELETE FROM `attendance_level1` WHERE code ="+result;
                    String Query3 = "DELETE FROM `exam_level1` WHERE code ="+result;
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query1);
                    pr2 = conn.prepareStatement(Query2);
                    pr3 = conn.prepareStatement(Query3);
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    pr3.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم حذف الطالب بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
            }else if(res >=2000 && res < 3000)
            {
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "DELETE FROM `name_level2` WHERE code ="+result;
                    String Query1 = "DELETE FROM `money_level2` WHERE code ="+result;
                    String Query2 = "DELETE FROM `attendance_level2` WHERE code ="+result;
                    String Query3 = "DELETE FROM `exam_level2` WHERE code ="+result;
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query1);
                    pr2 = conn.prepareStatement(Query2);
                    pr3 = conn.prepareStatement(Query3);
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    pr3.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم حذف الطالب بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
            }else if(res >=3000)
            {
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "DELETE FROM `name_level3` WHERE code ="+result;
                    String Query1 = "DELETE FROM `money_level3` WHERE code ="+result;
                    String Query2 = "DELETE FROM `attendance_level3` WHERE code ="+result;
                    String Query3 = "DELETE FROM `exam_level3` WHERE code ="+result;
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query1);
                    pr2 = conn.prepareStatement(Query2);
                    pr3 = conn.prepareStatement(Query3);
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    pr3.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم حذف الطالب بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
        }
        }
        
        resetTextField();
    }//GEN-LAST:event_Delete_Button3ActionPerformed

    private void CloseLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseEntered
        CloseLabel.setBackground(Color.RED);
        CloseLabel.setOpaque(true);
    }//GEN-LAST:event_CloseLabelMouseEntered

    private void CloseLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseExited
        CloseLabel.setBackground(null);
        CloseLabel.setOpaque(false);
    }//GEN-LAST:event_CloseLabelMouseExited

    private void MinusLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel3MouseEntered
        MinusLabel3.setBackground(Color.WHITE);
        MinusLabel3.setOpaque(true);
    }//GEN-LAST:event_MinusLabel3MouseEntered

    private void MinusLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel3MouseExited
         MinusLabel3.setBackground(null);
        MinusLabel3.setOpaque(false);
    }//GEN-LAST:event_MinusLabel3MouseExited

    private void Search_Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Button4MouseEntered
       Search_Button4.setBackground(Color.DARK_GRAY);
       Search_Button4.setOpaque(true);
    }//GEN-LAST:event_Search_Button4MouseEntered

    private void Search_Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Button4MouseExited
        Search_Button4.setBackground(null);
       Search_Button4.setOpaque(false);
    }//GEN-LAST:event_Search_Button4MouseExited

    private void Delete_Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_Button3MouseEntered
        Delete_Button3.setBackground(Color.DARK_GRAY);
        Delete_Button3.setOpaque(true);
    }//GEN-LAST:event_Delete_Button3MouseEntered

    private void Delete_Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_Button3MouseExited
        Delete_Button3.setBackground(null);
        Delete_Button3.setOpaque(false);
    }//GEN-LAST:event_Delete_Button3MouseExited

    private void Reeturn_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseEntered
        Reeturn_Button2.setBackground(Color.DARK_GRAY);
        Reeturn_Button2.setOpaque(true);
    }//GEN-LAST:event_Reeturn_Button2MouseEntered

    private void Reeturn_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseExited
        Reeturn_Button2.setBackground(null);
        Reeturn_Button2.setOpaque(false);
    }//GEN-LAST:event_Reeturn_Button2MouseExited

    public class function
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT * FROM `name_level1` WHERE code = ?";
                pr = conn.prepareStatement(Query);
                pr.setString(1, s);
                re = pr.executeQuery();
              }  catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                }
               return re;
           }
    }
     public class function1
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT * FROM `name_level2` WHERE code = ?";
                pr = conn.prepareStatement(Query);
                pr.setString(1, s);
                re = pr.executeQuery();
              }  catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                }
               return re;
           }
    }
      public class function2
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT * FROM `name_level3` WHERE code = ?";
                pr = conn.prepareStatement(Query);
                pr.setString(1, s);
                re = pr.executeQuery();
              }  catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                }
               return re;
           }
    }
    private void resetTextField()
    {
        Firsst_Name_TextField2.setText("");
        Number_Code_TextField3.setText("");
        Class_Number_TextField3.setText("");
        Search_TextField1.setText("");
        Number_phone_TextField4.setText("");
        group_Number_TextField2.setText("");
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
            java.util.logging.Logger.getLogger(Delete_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Student_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Secretary_Label;
    private javax.swing.JTextField Class_Number_TextField3;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JButton Delete_Button3;
    private javax.swing.JPanel Desktop_Panel;
    private javax.swing.JTextField Firsst_Name_TextField2;
    private javax.swing.JLabel First_Name_Lable1;
    private javax.swing.JLabel Group_number_Lable1;
    private javax.swing.JLabel ManagerLabel3;
    private javax.swing.JPanel Manager_Panel2;
    private javax.swing.JLabel MinusLabel3;
    private javax.swing.JTextField Number_Code_TextField3;
    private javax.swing.JTextField Number_phone_TextField4;
    private javax.swing.JLabel Phone_Number_Lable2;
    private javax.swing.JButton Reeturn_Button2;
    private javax.swing.JButton Search_Button4;
    private javax.swing.JTextField Search_TextField1;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JLabel class_number_Lable3;
    private javax.swing.JLabel code_Number_Lable3;
    private javax.swing.JTextField group_Number_TextField2;
    private javax.swing.JPanel malhash_Lazma;
    // End of variables declaration//GEN-END:variables

}
