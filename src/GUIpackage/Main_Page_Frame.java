/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author AhmedTalal
 */
public class Main_Page_Frame extends javax.swing.JFrame {

    /**
     * Creates new form AnotherManagerFrame
     */
    public Main_Page_Frame() {
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

        Manger_Panel1 = new javax.swing.JPanel();
        header_Panel2 = new javax.swing.JPanel();
        ManagerLabel = new javax.swing.JLabel();
        MinusLabel3 = new javax.swing.JLabel();
        CloseLabel = new javax.swing.JLabel();
        ManagerLabel3 = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        Time_Label1 = new javax.swing.JLabel();
        Delete_Student_Button = new javax.swing.JButton();
        Search_Student_Button = new javax.swing.JButton();
        Add_Student_Button2 = new javax.swing.JButton();
        ListOf_Student_Button = new javax.swing.JButton();
        Update_Student_Button2 = new javax.swing.JButton();
        Payment_Money_Button5 = new javax.swing.JButton();
        Talk_Absense_Button2 = new javax.swing.JButton();
        MakeReport_Student_Button4 = new javax.swing.JButton();
        emergency_button = new javax.swing.JButton();
        Take_Altasmeat_Button3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Manger_Panel1.setBackground(new java.awt.Color(1, 50, 67));

        header_Panel2.setBackground(new java.awt.Color(22, 160, 133));

        ManagerLabel.setBackground(new java.awt.Color(235, 151, 78));
        ManagerLabel.setFont(new java.awt.Font("Serif", 3, 38)); // NOI18N
        ManagerLabel.setForeground(new java.awt.Color(51, 36, 36));
        ManagerLabel.setText("تطبيق الطالب");

        MinusLabel3.setBackground(new java.awt.Color(235, 151, 78));
        MinusLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MinusLabel3.setForeground(new java.awt.Color(51, 36, 36));
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
        CloseLabel.setForeground(new java.awt.Color(51, 36, 36));
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
        ManagerLabel3.setForeground(new java.awt.Color(51, 36, 36));
        ManagerLabel3.setText("الصفحه_الرئيسيه ");

        Date_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(51, 36, 36));
        Date_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Time_Label1.setBackground(new java.awt.Color(235, 151, 78));
        Time_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_Label1.setForeground(new java.awt.Color(51, 36, 36));
        Time_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout header_Panel2Layout = new javax.swing.GroupLayout(header_Panel2);
        header_Panel2.setLayout(header_Panel2Layout);
        header_Panel2Layout.setHorizontalGroup(
            header_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_Panel2Layout.createSequentialGroup()
                .addComponent(ManagerLabel)
                .addGap(62, 62, 62)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(ManagerLabel3)
                .addGap(113, 113, 113)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MinusLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(CloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_Panel2Layout.setVerticalGroup(
            header_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManagerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(ManagerLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Date_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MinusLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CloseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Delete_Student_Button.setBackground(new java.awt.Color(5, 72, 96));
        Delete_Student_Button.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        Delete_Student_Button.setForeground(new java.awt.Color(67, 19, 19));
        Delete_Student_Button.setText("حذف_طالب");
        Delete_Student_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_Student_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Delete_Student_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Delete_Student_ButtonMouseExited(evt);
            }
        });
        Delete_Student_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Student_ButtonActionPerformed(evt);
            }
        });

        Search_Student_Button.setBackground(new java.awt.Color(5, 72, 96));
        Search_Student_Button.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        Search_Student_Button.setForeground(new java.awt.Color(67, 19, 19));
        Search_Student_Button.setText("البحث_عن_طالب");
        Search_Student_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search_Student_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_Student_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_Student_ButtonMouseExited(evt);
            }
        });
        Search_Student_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Student_ButtonActionPerformed(evt);
            }
        });

        Add_Student_Button2.setBackground(new java.awt.Color(5, 72, 96));
        Add_Student_Button2.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        Add_Student_Button2.setForeground(new java.awt.Color(67, 19, 19));
        Add_Student_Button2.setText("اضافه _طالب");
        Add_Student_Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Student_Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Add_Student_Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Add_Student_Button2MouseExited(evt);
            }
        });
        Add_Student_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Student_Button2ActionPerformed(evt);
            }
        });

        ListOf_Student_Button.setBackground(new java.awt.Color(5, 72, 96));
        ListOf_Student_Button.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        ListOf_Student_Button.setForeground(new java.awt.Color(67, 19, 19));
        ListOf_Student_Button.setText("عرض الجداول");
        ListOf_Student_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListOf_Student_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListOf_Student_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListOf_Student_ButtonMouseExited(evt);
            }
        });
        ListOf_Student_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOf_Student_ButtonActionPerformed(evt);
            }
        });

        Update_Student_Button2.setBackground(new java.awt.Color(5, 72, 96));
        Update_Student_Button2.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        Update_Student_Button2.setForeground(new java.awt.Color(67, 19, 19));
        Update_Student_Button2.setText("تحديث _طالب");
        Update_Student_Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update_Student_Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update_Student_Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update_Student_Button2MouseExited(evt);
            }
        });
        Update_Student_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Student_Button2ActionPerformed(evt);
            }
        });

        Payment_Money_Button5.setBackground(new java.awt.Color(5, 72, 96));
        Payment_Money_Button5.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        Payment_Money_Button5.setForeground(new java.awt.Color(67, 19, 19));
        Payment_Money_Button5.setText("دفع_المبلغ");
        Payment_Money_Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Payment_Money_Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Payment_Money_Button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Payment_Money_Button5MouseExited(evt);
            }
        });
        Payment_Money_Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payment_Money_Button5ActionPerformed(evt);
            }
        });

        Talk_Absense_Button2.setBackground(new java.awt.Color(5, 72, 96));
        Talk_Absense_Button2.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        Talk_Absense_Button2.setForeground(new java.awt.Color(67, 19, 19));
        Talk_Absense_Button2.setText("حضور _الطالب");
        Talk_Absense_Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Talk_Absense_Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Talk_Absense_Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Talk_Absense_Button2MouseExited(evt);
            }
        });
        Talk_Absense_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Talk_Absense_Button2ActionPerformed(evt);
            }
        });

        MakeReport_Student_Button4.setBackground(new java.awt.Color(5, 72, 96));
        MakeReport_Student_Button4.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        MakeReport_Student_Button4.setForeground(new java.awt.Color(67, 19, 19));
        MakeReport_Student_Button4.setText("تقرير_الطالب");
        MakeReport_Student_Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MakeReport_Student_Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MakeReport_Student_Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MakeReport_Student_Button4MouseExited(evt);
            }
        });
        MakeReport_Student_Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeReport_Student_Button4ActionPerformed(evt);
            }
        });

        emergency_button.setBackground(new java.awt.Color(5, 72, 96));
        emergency_button.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        emergency_button.setForeground(new java.awt.Color(67, 19, 19));
        emergency_button.setText("نهايه السنه");
        emergency_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emergency_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emergency_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emergency_buttonMouseExited(evt);
            }
        });
        emergency_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergency_buttonActionPerformed(evt);
            }
        });

        Take_Altasmeat_Button3.setBackground(new java.awt.Color(5, 72, 96));
        Take_Altasmeat_Button3.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        Take_Altasmeat_Button3.setForeground(new java.awt.Color(67, 19, 19));
        Take_Altasmeat_Button3.setText("رصد الدراجات ");
        Take_Altasmeat_Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Take_Altasmeat_Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Take_Altasmeat_Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Take_Altasmeat_Button3MouseExited(evt);
            }
        });
        Take_Altasmeat_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Take_Altasmeat_Button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Manger_Panel1Layout = new javax.swing.GroupLayout(Manger_Panel1);
        Manger_Panel1.setLayout(Manger_Panel1Layout);
        Manger_Panel1Layout.setHorizontalGroup(
            Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Manger_Panel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Manger_Panel1Layout.createSequentialGroup()
                        .addComponent(Add_Student_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Manger_Panel1Layout.createSequentialGroup()
                        .addGroup(Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MakeReport_Student_Button4, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(ListOf_Student_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76)))
                .addGroup(Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Search_Student_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete_Student_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Payment_Money_Button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addGroup(Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Update_Student_Button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(Talk_Absense_Button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Take_Altasmeat_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Manger_Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(emergency_button, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        Manger_Panel1Layout.setVerticalGroup(
            Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manger_Panel1Layout.createSequentialGroup()
                .addComponent(header_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Student_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_Student_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_Student_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Search_Student_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(Talk_Absense_Button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MakeReport_Student_Button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126)
                .addGroup(Manger_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ListOf_Student_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(Payment_Money_Button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Take_Altasmeat_Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(emergency_button, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manger_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Manger_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void Update_Student_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Student_Button2ActionPerformed
        // TODO add your handling code here:
        update_Student_Frame update = new update_Student_Frame();
        this.setVisible(false);
        update.setVisible(true);
    }//GEN-LAST:event_Update_Student_Button2ActionPerformed

    private void emergency_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergency_buttonActionPerformed
        // TODO add your handling code here:
        emeregency_frame eaxm = new emeregency_frame();
        this.setVisible(false);
        eaxm.setVisible(true);
        JOptionPane.showMessageDialog(null, "هذا الذرار لا تستخدمه الا عند نهايه  السنه الدراسيه لجميع المراحل الثانويه لكي يتم حذف جميع الطلاب من التطبيق وتخزين طلاب السنه الجديده ");
    }//GEN-LAST:event_emergency_buttonActionPerformed

    private void Add_Student_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Student_Button2ActionPerformed
        // TODO add your handling code here:
        Add_Student_Frame add = new Add_Student_Frame();
        this.setVisible(false);
        add.setVisible(true);
    }//GEN-LAST:event_Add_Student_Button2ActionPerformed

    private void Delete_Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Student_ButtonActionPerformed
        // TODO add your handling code here:
        Delete_Student_Frame del =  new Delete_Student_Frame();
        this.setVisible(false);
        del.setVisible(true);
    }//GEN-LAST:event_Delete_Student_ButtonActionPerformed

    private void Search_Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Student_ButtonActionPerformed
        // TODO add your handling code here:
        Search_Student_Frame search = new Search_Student_Frame();
        this.setVisible(false);
        search.setVisible(true);
    }//GEN-LAST:event_Search_Student_ButtonActionPerformed

    private void Talk_Absense_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Talk_Absense_Button2ActionPerformed
        // TODO add your handling code here:
        Attendance_student_frame attend = new Attendance_student_frame();
        this.setVisible(false);
        attend.setVisible(true);
    }//GEN-LAST:event_Talk_Absense_Button2ActionPerformed

    private void ListOf_Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOf_Student_ButtonActionPerformed
        // TODO add your handling code here:
        List_Student_Frame list = new List_Student_Frame();
        this.setVisible(false);
        list.setVisible(true);
    }//GEN-LAST:event_ListOf_Student_ButtonActionPerformed

    private void MakeReport_Student_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeReport_Student_Button4ActionPerformed
        // TODO add your handling code here:
        Reports_Frame report = new Reports_Frame();
        this.setVisible(false);
        report.setVisible(true);
    }//GEN-LAST:event_MakeReport_Student_Button4ActionPerformed

    private void Payment_Money_Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payment_Money_Button5ActionPerformed
        // TODO add your handling code here:
        payment_Money_frame payment = new payment_Money_frame();
        this.setVisible(false);
        payment.setVisible(true);
    }//GEN-LAST:event_Payment_Money_Button5ActionPerformed

    private void Add_Student_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Student_Button2MouseEntered
        Add_Student_Button2.setBackground(Color.darkGray);
        Add_Student_Button2.setOpaque(true);
    }//GEN-LAST:event_Add_Student_Button2MouseEntered

    private void Add_Student_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Student_Button2MouseExited
        Add_Student_Button2.setBackground(null);
        Add_Student_Button2.setOpaque(false);
    }//GEN-LAST:event_Add_Student_Button2MouseExited

    private void MakeReport_Student_Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MakeReport_Student_Button4MouseEntered
        MakeReport_Student_Button4.setBackground(Color.darkGray);
        MakeReport_Student_Button4.setOpaque(true);
    }//GEN-LAST:event_MakeReport_Student_Button4MouseEntered

    private void MakeReport_Student_Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MakeReport_Student_Button4MouseExited
        MakeReport_Student_Button4.setBackground(null);
        MakeReport_Student_Button4.setOpaque(false);
    }//GEN-LAST:event_MakeReport_Student_Button4MouseExited

    private void ListOf_Student_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListOf_Student_ButtonMouseEntered
        ListOf_Student_Button.setBackground(Color.darkGray);
        ListOf_Student_Button.setOpaque(true);
    }//GEN-LAST:event_ListOf_Student_ButtonMouseEntered

    private void ListOf_Student_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListOf_Student_ButtonMouseExited
        ListOf_Student_Button.setBackground(null);
        ListOf_Student_Button.setOpaque(false);
    }//GEN-LAST:event_ListOf_Student_ButtonMouseExited

    private void Delete_Student_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_Student_ButtonMouseEntered
        Delete_Student_Button.setBackground(Color.darkGray);
        Delete_Student_Button.setOpaque(true);
    }//GEN-LAST:event_Delete_Student_ButtonMouseEntered

    private void Delete_Student_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_Student_ButtonMouseExited
        Delete_Student_Button.setBackground(null);
        Delete_Student_Button.setOpaque(false);
    }//GEN-LAST:event_Delete_Student_ButtonMouseExited

    private void Search_Student_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Student_ButtonMouseEntered
        Search_Student_Button.setBackground(Color.darkGray);
        Search_Student_Button.setOpaque(true);
    }//GEN-LAST:event_Search_Student_ButtonMouseEntered

    private void Search_Student_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Student_ButtonMouseExited
       Search_Student_Button.setBackground(null);
        Search_Student_Button.setOpaque(false);
    }//GEN-LAST:event_Search_Student_ButtonMouseExited

    private void Payment_Money_Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payment_Money_Button5MouseEntered
        Payment_Money_Button5.setBackground(Color.darkGray);
        Payment_Money_Button5.setOpaque(true);
    }//GEN-LAST:event_Payment_Money_Button5MouseEntered

    private void Payment_Money_Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payment_Money_Button5MouseExited
        Payment_Money_Button5.setBackground(null);
        Payment_Money_Button5.setOpaque(false);
    }//GEN-LAST:event_Payment_Money_Button5MouseExited

    private void emergency_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergency_buttonMouseEntered
        emergency_button.setBackground(Color.darkGray);
        emergency_button.setOpaque(true);
    }//GEN-LAST:event_emergency_buttonMouseEntered

    private void emergency_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emergency_buttonMouseExited
        emergency_button.setBackground(null);
        emergency_button.setOpaque(false);
    }//GEN-LAST:event_emergency_buttonMouseExited

    private void Talk_Absense_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Talk_Absense_Button2MouseEntered
        Talk_Absense_Button2.setBackground(Color.darkGray);
        Talk_Absense_Button2.setOpaque(true);
    }//GEN-LAST:event_Talk_Absense_Button2MouseEntered

    private void Talk_Absense_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Talk_Absense_Button2MouseExited
        Talk_Absense_Button2.setBackground(null);
        Talk_Absense_Button2.setOpaque(false);
    }//GEN-LAST:event_Talk_Absense_Button2MouseExited

    private void Update_Student_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_Student_Button2MouseEntered
        Update_Student_Button2.setBackground(Color.darkGray);
        Update_Student_Button2.setOpaque(true);
    }//GEN-LAST:event_Update_Student_Button2MouseEntered

    private void Update_Student_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_Student_Button2MouseExited
        Update_Student_Button2.setBackground(null);
        Update_Student_Button2.setOpaque(false);
    }//GEN-LAST:event_Update_Student_Button2MouseExited

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

    private void Take_Altasmeat_Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Take_Altasmeat_Button3MouseEntered
        Take_Altasmeat_Button3.setBackground(Color.darkGray);
        Take_Altasmeat_Button3.setOpaque(true);
    }//GEN-LAST:event_Take_Altasmeat_Button3MouseEntered

    private void Take_Altasmeat_Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Take_Altasmeat_Button3MouseExited
       Take_Altasmeat_Button3.setBackground(null);
       Take_Altasmeat_Button3.setOpaque(false);
    }//GEN-LAST:event_Take_Altasmeat_Button3MouseExited

    private void Take_Altasmeat_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Take_Altasmeat_Button3ActionPerformed
       exames_tasmeat_frame ex =  new exames_tasmeat_frame();
       this.setVisible(false);
       ex.setVisible(true);
    }//GEN-LAST:event_Take_Altasmeat_Button3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Page_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Page_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Page_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Page_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        
        
//        try {
//            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
//        } catch (Exception ee) {
//            JOptionPane.showConfirmDialog(null, ee);
//        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Page_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Student_Button2;
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JButton Delete_Student_Button;
    private javax.swing.JButton ListOf_Student_Button;
    private javax.swing.JButton MakeReport_Student_Button4;
    private javax.swing.JLabel ManagerLabel;
    private javax.swing.JLabel ManagerLabel3;
    private javax.swing.JPanel Manger_Panel1;
    private javax.swing.JLabel MinusLabel3;
    private javax.swing.JButton Payment_Money_Button5;
    private javax.swing.JButton Search_Student_Button;
    private javax.swing.JButton Take_Altasmeat_Button3;
    private javax.swing.JButton Talk_Absense_Button2;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JButton Update_Student_Button2;
    private javax.swing.JButton emergency_button;
    private javax.swing.JPanel header_Panel2;
    // End of variables declaration//GEN-END:variables
}
