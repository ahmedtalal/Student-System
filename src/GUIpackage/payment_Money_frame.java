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
public class payment_Money_frame extends javax.swing.JFrame {

    /**
     * Creates new form payment_Money_frame
     */
    //function data And Time >>>>
    public payment_Money_frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        ShowDate();
        ShowTime();
    }

    
    void ShowDate(){
       Date d = new Date();
       SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
       Date_Label2.setText(s.format(d));
   }
   void ShowTime(){
       new Timer(0, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Date d = new Date();
               SimpleDateFormat s = new SimpleDateFormat("hh : mm : ss a");
                Time_Label2.setText(s.format(d));
           }
       }
       ).start();
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Search_Button3 = new javax.swing.JButton();
        Search_TextField1 = new javax.swing.JTextField();
        First_Name_Lable1 = new javax.swing.JLabel();
        class_Name_TextField2 = new javax.swing.JTextField();
        Firsst_Name_TextField3 = new javax.swing.JTextField();
        code_name_Label = new javax.swing.JLabel();
        code_Name_TextField3 = new javax.swing.JTextField();
        class_name_jLabel = new javax.swing.JLabel();
        Money_ComboBox1 = new javax.swing.JComboBox<>();
        paymentMoney_Name_Lable5 = new javax.swing.JLabel();
        Reeturn_Button2 = new javax.swing.JButton();
        Sure_Button4 = new javax.swing.JButton();
        Manager_Panel3 = new javax.swing.JPanel();
        MinusLabel4 = new javax.swing.JLabel();
        CloseLabel1 = new javax.swing.JLabel();
        ManagerLabel4 = new javax.swing.JLabel();
        Add_Secretary_Label1 = new javax.swing.JLabel();
        Date_Label2 = new javax.swing.JLabel();
        Time_Label2 = new javax.swing.JLabel();

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

        Search_TextField1.setBackground(new java.awt.Color(51, 110, 123));
        Search_TextField1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Search_TextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        First_Name_Lable1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        First_Name_Lable1.setForeground(new java.awt.Color(135, 54, 54));
        First_Name_Lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        First_Name_Lable1.setText("الاسم  :");

        class_Name_TextField2.setEditable(false);
        class_Name_TextField2.setBackground(new java.awt.Color(51, 110, 123));
        class_Name_TextField2.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        class_Name_TextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Firsst_Name_TextField3.setEditable(false);
        Firsst_Name_TextField3.setBackground(new java.awt.Color(51, 110, 123));
        Firsst_Name_TextField3.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Firsst_Name_TextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        code_name_Label.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        code_name_Label.setForeground(new java.awt.Color(135, 54, 54));
        code_name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code_name_Label.setText("رقم الكود  :");

        code_Name_TextField3.setEditable(false);
        code_Name_TextField3.setBackground(new java.awt.Color(51, 110, 123));
        code_Name_TextField3.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        code_Name_TextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        class_name_jLabel.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        class_name_jLabel.setForeground(new java.awt.Color(135, 54, 54));
        class_name_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        class_name_jLabel.setText("الصف   :");

        Money_ComboBox1.setBackground(new java.awt.Color(1, 50, 67));
        Money_ComboBox1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        Money_ComboBox1.setForeground(new java.awt.Color(135, 54, 54));
        Money_ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "تم", "لم يتم" }));
        Money_ComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Money_ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Money_ComboBox1ActionPerformed(evt);
            }
        });

        paymentMoney_Name_Lable5.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        paymentMoney_Name_Lable5.setForeground(new java.awt.Color(135, 54, 54));
        paymentMoney_Name_Lable5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentMoney_Name_Lable5.setText("دفع المبلغ:");

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
        Sure_Button4.setText("تخزين");
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

        Manager_Panel3.setBackground(new java.awt.Color(4, 132, 108));

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
        ManagerLabel4.setText("صفحه دفع الفلوس");

        Add_Secretary_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Add_Secretary_Label1.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        Add_Secretary_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Add_Secretary_Label1.setText("تطبيق الطالب");

        Date_Label2.setBackground(new java.awt.Color(235, 151, 78));
        Date_Label2.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label2.setForeground(new java.awt.Color(67, 19, 19));

        Time_Label2.setBackground(new java.awt.Color(235, 151, 78));
        Time_Label2.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_Label2.setForeground(new java.awt.Color(67, 19, 19));

        javax.swing.GroupLayout Manager_Panel3Layout = new javax.swing.GroupLayout(Manager_Panel3);
        Manager_Panel3.setLayout(Manager_Panel3Layout);
        Manager_Panel3Layout.setHorizontalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel3Layout.createSequentialGroup()
                .addComponent(Add_Secretary_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Date_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManagerLabel4)
                .addGap(72, 72, 72)
                .addComponent(Time_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinusLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(CloseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Manager_Panel3Layout.setVerticalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel3Layout.createSequentialGroup()
                .addGroup(Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Time_Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_Secretary_Label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(Date_Label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManagerLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(CloseLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MinusLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manager_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Search_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Search_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Firsst_Name_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(First_Name_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(289, 289, 289)
                                        .addComponent(Sure_Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(code_Name_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(class_Name_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Money_ComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(class_name_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(code_name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paymentMoney_Name_Lable5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(First_Name_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Firsst_Name_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(code_name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code_Name_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(class_Name_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(class_name_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Money_ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentMoney_Name_Lable5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Reeturn_Button2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(Sure_Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Money_ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Money_ComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Money_ComboBox1ActionPerformed

    private void Reeturn_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reeturn_Button2ActionPerformed
        // TODO add your handling code here:
        Main_Page_Frame another =  new Main_Page_Frame();
        this.setVisible(false);
        another.setVisible(true);
    }//GEN-LAST:event_Reeturn_Button2ActionPerformed

    private void MinusLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel4MouseClicked
        // TODO add your handling code here:
        this.setState(Login_Frame.ICONIFIED);
    }//GEN-LAST:event_MinusLabel4MouseClicked

    private void CloseLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLabel1MouseClicked

    private void Sure_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sure_Button4ActionPerformed
        // TODO add your handling code here:
        if(Search_TextField1.getText().equals(""))
        {
            resetTextField();
            JOptionPane.showMessageDialog(null, "يجب ان تقوم بكتابه رقم الكود قبل ان تضغط علي ذر البحث!");
        }else
        {
                String name = Firsst_Name_TextField3.getText();
                String code = code_Name_TextField3.getText();
                String clas =  class_Name_TextField2.getText();
                String payment_type = Money_ComboBox1.getSelectedItem().toString();
                String result =Search_TextField1.getText();
                int res = Integer.parseInt(result);
                String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
                String url = "jdbc:mysql://localhost/";
                String db = "teacher";
                Connection conn = null;
                PreparedStatement pr = null;
                if(res >=1000 && res <2000)
                {
                    try {
                        conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                        String Query = "UPDATE `money_level1` SET `paymet_type`=? WHERE code="+code;
                        pr = conn.prepareStatement(Query);
                         pr.setString(1, payment_type);
                         pr.executeUpdate();
                       JOptionPane.showMessageDialog(null, "تم دفع الشهر ");
                       resetTextField();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex.getMessage() , "ERROR" , 3);
                    }
                }else if(res >=2000 && res <3000)
                {
                    try {
                        conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                        String Query = "UPDATE `money_level2` SET `paymet_type`=? WHERE code="+code;
                        pr = conn.prepareStatement(Query);
                        pr.setString(1, payment_type);
                        pr.executeUpdate();
                       JOptionPane.showMessageDialog(null, "تم دفع الشهر ");
                       resetTextField();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex.getMessage() , "ERROR" , 3);
                    }
                }else
                {
                    try {
                        conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                        String Query = "UPDATE `money_level3` SET `paymet_type`=? WHERE code="+code;
                        pr = conn.prepareStatement(Query);
                        pr.setString(1, payment_type);
                        pr.executeUpdate();
                       JOptionPane.showMessageDialog(null, "تم دفع الشهر ");
                       resetTextField();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex.getMessage() , "ERROR" , 3);
                    }
                }
        }
    }//GEN-LAST:event_Sure_Button4ActionPerformed

    private void Search_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Button3ActionPerformed
        // TODO add your handling code here:
        if(Search_TextField1.getText().equals(""))
        {
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
                        Firsst_Name_TextField3.setText(re.getString(name));
                        code_Name_TextField3.setText(re.getString(code));
                         class_Name_TextField2.setText(re.getString(clas));
                    }else
                    {
                         JOptionPane.showMessageDialog(null, "لم يتم تسجيل طالب بهذا الكود  ", "ERROR", 3);
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
                        Firsst_Name_TextField3.setText(re.getString(name));
                        code_Name_TextField3.setText(re.getString(code));
                        class_Name_TextField2.setText(re.getString(clas));
                    }else
                    {
                         JOptionPane.showMessageDialog(null, "لم يتم تسجيل طالب بهذا الكود  ", "ERROR", 3);
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
                        Firsst_Name_TextField3.setText(re.getString(name));
                        code_Name_TextField3.setText(re.getString(code));
                        class_Name_TextField2.setText(re.getString(clas));
                    }else
                    {
                         JOptionPane.showMessageDialog(null, "لم يتم تسجيل طالب بهذا الكود  ", "ERROR", 3);
                          resetTextField();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                }
        }
        }
    }//GEN-LAST:event_Search_Button3ActionPerformed

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
 
    private void resetTextField()
    {
        Firsst_Name_TextField3.setText("");
        code_Name_TextField3.setText("");
        class_Name_TextField2.setText("");
        Search_TextField1.setText("");
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
            java.util.logging.Logger.getLogger(payment_Money_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment_Money_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment_Money_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment_Money_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment_Money_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Secretary_Label1;
    private javax.swing.JLabel CloseLabel1;
    private javax.swing.JLabel Date_Label2;
    private javax.swing.JTextField Firsst_Name_TextField3;
    private javax.swing.JLabel First_Name_Lable1;
    private javax.swing.JLabel ManagerLabel4;
    private javax.swing.JPanel Manager_Panel3;
    private javax.swing.JLabel MinusLabel4;
    private javax.swing.JComboBox<String> Money_ComboBox1;
    private javax.swing.JButton Reeturn_Button2;
    private javax.swing.JButton Search_Button3;
    private javax.swing.JTextField Search_TextField1;
    private javax.swing.JButton Sure_Button4;
    private javax.swing.JLabel Time_Label2;
    private javax.swing.JTextField class_Name_TextField2;
    private javax.swing.JLabel class_name_jLabel;
    private javax.swing.JTextField code_Name_TextField3;
    private javax.swing.JLabel code_name_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel paymentMoney_Name_Lable5;
    // End of variables declaration//GEN-END:variables
}
