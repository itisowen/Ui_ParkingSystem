/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author itisowen_
 */
public class MainUser extends javax.swing.JFrame {
    Pnl_Booking home;
    Pnl_Profile profile;
    Pnl_Checkout checkout;
    Pnl_Register addcar;
    Pnl_Floor1 f1;
    private String user, isAdmin;
    private String bn_homec = "0", bn_profilec = "0", bn_checkoutc = "0", bn_addcarc = "0";
    private Connection con = null;
    private PreparedStatement pst, ps = null;
    private ResultSet rs_form, rs_license, rs_slot, rs_name, rs_checkout = null;
    
    public MainUser(String user, String isAdmin) {
        initComponents();
	this.user = user;
	this.isAdmin = isAdmin;
	if(this.isAdmin == "admin"){
	    bn_checkout.setVisible(true);
            bn_regis.setVisible(true);
	}
	else{
	    bn_checkout.setVisible(false);
            bn_regis.setVisible(false);
	}
	System.out.println(this.user);
        GridBagLayout layout = new GridBagLayout();
        home = new Pnl_Booking(this);
        profile = new Pnl_Profile(this);
        checkout = new Pnl_Checkout(this);
        addcar = new Pnl_Register(this);
        multiPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        multiPanel.add(home, c);
        multiPanel.add(profile, c);
        multiPanel.add(checkout, c);
        multiPanel.add(addcar, c);
	formSet(this.user);
	updateArraySlot();
	home.updateSlot();
        bn_Home.setBackground(new Color(104,26,228));
        home.setVisible(true);
        profile.setVisible(false);
        checkout.setVisible(false);
        addcar.setVisible(false);
	home.test();

    }

    private MainUser(String user) {
    }   
    
    public void clearTf(String but){
	if(but == "user"){
	    profile.setName("");
            profile.setLname("");
	    profile.setPhonenumber("");
	    profile.setLicense("");
	    profile.setCar("");
	}
	else if(but == "license"){
	    profile.setName("");
            profile.setLname("");
	    profile.setPhonenumber("");
	    profile.setUser("");
	    profile.setCar("");
	}
    }
    
    public void checkOut_detail(String license){
	try{
		String sql = "SELECT * FROM `floor` WHERE license = ? ";
		con = MyConnection.getConnection();
		pst = con.prepareStatement(sql);
		pst.setString(1, license);
		rs_checkout = pst.executeQuery();
		if(rs_checkout.next()){
		    checkout.setTf_Fname(rs_checkout.getString("fname"));
		    checkout.setTf_Lname(rs_checkout.getString("lname"));
		    checkout.setTf_User(rs_checkout.getString("user"));
		    checkout.setTf_Slot(rs_checkout.getString("slot"));
		}
		else{
		    JOptionPane.showMessageDialog(null, "Not Found this license");
		}
	    }catch(Exception ex){
		   System.out.println(ex);
	    }
    }
    
    public void checkOut(String slot){
	try{
	    String sql2 = "UPDATE `floor` SET  user = ?, fname = ?, lname = ?, license = ?, availble = 0 WHERE slot = ?";
	    PreparedStatement ps = con.prepareStatement(sql2);
	    ps.setString(1, "");
	    ps.setString(2, "");
	    ps.setString(3, "");
	    ps.setString(4, "");
	    
	    ps.setString(5, slot);
	    
	    if(ps.executeUpdate() > 0){
		JOptionPane.showMessageDialog(null, "CheckOut");
		checkout.clearTf();
		
		
	    }
	}catch(Exception ex){
	    System.out.println(ex);
	}
    }
    
    public void bookSlotF1(String slot){
	getNameSql(home.getUser());
	try{
	    String sql2 = "UPDATE `floor` SET  user = ?, fname = ?, lname = ?, license = ?, availble = 1 WHERE slot = ?";
	    PreparedStatement ps = con.prepareStatement(sql2);
	    ps.setString(1, home.getUser());
	    ps.setString(2, home.getFname());
	    ps.setString(3, home.getLname());
	    ps.setString(4, home.getLicense());
	    
	    ps.setString(5, slot);
	    
	    if(ps.executeUpdate() > 0){
		JOptionPane.showMessageDialog(null, "Booked");
	    }
	}catch(Exception ex){
		
	}
	updateArraySlot();
	home.updateSlot();
	home.clearTF();
    }
    
    
    public void updateArraySlot(){
	home.clearArray();
	for(int i = 1; i<=24; i++){
	    try{
		String sql = "SELECT * FROM `floor` WHERE slot = ? ";
		con = MyConnection.getConnection();
		pst = con.prepareStatement(sql);
		pst.setInt(1, i);
		rs_slot = pst.executeQuery();
		if(rs_slot.next()){
		    home.addArraySlot(rs_slot.getString("availble"));
		}
	    }catch(Exception ex){
	    
	    }
	}
    }
    
    public void getNameSql(String user){
	try{
	    String sql = "SELECT * FROM `test` WHERE user = ? ";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, user);
	    rs_name = pst.executeQuery();
	    if(rs_name.next()){
		home.setFname(rs_name.getString("fname"));
		home.setLname(rs_name.getString("lname"));
	    }
	}catch(Exception ex){
	    
	}
    }
    
    public String userSearchFormLicense(String license){
	try{
	    String sql = "SELECT * FROM `carlist` WHERE license = ?";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, license);
	    rs_license = pst.executeQuery();
	    if(rs_license.next()){
		return rs_license.getString("user");
	    }
	    else{
		JOptionPane.showMessageDialog(null, "License not found");
		return "";
		
	    }
            
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
	return "";
    }
    
    public void formSet(String user){
	try{
	    String sql = "SELECT * FROM `test` WHERE user = ? ";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, user);
	    rs_form = pst.executeQuery();
	    if(rs_form.next()){
                profile.setName(rs_form.getString("fname"));
                profile.setLname(rs_form.getString("lname"));
		profile.setUser(user);
		profile.setPhonenumber(rs_form.getString("phonenumber"));
            }
	    else{
		JOptionPane.showMessageDialog(null, "User not found");
		clearTf("user");
	    }
	    
	    
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
	try{
	    String sql = "SELECT * FROM `carlist` WHERE user = ?";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, user);
	    rs_license = pst.executeQuery();
	    while((rs_license!=null) && (rs_license.next())){
		profile.setLicense(rs_license.getString("license"));
		profile.setCar(rs_license.getString("car"));
            }
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
    }
    
    public void formUpdate(String user){
	try{
	String sql = "UPDATE `test` SET fname = ?, lname = ?, phonenumber = ? WHERE user = ?";
	ps = con.prepareStatement(sql);
	ps.setString(1, profile.getFname());
        ps.setString(2, profile.getLname());
	ps.setString(3, profile.getPhonenumber());
	ps.setString(4, user);
	if(ps.executeUpdate() > 0){
	    JOptionPane.showMessageDialog(null, "Update name");
	}
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
	try{
	    String sql = "UPDATE `carlist` SET `license`= ?, `car` = ? WHERE `user` = ?";
	    ps = con.prepareStatement(sql);
	    ps.setString(1, profile.getLicense());
	    ps.setString(2, profile.getCar());
	    ps.setString(3, user);
	    if(ps.executeUpdate() > 0){
	    JOptionPane.showMessageDialog(null, "Update license");
	}
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
    }
    
    
    public String getUser() {
	return user;
    }
    
    public void formSetLicense(){
	try{
	    String sql = "SELECT * FROM `carlist` WHERE user = ? AND car = ?";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, this.user);
//	    pst.setString(2, profile.getCar());
	    rs_license = pst.executeQuery();
	    while((rs_license!=null) && (rs_license.next())){
		profile.setLicense(rs_license.getString("license"));
            }
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multiPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bn_Home = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bn_Profile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bn_exit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bn_checkout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bn_regis = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(890, 580));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        multiPanel.setBackground(new java.awt.Color(153, 153, 255));
        multiPanel.setMinimumSize(new java.awt.Dimension(710, 580));

        javax.swing.GroupLayout multiPanelLayout = new javax.swing.GroupLayout(multiPanel);
        multiPanel.setLayout(multiPanelLayout);
        multiPanelLayout.setHorizontalGroup(
            multiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        multiPanelLayout.setVerticalGroup(
            multiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(multiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 710, 580));

        jPanel2.setBackground(new java.awt.Color(62, 16, 136));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bn_Home.setBackground(new java.awt.Color(62, 16, 136));
        bn_Home.setForeground(new java.awt.Color(104, 26, 228));
        bn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bn_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bn_HomeMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 254));
        jLabel4.setText("Booking");

        javax.swing.GroupLayout bn_HomeLayout = new javax.swing.GroupLayout(bn_Home);
        bn_Home.setLayout(bn_HomeLayout);
        bn_HomeLayout.setHorizontalGroup(
            bn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_HomeLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        bn_HomeLayout.setVerticalGroup(
            bn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_HomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(bn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 70));

        bn_Profile.setBackground(new java.awt.Color(62, 16, 136));
        bn_Profile.setForeground(new java.awt.Color(104, 26, 228));
        bn_Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_ProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bn_ProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bn_ProfileMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 254));
        jLabel3.setText("Profile");

        javax.swing.GroupLayout bn_ProfileLayout = new javax.swing.GroupLayout(bn_Profile);
        bn_Profile.setLayout(bn_ProfileLayout);
        bn_ProfileLayout.setHorizontalGroup(
            bn_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_ProfileLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        bn_ProfileLayout.setVerticalGroup(
            bn_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_ProfileLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.add(bn_Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, -1));

        bn_exit.setBackground(new java.awt.Color(54, 33, 150));
        bn_exit.setForeground(new java.awt.Color(255, 255, 254));
        bn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_exitMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 254));
        jLabel1.setText("Logout");

        javax.swing.GroupLayout bn_exitLayout = new javax.swing.GroupLayout(bn_exit);
        bn_exit.setLayout(bn_exitLayout);
        bn_exitLayout.setHorizontalGroup(
            bn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_exitLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        bn_exitLayout.setVerticalGroup(
            bn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_exitLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jPanel2.add(bn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, -1));

        bn_checkout.setBackground(new java.awt.Color(62, 16, 136));
        bn_checkout.setForeground(new java.awt.Color(104, 26, 228));
        bn_checkout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_checkoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bn_checkoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bn_checkoutMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 254));
        jLabel5.setText("Check Out");

        javax.swing.GroupLayout bn_checkoutLayout = new javax.swing.GroupLayout(bn_checkout);
        bn_checkout.setLayout(bn_checkoutLayout);
        bn_checkoutLayout.setHorizontalGroup(
            bn_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_checkoutLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );
        bn_checkoutLayout.setVerticalGroup(
            bn_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_checkoutLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.add(bn_checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, -1));

        bn_regis.setBackground(new java.awt.Color(62, 16, 136));
        bn_regis.setForeground(new java.awt.Color(104, 26, 228));
        bn_regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_regisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bn_regisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bn_regisMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 254));
        jLabel6.setText("Register");

        javax.swing.GroupLayout bn_regisLayout = new javax.swing.GroupLayout(bn_regis);
        bn_regis.setLayout(bn_regisLayout);
        bn_regisLayout.setHorizontalGroup(
            bn_regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_regisLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(30, 30, 30))
        );
        bn_regisLayout.setVerticalGroup(
            bn_regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_regisLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.add(bn_regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_exitMouseClicked
        UiLogin ul = new UiLogin();
	ul.setVisible(true);
        ul.pack();
        ul.setLocationRelativeTo(null);
        ul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.dispose();
    }//GEN-LAST:event_bn_exitMouseClicked

    private void bn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_HomeMouseClicked
	home.setVisible(true);
        profile.setVisible(false);
        checkout.setVisible(false);
        addcar.setVisible(false);
	bn_Home.setBackground(new Color(104,26,228));
	bn_Profile.setBackground(new Color(62,16,136));
	bn_checkout.setBackground(new Color(62,16,136));
	bn_regis.setBackground(new Color(62,16,136));
	bn_homec = "1";
	bn_profilec = "0";
	bn_addcarc = "0";
	bn_checkoutc = "0";
	updateArraySlot();
	home.updateSlot();

    }//GEN-LAST:event_bn_HomeMouseClicked

    private void bn_ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_ProfileMouseClicked
        home.setVisible(false);
        profile.setVisible(true);
        checkout.setVisible(false);
        addcar.setVisible(false);
	bn_homec = "0";
	bn_profilec = "1";
	bn_addcarc = "0";
	bn_checkoutc = "0";
	bn_Home.setBackground(new Color(62,16,136));
	bn_Profile.setBackground(new Color(104,26,228));
	bn_checkout.setBackground(new Color(62,16,136));
	bn_regis.setBackground(new Color(62,16,136));

    }//GEN-LAST:event_bn_ProfileMouseClicked

    private void bn_ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_ProfileMouseEntered
	bn_Profile.setBackground(new Color(104,26,228));
    }//GEN-LAST:event_bn_ProfileMouseEntered

    private void bn_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_HomeMouseEntered
        bn_Home.setBackground(new Color(104,26,228));
    }//GEN-LAST:event_bn_HomeMouseEntered

    private void bn_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_HomeMouseExited
        if(bn_homec == "0"){
	    bn_Home.setBackground(new Color(62,16,136));
	}
	else{
	    
	}
    }//GEN-LAST:event_bn_HomeMouseExited

    private void bn_ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_ProfileMouseExited
        if(bn_profilec == "0"){
	    bn_Profile.setBackground(new Color(62,16,136));
	}
	else{
	    
	}
    }//GEN-LAST:event_bn_ProfileMouseExited

    private void bn_checkoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_checkoutMouseClicked
        home.setVisible(false);
        profile.setVisible(false);
        checkout.setVisible(true);
        addcar.setVisible(false);
        bn_homec = "0";
	bn_profilec = "0";
	bn_addcarc = "0";
	bn_checkoutc = "1";
	bn_Home.setBackground(new Color(62,16,136));
	bn_Profile.setBackground(new Color(62,16,136));
	bn_checkout.setBackground(new Color(104,26,228));
	bn_regis.setBackground(new Color(62,16,136));
    }//GEN-LAST:event_bn_checkoutMouseClicked

    private void bn_checkoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_checkoutMouseEntered
	bn_checkout.setBackground(new Color(104,26,228));
    }//GEN-LAST:event_bn_checkoutMouseEntered

    private void bn_checkoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_checkoutMouseExited
        if(bn_checkoutc == "0"){
	    bn_checkout.setBackground(new Color(62,16,136));
	}else{
	    
	}
    }//GEN-LAST:event_bn_checkoutMouseExited

    private void bn_regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_regisMouseClicked
        home.setVisible(false);
        profile.setVisible(false);
        checkout.setVisible(false);
        addcar.setVisible(true);
        bn_homec = "0";
	bn_profilec = "0";
	bn_addcarc = "1";
	bn_checkoutc = "0";
	bn_Home.setBackground(new Color(62,16,136));
	bn_Profile.setBackground(new Color(62,16,136));
	bn_checkout.setBackground(new Color(62,16,136));
	bn_regis.setBackground(new Color(104,26,228));
    }//GEN-LAST:event_bn_regisMouseClicked

    private void bn_regisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_regisMouseEntered
        bn_regis.setBackground(new Color(104,26,228));
    }//GEN-LAST:event_bn_regisMouseEntered

    private void bn_regisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_regisMouseExited
        if(bn_addcarc == "0"){
	    bn_regis.setBackground(new Color(62,16,136));
	}else{
	    
	}
    }//GEN-LAST:event_bn_regisMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String user) {
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
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUser(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bn_Home;
    private javax.swing.JPanel bn_Profile;
    private javax.swing.JPanel bn_checkout;
    private javax.swing.JPanel bn_exit;
    private javax.swing.JPanel bn_regis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel multiPanel;
    // End of variables declaration//GEN-END:variables

}
