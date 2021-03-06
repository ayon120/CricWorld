/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafee
 */
public class teamInfo extends javax.swing.JFrame {
    
    private DatabaseHandler ob1 = new DatabaseHandler();
    private String tableName = null;
    private String selectedteamName = null;
    
    public teamInfo() {
        initComponents();
        
        ob1.setConnection();
        
        showTeamList();
        
    }
    
    private void showTeamList() {
        try {
            teamComboBox.removeAllItems();
            
            ArrayList<String> table;
            
            tableName = "team";
            
            ResultSet result = ob1.showAllDataQuery(tableName,null,null,0);
            
            while (result.next()) {
                teamComboBox.addItem(result.getString(2));
                //result.getString(2) is team name
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
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
        selectTeamBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        playerList = new javax.swing.JList<>();
        teamComboBox = new javax.swing.JComboBox<>();
        cancelBttn = new javax.swing.JButton();
        selectPlayerBttn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tmatchplayed = new javax.swing.JLabel();
        tmatchwon = new javax.swing.JLabel();
        twinrate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        todi = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ttest = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tt20 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        todiwon = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ttestwon = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tt20won = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        selectTeamBttn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectTeamBttn.setText("Select");
        selectTeamBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTeamBttnActionPerformed(evt);
            }
        });

        playerList.setModel(new DefaultListModel ());
        jScrollPane1.setViewportView(playerList);

        teamComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teamComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cancelBttn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelBttn.setText("Cancel");
        cancelBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBttnActionPerformed(evt);
            }
        });

        selectPlayerBttn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectPlayerBttn.setText("Select Player");
        selectPlayerBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPlayerBttnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Teams");

        tname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tname.setText("Show Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Match-Played:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Match-Won:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Winning-Rate:");

        tmatchplayed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tmatchwon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        twinrate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("ODI:");

        todi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Test:");

        ttest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("T20:");

        tt20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("ODI");

        todiwon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Test:");

        ttestwon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("T20:");

        tt20won.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricproject/icons8-Home-64.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(81, 81, 81)
                                .addComponent(tmatchplayed)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(todi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(twinrate))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(91, 91, 91)
                                    .addComponent(tmatchwon))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(selectTeamBttn)
                                .addGap(32, 32, 32)
                                .addComponent(cancelBttn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(teamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tname))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(374, 374, 374)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addComponent(todiwon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(selectPlayerBttn)))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttestwon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttest)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tt20)
                    .addComponent(tt20won))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tname))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectTeamBttn)
                            .addComponent(cancelBttn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tmatchplayed)
                            .addComponent(jLabel14)
                            .addComponent(todi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(ttest)
                            .addComponent(jLabel18)
                            .addComponent(tt20))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tmatchwon)
                            .addComponent(jLabel20)
                            .addComponent(todiwon, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(ttestwon)
                            .addComponent(jLabel24)
                            .addComponent(tt20won))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(twinrate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(selectPlayerBttn)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectTeamBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTeamBttnActionPerformed
        try {
            selectedteamName = teamComboBox.getSelectedItem().toString();
            
            ResultSet result = ob1.showPlayerList(selectedteamName);
            
            DefaultListModel listModel =  (DefaultListModel) playerList.getModel();
            
            listModel.removeAllElements();
            
            while(result.next()){
                listModel.addElement(result.getString(1));
            }
            
            playerList.setModel(listModel);
            
            ResultSet result1 = ob1.teamMatchPlayed(selectedteamName);
            
            int m = 0, w = 0;
            while(result1.next())
            {   
                if(!result1.wasNull())
                {
                    tmatchplayed.setText(result1.getString(2));
                    m = ((Number) result1.getObject(2)).intValue();
                }
            }
            
            ResultSet result3 = ob1.teamODIPlayed(selectedteamName);
            
            //int m = 0, w = 0;
            while(result3.next())
            {   
                if(!result3.wasNull())
                {
                    todi.setText(result3.getString(2));
                    //m = ((Number) result1.getObject(2)).intValue();
                }
            }
            
            ResultSet result2 = ob1.teamWinCount(selectedteamName);
            
            while(result2.next())
            {
                if(!result2.wasNull())
                {
                    tmatchwon.setText(result2.getString(1));
                    w = ((Number) result2.getObject(1)).intValue();
                    
                    if(w != 0 || m != 0)
                    {
                        double winrate = (w/m)*100.0;
                        twinrate.setText(Double.toString(winrate));
                    }
                }
            }
            
            ResultSet result4 = ob1.teamWinCount(selectedteamName);
            
            while(result4.next())
            {
                if(!result4.wasNull())
                {
                    todiwon.setText(result4.getString(1));
                    //w = ((Number) result2.getObject(1)).intValue();
                    
                }
            }
            
            tname.setText(teamComboBox.getSelectedItem().toString());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_selectTeamBttnActionPerformed

    private void cancelBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBttnActionPerformed

    private void selectPlayerBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPlayerBttnActionPerformed
        try{
        String playerName = playerList.getSelectedValue();
        String playerCatg = null;
        String playerDOB = null;         
        
        String col_name = "p_name";
        
        tableName = "player";
        
        ResultSet result = ob1.showAllDataQuery(tableName, col_name, playerName, 1);
        
        while(result.next()){
            playerCatg = result.getString(4);
            playerDOB = result.getString(5);
        }
        
        ResultSet result1 = ob1.playerInningsBowled(playerName);
        ResultSet result2 = ob1.playerInningsBatted(playerName);
        ResultSet result3 = ob1.playerWicketsTaken(playerName);
        ResultSet result4 = ob1.playerHighestWicket(playerName);
        ResultSet result5 = ob1.playerEconomy(playerName);
        ResultSet result6 = ob1.playerCatches(playerName);
        ResultSet result7 = ob1.playerTotRuns(playerName);
        ResultSet result8 = ob1.playerHighestScore(playerName);
        ResultSet result9 = ob1.playerFifties(playerName);
        ResultSet result10 = ob1.playerHundreds(playerName);
        ResultSet result11 = ob1.playerStrikeRate(playerName);
        ResultSet result12 = ob1.playerHighestWicketAgainst(playerName);
        ResultSet result13 = ob1.playerHighestScoreAgainst(playerName);
        ResultSet result14 = ob1.playerMOMs(playerName);
        ResultSet result15 = ob1.playermatchplayed(playerName);
        ResultSet result16 = ob1.playerODIWicketsTaken(playerName);
        ResultSet result17 = ob1.playerODIRuns(playerName);
  
        playerInfo ob2 = new playerInfo(playerName, playerCatg, playerDOB, selectedteamName, result1, result2, result3, result4, result5, result6, result7,result8,result9,result10,result11,result12,result13,result14,result15,result16,result17);
        this.dispose();
        ob2.setVisible(true);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_selectPlayerBttnActionPerformed

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
            java.util.logging.Logger.getLogger(teamInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teamInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teamInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teamInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teamInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBttn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> playerList;
    private javax.swing.JButton selectPlayerBttn;
    private javax.swing.JButton selectTeamBttn;
    private javax.swing.JComboBox<String> teamComboBox;
    private javax.swing.JLabel tmatchplayed;
    private javax.swing.JLabel tmatchwon;
    private javax.swing.JLabel tname;
    private javax.swing.JLabel todi;
    private javax.swing.JLabel todiwon;
    private javax.swing.JLabel tt20;
    private javax.swing.JLabel tt20won;
    private javax.swing.JLabel ttest;
    private javax.swing.JLabel ttestwon;
    private javax.swing.JLabel twinrate;
    // End of variables declaration//GEN-END:variables
}
