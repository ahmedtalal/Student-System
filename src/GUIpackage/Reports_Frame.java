/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author AhmedTalal
 */
public final class Reports_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Reports_Frame
     */
    public Reports_Frame() {
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
        Search_Button3 = new javax.swing.JButton();
        Searche_Name_TextField1 = new javax.swing.JTextField();
        First_Name_Lable1 = new javax.swing.JLabel();
        Firsst_Name_TextField2 = new javax.swing.JTextField();
        code_number_TextField4 = new javax.swing.JTextField();
        code_Lable4 = new javax.swing.JLabel();
        gyab = new javax.swing.JLabel();
        Atlasmeat_Lable4 = new javax.swing.JLabel();
        Reeturn_Button2 = new javax.swing.JButton();
        Print_Button4 = new javax.swing.JButton();
        attendance_Lable4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ex1 = new javax.swing.JTextField();
        ex2 = new javax.swing.JTextField();
        ex3 = new javax.swing.JTextField();
        ex4 = new javax.swing.JTextField();
        ex5 = new javax.swing.JTextField();
        ex6 = new javax.swing.JTextField();
        ex7 = new javax.swing.JTextField();
        ex8 = new javax.swing.JTextField();
        ex9 = new javax.swing.JTextField();
        ex10 = new javax.swing.JTextField();
        ex11 = new javax.swing.JTextField();
        ex12 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lec11 = new javax.swing.JTextField();
        lec12 = new javax.swing.JTextField();
        lec3 = new javax.swing.JTextField();
        lec4 = new javax.swing.JTextField();
        lec5 = new javax.swing.JTextField();
        lec6 = new javax.swing.JTextField();
        lec7 = new javax.swing.JTextField();
        lec2 = new javax.swing.JTextField();
        lec1 = new javax.swing.JTextField();
        lec10 = new javax.swing.JTextField();
        lec8 = new javax.swing.JTextField();
        lec9 = new javax.swing.JTextField();
        men_textfield = new javax.swing.JTextField();
        mohadra1 = new javax.swing.JLabel();
        class_number_TextField5 = new javax.swing.JTextField();
        gyab_textfield1 = new javax.swing.JTextField();
        gyab1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));

        Manager_Panel3.setBackground(new java.awt.Color(4, 132, 108));

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
        ManagerLabel4.setText("صفحه  التقارير");

        Date_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Date_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Time_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Time_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Time_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Manager_Panel3Layout = new javax.swing.GroupLayout(Manager_Panel3);
        Manager_Panel3.setLayout(Manager_Panel3Layout);
        Manager_Panel3Layout.setHorizontalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manager_Panel3Layout.createSequentialGroup()
                .addComponent(Add_Student_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ManagerLabel4)
                .addGap(83, 83, 83)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(MinusLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(CloseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Manager_Panel3Layout.setVerticalGroup(
            Manager_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add_Student_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MinusLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CloseLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Date_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManagerLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        Searche_Name_TextField1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Searche_Name_TextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Searche_Name_TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searche_Name_TextField1ActionPerformed(evt);
            }
        });

        First_Name_Lable1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        First_Name_Lable1.setForeground(new java.awt.Color(135, 54, 54));
        First_Name_Lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        First_Name_Lable1.setText("الاسم  :");

        Firsst_Name_TextField2.setBackground(new java.awt.Color(51, 110, 123));
        Firsst_Name_TextField2.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Firsst_Name_TextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        code_number_TextField4.setEditable(false);
        code_number_TextField4.setBackground(new java.awt.Color(51, 110, 123));
        code_number_TextField4.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        code_number_TextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        code_number_TextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code_number_TextField4ActionPerformed(evt);
            }
        });

        code_Lable4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        code_Lable4.setForeground(new java.awt.Color(135, 54, 54));
        code_Lable4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code_Lable4.setText("رقم الكود  :");

        gyab.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        gyab.setForeground(new java.awt.Color(135, 54, 54));
        gyab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gyab.setText("من:");

        Atlasmeat_Lable4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Atlasmeat_Lable4.setForeground(new java.awt.Color(135, 54, 54));
        Atlasmeat_Lable4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atlasmeat_Lable4.setText("الدرجات:");
        Atlasmeat_Lable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 98, 66), 3));

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

        Print_Button4.setBackground(new java.awt.Color(51, 110, 123));
        Print_Button4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Print_Button4.setForeground(new java.awt.Color(135, 54, 54));
        Print_Button4.setText("طباعه");
        Print_Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Print_Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Print_Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Print_Button4MouseExited(evt);
            }
        });
        Print_Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_Button4ActionPerformed(evt);
            }
        });

        attendance_Lable4.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        attendance_Lable4.setForeground(new java.awt.Color(135, 54, 54));
        attendance_Lable4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attendance_Lable4.setText("الحضور    :");
        attendance_Lable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 105, 68), 3));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 72, 37), 3));

        ex1.setEditable(false);
        ex1.setBackground(new java.awt.Color(51, 110, 123));
        ex1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex1ActionPerformed(evt);
            }
        });

        ex2.setEditable(false);
        ex2.setBackground(new java.awt.Color(51, 110, 123));
        ex2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex2ActionPerformed(evt);
            }
        });

        ex3.setEditable(false);
        ex3.setBackground(new java.awt.Color(51, 110, 123));
        ex3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex3ActionPerformed(evt);
            }
        });

        ex4.setEditable(false);
        ex4.setBackground(new java.awt.Color(51, 110, 123));
        ex4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex4ActionPerformed(evt);
            }
        });

        ex5.setEditable(false);
        ex5.setBackground(new java.awt.Color(51, 110, 123));
        ex5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex5ActionPerformed(evt);
            }
        });

        ex6.setEditable(false);
        ex6.setBackground(new java.awt.Color(51, 110, 123));
        ex6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex6ActionPerformed(evt);
            }
        });

        ex7.setEditable(false);
        ex7.setBackground(new java.awt.Color(51, 110, 123));
        ex7.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex7ActionPerformed(evt);
            }
        });

        ex8.setEditable(false);
        ex8.setBackground(new java.awt.Color(51, 110, 123));
        ex8.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex8ActionPerformed(evt);
            }
        });

        ex9.setEditable(false);
        ex9.setBackground(new java.awt.Color(51, 110, 123));
        ex9.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex9ActionPerformed(evt);
            }
        });

        ex10.setEditable(false);
        ex10.setBackground(new java.awt.Color(51, 110, 123));
        ex10.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex10ActionPerformed(evt);
            }
        });

        ex11.setEditable(false);
        ex11.setBackground(new java.awt.Color(51, 110, 123));
        ex11.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex11ActionPerformed(evt);
            }
        });

        ex12.setEditable(false);
        ex12.setBackground(new java.awt.Color(51, 110, 123));
        ex12.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        ex12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ex12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ex10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ex11, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ex1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ex2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ex7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ex8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ex3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(ex9)
                            .addComponent(ex12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ex4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ex5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ex6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ex1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ex4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ex7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ex10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 38), 3));

        lec11.setBackground(new java.awt.Color(51, 110, 123));
        lec11.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec11ActionPerformed(evt);
            }
        });

        lec12.setBackground(new java.awt.Color(51, 110, 123));
        lec12.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec12ActionPerformed(evt);
            }
        });

        lec3.setBackground(new java.awt.Color(51, 110, 123));
        lec3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec3ActionPerformed(evt);
            }
        });

        lec4.setBackground(new java.awt.Color(51, 110, 123));
        lec4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec4ActionPerformed(evt);
            }
        });

        lec5.setBackground(new java.awt.Color(51, 110, 123));
        lec5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec5ActionPerformed(evt);
            }
        });

        lec6.setBackground(new java.awt.Color(51, 110, 123));
        lec6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec6ActionPerformed(evt);
            }
        });

        lec7.setBackground(new java.awt.Color(51, 110, 123));
        lec7.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec7ActionPerformed(evt);
            }
        });

        lec2.setBackground(new java.awt.Color(51, 110, 123));
        lec2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec2ActionPerformed(evt);
            }
        });

        lec1.setBackground(new java.awt.Color(51, 110, 123));
        lec1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec1ActionPerformed(evt);
            }
        });

        lec10.setBackground(new java.awt.Color(51, 110, 123));
        lec10.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec10ActionPerformed(evt);
            }
        });

        lec8.setBackground(new java.awt.Color(51, 110, 123));
        lec8.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec8ActionPerformed(evt);
            }
        });

        lec9.setBackground(new java.awt.Color(51, 110, 123));
        lec9.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lec9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lec9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lec9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lec10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lec1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lec2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(lec11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lec3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(lec12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lec4)
                        .addGap(34, 34, 34)
                        .addComponent(lec5)
                        .addGap(18, 18, 18)
                        .addComponent(lec6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lec7)
                        .addGap(34, 34, 34)
                        .addComponent(lec8)
                        .addGap(18, 18, 18)
                        .addComponent(lec9)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lec3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lec2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lec1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lec4)
                    .addComponent(lec5)
                    .addComponent(lec6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lec7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lec8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lec9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lec12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lec10)
                    .addComponent(lec11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        men_textfield.setBackground(new java.awt.Color(51, 110, 123));
        men_textfield.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        men_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        men_textfield.setText("12");
        men_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_textfieldActionPerformed(evt);
            }
        });

        mohadra1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        mohadra1.setForeground(new java.awt.Color(135, 54, 54));
        mohadra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mohadra1.setText("الحضور:");

        class_number_TextField5.setBackground(new java.awt.Color(51, 110, 123));
        class_number_TextField5.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        class_number_TextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        class_number_TextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_number_TextField5ActionPerformed(evt);
            }
        });

        gyab_textfield1.setBackground(new java.awt.Color(51, 110, 123));
        gyab_textfield1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        gyab_textfield1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gyab_textfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gyab_textfield1ActionPerformed(evt);
            }
        });

        gyab1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        gyab1.setForeground(new java.awt.Color(135, 54, 54));
        gyab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gyab1.setText("الغياب:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(gyab, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Atlasmeat_Lable4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attendance_Lable4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Print_Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(code_number_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(men_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(code_Lable4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(gyab_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(class_number_TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(581, 581, 581)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mohadra1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(First_Name_Lable1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(Searche_Name_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(Search_Button3))))
                    .addComponent(Manager_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(749, Short.MAX_VALUE)
                    .addComponent(gyab1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(608, 608, 608)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Searche_Name_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Firsst_Name_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(First_Name_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(code_number_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code_Lable4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(men_textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mohadra1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(class_number_TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gyab, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gyab_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atlasmeat_Lable4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendance_Lable4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Print_Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(Reeturn_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(334, 334, 334)
                    .addComponent(gyab1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(674, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Searche_Name_TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searche_Name_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Searche_Name_TextField1ActionPerformed

    private void code_number_TextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code_number_TextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_code_number_TextField4ActionPerformed

    private void men_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_men_textfieldActionPerformed

    private void ex7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex7ActionPerformed

    private void Reeturn_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reeturn_Button2ActionPerformed
        // TODO add your handling code here:
        Main_Page_Frame another =  new Main_Page_Frame();
        this.setVisible(false);
        another.setVisible(true);
    }//GEN-LAST:event_Reeturn_Button2ActionPerformed

    private void Print_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_Button4ActionPerformed
        // TODO add your handling code here:
        if(!class_number_TextField5.getText().equals("") & !gyab_textfield1.getText().equals("")){
        String path = "";
        JFileChooser jfile = new JFileChooser();
        jfile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int file =  jfile.showSaveDialog(this);
        if(file == JFileChooser.APPROVE_OPTION)
        {
            path = jfile.getSelectedFile().getPath();
        }
        
        try{
                Document doc = new Document();
                String name = new String (Firsst_Name_TextField2.getText());
                try{
                PdfWriter.getInstance(doc, new FileOutputStream(path+ "_report.pdf"));
                doc.open();
                doc.add(new Paragraph("                                                     [Student Report]   "+"\n"));
                doc.add(new Paragraph("=========================================================================="));
                doc.add(new Paragraph ("code : "+code_number_TextField4.getText()+"\n"));
                doc.add(new Paragraph ( "[exam1] : "+ex1.getText()+"\n"
                        +"[exam2] : "+ex2.getText()+"\n"+
                        "[exam3]   : "+ex3.getText()+"\n"+
                        "[exam4]   : "+ex4.getText()+"\n"+
                        "[exam5]  : "+ex5.getText()+"\n"+
                       "[exame6]  : "+ex6.getText()+"\n"+
                       "[exam7]   : "+ex7.getText()+"\n"+
                        "[exam8]   : "+ex8.getText()+"\n"+
                        "[exam9]   : "+ex9.getText()+"\n"+
                        "[exam10]  :"+ex10.getText()+"\n"+
                        "[exam11]  : "+ex11.getText()+"\n"+
                        "[exam12]    : "+ex12.getText()));
                doc.add(new Paragraph("==========================================================================" +"\n \n"));
                doc.add(new Paragraph("[ALHODOR ]: "+ class_number_TextField5.getText()+
                "                      [ALGYAP ] :"+ gyab_textfield1.getText()+
                    "                          [total ] :"+ men_textfield.getText()));
                doc.add(new Paragraph("=========================================================================="));
                
                doc.close();
                JOptionPane.showMessageDialog(null, "تم طباعه التقرير للطالب", "messege", 3);
                resetTextField();
                }catch(FileNotFoundException f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage(), "ERROR", 1);
                }
        }catch(DocumentException doc)
        {
            JOptionPane.showMessageDialog(null, "هناك خطاء", "ERRPR", 3);
        }
        }else
        {
            JOptionPane.showMessageDialog(null, "اكمل التقرير", "ERROR", 1);
        }
        
    }//GEN-LAST:event_Print_Button4ActionPerformed

    private void Search_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Button3ActionPerformed
        // TODO add your handling code here:
        if(Searche_Name_TextField1.getText().equals(""))
       {
           resetTextField();
           JOptionPane.showMessageDialog(null, "يجب ان تقوم بكتابه رقم الكود قبل ان تضغط علي ذر البحث!", "ERROR", 3);
       }else{
                String result =Searche_Name_TextField1.getText();
               int res = Integer.parseInt(result);
                   ResultSet re = null;
                   ResultSet re1 = null;
                   ResultSet re2 = null;
                   String name =  "name";
                   String clas = "class";
                   String code = "code";
                   String group = "group";
                   String exam = "ex1";
                   String exam1 = "ex2";
                   String exam2 = "ex3";
                   String exam3 = "ex4";
                   String exam4 = "ex5";
                   String exam5 = "ex6";
                   String exam6 = "ex7";
                   String exam7 = "ex8";
                   String exam8 = "ex9";
                   String exam9 = "ex10";
                   String exam10 = "ex11";
                   String exam11 = "ex12";
                   String lecture1 = "lecture";
                   String lecture2 = "lecture";
                   String lecture3 = "lecture";
                   String lece3 = "lec4";
                   String lece4 = "lec5";
                   String lece5 = "lec6";
                   String lece6 = "lec7";
                   String lece7 = "lec8";
                   String lece8 = "lec9";
                   String lece9 = "lec10";
                   String lece10 = "lec11";
                   String lece11 = "lec12";
               if(res >= 1000 && res < 2000)
               {
                   function f = new function();
                   function1_1 f1 = new function1_1();
                   function12_1 f2_1 = new function12_1();
                   re = f.find(result);
                   try {
                       if(re.next())
                       {
                           Firsst_Name_TextField2.setText(re.getString(name));
                            code_number_TextField4.setText(re.getString(code));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                       }
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }
                   re1 = f1.find1(result);
                   try {
                       if(re1.next())
                       {
                           
                            ex1.setText(re1.getString(exam));
                            ex2.setText(re1.getString(exam1));
                            ex3.setText(re1.getString(exam2));
                            ex4.setText(re1.getString(exam3));
                            ex5.setText(re1.getString(exam4));
                            ex6.setText(re1.getString(exam5));
                            ex7.setText(re1.getString(exam6));
                            ex8.setText(re1.getString(exam7));
                            ex9.setText(re1.getString(exam8));
                            ex10.setText(re1.getString(exam9));
                            ex11.setText(re1.getString(exam10));
                            ex12.setText(re1.getString(exam11));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                       }
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }
                   re2 = f2_1.find2_1(result);
                   try {
                      if(re2.next()){
                            lec1.setText(re2.getString(lecture1));
                            lec2.setText(re2.getString(lecture1));
                            lec3.setText(re2.getString(lecture1));
                      }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                       }
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }

                }else if(res >= 2000 && res <3000)
                {
                    function1 f = new function1();
                    function1_2 f1 = new function1_2();
                    function12_2 f2_1 = new function12_2();
                    re = f.find(result);
                   try {
                       if(re.next())
                       {
                           Firsst_Name_TextField2.setText(re.getString(name));
                           code_number_TextField4.setText(re.getString(code));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                            return;
                       }
                   } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }
                   re1 = f1.find2(result);
                   try {
                       if(re1.next())
                       {
                           
                            ex1.setText(re1.getString(exam));
                            ex2.setText(re1.getString(exam1));
                            ex3.setText(re1.getString(exam2));
                            ex4.setText(re1.getString(exam3));
                            ex5.setText(re1.getString(exam4));
                            ex6.setText(re1.getString(exam5));
                            ex7.setText(re1.getString(exam6));
                            ex8.setText(re1.getString(exam7));
                            ex9.setText(re1.getString(exam8));
                            ex10.setText(re1.getString(exam9));
                            ex11.setText(re1.getString(exam10));
                            ex12.setText(re1.getString(exam11));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                       }
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }
                   re2 = f2_1.find2_2(result);
                   try {
                       if(re2.next())
                       {
                           
//                            lec1.setText(re2.getString(lec));
//                           // lec2.setText(re2.getString(lece1));
//                            lec3.setText(re2.getString(lece2));
//                            lec4.setText(re2.getString(lece3));
//                            lec5.setText(re2.getString(lece4));
//                            lec6.setText(re2.getString(lece5));
//                            lec7.setText(re2.getString(lece6));
//                            lec8.setText(re2.getString(lece7));
//                            lec9.setText(re2.getString(lece8));
//                            lec10.setText(re2.getString(lece9));
//                            lec11.setText(re2.getString(lece10));
//                            lec12.setText(re2.getString(lece11));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                       }
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }
                }else if(res >= 3000)
                {
                   function2 f = new function2();
                   function1_3 f3 = new function1_3();
                   function2_3 fc =  new function2_3();
                   re = f.find(result);
                   try {
                       if(re.next())
                       {
                           Firsst_Name_TextField2.setText(re.getString(name));
                           code_number_TextField4.setText(re.getString(code));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                       }
                   } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }
                   re1 = f3.find3(result);
                   try {
                       if(re1.next())
                       {
                           
                            ex1.setText(re1.getString(exam));
                            ex2.setText(re1.getString(exam1));
                            ex3.setText(re1.getString(exam2));
                            ex4.setText(re1.getString(exam3));
                            ex5.setText(re1.getString(exam4));
                            ex6.setText(re1.getString(exam5));
                            ex7.setText(re1.getString(exam6));
                            ex8.setText(re1.getString(exam7));
                            ex9.setText(re1.getString(exam8));
                            ex10.setText(re1.getString(exam9));
                            ex11.setText(re1.getString(exam10));
                            ex12.setText(re1.getString(exam11));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                       }
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                   }
                   re2 = fc.find2_3(result);
                   try {
                       if(re2.next())
                       {
//                           
//                            lec1.setText(re2.getString(lec));
//                            //lec2.setText(re2.getString(lece1));
//                            lec3.setText(re2.getString(lece2));
//                            lec4.setText(re2.getString(lece3));
//                            lec5.setText(re2.getString(lece4));
//                            lec6.setText(re2.getString(lece5));
//                            lec7.setText(re2.getString(lece6));
//                            lec8.setText(re2.getString(lece7));
//                            lec9.setText(re2.getString(lece8));
//                            lec10.setText(re2.getString(lece9));
//                            lec11.setText(re2.getString(lece10));
//                            lec12.setText(re2.getString(lece11));
                       }else
                       {
                            JOptionPane.showMessageDialog(null, "لم يتم سجيل طالب بهذا الكود  ", "ERROR", 3);
                            resetTextField();
                       }
                   } catch (SQLException ex) {
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

    private void Print_Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Print_Button4MouseEntered
        Print_Button4.setBackground(Color.DARK_GRAY);
        Print_Button4.setOpaque(true);
    }//GEN-LAST:event_Print_Button4MouseEntered

    private void Print_Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Print_Button4MouseExited
        Print_Button4.setBackground(null);
        Print_Button4.setOpaque(false);
    }//GEN-LAST:event_Print_Button4MouseExited

    private void Reeturn_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseEntered
        Reeturn_Button2.setBackground(Color.DARK_GRAY);
        Reeturn_Button2.setOpaque(true);
    }//GEN-LAST:event_Reeturn_Button2MouseEntered

    private void Reeturn_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reeturn_Button2MouseExited
        Reeturn_Button2.setBackground(null);
        Reeturn_Button2.setOpaque(false);
    }//GEN-LAST:event_Reeturn_Button2MouseExited

    private void ex5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex5ActionPerformed

    private void ex6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex6ActionPerformed

    private void ex9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex9ActionPerformed

    private void ex8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex8ActionPerformed

    private void ex12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex12ActionPerformed

    private void ex10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex10ActionPerformed

    private void ex11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex11ActionPerformed

    private void ex3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex3ActionPerformed

    private void ex4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex4ActionPerformed

    private void ex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex2ActionPerformed

    private void ex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex1ActionPerformed

    private void lec12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec12ActionPerformed

    private void lec11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec11ActionPerformed

    private void lec10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec10ActionPerformed

    private void lec9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec9ActionPerformed

    private void lec8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec8ActionPerformed

    private void lec7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec7ActionPerformed

    private void lec6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec6ActionPerformed

    private void lec5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec5ActionPerformed

    private void lec4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec4ActionPerformed

    private void lec3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec3ActionPerformed

    private void lec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec2ActionPerformed

    private void class_number_TextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_number_TextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_class_number_TextField5ActionPerformed

    private void gyab_textfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gyab_textfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gyab_textfield1ActionPerformed

    private void lec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lec1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lec1ActionPerformed

    public class function
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           ResultSet re1 = null;
           PreparedStatement pr1 = null;
           public ResultSet find(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT `name`, `code` FROM `name_level1` WHERE code = ?";
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
     public class function1_1
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find1(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT `ex12`, `ex11`, `ex10`, `ex9`, `ex8`, `ex7`, "
                        + "`ex6`, `ex5`, `ex4`, `ex3`, `ex2`, `ex1` FROM `exam_level1` WHERE code = ?";
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
     public class function1_2
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find2(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT `ex12`, `ex11`, `ex10`, `ex9`, `ex8`, `ex7`, "
                        + "`ex6`, `ex5`, `ex4`, `ex3`, `ex2`, `ex1` FROM `exam_level2` WHERE code = ?";
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
     public class function1_3
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find3(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT `ex12`, `ex11`, `ex10`, `ex9`, `ex8`, `ex7`, "
                        + "`ex6`, `ex5`, `ex4`, `ex3`, `ex2`, `ex1` FROM `exam_level3` WHERE code = ?";
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
                String Query = "SELECT `name`, `code` FROM `name_level2` WHERE code = ?";
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
                String Query = "SELECT `name`, `code`FROM `name_level3` WHERE code = ?";
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
      public class function12_1
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find2_1(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT `lecture` FROM `storingattendance_level1` WHERE code = ?";
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
     public class function12_2
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find2_2(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT `lec12`, `lec11`, `lec10`, `lec9`, `lec8`, "
                        + "`lec7`, `lec6`, `lec5`, `lec4`, `lec3`, `lec2`, `lec1` FROM `attendance_level2` WHERE code = ?";
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
     public class function2_3
    {
           String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
           Connection conn = null;
           ResultSet re = null;
           PreparedStatement pr = null;
           public ResultSet find2_3(String s)
           {
               try{
                 conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                String Query = "SELECT `lec12`, `lec11`, `lec10`, `lec9`, `lec8`,"
                        + " `lec7`, `lec6`, `lec5`, `lec4`, `lec3`, `lec2`, `lec1` FROM `attendance_level3` WHERE code = ?";
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
      private void resetTextField()
    {
        Firsst_Name_TextField2.setText("");
        code_number_TextField4.setText("");
        gyab_textfield1.setText("");
        class_number_TextField5.setText("");
        Searche_Name_TextField1.setText("");
        ex1.setText("");
        ex2.setText("");
        ex3.setText("");
        ex4.setText("");
        ex5.setText("");
        ex6.setText("");
        ex7.setText("");
        ex8.setText("");
        ex9.setText("");
        ex10.setText("");
        ex11.setText("");
        ex12.setText("");
        lec1.setText("");
        lec2.setText("");
        lec3.setText("");
        lec4.setText("");
        lec5.setText("");
        lec6.setText("");
        lec7.setText("");
        lec8.setText("");
        lec9.setText("");
        lec10.setText("");
        lec11.setText("");
        lec12.setText("");
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
            java.util.logging.Logger.getLogger(Reports_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Student_Label;
    private javax.swing.JLabel Atlasmeat_Lable4;
    private javax.swing.JLabel CloseLabel1;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JTextField Firsst_Name_TextField2;
    private javax.swing.JLabel First_Name_Lable1;
    private javax.swing.JLabel ManagerLabel4;
    private javax.swing.JPanel Manager_Panel3;
    private javax.swing.JLabel MinusLabel4;
    private javax.swing.JButton Print_Button4;
    private javax.swing.JButton Reeturn_Button2;
    private javax.swing.JButton Search_Button3;
    private javax.swing.JTextField Searche_Name_TextField1;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JLabel attendance_Lable4;
    private javax.swing.JTextField class_number_TextField5;
    private javax.swing.JLabel code_Lable4;
    private javax.swing.JTextField code_number_TextField4;
    private javax.swing.JTextField ex1;
    private javax.swing.JTextField ex10;
    private javax.swing.JTextField ex11;
    private javax.swing.JTextField ex12;
    private javax.swing.JTextField ex2;
    private javax.swing.JTextField ex3;
    private javax.swing.JTextField ex4;
    private javax.swing.JTextField ex5;
    private javax.swing.JTextField ex6;
    private javax.swing.JTextField ex7;
    private javax.swing.JTextField ex8;
    private javax.swing.JTextField ex9;
    private javax.swing.JLabel gyab;
    private javax.swing.JLabel gyab1;
    private javax.swing.JTextField gyab_textfield1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lec1;
    private javax.swing.JTextField lec10;
    private javax.swing.JTextField lec11;
    private javax.swing.JTextField lec12;
    private javax.swing.JTextField lec2;
    private javax.swing.JTextField lec3;
    private javax.swing.JTextField lec4;
    private javax.swing.JTextField lec5;
    private javax.swing.JTextField lec6;
    private javax.swing.JTextField lec7;
    private javax.swing.JTextField lec8;
    private javax.swing.JTextField lec9;
    private javax.swing.JTextField men_textfield;
    private javax.swing.JLabel mohadra1;
    // End of variables declaration//GEN-END:variables
}
