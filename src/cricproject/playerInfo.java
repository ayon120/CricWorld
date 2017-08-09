/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafee
 */
public class playerInfo extends javax.swing.JFrame {
    
    private DatabaseHandler ob1 = new DatabaseHandler();

    private static String plyrName = null;
    private static String plyrCatg = null;
    private static String plyrDOB = null;
    private static String plyrTeam = null;
    private static ResultSet rs1 = null;
    private static ResultSet rs2 = null;
    private static ResultSet rs3 = null;
    private static ResultSet rs4 = null;
    private static ResultSet rs5 = null;
    private static ResultSet rs6 = null;
    private static ResultSet rs7= null;
    private static ResultSet rs8 = null;
    private static ResultSet rs9 = null;
    private static ResultSet rs10 = null;
    private static ResultSet rs11 = null;
    private static ResultSet rs12 = null;
    private static ResultSet rs13 = null;
    private static ResultSet rs14 = null;
    private static ResultSet rs15 = null;
    private static ResultSet rs16 = null;
    private static ResultSet rs17 = null;
    
    
    
    public playerInfo() {
        initComponents();
    }
    
    public playerInfo(String plyrName,String plyrCatg,String plyrDOB,String plyrTeam,ResultSet rs1, ResultSet rs2, ResultSet rs3, ResultSet rs4, ResultSet rs5, 
            ResultSet rs6,ResultSet rs7,ResultSet rs8,ResultSet rs9,ResultSet rs10,ResultSet rs11,ResultSet rs12,ResultSet rs13, ResultSet rs14,
            ResultSet rs15, ResultSet rs16, ResultSet rs17){
        
        initComponents();
            
        this.plyrName = plyrName;
        this.plyrCatg = plyrCatg;
        this.plyrDOB = plyrDOB;
        this.plyrTeam = plyrTeam;
            
        playerName.setText(this.plyrName);
        playerCatg.setText(this.plyrCatg);
        playerDOB.setText(this.plyrDOB);
        playerTeam.setText(this.plyrTeam);
            
        try {  
            if(rs1 != null)
            {
                while(rs1.next())
                {                  
                    pinningsbowled.setText(rs1.getString(1));
                }  
            }
            if(rs2 != null)
            {
                while(rs2.next())
                {
                    pinnbat.setText(rs2.getString(1));     
                }
            }
            
            if(rs3 != null)
            {
                while(rs3.next())
                {
                    totwicket.setText(rs3.getString(1));     
                }
            }
            if(rs4 != null)
            {
                while(rs4.next())
                {
                    highestwicket.setText(rs4.getString(1));     
                }
            }
            int over = 0, run = 0;
            
            if(rs5 != null)
            { 
                while(rs5.next())
                {
                    if(!rs5.wasNull())
                    {
                        over = rs5.getInt(1); 
                        run = rs5.getInt(2);
                        double eco = 0.0;
                        if(over != 0)
                            eco = (double) run/over;

                        economy.setText(Double.toString(eco)); 
                    }
                }
            }
            
            if(rs6 != null)
            {
                while(rs6.next())
                {
                    pcatches.setText(rs6.getString(1));     
                }
            }
            
            if(rs7 != null)
            {
                while(rs7.next())
                {
                    ptotrun.setText(rs7.getString(1));     
                }
            }
            
            if(rs8 != null)
            {
                while(rs8.next())
                {
                    phighestrun.setText(rs8.getString(1));     
                }
            }
            
            if(rs9 != null)
            {
                while(rs9.next())
                {
                    p50.setText(rs9.getString(1));     
                }
            }
            
            if(rs10 != null)
            {
                while(rs10.next())
                {
                    p100.setText(rs10.getString(1));     
                }
            }
            
            int runs = 0, ball = 0;
            if(rs11 != null)
            { 
                while(rs11.next())
                {
                    if(!rs11.wasNull())
                    {
                        runs = rs11.getInt(1); 
                        ball = rs11.getInt(2);
                        double sr = 0.0;
                        if(ball != 0)
                        sr = (double) runs*100/ball;

                        pstrikerate.setText(Double.toString(sr)); 
                    }
                }
            }
            
            if(rs12 != null)
            {
                while(rs12.next())
                {
                    highestwicketagainst.setText(rs12.getString(2));     
                }
            }
            
            if(rs13 != null)
            {
                while(rs13.next())
                {
                    highestrunagainst.setText(rs13.getString(2));     
                }
            }
            
            if(rs14 != null)
            {
                while(rs14.next())
                {
                    pmom.setText(rs14.getString(1));     
                }
            }
            
            if(rs15 != null)
            {
                while(rs15.next())
                {
                    pmatchplayed.setText(rs15.getString(1));     
                }
            }
            
            if(rs16 != null)
            {
                while(rs16.next())
                {
                    podiwickets.setText(rs16.getString(1));     
                }
            }
            
            if(rs17 != null)
            {
                while(rs17.next())
                {
                    podiruns.setText(rs17.getString(1));     
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(playerInfo.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        playerName = new javax.swing.JLabel();
        playerCatg = new javax.swing.JLabel();
        playerDOB = new javax.swing.JLabel();
        playerTeam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pmatchplayed = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pinnbat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ptotrun = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phighestrun = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p50 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        p100 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pmom = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pinningsbowled = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totwicket = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        highestwicket = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        highestrunagainst = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        podiruns = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        economy = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        pcatches = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pstrikerate = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        podiwickets = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        highestwicketagainst = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        playerName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        playerTeam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Catagory:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Date of birth:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricproject/icons8-Home-64.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Match-Played:");

        pmatchplayed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Innings-Batted:");

        pinnbat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total-Runs:");

        ptotrun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Highest-Run:");

        phighestrun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("50's:");

        p50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("100's:");

        p100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Man of the match:");

        pmom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Innings-Bowled:");

        pinningsbowled.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Total-Wickets:");

        totwicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Higest-Wicket:");

        highestwicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setText("Against");

        jLabel19.setText("ODI:");

        jLabel21.setText("Test:");

        jLabel23.setText("t20:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Economy-Rate:");

        economy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Catches:");

        pcatches.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Strike-Rate:");

        pstrikerate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel29.setText("ODI:");

        jLabel33.setText("Test:");

        jLabel35.setText("T20:");

        jLabel37.setText("Against");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Team:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel31))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p100)
                            .addComponent(p50)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phighestrun)
                                    .addComponent(ptotrun))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(highestrunagainst))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(podiruns)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pinningsbowled)
                                .addComponent(pinnbat))
                            .addComponent(pstrikerate)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(highestwicket)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel37)
                                        .addGap(18, 18, 18)
                                        .addComponent(highestwicketagainst))
                                    .addComponent(economy)
                                    .addComponent(pcatches)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(totwicket)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(podiwickets)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel34)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel36))))
                            .addComponent(pmom)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pmatchplayed)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(playerDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(playerCatg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(playerTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(131, 131, 131))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(playerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerCatg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(pinningsbowled)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10)
                                    .addComponent(totwicket)
                                    .addComponent(jLabel29)
                                    .addComponent(podiwickets)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(pmatchplayed)
                                    .addComponent(jLabel14)
                                    .addComponent(highestwicket)
                                    .addComponent(jLabel37)
                                    .addComponent(highestwicketagainst))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(economy))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(pcatches))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(pinnbat))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(ptotrun)
                                    .addComponent(jLabel19)
                                    .addComponent(podiruns)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(phighestrun)
                                    .addComponent(jLabel17)
                                    .addComponent(highestrunagainst))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(p50))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(p100))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(pstrikerate))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(pmom)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(473, 473, 473)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.dispose();
        new Homepage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(playerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playerInfo(plyrName,plyrCatg,plyrDOB,plyrTeam,rs1,rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10,rs11,rs12,rs13,rs14,rs15,rs16,rs17).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel economy;
    private javax.swing.JLabel highestrunagainst;
    private javax.swing.JLabel highestwicket;
    private javax.swing.JLabel highestwicketagainst;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p100;
    private javax.swing.JLabel p50;
    private javax.swing.JLabel pcatches;
    private javax.swing.JLabel phighestrun;
    private javax.swing.JLabel pinnbat;
    private javax.swing.JLabel pinningsbowled;
    private javax.swing.JLabel playerCatg;
    private javax.swing.JLabel playerDOB;
    private javax.swing.JLabel playerName;
    private javax.swing.JLabel playerTeam;
    private javax.swing.JLabel pmatchplayed;
    private javax.swing.JLabel pmom;
    private javax.swing.JLabel podiruns;
    private javax.swing.JLabel podiwickets;
    private javax.swing.JLabel pstrikerate;
    private javax.swing.JLabel ptotrun;
    private javax.swing.JLabel totwicket;
    // End of variables declaration//GEN-END:variables
}
