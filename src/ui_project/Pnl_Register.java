/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Owen
 */
public class Pnl_Register extends javax.swing.JPanel {
    private MainUser mu;
    
    public Pnl_Register() {
        initComponents();
    }

   Pnl_Register(MainUser mu) {
        this.mu = mu;
        initComponents();
    }
   
    public void clearTF(){
	tf_car.setText("");
	tf_fname.setText("");
	tf_lastname.setText("");
	tf_license.setText("");
	tf_phonenumber.setText("");
	tf_user.setText("");
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_phonenumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_car = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_license = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        tf_lastname = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(710, 624));
        setPreferredSize(new java.awt.Dimension(710, 624));

        jPanel1.setBackground(new java.awt.Color(62, 16, 136));
        jPanel1.setForeground(new java.awt.Color(255, 255, 254));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 254));
        jLabel3.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(35, 43, 43));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 254));
        jLabel2.setText("Firstname");

        tf_fname.setBackground(new java.awt.Color(35, 43, 43));
        tf_fname.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_fname.setForeground(new java.awt.Color(254, 255, 255));
        tf_fname.setText("Firstname");
        tf_fname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_fnameFocusGained(evt);
            }
        });
        tf_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fnameActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(35, 43, 43));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 254));
        jLabel1.setText("Username");

        tf_user.setBackground(new java.awt.Color(35, 43, 43));
        tf_user.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_user.setForeground(new java.awt.Color(254, 255, 255));
        tf_user.setText("username");
        tf_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_userFocusGained(evt);
            }
        });
        tf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_userActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(35, 43, 43));
        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 254));
        jLabel8.setText("Phone number");

        tf_phonenumber.setBackground(new java.awt.Color(35, 43, 43));
        tf_phonenumber.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_phonenumber.setForeground(new java.awt.Color(254, 255, 255));
        tf_phonenumber.setText("Phone number");
        tf_phonenumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_phonenumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_phonenumberFocusGained(evt);
            }
        });
        tf_phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phonenumberActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(35, 43, 43));
        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 254));
        jLabel6.setText("Car brand");

        tf_car.setBackground(new java.awt.Color(35, 43, 43));
        tf_car.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_car.setForeground(new java.awt.Color(254, 255, 255));
        tf_car.setText("Car brand");
        tf_car.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_car.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_carFocusGained(evt);
            }
        });
        tf_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_carActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(35, 43, 43));
        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 254));
        jLabel7.setText("License plate");

        tf_license.setBackground(new java.awt.Color(35, 43, 43));
        tf_license.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_license.setForeground(new java.awt.Color(254, 255, 255));
        tf_license.setText("License plate");
        tf_license.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_license.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_licenseFocusGained(evt);
            }
        });
        tf_license.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_licenseActionPerformed(evt);
            }
        });

        button1.setActionCommand("Sign up");
        button1.setBackground(new java.awt.Color(64, 64, 64));
        button1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Sign up");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(35, 43, 43));
        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 254));
        jLabel5.setText("Lastname");

        tf_lastname.setBackground(new java.awt.Color(35, 43, 43));
        tf_lastname.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_lastname.setForeground(new java.awt.Color(254, 255, 255));
        tf_lastname.setText("Lastname");
        tf_lastname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf_lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_lastnameFocusGained(evt);
            }
        });
        tf_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lastnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tf_car, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tf_license, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tf_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(tf_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_car, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(tf_license, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_fnameFocusGained
        if(tf_fname.getText().equals("Firstname")){
            tf_fname.setText("");
        }
    }//GEN-LAST:event_tf_fnameFocusGained

    private void tf_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fnameActionPerformed

    private void tf_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusGained
        if(tf_user.getText().equals("username")){
            tf_user.setText("");
        }
    }//GEN-LAST:event_tf_userFocusGained

    private void tf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_userActionPerformed

    private void tf_phonenumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_phonenumberFocusGained
        if(tf_phonenumber.getText().equals("Phone number")){
            tf_phonenumber.setText("");
        }
    }//GEN-LAST:event_tf_phonenumberFocusGained

    private void tf_phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phonenumberActionPerformed

    private void tf_carFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_carFocusGained
        if(tf_car.getText().equals("Car brand")){
            tf_car.setText("");
        }
    }//GEN-LAST:event_tf_carFocusGained

    private void tf_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_carActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_carActionPerformed

    private void tf_licenseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_licenseFocusGained
        if(tf_license.getText().equals("License plate")){
            tf_license.setText("");
        }
    }//GEN-LAST:event_tf_licenseFocusGained

    private void tf_licenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_licenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_licenseActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String fname1 = tf_fname.getText();
	String lname1 = tf_lastname.getText();
        String user1 = tf_user.getText();
        String car1 = tf_car.getText();
        String license1 = tf_license.getText();
        String phonenumber1 = tf_phonenumber.getText();

        if(fname1.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter firstname");
        }
        else if(user1.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter username");
        }
        else if(car1.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter car brand");
        }
        else if(license1.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter car license");
        }
        else if(phonenumber1.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter phonenumber");
        }
        else{
            PreparedStatement ps,ps2 = null;

            String sql = "INSERT INTO `test`(`fname`, `lname`, `user`, `pass`, `phonenumber`, `memclass`) VALUES (?,?,?,?,?,'sliver')";
            try {
                ps = MyConnection.getConnection().prepareStatement(sql);

                ps.setString(1, fname1);
		ps.setString(2, lname1);
                ps.setString(3, user1);
		ps.setString(4, "");
                ps.setString(5, phonenumber1);
                if(ps.executeUpdate() > 0){
                    sql = "INSERT INTO `carlist`(`car`, `license`, `user`, `book`) VALUES (?,?,?,'0')";
                    ps2 = MyConnection.getConnection().prepareStatement(sql);
                    ps2.setString(1, car1);
                    ps2.setString(2, license1);
                    ps2.setString(3, user1);
                    if(ps2.executeUpdate() > 0 ){

                        JOptionPane.showMessageDialog(null, "User add");
			clearTF();
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void tf_lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_lastnameFocusGained
        if(tf_lastname.getText().equals("Lastname")){
            tf_lastname.setText("");
        }
    }//GEN-LAST:event_tf_lastnameFocusGained

    private void tf_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_lastnameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_car;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_lastname;
    private javax.swing.JTextField tf_license;
    private javax.swing.JTextField tf_phonenumber;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
