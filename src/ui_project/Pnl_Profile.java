/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

import javax.swing.*;

/**
 *
 * @author Owen
 */
public class Pnl_Profile extends javax.swing.JPanel {
    private MainUser mu;
    Object selected_car;
    public Pnl_Profile() {
        initComponents();
    }

    Pnl_Profile(MainUser mu) {
        this.mu = mu;
        initComponents();
    }

    public void setName(String name) {
	tf_fname.setText(name);
    }

    public void setUser(String user) {
	tf_user.setText(user);
    }

    public void setPhonenumber(String phonenumber) {
	tf_phonenumber.setText(phonenumber);
    }
    
    public void setLicense(String license){
	tf_license.setText(license);
    }
    
    public String getFname() {
	return tf_fname.getText();
    }

    public String getUser() {
	return tf_user.getText();
    }

    public String getPhonenumber() {
	return tf_phonenumber.getText();
    }
    
    public String getLicense(){
	return tf_license.getText();
    }
    
    public String getCar(){
	return (String) selected_car;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tf_fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_license = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_phonenumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(710, 624));
        setPreferredSize(new java.awt.Dimension(710, 624));
        setRequestFocusEnabled(false);

        jLabel2.setBackground(new java.awt.Color(35, 43, 43));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 254));
        jLabel2.setText("Fullname");

        tf_fname.setBackground(new java.awt.Color(35, 43, 43));
        tf_fname.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_fname.setForeground(new java.awt.Color(254, 255, 255));
        tf_fname.setText("Fullname");
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

        tf_user.setEditable(false);
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

        jLabel7.setBackground(new java.awt.Color(35, 43, 43));
        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 254));
        jLabel7.setText("License plate");

        tf_license.setBackground(new java.awt.Color(35, 43, 43));
        tf_license.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 254));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(62, 16, 136));
        jPanel1.setForeground(new java.awt.Color(255, 255, 254));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 254));
        jLabel3.setText("PROFILE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setText("Car brand");

        jTextField1.setBackground(new java.awt.Color(35, 43, 43));
        jTextField1.setText("Car brand");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_license, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_phonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                    .addComponent(jTextField1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_license, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void tf_licenseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_licenseFocusGained
        if(tf_license.getText().equals("License plate")){
            tf_license.setText("");
        }
    }//GEN-LAST:event_tf_licenseFocusGained

    private void tf_licenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_licenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_licenseActionPerformed

    private void tf_phonenumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_phonenumberFocusGained
        if(tf_phonenumber.getText().equals("Phone number")){
            tf_phonenumber.setText("");
        }
    }//GEN-LAST:event_tf_phonenumberFocusGained

    private void tf_phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phonenumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mu.formUpdate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_license;
    private javax.swing.JTextField tf_phonenumber;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
