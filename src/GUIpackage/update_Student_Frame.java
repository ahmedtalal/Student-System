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
public class update_Student_Frame extends javax.swing.JFrame {

    /**
     * Creates new form update_Student_Frame
     */
    public update_Student_Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        showDate();
        ShowTime();
    }

    void showDate(){
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
                Time_jLabel1.setText(s.format(d));
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
        Time_jLabel1 = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        Searche_Name_TextField1 = new javax.swing.JTextField();
        Firsst_Name_TextField2 = new javax.swing.JTextField();
        First_Name_Lable1 = new javax.swing.JLabel();
        Number_Code_TextField3 = new javax.swing.JTextField();
        code_Number_Lable3 = new javax.swing.JLabel();
        Phone_Code_TextField4 = new javax.swing.JTextField();
        Phone_Number_Lable2 = new javax.swing.JLabel();
        class_number_Lable3 = new javax.swing.JLabel();
        Group_number_Lable1 = new javax.swing.JLabel();
        Reeturn_Button2 = new javax.swing.JButton();
        Search_Button3 = new javax.swing.JButton();
        Update_Button4 = new javax.swing.JButton();
        group_number_ComboBox = new javax.swing.JComboBox<>();
        Class_number_ComboBox1 = new javax.swing.JComboBox<>();
        Class_number_Button1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));

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
        ManagerLabel4.setText("صفحه تحديث الطالب");

        Time_jLabel1.setBackground(new java.awt.Color(235, 151, 78));
        Time_jLabel1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_jLabel1.setForeground(new java.awt.Color(67, 19, 19));
        Time_jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Date_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Date_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Manager_Panel3Layout = new javax.swing.GroupLayout(Manager_Panel3);
        Manager_Panel3.setLayout(Manager_Panel3Layout);
        Manager_Panel3Layout.setHorizontalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel3Layout.createSequentialGroup()
                .addComponent(Add_Student_Label)
                .addGap(28, 28, 28)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManagerLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Time_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MinusLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(CloseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Manager_Panel3Layout.setVerticalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CloseLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManagerLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
            .addComponent(Add_Student_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Date_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MinusLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Searche_Name_TextField1.setBackground(new java.awt.Color(51, 110, 123));
        Searche_Name_TextField1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Searche_Name_TextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Firsst_Name_TextField2.setBackground(new java.awt.Color(51, 110, 123));
        Firsst_Name_TextField2.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Firsst_Name_TextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        First_Name_Lable1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        First_Name_Lable1.setForeground(new java.awt.Color(135, 54, 54));
        First_Name_Lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        First_Name_Lable1.setText("الاسم :");

        Number_Code_TextField3.setEditable(false);
        Number_Code_TextField3.setBackground(new java.awt.Color(51, 110, 123));
        Number_Code_TextField3.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Number_Code_TextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Number_Code_TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_Code_TextField3ActionPerformed(evt);
            }
        });

        code_Number_Lable3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        code_Number_Lable3.setForeground(new java.awt.Color(135, 54, 54));
        code_Number_Lable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code_Number_Lable3.setText("رقم الكود  :");

        Phone_Code_TextField4.setBackground(new java.awt.Color(51, 110, 123));
        Phone_Code_TextField4.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Phone_Code_TextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Phone_Code_TextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phone_Code_TextField4ActionPerformed(evt);
            }
        });

        Phone_Number_Lable2.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Phone_Number_Lable2.setForeground(new java.awt.Color(135, 54, 54));
        Phone_Number_Lable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phone_Number_Lable2.setText("رقم التليفون:");

        class_number_Lable3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        class_number_Lable3.setForeground(new java.awt.Color(135, 54, 54));
        class_number_Lable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        class_number_Lable3.setText("الصف     :");
        class_number_Lable3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        Group_number_Lable1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Group_number_Lable1.setForeground(new java.awt.Color(135, 54, 54));
        Group_number_Lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Group_number_Lable1.setText("المجموعه:");
        Group_number_Lable1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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

        Search_Button3.setBackground(new java.awt.Color(51, 110, 123));
        Search_Button3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Search_Button3.setForeground(new java.awt.Color(135, 54, 54));
        Search_Button3.setText("البحث  :");
        Search_Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search_Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_Button3MouseExited(evt);
            }
        });
        Search_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Button3ActionPerformed(evt);
            }
        });

        Update_Button4.setBackground(new java.awt.Color(51, 110, 123));
        Update_Button4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Update_Button4.setForeground(new java.awt.Color(135, 54, 54));
        Update_Button4.setText("تحديث");
        Update_Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update_Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update_Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update_Button4MouseExited(evt);
            }
        });
        Update_Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Button4ActionPerformed(evt);
            }
        });

        group_number_ComboBox.setBackground(new java.awt.Color(1, 50, 67));
        group_number_ComboBox.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        group_number_ComboBox.setForeground(new java.awt.Color(135, 54, 54));
        group_number_ComboBox.setToolTipText("");
        group_number_ComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Class_number_ComboBox1.setBackground(new java.awt.Color(1, 50, 67));
        Class_number_ComboBox1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        Class_number_ComboBox1.setForeground(new java.awt.Color(135, 54, 54));
        Class_number_ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "اولي ثانوي ", "تانيه ثانوي", "تالته ثانوي" }));
        Class_number_ComboBox1.setSelectedIndex(-1);
        Class_number_ComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Class_number_Button1.setBackground(new java.awt.Color(51, 110, 123));
        Class_number_Button1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Class_number_Button1.setForeground(new java.awt.Color(135, 54, 54));
        Class_number_Button1.setText("اضغط");
        Class_number_Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Class_number_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Class_number_Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Class_number_Button1MouseExited(evt);
            }
        });
        Class_number_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_number_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manager_Panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Searche_Name_TextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(group_number_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Class_number_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(Class_number_ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Phone_Code_TextField4)
                    .addComponent(Number_Code_TextField3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Reeturn_Button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Update_Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Search_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(First_Name_Lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phone_Number_Lable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(code_Number_Lable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(class_number_Lable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Group_number_Lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Searche_Name_TextField1)
                    .addComponent(Search_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(First_Name_Lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code_Number_Lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Phone_Code_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Phone_Number_Lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(class_number_Lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(Group_number_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Class_number_ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Class_number_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addComponent(group_number_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void Number_Code_TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_Code_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Number_Code_TextField3ActionPerformed

    private void Phone_Code_TextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_Code_TextField4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Phone_Code_TextField4ActionPerformed

    private void Reeturn_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reeturn_Button2ActionPerformed
        // TODO add your handling code here:
        Main_Page_Frame another =  new Main_Page_Frame();
        this.setVisible(false);
        another.setVisible(true);

    }//GEN-LAST:event_Reeturn_Button2ActionPerformed

    private void Class_number_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_number_Button1ActionPerformed
         group_number_ComboBox.removeAllItems();
        if(Class_number_ComboBox1.getSelectedItem().equals("اولي ثانوي ")){
            group_number_ComboBox.addItem("السبت-الاتنين-الاربعاء -->>10.5 : 12");
            group_number_ComboBox.addItem("السبت-الاتنين-الاربعاء -->>12.5 : 2");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-->>10.5 : 12");
        }else if(Class_number_ComboBox1.getSelectedItem().equals("تانيه ثانوي")){
            group_number_ComboBox.addItem("السبت-الاتنين-الاربعاء -->>3.5 : 5");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-->>5 : 6.5");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-->>12.5 : 2");
        }else{
            group_number_ComboBox.addItem("السبت-الاتنين-الاربعاء -->>2 : 3.5");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-->>2 : 3.5");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-->>10.5 : 12");
        }
    }//GEN-LAST:event_Class_number_Button1ActionPerformed

    private void Search_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Button3ActionPerformed
        // TODO add your handling code here:
         if(Searche_Name_TextField1.getText().equals(""))
        {
            textFiledesEmpty();
            JOptionPane.showMessageDialog(null, "يجب ان تقوم بكتابه رقم الكود قبل ان تضغط علي ذر البحث!");
        }else
        {
            String result =Searche_Name_TextField1.getText();
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
                   Phone_Code_TextField4.setText(re.getString(phone));
                    group_number_ComboBox.addItem(re.getString(group));
                    Class_number_ComboBox1.setSelectedItem(re.getString(clas));
               }else
               {
                    JOptionPane.showMessageDialog(null, "لم يتم تسجيل طالب بهذا الكود  ", "ERROR", 3);
                     textFiledesEmpty();
                   
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
                   Phone_Code_TextField4.setText(re.getString(phone));
                    group_number_ComboBox.addItem(re.getString(group));
                   Number_Code_TextField3.setText(re.getString(code));
                   Class_number_ComboBox1.setSelectedItem(re.getString(clas));
               }else
               {
                    JOptionPane.showMessageDialog(null, "لم يتم تسجيل طالب بهذا الكود  ", "ERROR", 3);
                     textFiledesEmpty();
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
                   Phone_Code_TextField4.setText(re.getString(phone));
                    group_number_ComboBox.addItem(re.getString(group));
                   Number_Code_TextField3.setText(re.getString(code));
                   Class_number_ComboBox1.setSelectedItem(re.getString(clas));
               }else
               {
                    JOptionPane.showMessageDialog(null, "لم يتم تسجيل طالب بهذا الكود  ", "ERROR", 3);
                     textFiledesEmpty();
               }
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
           }
        }
        }
    }//GEN-LAST:event_Search_Button3ActionPerformed

    private void Update_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Button4ActionPerformed
        // TODO add your handling code here:
        if(Searche_Name_TextField1.getText().equals(""))
        {
            textFiledesEmpty();
            JOptionPane.showMessageDialog(null, "يجب ان تقوم بكتابه رقم الكود قبل ان تضغط علي ذر البحث!");
        }else
        {
            String result =Searche_Name_TextField1.getText();
            int res = Integer.parseInt(result);
            String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
                String url = "jdbc:mysql://localhost/";
                String db = "teacher";
                Connection conn = null;
                ResultSet re = null;
                PreparedStatement pr = null;
                ResultSet re1 = null;
                PreparedStatement pr1 = null;
                ResultSet re2 = null;
                PreparedStatement pr2 = null;
                ResultSet re3 = null;
                PreparedStatement pr3 = null;
                String value1 = Firsst_Name_TextField2.getText();
                String value2 = Number_Code_TextField3.getText();
                String value3 = Phone_Code_TextField4.getText();
                String value4 =  Class_number_ComboBox1.getSelectedItem().toString();
                String value5 =  group_number_ComboBox.getSelectedItem().toString();
            if(res >=1000 && res <2000)
            {
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "UPDATE   `name_level1` SET `name`=? ,`phone`=?,`class`=?,`group`=? WHERE code=?";
                    String Query2 = "UPDATE `attendance_level1` SET `name` = ?";
                    String Query3 = "UPDATE  `exam_level1` SET `name` = ?";
                    String Query4 = "UPDATE `money_level1` SET `name` = ?";
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query2);
                    pr2 = conn.prepareStatement(Query3);
                    pr3 = conn.prepareStatement(Query4);
                    pr.setString(1, Firsst_Name_TextField2.getText());
                    pr.setString(2, Phone_Code_TextField4.getText());
                    pr.setString(3, Class_number_ComboBox1.getSelectedItem().toString());
                    pr.setString(4, group_number_ComboBox.getSelectedItem().toString());
                    pr.setString(5, Number_Code_TextField3.getText());
                    pr1.setString(1, Firsst_Name_TextField2.getText());
                    pr2.setString(1, Firsst_Name_TextField2.getText());
                    pr3.setString(1, Firsst_Name_TextField2.getText());
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    pr3.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم تحديث الطالب بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
            }else if(res >=2000 && res < 3000)
            {
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "UPDATE   `name_level2` SET `name`=? ,`phone`=?,`class`=?,`group`=? WHERE code=?";
                    String Query2 = "UPDATE `attendance_level2` SET `name` = ?";
                    String Query3 = "UPDATE  `exam_level2` SET `name` = ?";
                    String Query4 = "UPDATE `money_level2` SET `name` = ?";
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query2);
                    pr2 = conn.prepareStatement(Query3);
                    pr3 = conn.prepareStatement(Query4);
                    pr.setString(1, Firsst_Name_TextField2.getText());
                    pr.setString(2, Phone_Code_TextField4.getText());
                    pr.setString(3, Class_number_ComboBox1.getSelectedItem().toString());
                    pr.setString(4, group_number_ComboBox.getSelectedItem().toString());
                    pr.setString(5, Number_Code_TextField3.getText());
                    pr1.setString(1, Firsst_Name_TextField2.getText());
                    pr2.setString(1, Firsst_Name_TextField2.getText());
                    pr3.setString(1, Firsst_Name_TextField2.getText());
                    pr.executeUpdate();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    pr3.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم تحديث الطالب بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
            }else if(res >=3000)
            {
                try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                    String Query = "UPDATE   `name_level3` SET `name`=? ,`phone`=?,`class`=?,`group`=? WHERE code=?";
                    String Query2 = "UPDATE `attendance_level3` SET `name` = ?";
                    String Query3 = "UPDATE  `exam_level3` SET `name` = ?";
                    String Query4 = "UPDATE `money_level3` SET `name` = ?";
                    pr = conn.prepareStatement(Query);
                    pr1 = conn.prepareStatement(Query2);
                    pr2 = conn.prepareStatement(Query3);
                    pr3 = conn.prepareStatement(Query4);
                    pr.setString(1, Firsst_Name_TextField2.getText());
                    pr.setString(2, Phone_Code_TextField4.getText());
                    pr.setString(3, Class_number_ComboBox1.getSelectedItem().toString());
                    pr.setString(4, group_number_ComboBox.getSelectedItem().toString());
                    pr.setString(5, Number_Code_TextField3.getText());
                    pr1.setString(1, Firsst_Name_TextField2.getText());
                    pr2.setString(1, Firsst_Name_TextField2.getText());
                    pr3.setString(1, Firsst_Name_TextField2.getText());
                    pr.execute();
                    pr1.executeUpdate();
                    pr2.executeUpdate();
                    pr3.executeUpdate();
                    JOptionPane.showMessageDialog(null,"تم تحديث الطالب بنجاح");
                  }  catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                    }
        }
        }
        textFiledesEmpty();
    }//GEN-LAST:event_Update_Button4ActionPerformed

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

    private void Search_Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Button3MouseEntered
        Search_Button3.setBackground(Color.DARK_GRAY);
        Search_Button3.setOpaque(true);
    }//GEN-LAST:event_Search_Button3MouseEntered

    private void Search_Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Button3MouseExited
        Search_Button3.setBackground(null);
        Search_Button3.setOpaque(false);
    }//GEN-LAST:event_Search_Button3MouseExited

    private void Class_number_Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class_number_Button1MouseEntered
        Class_number_Button1.setBackground(Color.DARK_GRAY);
        Class_number_Button1.setOpaque(true);
    }//GEN-LAST:event_Class_number_Button1MouseEntered

    private void Class_number_Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class_number_Button1MouseExited
        Class_number_Button1.setBackground(null);
        Class_number_Button1.setOpaque(false);
    }//GEN-LAST:event_Class_number_Button1MouseExited

    private void Reeturn_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseEntered
        Reeturn_Button2.setBackground(Color.DARK_GRAY);
        Reeturn_Button2.setOpaque(true);
    }//GEN-LAST:event_Reeturn_Button2MouseEntered

    private void Reeturn_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseExited
        Reeturn_Button2.setBackground(null);
        Reeturn_Button2.setOpaque(false);
    }//GEN-LAST:event_Reeturn_Button2MouseExited

    private void Update_Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_Button4MouseEntered
        Update_Button4.setBackground(Color.DARK_GRAY);
        Update_Button4.setOpaque(true);
    }//GEN-LAST:event_Update_Button4MouseEntered

    private void Update_Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_Button4MouseExited
        Update_Button4.setBackground(null);
        Update_Button4.setOpaque(false);
    }//GEN-LAST:event_Update_Button4MouseExited
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
   private void textFiledesEmpty(){
        Firsst_Name_TextField2.setText("");
        Number_Code_TextField3.setText("");
        Phone_Code_TextField4.setText("");
        group_number_ComboBox.removeAllItems();
        Searche_Name_TextField1.setText("");
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
            java.util.logging.Logger.getLogger(update_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_Student_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Student_Label;
    private javax.swing.JButton Class_number_Button1;
    private javax.swing.JComboBox<String> Class_number_ComboBox1;
    private javax.swing.JLabel CloseLabel1;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JTextField Firsst_Name_TextField2;
    private javax.swing.JLabel First_Name_Lable1;
    private javax.swing.JLabel Group_number_Lable1;
    private javax.swing.JLabel ManagerLabel4;
    private javax.swing.JPanel Manager_Panel3;
    private javax.swing.JLabel MinusLabel4;
    private javax.swing.JTextField Number_Code_TextField3;
    private javax.swing.JTextField Phone_Code_TextField4;
    private javax.swing.JLabel Phone_Number_Lable2;
    private javax.swing.JButton Reeturn_Button2;
    private javax.swing.JButton Search_Button3;
    private javax.swing.JTextField Searche_Name_TextField1;
    private javax.swing.JLabel Time_jLabel1;
    private javax.swing.JButton Update_Button4;
    private javax.swing.JLabel class_number_Lable3;
    private javax.swing.JLabel code_Number_Lable3;
    private javax.swing.JComboBox<String> group_number_ComboBox;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
