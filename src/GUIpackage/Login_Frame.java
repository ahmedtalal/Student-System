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
public class Login_Frame extends javax.swing.JFrame {

    /**
     * Creates new form AnotherLogin
     */
    public Login_Frame() {
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

        jPanel2 = new javax.swing.JPanel();
        LoginPanel1 = new javax.swing.JPanel();
        MinusPanel = new javax.swing.JPanel();
        CloseLabel = new javax.swing.JLabel();
        LoginLabel2 = new javax.swing.JLabel();
        MinusLabel3 = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        Time_Label1 = new javax.swing.JLabel();
        Date_Label1 = new javax.swing.JLabel();
        UserNameLogin = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        UserNameLogin1 = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        Designed_Label = new javax.swing.JLabel();
        Password_Login_Field = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoginFrame");
        setUndecorated(true);

        LoginPanel1.setBackground(new java.awt.Color(1, 50, 67));

        MinusPanel.setBackground(new java.awt.Color(4, 132, 108));

        CloseLabel.setBackground(new java.awt.Color(108, 122, 137));
        CloseLabel.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
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

        LoginLabel2.setBackground(new java.awt.Color(108, 122, 137));
        LoginLabel2.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        LoginLabel2.setForeground(new java.awt.Color(67, 19, 19));
        LoginLabel2.setText("صفحه التسجيل");

        MinusLabel3.setBackground(new java.awt.Color(235, 151, 78));
        MinusLabel3.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
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

        LoginLabel.setBackground(new java.awt.Color(108, 122, 137));
        LoginLabel.setFont(new java.awt.Font("Serif", 3, 34)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(67, 19, 19));
        LoginLabel.setText("تطبيق الطالب");

        Time_Label1.setBackground(new java.awt.Color(108, 122, 137));
        Time_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Time_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Time_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Date_Label1.setBackground(new java.awt.Color(108, 122, 137));
        Date_Label1.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        Date_Label1.setForeground(new java.awt.Color(67, 19, 19));
        Date_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MinusPanelLayout = new javax.swing.GroupLayout(MinusPanel);
        MinusPanel.setLayout(MinusPanelLayout);
        MinusPanelLayout.setHorizontalGroup(
            MinusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MinusPanelLayout.createSequentialGroup()
                .addComponent(LoginLabel)
                .addGap(42, 42, 42)
                .addComponent(Date_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(LoginLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(Time_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(MinusLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(CloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MinusPanelLayout.setVerticalGroup(
            MinusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LoginLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Date_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CloseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MinusLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        UserNameLogin.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        UserNameLogin.setForeground(new java.awt.Color(135, 54, 54));
        UserNameLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameLogin.setText("الرقم السري :");

        UserNameTextField.setBackground(new java.awt.Color(51, 110, 123));
        UserNameTextField.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        UserNameTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        UserNameLogin1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        UserNameLogin1.setForeground(new java.awt.Color(135, 54, 54));
        UserNameLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameLogin1.setText("اسم المستخدم:");

        Login_Button.setBackground(new java.awt.Color(1, 50, 67));
        Login_Button.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        Login_Button.setForeground(new java.awt.Color(67, 19, 19));
        Login_Button.setText("تسجيل->");
        Login_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login_ButtonMouseExited(evt);
            }
        });
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        Designed_Label.setFont(new java.awt.Font("Serif", 3, 25)); // NOI18N
        Designed_Label.setForeground(new java.awt.Color(102, 102, 102));
        Designed_Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Designed_Label.setText("Designed by Eng : Ahmed Talal ||   M / 01065418129 && 01111077944"); // NOI18N
        Designed_Label.setToolTipText("");
        Designed_Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 108, 76), 2));
        Designed_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Designed_LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Designed_LabelMouseExited(evt);
            }
        });

        Password_Login_Field.setBackground(new java.awt.Color(51, 110, 123));
        Password_Login_Field.setFont(new java.awt.Font("Serif", 3, 28)); // NOI18N
        Password_Login_Field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout LoginPanel1Layout = new javax.swing.GroupLayout(LoginPanel1);
        LoginPanel1.setLayout(LoginPanel1Layout);
        LoginPanel1Layout.setHorizontalGroup(
            LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MinusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserNameTextField)
                    .addComponent(Password_Login_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameLogin1))
                .addGap(209, 209, 209))
            .addGroup(LoginPanel1Layout.createSequentialGroup()
                .addGroup(LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanel1Layout.createSequentialGroup()
                        .addGap(609, 609, 609)
                        .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(Designed_Label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanel1Layout.setVerticalGroup(
            LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanel1Layout.createSequentialGroup()
                .addComponent(MinusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addGroup(LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserNameLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password_Login_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Designed_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        Designed_Label.getAccessibleContext().setAccessibleName("Designed by Eng : Ahmed Talal ||  \n M / 01065418129 && 01111077944");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        // TODO add your handling code here:
         String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
               String url = "jdbc:mysql://localhost/";
              String db = "teacher";
             Connection conn = null;
              ResultSet re = null;
           PreparedStatement pr = null;
             String name = UserNameTextField.getText();
           String password = String.valueOf(Password_Login_Field.getPassword());
             try{
                     conn = DriverManager.getConnection(url+db+ unicode , "root", "");
                     String INSERT_QUERY = "SELECT `name`, `password` FROM `login`";
                     pr = conn.prepareStatement(INSERT_QUERY);
                     re = pr.executeQuery();
                   while(re.next()){  
                     if(password.equals(re.getString("password")) & name.equals(re.getString("name")))
                     {
                         JOptionPane.showMessageDialog(null, "login successfully ^_^");
                         Main_Page_Frame main = new Main_Page_Frame();
                         this.setVisible(false);
                         main.setVisible(true);
                     }else if(!name.equals(re.getString("name"))& password.equals(re.getString("password")))
                     {
                         JOptionPane.showMessageDialog(null, "هناك خطاء في اسم المستخدم حاول التسجيل مره ثانيه", "ERROR", 3);
                         UserNameTextField.setText("");
                     }else if(!password.equals(re.getString("password"))& name.equals(re.getString("name")))
                     {
                         JOptionPane.showMessageDialog(null, "هناك خطاء في  الرقم السري حاول التسجيل مره ثانيه", "ERROR", 3);
                         Password_Login_Field.setText("");
                     }else
                     {
                         JOptionPane.showMessageDialog(null, "الاسم والرقم السري عير صحيحين حاول التسجيل مره اخري", "ERROR", 3);
                         UserNameTextField.setText("");
                         Password_Login_Field.setText("");
                     }
                   }
             }catch(SQLException ex)
             {
                 JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 1);
             }
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Designed_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Designed_LabelMouseEntered
        // TODO add your handling code here:
        Designed_Label.setBackground(Color.DARK_GRAY);
        Designed_Label.setOpaque(true);
    }//GEN-LAST:event_Designed_LabelMouseEntered

    private void Designed_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Designed_LabelMouseExited
        // TODO add your handling code here:
        Designed_Label.setBackground(null);
        Designed_Label.setOpaque(false);
    }//GEN-LAST:event_Designed_LabelMouseExited

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

    private void Login_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_ButtonMouseEntered
          Login_Button.setBackground(Color.DARK_GRAY);
          Login_Button.setOpaque(true);
    }//GEN-LAST:event_Login_ButtonMouseEntered

    private void Login_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_ButtonMouseExited
          Login_Button.setBackground(null);
          Login_Button.setOpaque(false);
    }//GEN-LAST:event_Login_ButtonMouseExited

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
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseLabel;
    private javax.swing.JLabel Date_Label1;
    private javax.swing.JLabel Designed_Label;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel LoginLabel2;
    private javax.swing.JPanel LoginPanel1;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel MinusLabel3;
    private javax.swing.JPanel MinusPanel;
    private javax.swing.JPasswordField Password_Login_Field;
    private javax.swing.JLabel Time_Label1;
    private javax.swing.JLabel UserNameLogin;
    private javax.swing.JLabel UserNameLogin1;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
