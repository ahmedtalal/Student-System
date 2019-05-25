/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;

//import com.sun.glass.events.WindowEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
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
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author AhmedTalal
 */
public class Add_Student_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Add_Student_Frame
     */
    public Add_Student_Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        ShowDate();
        ShowTime();
    }

    void ShowDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        Date_Label1.setText(s.format(d));
    }

    void ShowTime() {
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

    //----------------------------
    // CONNECTION DATABASE >>>>"jdbc:mysql://localhost:3306/teacher"
    public Connection getConnection() {
        String unicode = "?useUnicode=yes&characterEncoding=UTF-8";
        String url = "jdbc:mysql://localhost/";
        String db = "teacher";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url + db + unicode, "root", "");
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Manager_Panel2 = new javax.swing.JPanel();
        Add_Student_Label = new javax.swing.JLabel();
        MinusLabel3 = new javax.swing.JLabel();
        CloseLabel = new javax.swing.JLabel();
        ManagerLabel3 = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        Time_Label1 = new javax.swing.JLabel();
        First_Name_Lable = new javax.swing.JLabel();
        Firsst_Name_TextField1 = new javax.swing.JTextField();
        Group_number_Lable1 = new javax.swing.JLabel();
        code_Number_Lable3 = new javax.swing.JLabel();
        Number_Code_TextField3 = new javax.swing.JTextField();
        Phone_Number_Lable2 = new javax.swing.JLabel();
        phone_Code_TextField4 = new javax.swing.JTextField();
        Return_Button1 = new javax.swing.JButton();
        Add_Button2 = new javax.swing.JButton();
        class_number_Lable3 = new javax.swing.JLabel();
        Class_number_ComboBox1 = new javax.swing.JComboBox<>();
        Class_number_Button1 = new javax.swing.JButton();
        group_number_ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));

        Manager_Panel2.setBackground(new java.awt.Color(22, 160, 133));

        Add_Student_Label.setBackground(new java.awt.Color(235, 151, 78));
        Add_Student_Label.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        Add_Student_Label.setForeground(new java.awt.Color(67, 19, 19));
        Add_Student_Label.setText("تطبيق الطالب");
        Add_Student_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_Student_LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_Student_LabelMouseExited(evt);
            }
        });

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
        ManagerLabel3.setText("صفحه اضافه الطالب");

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
                .addComponent(Add_Student_Label)
                .addGap(45, 45, 45)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ManagerLabel3)
                .addGap(68, 68, 68)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinusLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Manager_Panel2Layout.setVerticalGroup(
            Manager_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MinusLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Date_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Add_Student_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManagerLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        First_Name_Lable.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        First_Name_Lable.setForeground(new java.awt.Color(135, 54, 54));
        First_Name_Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        First_Name_Lable.setText("الاسم :");

        Firsst_Name_TextField1.setBackground(new java.awt.Color(51, 110, 123));
        Firsst_Name_TextField1.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Firsst_Name_TextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Group_number_Lable1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Group_number_Lable1.setForeground(new java.awt.Color(135, 54, 54));
        Group_number_Lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Group_number_Lable1.setText("المجموعه:");
        Group_number_Lable1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        code_Number_Lable3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        code_Number_Lable3.setForeground(new java.awt.Color(135, 54, 54));
        code_Number_Lable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code_Number_Lable3.setText("رقم الكود  :");

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

        phone_Code_TextField4.setBackground(new java.awt.Color(51, 110, 123));
        phone_Code_TextField4.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        phone_Code_TextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        phone_Code_TextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_Code_TextField4ActionPerformed(evt);
            }
        });

        Return_Button1.setBackground(new java.awt.Color(51, 110, 123));
        Return_Button1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Return_Button1.setForeground(new java.awt.Color(135, 54, 54));
        Return_Button1.setText("الرجوع");
        Return_Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Return_Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Return_Button1MouseExited(evt);
            }
        });
        Return_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_Button1ActionPerformed(evt);
            }
        });

        Add_Button2.setBackground(new java.awt.Color(51, 110, 123));
        Add_Button2.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Add_Button2.setForeground(new java.awt.Color(135, 54, 54));
        Add_Button2.setText("اضافه");
        Add_Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_Button2MouseExited(evt);
            }
        });
        Add_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Button2ActionPerformed(evt);
            }
        });

        class_number_Lable3.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        class_number_Lable3.setForeground(new java.awt.Color(135, 54, 54));
        class_number_Lable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        class_number_Lable3.setText("الصف     :");
        class_number_Lable3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        Class_number_ComboBox1.setBackground(new java.awt.Color(1, 50, 67));
        Class_number_ComboBox1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        Class_number_ComboBox1.setForeground(new java.awt.Color(135, 54, 54));
        Class_number_ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "اولي ثانوي ", "تانيه ثانوي", "تالته ثانوي" }));
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

        group_number_ComboBox.setBackground(new java.awt.Color(1, 50, 67));
        group_number_ComboBox.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        group_number_ComboBox.setForeground(new java.awt.Color(135, 54, 54));
        group_number_ComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manager_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Class_number_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(430, 430, 430))
                            .addComponent(Class_number_ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(group_number_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Return_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(259, 259, 259)
                                .addComponent(Add_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Firsst_Name_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone_Code_TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Phone_Number_Lable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(code_Number_Lable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(First_Name_Lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(class_number_Lable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Group_number_Lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Manager_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Firsst_Name_TextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(First_Name_Lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code_Number_Lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number_Code_TextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Phone_Number_Lable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phone_Code_TextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Class_number_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(class_number_Lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Class_number_ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(group_number_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Group_number_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Return_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinusLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(Login_Frame.ICONIFIED);
    }//GEN-LAST:event_MinusLabel3MouseClicked

    private void CloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLabelMouseClicked

    private void Number_Code_TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_Code_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Number_Code_TextField3ActionPerformed

    private void phone_Code_TextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_Code_TextField4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_phone_Code_TextField4ActionPerformed

    private void Return_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button1ActionPerformed
        // TODO add your handling code here:
        Main_Page_Frame another = new Main_Page_Frame();
        this.setVisible(false);
        another.setVisible(true);
    }//GEN-LAST:event_Return_Button1ActionPerformed

    private void Class_number_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_number_Button1ActionPerformed
        // String level1 = String.valueOf(Class_number_ComboBox1.toString());
            String unicode = "?useUnicode=yes&characterEncoding=UTF-8";
            String url = "jdbc:mysql://localhost/";
            String db = "teacher";
            Connection conn = null;
            ResultSet re = null;
            PreparedStatement pr = null;
             int code = 1;
        if (Class_number_ComboBox1.getSelectedItem().equals("اولي ثانوي ")) {
            group_number_ComboBox.addItem("السبت-الاتنين-الاربعاء -> 10.5 : 12");
            group_number_ComboBox.addItem("السبت-الاتنين-الاربعاء -> 12.5 : 2");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-> 3.5 : 5");
            try {
                conn = DriverManager.getConnection(url + db + unicode, "root", "");
                String Query = "SELECT MAX(code) FROM `name_level1`";
                pr = conn.prepareStatement(Query);
                re = pr.executeQuery();
                while(re.next())
                {
                    code = re.getInt(1) + 1;
                }
                Number_Code_TextField3.setText(String.valueOf(code));
                if(Integer.parseInt(Number_Code_TextField3.getText())>= 1000 
                  & Integer.parseInt(Number_Code_TextField3.getText())< 2000)
                {
                    Number_Code_TextField3.setEditable(false);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);

            }

        } else if (Class_number_ComboBox1.getSelectedItem().equals("تانيه ثانوي")) {
            Number_Code_TextField3.setEditable(true);
            group_number_ComboBox.addItem("السبت-الاتنين-الاربعاء -> 3.5 : 5");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-> 5 : 6.5");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-> 12.5 : 2");
                try {
                conn = DriverManager.getConnection(url + db + unicode, "root", "");
                String Query = "SELECT MAX(code) FROM `name_level2`";
                pr = conn.prepareStatement(Query);
                re = pr.executeQuery();
                while(re.next())
                {
                    code = re.getInt(1) + 1;
                }
                Number_Code_TextField3.setText(String.valueOf(code));
                if(Integer.parseInt(Number_Code_TextField3.getText())>= 2000 &
                    Integer.parseInt(Number_Code_TextField3.getText())< 3000    )
                {
                    Number_Code_TextField3.setEditable(false);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);

            }
        } else {
            Number_Code_TextField3.setEditable(true);
            group_number_ComboBox.addItem("السبت-الاتنين-الاربعاء -> 2 : 3.5");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-> 2 : 3.5");
            group_number_ComboBox.addItem("الاحد-التلات-الخميس-> 10.5 : 12");
            try {
                conn = DriverManager.getConnection(url + db + unicode, "root", "");
                String Query = "SELECT MAX(code) FROM `name_level3`";
                pr = conn.prepareStatement(Query);
                re = pr.executeQuery();
                while(re.next())
                {
                    code = re.getInt(1) + 1;
                }
                Number_Code_TextField3.setText(String.valueOf(code));
                if(Integer.parseInt(Number_Code_TextField3.getText())> 3000)
                {
                    Number_Code_TextField3.setEditable(false);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);

            }
        }
    }//GEN-LAST:event_Class_number_Button1ActionPerformed

    private void Add_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Button2ActionPerformed
        // TODO add your handling code here:
        String name =Firsst_Name_TextField1.getText().toString();
        
        String code = Number_Code_TextField3.getText();
        String phone = phone_Code_TextField4.getText();
        String classes = (String) Class_number_ComboBox1.getSelectedItem();
        String group = (String) group_number_ComboBox.getSelectedItem();

        String result = phone_Code_TextField4.getText();
        int sum = 0;
        String Etisalat = "011";
        String Vodafone = "010";
        String Orange = "012";
        String We = "015";
        for (int i = 0; i < result.length(); i++) {
            sum++;
        }
        if (Firsst_Name_TextField1.getText().equals("") || phone_Code_TextField4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك قم بتكميل بيانات الطالب لكي يتم اضافه!");
        } else if ((sum < 11 || sum > 11) || !(result.substring(0, 3).equals(Etisalat)
                || result.substring(0, 3).equals(Vodafone) || result.substring(0, 3).equals(Orange)
                || result.substring(0, 3).equals(We))) {
            JOptionPane.showMessageDialog(null, "1-يجب ان يكون رقم التليفون مكون من 11 رقم  \n"
                    + "2- اول ثلاث ارقام يجب ان يكونو 010 او 011 او 012 او 015  ", "PhoneException", 1);
        } else {

            if (Class_number_ComboBox1.getSelectedItem().equals("اولي ثانوي ")) {
                try {
                    Connection connect = getConnection();
                    Statement stmt;
                    stmt = (Statement) connect.createStatement();
                    Statement stmt1;
                    stmt1 = (Statement) connect.createStatement();
                    Statement stmt2;
                    stmt2 = (Statement) connect.createStatement();
                    Statement stmt3;
                    stmt3 = (Statement) connect.createStatement();
                    String INSERT_QUERY = " INSERT INTO `name_level1`(`name`,`code`,`phone`, `class`, `group`)VALUES ('" + name + "','" +code+ "','" + phone + "','" + classes + "','" + group + "')";
                    String Query = "INSERT INTO `attendance_level1`(`name`, `code`)VALUES ('" + name + "','" + code+"')";
                    String Query1 = "INSERT INTO `exam_level1`(`name`, `code`)VALUES ('" + name + "','" + code + "')";
                    String Query2 = "INSERT INTO `money_level1`(`name`, `code`, `class` )VALUES ('" + name + "','" + code + "','"+classes + "')";
                    stmt.executeUpdate(INSERT_QUERY);
                    stmt1.executeUpdate(Query);
                    stmt2.executeUpdate(Query1);
                    stmt3.executeUpdate(Query2);
                    JOptionPane.showMessageDialog(null, "تم تخزين الطالب بنجاح");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                }
            } else if (Class_number_ComboBox1.getSelectedItem().equals("تانيه ثانوي")) {
                try {
                    Connection connect = getConnection();
                    Statement stmt;
                    stmt = (Statement) connect.createStatement();
                    Statement stmt1;
                    stmt1 = (Statement) connect.createStatement();
                    Statement stmt2;
                    stmt2 = (Statement) connect.createStatement();
                    Statement stmt3;
                    stmt3 = (Statement) connect.createStatement();
                    String INSERT_QUERY = " INSERT INTO `name_level2`(`name`, `code`, `phone`, `class`, `group`)VALUES ('" + name + "','" + code + "','" + phone + "','" + classes + "','" + group + "')";
                    String Query1 = "INSERT INTO `attendance_level2`(`name`, `code`)VALUES ('" + name + "','" + code + "')";
                    String Query2 = "INSERT INTO `exam_level2`(`name`, `code`)VALUES ('" + name + "','" + code + "')";
                    String Query3 = "INSERT INTO `money_level2`(`name`, `code`, `class` )VALUES ('" + name + "','" + code + "','"+classes + "')";
                    stmt.executeUpdate(INSERT_QUERY);
                    stmt1.executeUpdate(Query1);
                    stmt2.executeUpdate(Query2);
                    stmt3.executeUpdate(Query3);
                    JOptionPane.showMessageDialog(null, "تم تخزين الطالب بنجاح");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                }
            } else {
                try {
                    Connection connect = getConnection();
                    Statement stmt;
                    stmt = (Statement) connect.createStatement();
                    Statement stmt1;
                    stmt1 = (Statement) connect.createStatement();
                    Statement stmt2;
                    stmt2 = (Statement) connect.createStatement();
                    Statement stmt3;
                    stmt3 = (Statement) connect.createStatement();
                    String INSERT_QUERY = " INSERT INTO `name_level3`(`name`, `code`, `phone`, `class`, `group`)VALUES ('" + name + "','" + code + "','" + phone + "','" + classes + "','" + group + "')";
                    String Query1 = "INSERT INTO `attendance_level3`(`name`, `code`)VALUES ('" + name + "','" + code + "')";
                    String Query2 = "INSERT INTO `exam_level3`(`name`, `code`)VALUES ('" + name + "','" + code + "')";
                    String Query3 = "INSERT INTO `money_level3`(`name`, `code`, `class` )VALUES ('" + name + "','" + code + "','"+classes + "')";
                    stmt.executeUpdate(INSERT_QUERY);
                    stmt1.executeUpdate(Query1);
                    stmt2.executeUpdate(Query2);
                    stmt3.executeUpdate(Query3);
                    JOptionPane.showMessageDialog(null, "تم تخزين الطالب بنجاح");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 3);
                }
            }
            textFiledesEmpty();
        }
    }//GEN-LAST:event_Add_Button2ActionPerformed

    private void Add_Student_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Student_LabelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Student_LabelMouseEntered

    private void Add_Student_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Student_LabelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Student_LabelMouseExited

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

    private void Return_Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Return_Button1MouseEntered
        Return_Button1.setBackground(Color.DARK_GRAY);
        Return_Button1.setOpaque(true);
    }//GEN-LAST:event_Return_Button1MouseEntered

    private void Return_Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Return_Button1MouseExited
        Return_Button1.setBackground(null);
        Return_Button1.setOpaque(false);
    }//GEN-LAST:event_Return_Button1MouseExited

    private void Class_number_Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class_number_Button1MouseEntered
        Class_number_Button1.setBackground(Color.DARK_GRAY);
        Class_number_Button1.setOpaque(true);
    }//GEN-LAST:event_Class_number_Button1MouseEntered

    private void Class_number_Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class_number_Button1MouseExited
        Class_number_Button1.setBackground(null);
        Class_number_Button1.setOpaque(false);
    }//GEN-LAST:event_Class_number_Button1MouseExited

    private void Add_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Button2MouseEntered
        Add_Button2.setBackground(Color.DARK_GRAY);
        Add_Button2.setOpaque(true);
    }//GEN-LAST:event_Add_Button2MouseEntered

    private void Add_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Button2MouseExited
        Add_Button2.setBackground(null);
        Add_Button2.setOpaque(false);
    }//GEN-LAST:event_Add_Button2MouseExited

// implemmentation function make textfieldes is empty
    private void textFiledesEmpty() {
        Firsst_Name_TextField1.setText("");
        Number_Code_TextField3.setText("");
        phone_Code_TextField4.setText("");
        group_number_ComboBox.removeAllItems();
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
            java.util.logging.Logger.getLogger(Add_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Student_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Student_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button2;
    private javax.swing.JLabel Add_Student_Label;
    private javax.swing.JButton Class_number_Button1;
    private javax.swing.JComboBox<String> Class_number_ComboBox1;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JTextField Firsst_Name_TextField1;
    private javax.swing.JLabel First_Name_Lable;
    private javax.swing.JLabel Group_number_Lable1;
    private javax.swing.JLabel ManagerLabel3;
    private javax.swing.JPanel Manager_Panel2;
    private javax.swing.JLabel MinusLabel3;
    private javax.swing.JTextField Number_Code_TextField3;
    private javax.swing.JLabel Phone_Number_Lable2;
    private javax.swing.JButton Return_Button1;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JLabel class_number_Lable3;
    private javax.swing.JLabel code_Number_Lable3;
    private javax.swing.JComboBox<String> group_number_ComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phone_Code_TextField4;
    // End of variables declaration//GEN-END:variables
}
