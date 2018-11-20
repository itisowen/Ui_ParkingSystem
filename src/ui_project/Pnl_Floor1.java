/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;


import java.sql.*;
import javax.swing.*;

public class Pnl_Floor1 extends javax.swing.JPanel {
    
    private MainUser mu;
    private Pnl_Booking pb;
    private Pnl_Profile pn;
    private String fname, lname, license, car, user;
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs_floor1 = null;
    private ImageIcon[] image = new ImageIcon[2];
    private int[] slot = new int[11];

    Pnl_Floor1(Pnl_Booking pb, String user) {
        initComponents();
	image[0] = new ImageIcon(getClass().getResource("car1.png"));
	image[1] = new ImageIcon(getClass().getResource("car2.png"));
	checkFloor1();
	this.user = user;


    }

    public void setCar(String car){
	this.car = car;
	System.out.println(this.car);
    }
    
    public String getFname() {
	return fname;
    }

    public void setFname(String fname) {
	this.fname = fname;
    }

    public String getLname() {
	return lname;
    }

    public void setLname(String lname) {
	this.lname = lname;
    }

    public String getLicense() {
	return license;
    }

    public void setLicense(String license) {
	this.license = license;
    }

    
    
    public void checkFloor1(){
	int ava = 0;
	for(int i=1; i<=10; i++){
	    try{
	    String sql = "SELECT * FROM `floor1` WHERE  slot = ?";
		con = MyConnection.getConnection();
		pst = con.prepareStatement(sql);
		pst.setInt(1, i);
		rs_floor1 = pst.executeQuery();
		while((rs_floor1!=null) && (rs_floor1.next())){
		    ava = rs_floor1.getInt("availble");
		}
	    }catch(Exception e){
		JOptionPane.showMessageDialog(null, e);
	    }
	    switch(i) {
		    case 1 :
			if(ava == 0){
			    s1.setIcon(image[1]);
			    slot[1] = 0;
			}
			else{
			    s1.setIcon(image[0]);
			    slot[1] = 1;
			}
			break;
		    case 2 :
			if(ava == 0){
			    s2.setIcon(image[1]);
			    slot[2] = 0;
			}
			else{
			    s2.setIcon(image[0]);
			    slot[2] = 1;
			}
			break;
		    case 3 :
			if(ava == 0){
			    s3.setIcon(image[1]);
			    slot[3] = 0;
			}
			else{
			    s3.setIcon(image[0]);
			    slot[3] = 1;
			}
			break;
		    case 4 :
			if(ava == 0){
			    s4.setIcon(image[1]);
			    slot[4] = 0;
			}
			else{
			    s4.setIcon(image[0]);
			    slot[4] = 1;
			}
			break;
		    case 5 :
			if(ava == 0){
			    s5.setIcon(image[1]);
			    slot[5] = 0;
			}
			else{
			    s5.setIcon(image[0]);
			    slot[5] = 1;
			}
			break;
		    case 6 :
			if(ava == 0){
			    s6.setIcon(image[1]);
			    slot[6] = 0;
			}
			else{
			    s6.setIcon(image[0]);
			    slot[6] = 1;
			}
			break;
		    case 7 :
			if(ava == 0){
			    s7.setIcon(image[1]);
			    slot[7] = 0;
			}
			else{
			    s7.setIcon(image[0]);
			    slot[7] = 1;
			}
			break;
		    case 8 :
			if(ava == 0){
			    s8.setIcon(image[1]);
			    slot[8] = 0;
			}
			else{
			    s8.setIcon(image[0]);
			    slot[8] = 1;
			}
			break;
		    case 9:
			if(ava == 0){
			    s9.setIcon(image[1]);
			    slot[9] = 0;
			}
			else{
			    s9.setIcon(image[0]);
			    slot[9] = 1;
			}
			break;
		    case 10:
			if(ava == 0){
			    s10.setIcon(image[1]);
			    slot[10] = 0;
			}
			else{
			    s10.setIcon(image[0]);
			    slot[10] = 1;
			}
			break;
		}
	    rs_floor1 = null;
	    pst = null;
	    con = null;
	    ava = 1;
	}
	
    }

    public void bookSlotF1(String slot){
	System.out.println(this.user);
	System.out.println(this.fname);
	System.out.println(this.lname);
	System.out.println(formGetLicense(this.car));
	try{
	    String sql2 = "UPDATE `floor1` SET  user = ?, fname = ?, lname = ?, car = ?, license = ?, availble = 1 WHERE slot = ?";
	    PreparedStatement ps = con.prepareStatement(sql2);
	    ps.setString(1, this.user);
	    ps.setString(2, this.fname);
	    ps.setString(3, this.lname);
	    ps.setString(4, this.car);
	    ps.setString(5,formGetLicense(this.car));
	    ps.setString(6, slot);
	    
	if(ps.executeUpdate() > 0){
	    try{
		String sql3 = "UPDATE `carlist` SET  book = '1' WHERE license = ?";
		PreparedStatement ps2 = con.prepareStatement(sql3);
		ps2.setString(1, formGetLicense(this.car));
		ps2.executeUpdate();
	    }catch(Exception ex){
		System.out.println(ex);
	    }
	    JOptionPane.showMessageDialog(null, "Booked");
	}
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, "ERROR");
	}
	checkFloor1();
    }
    
    public String formGetLicense(String car){
	String li = "";
	try{
	    String sql = "SELECT * FROM `carlist` WHERE user = ? AND car = ?";
	    con = MyConnection.getConnection();
	    pst = con.prepareStatement(sql);
	    pst.setString(1, this.user);
	    pst.setString(2, car);
	    ResultSet rs_license = pst.executeQuery();
	    while((rs_license!=null) && (rs_license.next())){
		li = rs_license.getString("license");
            }
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
	return li;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        s5 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s10 = new javax.swing.JLabel();
        s9 = new javax.swing.JLabel();
        s8 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(710, 562));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel7.setMinimumSize(new java.awt.Dimension(7, 211));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jPanel13.setMinimumSize(new java.awt.Dimension(7, 211));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jPanel30.setMinimumSize(new java.awt.Dimension(7, 211));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jPanel32.setMinimumSize(new java.awt.Dimension(7, 211));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel33.setMinimumSize(new java.awt.Dimension(7, 211));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel34.setMinimumSize(new java.awt.Dimension(7, 211));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel35.setMinimumSize(new java.awt.Dimension(7, 211));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel36.setMinimumSize(new java.awt.Dimension(7, 211));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        s5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s5MouseClicked(evt);
            }
        });

        s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s3MouseClicked(evt);
            }
        });

        s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s2MouseClicked(evt);
            }
        });

        s10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s10MouseClicked(evt);
            }
        });

        s9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s9MouseClicked(evt);
            }
        });

        s8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s8MouseClicked(evt);
            }
        });

        s7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s7MouseClicked(evt);
            }
        });

        s6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s6MouseClicked(evt);
            }
        });

        s4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s4MouseClicked(evt);
            }
        });

        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_project/car1.png"))); // NOI18N
        s1.setText("jLabel1");
        s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s5)
                        .addGap(42, 42, 42)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(s6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s10)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(s10)
                    .addComponent(s9)
                    .addComponent(s8)
                    .addComponent(s7)
                    .addComponent(s6))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1MouseClicked
        if(slot[1] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("1");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s1MouseClicked

    private void s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2MouseClicked
        if(slot[2] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("2");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s2MouseClicked

    private void s3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s3MouseClicked
        if(slot[3] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("3");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s3MouseClicked

    private void s4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s4MouseClicked
        if(slot[4] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("4");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s4MouseClicked

    private void s5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s5MouseClicked
        if(slot[5] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("5");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s5MouseClicked

    private void s6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s6MouseClicked
        if(slot[6] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("6");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s6MouseClicked

    private void s7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s7MouseClicked
        if(slot[7] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("7");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s7MouseClicked

    private void s8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s8MouseClicked
        if(slot[8] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("8");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s8MouseClicked

    private void s9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s9MouseClicked
        if(slot[9] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("9");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s9MouseClicked

    private void s10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s10MouseClicked
        if(slot[10] == 0){
	    int option = JOptionPane.showConfirmDialog(null, "Do you want to book this slot?");
	    if(option == 0){
		bookSlotF1("10");
	    }
	    else if(option == 1){
		
	    }
	    else{
		
	    }
	}
	else{
	    JOptionPane.showMessageDialog(null, "This slot not availble");
	}
    }//GEN-LAST:event_s10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s10;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JLabel s7;
    private javax.swing.JLabel s8;
    private javax.swing.JLabel s9;
    // End of variables declaration//GEN-END:variables
}
