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

    public void setLname(String lname){
        tf_lname.setText(lname);
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
    
    public void setCar(String car){
	tf_car.setText(car);
    }
    
    public String getCar(){
	return tf_car.getText();
    }
    
    public String getFname() {
	return tf_fname.getText();
    }
    
    public String getLname(){
        return tf_lname.getText();
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
        update = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchUser = new javax.swing.JButton();
        searchLicense = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_car = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_lname = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(710, 624));
        setPreferredSize(new java.awt.Dimension(710, 624));
        setRequestFocusEnabled(false);

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

        update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 254));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
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

        searchUser.setText("search");
        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });

        searchLicense.setText("search");
        searchLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLicenseActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(64, 64, 65));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 254));
        jLabel4.setText("Car brand");

        tf_car.setBackground(new java.awt.Color(35, 43, 43));
        tf_car.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_car.setForeground(new java.awt.Color(255, 255, 254));
        tf_car.setText("Car brand");
        tf_car.setBorder(null);

        jLabel5.setBackground(new java.awt.Color(35, 43, 43));
        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 254));
        jLabel5.setText("Lastname");

        tf_lname.setBackground(new java.awt.Color(35, 43, 43));
        tf_lname.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tf_lname.setForeground(new java.awt.Color(255, 255, 254));
        tf_lname.setText("Lastname");
        tf_lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_lnameFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tf_license, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(jLabel7)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_lname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_fname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                        .addComponent(jLabel8)
                        .addComponent(tf_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(tf_car, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_license, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(tf_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_car, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        mu.formUpdate(getUser());
    }//GEN-LAST:event_updateActionPerformed

    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserActionPerformed
	mu.formSet(tf_user.getText());
    }//GEN-LAST:event_searchUserActionPerformed

    private void searchLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLicenseActionPerformed
        mu.formSet(mu.userSearchFormLicense(tf_license.getText()));
    }//GEN-LAST:event_searchLicenseActionPerformed

    private void tf_lnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_lnameFocusGained
        if(tf_lname.getText().equals("Lastname")){
            tf_lname.setText("");
        }
    }//GEN-LAST:event_tf_lnameFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchLicense;
    private javax.swing.JButton searchUser;
    private javax.swing.JTextField tf_car;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_license;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_phonenumber;
    private javax.swing.JTextField tf_user;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
