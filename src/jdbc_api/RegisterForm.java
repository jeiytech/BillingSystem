/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_api;

import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author HP
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2Close = new javax.swing.JLabel();
        jLabel3Min = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1Register = new javax.swing.JButton();
        jButton2cancel = new javax.swing.JButton();
        passwd = new javax.swing.JPasswordField();
        addr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        eMail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Signup");

        jLabel2Close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2Close.setText("X");
        jLabel2Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2CloseMouseClicked(evt);
            }
        });

        jLabel3Min.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3Min.setText("-");
        jLabel3Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(198, 198, 198)
                .addComponent(jLabel3Min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2Close, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2Close)
                    .addComponent(jLabel3Min))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Firstname:");

        fName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Lastname:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Age:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Password:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Email:");

        lName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });

        age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Username:");

        uName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Address:");

        jButton1Register.setBackground(new java.awt.Color(51, 153, 255));
        jButton1Register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1Register.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Register.setText("Sign Up");
        jButton1Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1RegisterMouseClicked(evt);
            }
        });
        jButton1Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegisterActionPerformed(evt);
            }
        });

        jButton2cancel.setBackground(new java.awt.Color(0, 51, 51));
        jButton2cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton2cancel.setText("Cancel");
        jButton2cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2cancelMouseClicked(evt);
            }
        });
        jButton2cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2cancelActionPerformed(evt);
            }
        });

        passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdActionPerformed(evt);
            }
        });

        addr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("Click here to login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        eMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fName)
                            .addComponent(lName)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(age)
                                    .addComponent(uName)
                                    .addComponent(passwd)
                                    .addComponent(eMail)
                                    .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1Register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(eMail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addr))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1Register)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MinMouseClicked
       this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MinMouseClicked

    private void jLabel2CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2CloseMouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel2CloseMouseClicked

    private void addrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrActionPerformed

    private void passwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwdActionPerformed

    private void jButton2cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2cancelActionPerformed

    private void jButton2cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2cancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton2cancelMouseClicked

    private void jButton1RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegisterActionPerformed
        // TODO add your handling code here:
        
        String f_name = fName.getText();
        String l_name = lName.getText();
        String a_ge = age.getText();
        String pass_wd = String.valueOf(passwd.getPassword());
        String e_mail = eMail.getText();
        String u_name = uName.getText();
        String address = addr.getText();
        
        if(f_name.isEmpty() || l_name.isEmpty() || a_ge.isEmpty() || pass_wd.isEmpty() || e_mail.isEmpty() || u_name.isEmpty() || address.isEmpty()){
            JOptionPane.showMessageDialog(this, "Form field cannot be empty...!", "Invalid", JOptionPane.INFORMATION_MESSAGE);
        }else{
            intoDatabase(f_name, l_name, a_ge, pass_wd, e_mail, u_name, address);
            clear();
        }

        
    }//GEN-LAST:event_jButton1RegisterActionPerformed

    private void jButton1RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1RegisterMouseClicked
        RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1RegisterMouseClicked

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        LoginForm obj = new LoginForm();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eMailActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new RegisterForm().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr;
    private javax.swing.JTextField age;
    private javax.swing.JTextField eMail;
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Register;
    private javax.swing.JButton jButton2cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2Close;
    private javax.swing.JLabel jLabel3Min;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lName;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JTextField uName;
    // End of variables declaration//GEN-END:variables

    private void intoDatabase(String f_name, String l_name, String a_ge, String pass_wd, String e_mail, String u_name, String address) {
    
        Connection conn = javaConnect.connect();
        if(conn != null){
            try{
            PreparedStatement stmt = (PreparedStatement)
                    conn.prepareStatement("INSERT INTO signupDetails(FNAME, LNAME, AGE, PASSWD, EMAIL, UNAME, ADDR) VALUES(?,?,?,?,?,?,?)");
                    stmt.setString(1, f_name);
                    stmt.setString(2, l_name);
                    stmt.setString(3, a_ge);
                    stmt.setString(4, pass_wd);
                    stmt.setString(5, e_mail);
                    stmt.setString(6, u_name);
                    stmt.setString(7, address);
                    
                    int accept = stmt.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Registered Successfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(SQLException ex){
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Database Connection Down...", "Unsuccessful", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    /**
     *
     */
    public void clear(){
        fName.setText("");
        lName.setText("");
        age.setText("");
        passwd.setText("");
        eMail.setText("");
        uName.setText("");
        addr.setText("");
    }
}
