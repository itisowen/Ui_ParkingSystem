/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

/**
 *
 * @author Owen
 */
public class Pnl_Booking extends javax.swing.JPanel {

    private MainUser mu;
    public Pnl_Booking(MainUser mu) {
        this.mu = mu;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_topic = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
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

        jTextField1.setText("jTextField1");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 254));
        jLabel5.setText("User :");

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout pn_topicLayout = new javax.swing.GroupLayout(pn_topic);
        pn_topic.setLayout(pn_topicLayout);
        pn_topicLayout.setHorizontalGroup(
            pn_topicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_topicLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(80, 80, 80)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        pn_topicLayout.setVerticalGroup(
            pn_topicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_topicLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(pn_topicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(pn_topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pn_parking.setBackground(new java.awt.Color(153, 153, 255));
        pn_parking.setLayout(null);

        jLabel1.setText("A1");

        javax.swing.GroupLayout bn_a1Layout = new javax.swing.GroupLayout(bn_a1);
        bn_a1.setLayout(bn_a1Layout);
        bn_a1Layout.setHorizontalGroup(
            bn_a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_a1Layout.setVerticalGroup(
            bn_a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pn_parking.add(bn_a1);
        bn_a1.setBounds(10, 10, 100, 100);

        jLabel10.setText("A2");

        javax.swing.GroupLayout bn_a2Layout = new javax.swing.GroupLayout(bn_a2);
        bn_a2.setLayout(bn_a2Layout);
        bn_a2Layout.setHorizontalGroup(
            bn_a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_a2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(41, 41, 41))
        );
        bn_a2Layout.setVerticalGroup(
            bn_a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_a2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(40, 40, 40))
        );

        pn_parking.add(bn_a2);
        bn_a2.setBounds(120, 10, 100, 100);

        jLabel17.setText("A3");

        javax.swing.GroupLayout bn_a3Layout = new javax.swing.GroupLayout(bn_a3);
        bn_a3.setLayout(bn_a3Layout);
        bn_a3Layout.setHorizontalGroup(
            bn_a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel17)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bn_a3Layout.setVerticalGroup(
            bn_a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_a3Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(41, 41, 41))
        );

        pn_parking.add(bn_a3);
        bn_a3.setBounds(230, 10, 100, 100);

        jLabel11.setText("A4");

        javax.swing.GroupLayout bn_a4Layout = new javax.swing.GroupLayout(bn_a4);
        bn_a4.setLayout(bn_a4Layout);
        bn_a4Layout.setHorizontalGroup(
            bn_a4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel11)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        bn_a4Layout.setVerticalGroup(
            bn_a4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_a4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(40, 40, 40))
        );

        pn_parking.add(bn_a4);
        bn_a4.setBounds(340, 10, 100, 100);

        jLabel15.setText("A5");

        javax.swing.GroupLayout bn_a5Layout = new javax.swing.GroupLayout(bn_a5);
        bn_a5.setLayout(bn_a5Layout);
        bn_a5Layout.setHorizontalGroup(
            bn_a5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_a5Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(42, 42, 42))
        );
        bn_a5Layout.setVerticalGroup(
            bn_a5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_a5Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(39, 39, 39))
        );

        pn_parking.add(bn_a5);
        bn_a5.setBounds(450, 10, 100, 100);

        jLabel16.setText("A6");

        javax.swing.GroupLayout bn_a6Layout = new javax.swing.GroupLayout(bn_a6);
        bn_a6.setLayout(bn_a6Layout);
        bn_a6Layout.setHorizontalGroup(
            bn_a6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_a6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel16)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_a6Layout.setVerticalGroup(
            bn_a6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_a6Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(38, 38, 38))
        );

        pn_parking.add(bn_a6);
        bn_a6.setBounds(560, 10, 100, 100);

        jLabel18.setText("B1");

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
                .addGap(40, 40, 40)
                .addComponent(jLabel18)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b1);
        bn_b1.setBounds(10, 120, 100, 100);

        jLabel20.setText("B2");

        javax.swing.GroupLayout bn_b2Layout = new javax.swing.GroupLayout(bn_b2);
        bn_b2.setLayout(bn_b2Layout);
        bn_b2Layout.setHorizontalGroup(
            bn_b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel20)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_b2Layout.setVerticalGroup(
            bn_b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel20)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b2);
        bn_b2.setBounds(120, 120, 100, 100);

        jLabel21.setText("B3");

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
                .addGap(41, 41, 41)
                .addComponent(jLabel21)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b3);
        bn_b3.setBounds(230, 120, 100, 100);

        jLabel25.setText("B4");

        javax.swing.GroupLayout bn_b4Layout = new javax.swing.GroupLayout(bn_b4);
        bn_b4.setLayout(bn_b4Layout);
        bn_b4Layout.setHorizontalGroup(
            bn_b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel25)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bn_b4Layout.setVerticalGroup(
            bn_b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel25)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b4);
        bn_b4.setBounds(340, 120, 100, 100);

        jLabel26.setText("B5");

        javax.swing.GroupLayout bn_b5Layout = new javax.swing.GroupLayout(bn_b5);
        bn_b5.setLayout(bn_b5Layout);
        bn_b5Layout.setHorizontalGroup(
            bn_b5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel26)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_b5Layout.setVerticalGroup(
            bn_b5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel26)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b5);
        bn_b5.setBounds(450, 120, 100, 100);

        jLabel27.setText("B6");

        javax.swing.GroupLayout bn_b6Layout = new javax.swing.GroupLayout(bn_b6);
        bn_b6.setLayout(bn_b6Layout);
        bn_b6Layout.setHorizontalGroup(
            bn_b6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_b6Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(41, 41, 41))
        );
        bn_b6Layout.setVerticalGroup(
            bn_b6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_b6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel27)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_b6);
        bn_b6.setBounds(560, 120, 100, 100);

        jLabel56.setText("C1");

        javax.swing.GroupLayout bn_c1Layout = new javax.swing.GroupLayout(bn_c1);
        bn_c1.setLayout(bn_c1Layout);
        bn_c1Layout.setHorizontalGroup(
            bn_c1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel56)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bn_c1Layout.setVerticalGroup(
            bn_c1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel56)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c1);
        bn_c1.setBounds(10, 230, 100, 100);

        jLabel36.setText("C2");

        javax.swing.GroupLayout bn_c2Layout = new javax.swing.GroupLayout(bn_c2);
        bn_c2.setLayout(bn_c2Layout);
        bn_c2Layout.setHorizontalGroup(
            bn_c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_c2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(41, 41, 41))
        );
        bn_c2Layout.setVerticalGroup(
            bn_c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel36)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c2);
        bn_c2.setBounds(120, 230, 100, 100);

        jLabel58.setText("C3");

        javax.swing.GroupLayout bn_c3Layout = new javax.swing.GroupLayout(bn_c3);
        bn_c3.setLayout(bn_c3Layout);
        bn_c3Layout.setHorizontalGroup(
            bn_c3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel58)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_c3Layout.setVerticalGroup(
            bn_c3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel58)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c3);
        bn_c3.setBounds(230, 230, 100, 100);

        jLabel39.setText("C4");

        javax.swing.GroupLayout bn_c4Layout = new javax.swing.GroupLayout(bn_c4);
        bn_c4.setLayout(bn_c4Layout);
        bn_c4Layout.setHorizontalGroup(
            bn_c4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel39)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_c4Layout.setVerticalGroup(
            bn_c4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel39)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c4);
        bn_c4.setBounds(340, 230, 100, 100);

        jLabel57.setText("C5");

        javax.swing.GroupLayout bn_c5Layout = new javax.swing.GroupLayout(bn_c5);
        bn_c5.setLayout(bn_c5Layout);
        bn_c5Layout.setHorizontalGroup(
            bn_c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel57)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        bn_c5Layout.setVerticalGroup(
            bn_c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel57)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c5);
        bn_c5.setBounds(450, 230, 100, 100);

        jLabel64.setText("C6");

        javax.swing.GroupLayout bn_c6Layout = new javax.swing.GroupLayout(bn_c6);
        bn_c6.setLayout(bn_c6Layout);
        bn_c6Layout.setHorizontalGroup(
            bn_c6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel64)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_c6Layout.setVerticalGroup(
            bn_c6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_c6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel64)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_c6);
        bn_c6.setBounds(560, 230, 100, 100);

        jLabel59.setText("D1");

        javax.swing.GroupLayout bn_d1Layout = new javax.swing.GroupLayout(bn_d1);
        bn_d1.setLayout(bn_d1Layout);
        bn_d1Layout.setHorizontalGroup(
            bn_d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel59)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        bn_d1Layout.setVerticalGroup(
            bn_d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel59)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d1);
        bn_d1.setBounds(10, 340, 100, 100);

        jLabel60.setText("D2");

        javax.swing.GroupLayout bn_d2Layout = new javax.swing.GroupLayout(bn_d2);
        bn_d2.setLayout(bn_d2Layout);
        bn_d2Layout.setHorizontalGroup(
            bn_d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel60)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        bn_d2Layout.setVerticalGroup(
            bn_d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel60)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d2);
        bn_d2.setBounds(120, 340, 100, 100);

        jLabel61.setText("D3");

        javax.swing.GroupLayout bn_d3Layout = new javax.swing.GroupLayout(bn_d3);
        bn_d3.setLayout(bn_d3Layout);
        bn_d3Layout.setHorizontalGroup(
            bn_d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel61)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        bn_d3Layout.setVerticalGroup(
            bn_d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel61)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d3);
        bn_d3.setBounds(230, 340, 100, 100);

        jLabel62.setText("D4");

        javax.swing.GroupLayout bn_d4Layout = new javax.swing.GroupLayout(bn_d4);
        bn_d4.setLayout(bn_d4Layout);
        bn_d4Layout.setHorizontalGroup(
            bn_d4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel62)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bn_d4Layout.setVerticalGroup(
            bn_d4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel62)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d4);
        bn_d4.setBounds(340, 340, 100, 100);

        jLabel63.setText("D5");

        javax.swing.GroupLayout bn_d5Layout = new javax.swing.GroupLayout(bn_d5);
        bn_d5.setLayout(bn_d5Layout);
        bn_d5Layout.setHorizontalGroup(
            bn_d5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bn_d5Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addGap(42, 42, 42))
        );
        bn_d5Layout.setVerticalGroup(
            bn_d5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel63)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d5);
        bn_d5.setBounds(450, 340, 100, 100);

        jLabel66.setText("D6");

        javax.swing.GroupLayout bn_d6Layout = new javax.swing.GroupLayout(bn_d6);
        bn_d6.setLayout(bn_d6Layout);
        bn_d6Layout.setHorizontalGroup(
            bn_d6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel66)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        bn_d6Layout.setVerticalGroup(
            bn_d6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bn_d6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel66)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pn_parking.add(bn_d6);
        bn_d6.setBounds(560, 340, 100, 100);

        add(pn_parking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 680, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel pn_parking;
    private javax.swing.JPanel pn_topic;
    // End of variables declaration//GEN-END:variables
}
