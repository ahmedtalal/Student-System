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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author AhmedTalal
 */
public class Attendance_student_frame extends javax.swing.JFrame {

    /**
     * Creates new form Attendance_seretary_frame
     */
  //  int c = 1;
    String co ="1000";
    public Attendance_student_frame() {
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
        Search_Button3 = new javax.swing.JButton();
        Searche_Name_TextField1 = new javax.swing.JTextField();
        Firsst_Name_TextField2 = new javax.swing.JTextField();
        First_Name_Lable1 = new javax.swing.JLabel();
        code_Number_Lable3 = new javax.swing.JLabel();
        Number_Code_TextField3 = new javax.swing.JTextField();
        Sure_attendance_Lable4 = new javax.swing.JLabel();
        attendance_ComboBox1 = new javax.swing.JComboBox<>();
        Reeturn_Button2 = new javax.swing.JButton();
        Sure_Button4 = new javax.swing.JButton();
        Manager_Panel2 = new javax.swing.JPanel();
        MinusLabel3 = new javax.swing.JLabel();
        CloseLabel = new javax.swing.JLabel();
        ManagerLabel3 = new javax.swing.JLabel();
        Add_Secretary_Label = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        Time_Label1 = new javax.swing.JLabel();
        class_Name_Lable4 = new javax.swing.JLabel();
        class_number_TextField6 = new javax.swing.JTextField();
        weekCombox = new javax.swing.JComboBox<>();
        classlabel = new javax.swing.JLabel();
        lecture_ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));

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

        Searche_Name_TextField1.setBackground(new java.awt.Color(51, 110, 123));
        Searche_Name_TextField1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        Searche_Name_TextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Firsst_Name_TextField2.setEditable(false);
        Firsst_Name_TextField2.setBackground(new java.awt.Color(51, 110, 123));
        Firsst_Name_TextField2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        Firsst_Name_TextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        First_Name_Lable1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        First_Name_Lable1.setForeground(new java.awt.Color(135, 54, 54));
        First_Name_Lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        First_Name_Lable1.setText("الاسم   :");

        code_Number_Lable3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        code_Number_Lable3.setForeground(new java.awt.Color(135, 54, 54));
        code_Number_Lable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code_Number_Lable3.setText("رقم الكود  :");

        Number_Code_TextField3.setEditable(false);
        Number_Code_TextField3.setBackground(new java.awt.Color(51, 110, 123));
        Number_Code_TextField3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        Number_Code_TextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Number_Code_TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_Code_TextField3ActionPerformed(evt);
            }
        });

        Sure_attendance_Lable4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Sure_attendance_Lable4.setForeground(new java.awt.Color(135, 54, 54));
        Sure_attendance_Lable4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sure_attendance_Lable4.setText("الحضور   :");

        attendance_ComboBox1.setBackground(new java.awt.Color(1, 50, 67));
        attendance_ComboBox1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        attendance_ComboBox1.setForeground(new java.awt.Color(135, 54, 54));
        attendance_ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ح" }));
        attendance_ComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendance_ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendance_ComboBox1ActionPerformed(evt);
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

        Sure_Button4.setBackground(new java.awt.Color(51, 110, 123));
        Sure_Button4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Sure_Button4.setForeground(new java.awt.Color(135, 54, 54));
        Sure_Button4.setText("تاكيد");
        Sure_Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sure_Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sure_Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sure_Button4MouseExited(evt);
            }
        });
        Sure_Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sure_Button4ActionPerformed(evt);
            }
        });

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
        ManagerLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManagerLabel3.setText("صفحه تسجيل الحضور");

        Add_Secretary_Label.setBackground(new java.awt.Color(235, 151, 78));
        Add_Secretary_Label.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        Add_Secretary_Label.setForeground(new java.awt.Color(67, 19, 19));
        Add_Secretary_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_Secretary_Label.setText("تطبيق الطالب");

        Date_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(67, 19, 19));

        Time_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Time_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_Label1.setForeground(new java.awt.Color(67, 19, 19));

        javax.swing.GroupLayout Manager_Panel2Layout = new javax.swing.GroupLayout(Manager_Panel2);
        Manager_Panel2.setLayout(Manager_Panel2Layout);
        Manager_Panel2Layout.setHorizontalGroup(
            Manager_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel2Layout.createSequentialGroup()
                .addComponent(Add_Secretary_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManagerLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(MinusLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(CloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Manager_Panel2Layout.setVerticalGroup(
            Manager_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel2Layout.createSequentialGroup()
                .addGroup(Manager_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ManagerLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(Time_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Date_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_Secretary_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(CloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MinusLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        class_Name_Lable4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        class_Name_Lable4.setForeground(new java.awt.Color(135, 54, 54));
        class_Name_Lable4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        class_Name_Lable4.setText("الصف   :");

        class_number_TextField6.setEditable(false);
        class_number_TextField6.setBackground(new java.awt.Color(51, 110, 123));
        class_number_TextField6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        class_number_TextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        class_number_TextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_number_TextField6ActionPerformed(evt);
            }
        });

        weekCombox.setBackground(new java.awt.Color(1, 50, 67));
        weekCombox.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        weekCombox.setForeground(new java.awt.Color(135, 54, 54));
        weekCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الاسبوع الاول", "الاسبوع التاني", "الاسبوع التالت", "الاسبوع الرابع" }));
        weekCombox.setSelectedIndex(-1);
        weekCombox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 80, 29), 3, true));
        weekCombox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        classlabel.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        classlabel.setForeground(new java.awt.Color(135, 54, 54));
        classlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classlabel.setText("رقم الحصه:");

        lecture_ComboBox.setBackground(new java.awt.Color(1, 50, 67));
        lecture_ComboBox.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        lecture_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "سبت_حد", "اتنين_تلات", "اربع_خميس" }));
        lecture_ComboBox.setSelectedIndex(-1);
        lecture_ComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 91, 28), 3));
        lecture_ComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(weekCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Searche_Name_TextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                            .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(class_number_TextField6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lecture_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(classlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(attendance_ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(code_Number_Lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addComponent(Search_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(First_Name_Lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(class_Name_Lable4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sure_attendance_Lable4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314)
                        .addComponent(Sure_Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(287, 287, 287))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Searche_Name_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_Name_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code_Number_Lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(class_number_TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(class_Name_Lable4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attendance_ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sure_attendance_Lable4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(weekCombox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(lecture_ComboBox, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sure_Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Number_Code_TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_Code_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Number_Code_TextField3ActionPerformed

    private void Reeturn_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reeturn_Button2ActionPerformed
        // TODO add your handling code here:
        Main_Page_Frame another =  new Main_Page_Frame();
        this.setVisible(false);
        another.setVisible(true);
    }//GEN-LAST:event_Reeturn_Button2ActionPerformed

    private void attendance_ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendance_ComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendance_ComboBox1ActionPerformed

    private void MinusLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(Login_Frame.ICONIFIED);
    }//GEN-LAST:event_MinusLabel3MouseClicked

    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLabelMouseClicked

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
                            class_number_TextField6.setText(re.getString(clas));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
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
                           Number_Code_TextField3.setText(re.getString(code));
                           class_number_TextField6.setText(re.getString(clas));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
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
                           Number_Code_TextField3.setText(re.getString(code));
                           class_number_TextField6.setText(re.getString(clas));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            textFiledesEmpty();
                       }
                   } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }
                }
        }
    }//GEN-LAST:event_Search_Button3ActionPerformed

    private void Sure_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sure_Button4ActionPerformed
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
               String name = Firsst_Name_TextField2.getText();
               String code = Number_Code_TextField3.getText();
               String attendance = attendance_ComboBox1.getSelectedItem().toString();
                   
               String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
               String url = "jdbc:mysql://localhost/";
              String db = "teacher";
             Connection conn = null;
             PreparedStatement pr = null;
             if(res >=1000 & res <2000)
             {
                 if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                   try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec1`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                      pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                 }else if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec2`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                 }else if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec3`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
             }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec4`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec5`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec6`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec7`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec8`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec9`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec10`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec11`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level1` SET `lec12`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }
             }else if(res >=2000 & res <3000)
             {
                 if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                   try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec1`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                      pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                 }else if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec2`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                 }else if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec3`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
             }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec4`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec5`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec6`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec7`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec8`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec9`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec10`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec11`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level2` SET `lec12`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }
             } else if(res >=3000)
                {
                    if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                   try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec1`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                      pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                 }else if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec2`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                 }else if(weekCombox.getSelectedItem().equals("الاسبوع الاول")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec3`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
             }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec4`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec5`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التاني")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec6`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec7`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec8`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع التالت")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec9`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("سبت_حد"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec10`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("اتنين_تلات"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec11`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }else if(weekCombox.getSelectedItem().equals("الاسبوع الرابع")& lecture_ComboBox.getSelectedItem().equals("اربع_خميس"))
                 {
                     try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "UPDATE   `attendance_level3` SET `lec12`=? WHERE code="+code;
                     pr = conn.prepareStatement(INSERT_QUERY);
                     pr.setString(1, attendance);
                     pr.executeUpdate();
                     JOptionPane.showMessageDialog(null, "تم تاكيد حضورالطالب بنجاح");
                     textFiledesEmpty();
                 }  catch(SQLException ex)
                   {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                   }
                }
                }
        }
    }//GEN-LAST:event_Sure_Button4ActionPerformed

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

    private void Search_Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Button3MouseEntered
        Search_Button3.setBackground(Color.DARK_GRAY);
        Search_Button3.setOpaque(true);
    }//GEN-LAST:event_Search_Button3MouseEntered

    private void Search_Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Button3MouseExited
        Search_Button3.setBackground(null);
        Search_Button3.setOpaque(false);
    }//GEN-LAST:event_Search_Button3MouseExited

    private void Sure_Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sure_Button4MouseEntered
        Sure_Button4.setBackground(Color.DARK_GRAY);
        Sure_Button4.setOpaque(true);
    }//GEN-LAST:event_Sure_Button4MouseEntered

    private void Sure_Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sure_Button4MouseExited
        Sure_Button4.setBackground(null);
        Sure_Button4.setOpaque(false);
    }//GEN-LAST:event_Sure_Button4MouseExited

    private void Reeturn_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseEntered
        Reeturn_Button2.setBackground(Color.DARK_GRAY);
        Reeturn_Button2.setOpaque(true);
    }//GEN-LAST:event_Reeturn_Button2MouseEntered

    private void Reeturn_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseExited
        Reeturn_Button2.setBackground(null);
        Reeturn_Button2.setOpaque(false);
    }//GEN-LAST:event_Reeturn_Button2MouseExited

    private void class_number_TextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_number_TextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_class_number_TextField6ActionPerformed

     private void textFiledesEmpty(){
        Firsst_Name_TextField2.setText("");
        Number_Code_TextField3.setText("");
        class_number_TextField6.setText("");
        Searche_Name_TextField1.setText("");
        lecture_ComboBox.setSelectedItem("");
        weekCombox.setSelectedItem("");
    }
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
                String Query = "SELECT `name`, `code` ,`class` FROM `name_level1` WHERE code = ?";
                pr = conn.prepareStatement(Query);
                pr.setString(1, s);
                re = pr.executeQuery();
              }  catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
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
                String Query = "SELECT `name`, `code`, `class` FROM `name_level2` WHERE code = ?";
                pr = conn.prepareStatement(Query);
                pr.setString(1, s);
                re = pr.executeQuery();
              }  catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
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
                String Query = "SELECT `name`, `code`, `class` FROM `name_level3` WHERE code = ?";
                pr = conn.prepareStatement(Query);
                pr.setString(1, s);
                re = pr.executeQuery();
              }  catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
                }
               return re;
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
            java.util.logging.Logger.getLogger(Attendance_student_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance_student_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance_student_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance_student_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance_student_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Secretary_Label;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JTextField Firsst_Name_TextField2;
    private javax.swing.JLabel First_Name_Lable1;
    private javax.swing.JLabel ManagerLabel3;
    private javax.swing.JPanel Manager_Panel2;
    private javax.swing.JLabel MinusLabel3;
    private javax.swing.JTextField Number_Code_TextField3;
    private javax.swing.JButton Reeturn_Button2;
    private javax.swing.JButton Search_Button3;
    private javax.swing.JTextField Searche_Name_TextField1;
    private javax.swing.JButton Sure_Button4;
    private javax.swing.JLabel Sure_attendance_Lable4;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JComboBox<String> attendance_ComboBox1;
    private javax.swing.JLabel class_Name_Lable4;
    private javax.swing.JTextField class_number_TextField6;
    private javax.swing.JLabel classlabel;
    private javax.swing.JLabel code_Number_Lable3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> lecture_ComboBox;
    private javax.swing.JComboBox<String> weekCombox;
    // End of variables declaration//GEN-END:variables
}
