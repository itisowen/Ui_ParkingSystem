/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author itisowen_
 */
public class MainUser extends javax.swing.JFrame {
    Pnl_Booking home;
    Pnl_Profile profile;
    Pnl_Floor1 f1;
    private String user;
    private Connection con = null;
    private PreparedStatement pst, ps = null;
    private ResultSet rs_carlist, rs_form, rs_license = null;
    
    public MainUser(String user) {
        initComponents();
	this.user = user;
	System.out.println(this.user);
        GridBagLayout layout = new GridBagLayout();
        home = new Pnl_Booking(this);
        profile = new Pnl_Profile(this);
        multiPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        multiPanel.add(home, c);
        multiPanel.add(profile, c);
	CarComboUpdate();
	CarComboUpdateBook();
	formSet();
        home.setVisible(true);
        profile.setVisible(false);

    }
    
    public void CarComboUpdate(){
	home.resetCarCombo();
	try{
	String sql = "SELECT * FROM `carlist` WHERE user = ?";
	con = MyConnection.getConnection();
	pst = con.prepareStatement(sql);
	pst.setString(1, user);
	rs_carlist = pst.executeQuery();
	
	while(rs_carlist.next()){
	    String usercar = rs_carlist.getString("car");
//	    home.CarComboUpdate(usercar);
	    profile.CarComboUpdate(usercar);
	}
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
    }
    
    public void CarComboUpdateBook(){
	home.resetCarCombo();
	try{
	String sql = "SELECT * FROM `carlist` WHERE user = ? AND book = '0'";
	con = MyConnection.getConnection();
	pst = con.prepareStatement(sql);
	pst.setString(1, user);
	rs_carlist = pst.executeQuery();
	
	while(rs_carlist.next()){
	    String usercar = rs_carlist.getString("car");
	    home.CarComboUpdate(usercar);
	}
	
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
    }
    
    
    public void formSet(){
	try{
	    String sql = "SELECT * FROM `test` WHERE user = ? ";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, user);
	    rs_form = pst.executeQuery();
	    while((rs_form!=null) && (rs_form.next())){
                profile.setName(rs_form.getString("fname"));
                profile.setLname(rs_form.getString("lname"));
		profile.setUser(user);
		profile.setPhonenumber(rs_form.getString("phonenumber"));
            }
	    
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
	try{
	    String sql = "SELECT * FROM `carlist` WHERE user = ? AND car = ?";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, this.user);
	    pst.setString(2, profile.getCar());
	    rs_license = pst.executeQuery();
	    while((rs_license!=null) && (rs_license.next())){
		profile.setLicense(rs_license.getString("license"));
            }
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
    }
    
    public void formUpdate(){
	try{
	String sql = "UPDATE `test` SET fname = ?, lname = ?, phonenumber = ? WHERE user = ?";
	ps = con.prepareStatement(sql);
	ps.setString(1, profile.getFname());
	ps.setString(2, profile.getLname());
	ps.setString(3, profile.getPhonenumber());
	ps.setString(4, this.user);
	if(ps.executeUpdate() > 0){
	    JOptionPane.showMessageDialog(null, "Update");
	}
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
	try{
	    String sql = "UPDATE `carlist` SET `license`= ? WHERE `user` = ? AND `car` = ?";
	    ps = con.prepareStatement(sql);
	    ps.setString(1, profile.getLicense());
	    ps.setString(2, this.user);
	    ps.setString(3, profile.getCar());
	    if(ps.executeUpdate() > 0){
	    JOptionPane.showMessageDialog(null, "Update");
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
	    pst.setString(2, profile.getCar());
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
        jSeparator1 = new javax.swing.JSeparator();
        bn_Home = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bn_Profile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bn_exit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(890, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        multiPanel.setBackground(new java.awt.Color(204, 204, 255));
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 180, 10));

        bn_Home.setBackground(new java.awt.Color(255, 204, 204));
        bn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_HomeMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Booking");

        javax.swing.GroupLayout bn_HomeLayout = new javax.swing.GroupLayout(bn_Home);
        bn_Home.setLayout(bn_HomeLayout);
        bn_HomeLayout.setHorizontalGroup(
            bn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_HomeLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        bn_HomeLayout.setVerticalGroup(
            bn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_HomeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(bn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 70));

        bn_Profile.setBackground(new java.awt.Color(255, 204, 204));
        bn_Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_ProfileMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Profile");

        javax.swing.GroupLayout bn_ProfileLayout = new javax.swing.GroupLayout(bn_Profile);
        bn_Profile.setLayout(bn_ProfileLayout);
        bn_ProfileLayout.setHorizontalGroup(
            bn_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_ProfileLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        bn_ProfileLayout.setVerticalGroup(
            bn_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_ProfileLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(bn_Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, -1));

        bn_exit.setBackground(new java.awt.Color(255, 204, 204));
        bn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_exitMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("EXit");

        javax.swing.GroupLayout bn_exitLayout = new javax.swing.GroupLayout(bn_exit);
        bn_exit.setLayout(bn_exitLayout);
        bn_exitLayout.setHorizontalGroup(
            bn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_exitLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        bn_exitLayout.setVerticalGroup(
            bn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_exitLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jPanel2.add(bn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bn_exitMouseClicked

    private void bn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_HomeMouseClicked
	home.resetCarCombo();
	CarComboUpdateBook();
	home.setVisible(true);
        profile.setVisible(false);
	home.check();

    }//GEN-LAST:event_bn_HomeMouseClicked

    private void bn_ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_ProfileMouseClicked
        home.setVisible(false);
        profile.setVisible(true);

    }//GEN-LAST:event_bn_ProfileMouseClicked

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
    private javax.swing.JPanel bn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel multiPanel;
    // End of variables declaration//GEN-END:variables

}
