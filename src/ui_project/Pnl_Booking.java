/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Owen
 */
public class Pnl_Booking extends javax.swing.JPanel {


    private String user, fname, lname;
    private MainUser mu;
    ArrayList<String> slot;
    
    public Pnl_Booking(MainUser mu) {
	this.mu = mu;
        initComponents();
	
    }
    
    public void clearTF(){
	tf_license.setText("");
	tf_user.setText("");
    }
    
    public void clearArray(){
	slot = new ArrayList<String>();
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
    
    public String getUser(){
	return this.user;
    }
    
    public String getLicense(){
	return tf_license.getText();
    }

    public void test(){
	for(String i : slot){
	    System.out.println(i);
	}
    }
    
    public void addArraySlot(String availble){
	slot.add(availble);
    }
    
    public void updateSlot(){
	for(int i = 0; i<24; i++){
	    if(i == 0){
		if(slot.get(i).equals("1")){
		    bn_a1.setBackground(Color.RED);
		    
		}
	    	else{
		    bn_a1.setBackground(Color.GREEN);
		}
	    }
	    if(i == 1){
		if(slot.get(i).equals("1")){
		    bn_a2.setBackground(Color.RED);
		}
	    	else{
		    bn_a2.setBackground(Color.GREEN);
		}
	    }
	    if(i == 2){
		if(slot.get(i).equals("1")){
		    bn_a3.setBackground(Color.RED);
		}
	    	else{
		    bn_a3.setBackground(Color.GREEN);
		}
	    }
	    if(i == 3){
		if(slot.get(i).equals("1")){
		    bn_a4.setBackground(Color.RED);
		}
	    	else{
		    bn_a4.setBackground(Color.GREEN);
		}
	    }
	    if(i == 4){
		if(slot.get(i).equals("1")){
		    bn_a5.setBackground(Color.RED);
		}
	    	else{
		    bn_a5.setBackground(Color.GREEN);
		}
	    }
	    if(i == 5){
		if(slot.get(i).equals("1")){
		    bn_a6.setBackground(Color.RED);
		}
	    	else{
		    bn_a6.setBackground(Color.GREEN);
		}
	    }
	    if(i == 6){
		if(slot.get(i).equals("1")){
		    bn_b1.setBackground(Color.RED);
		}
	    	else{
		    bn_b1.setBackground(Color.GREEN);
		}
	    }
	    if(i == 7){
		if(slot.get(i).equals("1")){
		    bn_b2.setBackground(Color.RED);
		}
	    	else{
		    bn_b2.setBackground(Color.GREEN);
		}
	    }
	    if(i == 8){
		if(slot.get(i).equals("1")){
		    bn_b3.setBackground(Color.RED);
		}
	    	else{
		    bn_b3.setBackground(Color.GREEN);
		}
	    }
	    if(i == 9){
		if(slot.get(i).equals("1")){
		    bn_b4.setBackground(Color.RED);
		}
	    	else{
		    bn_b4.setBackground(Color.GREEN);
		}
	    }
	    if(i == 10){
		if(slot.get(i).equals("1")){
		    bn_b5.setBackground(Color.RED);
		}
	    	else{
		    bn_b5.setBackground(Color.GREEN);
		}
	    }
	    if(i == 11){
		if(slot.get(i).equals("1")){
		    bn_b6.setBackground(Color.RED);
		}
	    	else{
		    bn_b6.setBackground(Color.GREEN);
		}
	    }
	    if(i == 12){
		if(slot.get(i).equals("1")){
		    bn_c1.setBackground(Color.RED);
		}
	    	else{
		    bn_c1.setBackground(Color.GREEN);
		}
	    }
	    if(i == 13){
		if(slot.get(i).equals("1")){
		    bn_c2.setBackground(Color.RED);
		}
	    	else{
		    bn_c2.setBackground(Color.GREEN);
		}
	    }
	    if(i == 14){
		if(slot.get(i).equals("1")){
		    bn_c3.setBackground(Color.RED);
		}
	    	else{
		    bn_c3.setBackground(Color.GREEN);
		}
	    }
	    if(i == 15){
		if(slot.get(i).equals("1")){
		    bn_c4.setBackground(Color.RED);
		}
	    	else{
		    bn_c4.setBackground(Color.GREEN);
		}
	    }
	    if(i == 16){
		if(slot.get(i).equals("1")){
		    bn_c5.setBackground(Color.RED);
		}
	    	else{
		    bn_c5.setBackground(Color.GREEN);
		}
	    }
	    if(i == 17){
		if(slot.get(i).equals("1")){
		    bn_c6.setBackground(Color.RED);
		}
	    	else{
		    bn_c6.setBackground(Color.GREEN);
		}
	    }
	    if(i == 18){
		if(slot.get(i).equals("1")){
		    bn_d1.setBackground(Color.RED);
		}
	    	else{
		    bn_d1.setBackground(Color.GREEN);
		}
	    }
	    if(i == 19){
		if(slot.get(i).equals("1")){
		    bn_d2.setBackground(Color.RED);
		}
	    	else{
		    bn_d2.setBackground(Color.GREEN);
		}
	    }
	    if(i == 20){
		if(slot.get(i).equals("1")){
		    bn_d3.setBackground(Color.RED);
		}
	    	else{
		    bn_d3.setBackground(Color.GREEN);
		}
	    }
	    if(i == 21){
		if(slot.get(i).equals("1")){
		    bn_d4.setBackground(Color.RED);
		}
	    	else{
		    bn_d4.setBackground(Color.GREEN);
		}
	    }
	    if(i == 22){
		if(slot.get(i).equals("1")){
		    bn_d5.setBackground(Color.RED);
		}
	    	else{
		    bn_d5.setBackground(Color.GREEN);
		}
	    }
	    if(i == 23){
		if(slot.get(i).equals("1")){
		    bn_d6.setBackground(Color.RED);
		}
	    	else{
		    bn_d6.setBackground(Color.GREEN);
		}
	    }
	  
	    
	    
	}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_topic = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_license = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        pn_parking = new javax.swing.JPanel();
        bn_a1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bn_a2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        bn_a3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        bn_a4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bn_a5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        bn_a6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        bn_b1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        bn_b2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        bn_b3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        bn_b4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        bn_b5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        bn_b6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        bn_c1 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        bn_c2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        bn_c3 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        bn_c4 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        bn_c5 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        bn_c6 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        bn_d1 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        bn_d2 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        bn_d3 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        bn_d4 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        bn_d5 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        bn_d6 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(710, 580));
        setPreferredSize(new java.awt.Dimension(710, 580));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_topic.setBackground(new java.awt.Color(76, 19, 168));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 254));
        jLabel2.setText("License :");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 254));
        jLabel5.setText("User :");

        javax.swing.GroupLayout pn_topicLayout = new javax.swing.GroupLayout(pn_topic);
        pn_topic.setLayout(pn_topicLayout);
        pn_topicLayout.setHorizontalGroup(
            pn_topicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_topicLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_license, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(80, 80, 80)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pn_topicLayout.setVerticalGroup(
            pn_topicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_topicLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(pn_topicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_license, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(pn_topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pn_parking.setBackground(new java.awt.Color(153, 153, 255));
        pn_parking.setLayout(null);

        bn_a1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        bn_a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_a1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("1");

        javax.swing.GroupLayout bn_a1Layout = new javax.swing.GroupLayout(bn_a1);
        bn_a1.setLayout(bn_a1Layout);
        bn_a1Layout.setHorizontalGroup(
            bn_a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        bn_a1Layout.setVerticalGroup(
            bn_a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_a1);
        bn_a1.setBounds(10, 10, 100, 100);

        bn_a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_a2MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("2");

        javax.swing.GroupLayout bn_a2Layout = new javax.swing.GroupLayout(bn_a2);
        bn_a2.setLayout(bn_a2Layout);
        bn_a2Layout.setHorizontalGroup(
            bn_a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel10)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        bn_a2Layout.setVerticalGroup(
            bn_a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_a2);
        bn_a2.setBounds(120, 10, 100, 100);

        bn_a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_a3MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setText("3");

        javax.swing.GroupLayout bn_a3Layout = new javax.swing.GroupLayout(bn_a3);
        bn_a3.setLayout(bn_a3Layout);
        bn_a3Layout.setHorizontalGroup(
            bn_a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel17)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bn_a3Layout.setVerticalGroup(
            bn_a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_a3);
        bn_a3.setBounds(230, 10, 100, 100);

        bn_a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_a4MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("4");

        javax.swing.GroupLayout bn_a4Layout = new javax.swing.GroupLayout(bn_a4);
        bn_a4.setLayout(bn_a4Layout);
        bn_a4Layout.setHorizontalGroup(
            bn_a4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel11)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bn_a4Layout.setVerticalGroup(
            bn_a4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_a4);
        bn_a4.setBounds(340, 10, 100, 100);

        bn_a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_a5MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setText("5");

        javax.swing.GroupLayout bn_a5Layout = new javax.swing.GroupLayout(bn_a5);
        bn_a5.setLayout(bn_a5Layout);
        bn_a5Layout.setHorizontalGroup(
            bn_a5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel15)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bn_a5Layout.setVerticalGroup(
            bn_a5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_a5);
        bn_a5.setBounds(450, 10, 100, 100);

        bn_a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_a6MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setText("6");

        javax.swing.GroupLayout bn_a6Layout = new javax.swing.GroupLayout(bn_a6);
        bn_a6.setLayout(bn_a6Layout);
        bn_a6Layout.setHorizontalGroup(
            bn_a6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_a6Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(42, 42, 42))
        );
        bn_a6Layout.setVerticalGroup(
            bn_a6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_a6);
        bn_a6.setBounds(560, 10, 100, 100);

        bn_b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_b1MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setText("7");

        javax.swing.GroupLayout bn_b1Layout = new javax.swing.GroupLayout(bn_b1);
        bn_b1.setLayout(bn_b1Layout);
        bn_b1Layout.setHorizontalGroup(
            bn_b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel18)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bn_b1Layout.setVerticalGroup(
            bn_b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b1);
        bn_b1.setBounds(10, 120, 100, 100);

        bn_b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_b2MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel20.setText("8");

        javax.swing.GroupLayout bn_b2Layout = new javax.swing.GroupLayout(bn_b2);
        bn_b2.setLayout(bn_b2Layout);
        bn_b2Layout.setHorizontalGroup(
            bn_b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_b2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(41, 41, 41))
        );
        bn_b2Layout.setVerticalGroup(
            bn_b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b2);
        bn_b2.setBounds(120, 120, 100, 100);

        bn_b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_b3MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel21.setText("9");

        javax.swing.GroupLayout bn_b3Layout = new javax.swing.GroupLayout(bn_b3);
        bn_b3.setLayout(bn_b3Layout);
        bn_b3Layout.setHorizontalGroup(
            bn_b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel21)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_b3Layout.setVerticalGroup(
            bn_b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b3);
        bn_b3.setBounds(230, 120, 100, 100);

        bn_b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_b4MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel25.setText("10");

        javax.swing.GroupLayout bn_b4Layout = new javax.swing.GroupLayout(bn_b4);
        bn_b4.setLayout(bn_b4Layout);
        bn_b4Layout.setHorizontalGroup(
            bn_b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel25)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        bn_b4Layout.setVerticalGroup(
            bn_b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b4);
        bn_b4.setBounds(340, 120, 100, 100);

        bn_b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_b5MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel26.setText("11");

        javax.swing.GroupLayout bn_b5Layout = new javax.swing.GroupLayout(bn_b5);
        bn_b5.setLayout(bn_b5Layout);
        bn_b5Layout.setHorizontalGroup(
            bn_b5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_b5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(35, 35, 35))
        );
        bn_b5Layout.setVerticalGroup(
            bn_b5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b5);
        bn_b5.setBounds(450, 120, 100, 100);

        bn_b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_b6MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel27.setText("12");

        javax.swing.GroupLayout bn_b6Layout = new javax.swing.GroupLayout(bn_b6);
        bn_b6.setLayout(bn_b6Layout);
        bn_b6Layout.setHorizontalGroup(
            bn_b6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_b6Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(36, 36, 36))
        );
        bn_b6Layout.setVerticalGroup(
            bn_b6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b6);
        bn_b6.setBounds(560, 120, 100, 100);

        bn_c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_c1MouseClicked(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel56.setText("13");

        javax.swing.GroupLayout bn_c1Layout = new javax.swing.GroupLayout(bn_c1);
        bn_c1.setLayout(bn_c1Layout);
        bn_c1Layout.setHorizontalGroup(
            bn_c1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel56)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        bn_c1Layout.setVerticalGroup(
            bn_c1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c1);
        bn_c1.setBounds(10, 230, 100, 100);

        bn_c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_c2MouseClicked(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel36.setText("14");

        javax.swing.GroupLayout bn_c2Layout = new javax.swing.GroupLayout(bn_c2);
        bn_c2.setLayout(bn_c2Layout);
        bn_c2Layout.setHorizontalGroup(
            bn_c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel36)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        bn_c2Layout.setVerticalGroup(
            bn_c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c2);
        bn_c2.setBounds(120, 230, 100, 100);

        bn_c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_c3MouseClicked(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel58.setText("15");

        javax.swing.GroupLayout bn_c3Layout = new javax.swing.GroupLayout(bn_c3);
        bn_c3.setLayout(bn_c3Layout);
        bn_c3Layout.setHorizontalGroup(
            bn_c3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel58)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        bn_c3Layout.setVerticalGroup(
            bn_c3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c3);
        bn_c3.setBounds(230, 230, 100, 100);

        bn_c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_c4MouseClicked(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel39.setText("16");

        javax.swing.GroupLayout bn_c4Layout = new javax.swing.GroupLayout(bn_c4);
        bn_c4.setLayout(bn_c4Layout);
        bn_c4Layout.setHorizontalGroup(
            bn_c4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_c4Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(35, 35, 35))
        );
        bn_c4Layout.setVerticalGroup(
            bn_c4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c4);
        bn_c4.setBounds(340, 230, 100, 100);

        bn_c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_c5MouseClicked(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel57.setText("17");

        javax.swing.GroupLayout bn_c5Layout = new javax.swing.GroupLayout(bn_c5);
        bn_c5.setLayout(bn_c5Layout);
        bn_c5Layout.setHorizontalGroup(
            bn_c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_c5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(36, 36, 36))
        );
        bn_c5Layout.setVerticalGroup(
            bn_c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c5);
        bn_c5.setBounds(450, 230, 100, 100);

        bn_c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_c6MouseClicked(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel64.setText("18");

        javax.swing.GroupLayout bn_c6Layout = new javax.swing.GroupLayout(bn_c6);
        bn_c6.setLayout(bn_c6Layout);
        bn_c6Layout.setHorizontalGroup(
            bn_c6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_c6Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(34, 34, 34))
        );
        bn_c6Layout.setVerticalGroup(
            bn_c6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c6);
        bn_c6.setBounds(560, 230, 100, 100);

        bn_d1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_d1MouseClicked(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel59.setText("19");

        javax.swing.GroupLayout bn_d1Layout = new javax.swing.GroupLayout(bn_d1);
        bn_d1.setLayout(bn_d1Layout);
        bn_d1Layout.setHorizontalGroup(
            bn_d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_d1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addGap(35, 35, 35))
        );
        bn_d1Layout.setVerticalGroup(
            bn_d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d1);
        bn_d1.setBounds(10, 340, 100, 100);

        bn_d2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_d2MouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel60.setText("20");

        javax.swing.GroupLayout bn_d2Layout = new javax.swing.GroupLayout(bn_d2);
        bn_d2.setLayout(bn_d2Layout);
        bn_d2Layout.setHorizontalGroup(
            bn_d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_d2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addGap(34, 34, 34))
        );
        bn_d2Layout.setVerticalGroup(
            bn_d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d2);
        bn_d2.setBounds(120, 340, 100, 100);

        bn_d3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_d3MouseClicked(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel61.setText("21");

        javax.swing.GroupLayout bn_d3Layout = new javax.swing.GroupLayout(bn_d3);
        bn_d3.setLayout(bn_d3Layout);
        bn_d3Layout.setHorizontalGroup(
            bn_d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_d3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel61)
                .addGap(33, 33, 33))
        );
        bn_d3Layout.setVerticalGroup(
            bn_d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d3);
        bn_d3.setBounds(230, 340, 100, 100);

        bn_d4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_d4MouseClicked(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel62.setText("22");

        javax.swing.GroupLayout bn_d4Layout = new javax.swing.GroupLayout(bn_d4);
        bn_d4.setLayout(bn_d4Layout);
        bn_d4Layout.setHorizontalGroup(
            bn_d4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_d4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addGap(36, 36, 36))
        );
        bn_d4Layout.setVerticalGroup(
            bn_d4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d4);
        bn_d4.setBounds(340, 340, 100, 100);

        bn_d5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_d5MouseClicked(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel63.setText("23");

        javax.swing.GroupLayout bn_d5Layout = new javax.swing.GroupLayout(bn_d5);
        bn_d5.setLayout(bn_d5Layout);
        bn_d5Layout.setHorizontalGroup(
            bn_d5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_d5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addGap(35, 35, 35))
        );
        bn_d5Layout.setVerticalGroup(
            bn_d5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d5);
        bn_d5.setBounds(450, 340, 100, 100);

        bn_d6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bn_d6MouseClicked(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel66.setText("24");

        javax.swing.GroupLayout bn_d6Layout = new javax.swing.GroupLayout(bn_d6);
        bn_d6.setLayout(bn_d6Layout);
        bn_d6Layout.setHorizontalGroup(
            bn_d6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_d6Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(31, 31, 31))
        );
        bn_d6Layout.setVerticalGroup(
            bn_d6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d6);
        bn_d6.setBounds(560, 340, 100, 100);

        add(pn_parking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 680, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	this.user = mu.userSearchFormLicense(tf_license.getText());
	if(this.user.equals("")){
	    this.user = "guess";
	    this.fname = " ";
	    this.lname = " ";
	}
	else{
	    
	}
	
	tf_user.setText(this.user);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bn_a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_a1MouseClicked
	if(slot.get(0).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(0).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("1");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_a1MouseClicked

    private void bn_a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_a2MouseClicked
        if(slot.get(1).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(1).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("2");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_a2MouseClicked

    private void bn_a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_a3MouseClicked
        if(slot.get(2).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(2).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("3");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_a3MouseClicked

    private void bn_a4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_a4MouseClicked
        if(slot.get(3).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(3).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("4");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_a4MouseClicked

    private void bn_a5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_a5MouseClicked
        if(slot.get(4).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(4).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("5");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_a5MouseClicked

    private void bn_a6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_a6MouseClicked
        if(slot.get(5).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(5).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("6");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_a6MouseClicked

    private void bn_b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_b1MouseClicked
        if(slot.get(6).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(6).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("7");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_b1MouseClicked

    private void bn_b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_b2MouseClicked
        if(slot.get(7).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(7).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("8");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_b2MouseClicked

    private void bn_b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_b3MouseClicked
        if(slot.get(8).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(8).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("9");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_b3MouseClicked

    private void bn_b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_b4MouseClicked
        if(slot.get(9).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(9).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("10");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_b4MouseClicked

    private void bn_b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_b5MouseClicked
        if(slot.get(10).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(10).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("11");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_b5MouseClicked

    private void bn_b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_b6MouseClicked
        if(slot.get(11).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(11).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("12");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_b6MouseClicked

    private void bn_c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_c1MouseClicked
        if(slot.get(12).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(12).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("13");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_c1MouseClicked

    private void bn_c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_c2MouseClicked
        if(slot.get(13).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(13).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("14");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_c2MouseClicked

    private void bn_c3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_c3MouseClicked
        if(slot.get(14).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(14).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("15");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_c3MouseClicked

    private void bn_c4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_c4MouseClicked
        if(slot.get(15).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(15).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("16");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_c4MouseClicked

    private void bn_c5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_c5MouseClicked
        if(slot.get(16).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(16).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("17");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_c5MouseClicked

    private void bn_c6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_c6MouseClicked
        if(slot.get(17).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(17).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("18");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_c6MouseClicked

    private void bn_d1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_d1MouseClicked
        if(slot.get(18).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(18).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("19");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_d1MouseClicked

    private void bn_d2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_d2MouseClicked
        if(slot.get(19).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(19).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("20");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_d2MouseClicked

    private void bn_d3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_d3MouseClicked
        if(slot.get(20).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(20).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("21");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_d3MouseClicked

    private void bn_d4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_d4MouseClicked
        if(slot.get(21).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(21).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("22");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_d4MouseClicked

    private void bn_d5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_d5MouseClicked
        if(slot.get(22).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(22).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("23");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_d5MouseClicked

    private void bn_d6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bn_d6MouseClicked
        if(slot.get(23).equals("1")){
	    JOptionPane.showMessageDialog(null, "This slot is not availble");
	}
	else if(slot.get(23).equals("0")){
	    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		mu.bookSlotF1("24");
	    } else {
	     
	    }
	    
	}
    }//GEN-LAST:event_bn_d6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bn_a1;
    private javax.swing.JPanel bn_a2;
    private javax.swing.JPanel bn_a3;
    private javax.swing.JPanel bn_a4;
    private javax.swing.JPanel bn_a5;
    private javax.swing.JPanel bn_a6;
    private javax.swing.JPanel bn_b1;
    private javax.swing.JPanel bn_b2;
    private javax.swing.JPanel bn_b3;
    private javax.swing.JPanel bn_b4;
    private javax.swing.JPanel bn_b5;
    private javax.swing.JPanel bn_b6;
    private javax.swing.JPanel bn_c1;
    private javax.swing.JPanel bn_c2;
    private javax.swing.JPanel bn_c3;
    private javax.swing.JPanel bn_c4;
    private javax.swing.JPanel bn_c5;
    private javax.swing.JPanel bn_c6;
    private javax.swing.JPanel bn_d1;
    private javax.swing.JPanel bn_d2;
    private javax.swing.JPanel bn_d3;
    private javax.swing.JPanel bn_d4;
    private javax.swing.JPanel bn_d5;
    private javax.swing.JPanel bn_d6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JPanel pn_parking;
    private javax.swing.JPanel pn_topic;
    private javax.swing.JTextField tf_license;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
