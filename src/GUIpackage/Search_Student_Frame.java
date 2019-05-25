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
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author AhmedTalal
 */
public class Search_Student_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Search_Frame
     */
    public Search_Student_Frame() {
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
    public Connection  getConnection()
   {
       String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
       String url = "jdbc:mysql://localhost/";
        String db = "teacher";
       Connection conn;
       try{
           conn = DriverManager.getConnection(url+db+ unicode , "root", "");
           return  conn;
       }catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(null, ex, "ERROR", 1);
       }
       return null;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Searche_Name_TextField1 = new javax.swing.JTextField();
        Search_Button3 = new javax.swing.JButton();
        Firsst_Name_TextField2 = new javax.swing.JTextField();
        First_Name_Lable1 = new javax.swing.JLabel();
        Number_Code_TextField3 = new javax.swing.JTextField();
        code_Number_Lable3 = new javax.swing.JLabel();
        Phone_Code_TextField4 = new javax.swing.JTextField();
        Phone_Number_Lable2 = new javax.swing.JLabel();
        Class_Number_TextField3 = new javax.swing.JTextField();
        class_number_Lable3 = new javax.swing.JLabel();
        group_Number_TextField2 = new javax.swing.JTextField();
        Group_number_Lable1 = new javax.swing.JLabel();
        Reeturn_Button2 = new javax.swing.JButton();
        Manager_Panel2 = new javax.swing.JPanel();
        MinusLabel3 = new javax.swing.JLabel();
        CloseLabel = new javax.swing.JLabel();
        ManagerLabel3 = new javax.swing.JLabel();
        Add_Secretary_Label = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        Time_Label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));

        Searche_Name_TextField1.setBackground(new java.awt.Color(51, 110, 123));
        Searche_Name_TextField1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Searche_Name_TextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

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

        Firsst_Name_TextField2.setEditable(false);
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

        Phone_Code_TextField4.setEditable(false);
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

        group_Number_TextField2.setEditable(false);
        group_Number_TextField2.setBackground(new java.awt.Color(51, 110, 123));
        group_Number_TextField2.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        group_Number_TextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        group_Number_TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group_Number_TextField2ActionPerformed(evt);
            }
        });

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
        ManagerLabel3.setText("صفحه البحث عن طالب");

        Add_Secretary_Label.setBackground(new java.awt.Color(67, 19, 19));
        Add_Secretary_Label.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        Add_Secretary_Label.setForeground(new java.awt.Color(67, 19, 19));
        Add_Secretary_Label.setText("تطبيق الطالب");

        Date_Label1.setBackground(new java.awt.Color(67, 19, 19));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Date_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Time_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Time_Label1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
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
                .addGap(18, 18, 18)
                .addComponent(ManagerLabel3)
                .addGap(72, 72, 72)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinusLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(CloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manager_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Searche_Name_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone_Code_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Class_Number_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(group_Number_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(First_Name_Lable1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Phone_Number_Lable2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(code_Number_Lable3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Search_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(class_number_Lable3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Group_number_Lable1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Searche_Name_TextField1)
                    .addComponent(Search_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(First_Name_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(code_Number_Lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Phone_Number_Lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Phone_Code_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(class_number_Lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Class_Number_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Group_number_Lable1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(group_Number_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(17, 17, 17)
                .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Number_Code_TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_Code_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Number_Code_TextField3ActionPerformed

    private void Phone_Code_TextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_Code_TextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Phone_Code_TextField4ActionPerformed

    private void Class_Number_TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_Number_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Class_Number_TextField3ActionPerformed

    private void group_Number_TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group_Number_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_group_Number_TextField2ActionPerformed

    private void Reeturn_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reeturn_Button2ActionPerformed
        // TODO add your handling code here:
        Main_Page_Frame another =  new Main_Page_Frame();
        this.setVisible(false);
        another.setVisible(true);
    }//GEN-LAST:event_Reeturn_Button2ActionPerformed

    private void MinusLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(Login_Frame.ICONIFIED);
    }//GEN-LAST:event_MinusLabel3MouseClicked

    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLabelMouseClicked

    private void Search_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Button3ActionPerformed
       if(Searche_Name_TextField1.getText().equals(""))
       {
           textFiledesEmpty();
           JOptionPane.showMessageDialog(null, "يجب ان تقوم بكتابه رقم الكود قبل ان تضغط علي ذر البحث!", "ERROR", 3);
       }else{
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
                            group_Number_TextField2.setText(re.getString(group));
                            Class_Number_TextField3.setText(re.getString(clas));
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
                           Phone_Code_TextField4.setText(re.getString(phone));
                            group_Number_TextField2.setText(re.getString(group));
                           Number_Code_TextField3.setText(re.getString(code));
                           Class_Number_TextField3.setText(re.getString(clas));
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
                           Phone_Code_TextField4.setText(re.getString(phone));
                            group_Number_TextField2.setText(re.getString(group));
                           Number_Code_TextField3.setText(re.getString(code));
                           Class_Number_TextField3.setText(re.getString(clas));
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

    private void CloseLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseEntered
        CloseLabel.setBackground(Color.RED);
        CloseLabel.setOpaque(true);
    }//GEN-LAST:event_CloseLabelMouseEntered

    private void CloseLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseExited
        CloseLabel.setBackground(null);
        CloseLabel.setOpaque(false);
    }//GEN-LAST:event_CloseLabelMouseExited

    private void MinusLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel3MouseEntered
        MinusLabel3.setBackground(Color.white);
        MinusLabel3.setOpaque(true);
    }//GEN-LAST:event_MinusLabel3MouseEntered

    private void MinusLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel3MouseExited
        MinusLabel3.setBackground(null);
        MinusLabel3.setOpaque(false);
    }//GEN-LAST:event_MinusLabel3MouseExited

    private void Reeturn_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseEntered
        Reeturn_Button2.setBackground(Color.DARK_GRAY);
        Reeturn_Button2.setOpaque(true);
    }//GEN-LAST:event_Reeturn_Button2MouseEntered

    private void Reeturn_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseExited
        Reeturn_Button2.setBackground(null);
        Reeturn_Button2.setOpaque(false);
    }//GEN-LAST:event_Reeturn_Button2MouseExited

    private void Search_Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Button3MouseEntered
        Search_Button3.setBackground(Color.DARK_GRAY);
        Search_Button3.setOpaque(true);
    }//GEN-LAST:event_Search_Button3MouseEntered

    private void Search_Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Button3MouseExited
        Search_Button3.setBackground(null);
        Search_Button3.setOpaque(false);
    }//GEN-LAST:event_Search_Button3MouseExited

    private void textFiledesEmpty(){
        Firsst_Name_TextField2.setText("");
        Number_Code_TextField3.setText("");
        Class_Number_TextField3.setText("");
        Searche_Name_TextField1.setText("");
        group_Number_TextField2.setText("");
        Phone_Code_TextField4.setText("");
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
                String Query = "SELECT * FROM `name_level1` WHERE code = ?";
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
                String Query = "SELECT * FROM `name_level2` WHERE code = ?";
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
                String Query = "SELECT * FROM `name_level3` WHERE code = ?";
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
            java.util.logging.Logger.getLogger(Search_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Student_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Secretary_Label;
    private javax.swing.JTextField Class_Number_TextField3;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JTextField Firsst_Name_TextField2;
    private javax.swing.JLabel First_Name_Lable1;
    private javax.swing.JLabel Group_number_Lable1;
    private javax.swing.JLabel ManagerLabel3;
    private javax.swing.JPanel Manager_Panel2;
    private javax.swing.JLabel MinusLabel3;
    private javax.swing.JTextField Number_Code_TextField3;
    private javax.swing.JTextField Phone_Code_TextField4;
    private javax.swing.JLabel Phone_Number_Lable2;
    private javax.swing.JButton Reeturn_Button2;
    private javax.swing.JButton Search_Button3;
    private javax.swing.JTextField Searche_Name_TextField1;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JLabel class_number_Lable3;
    private javax.swing.JLabel code_Number_Lable3;
    private javax.swing.JTextField group_Number_TextField2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
