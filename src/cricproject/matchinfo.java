/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricproject;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 * @author Ayon
 */
public class matchinfo extends javax.swing.JFrame {

    private static DatabaseHandler ob1 = new DatabaseHandler();
    private ResultSet result;
    private String m_id,t_name;
    private int selectedData;

    private TableModel model = null;

    public matchinfo(DatabaseHandler ob1) {
        initComponents();

        result = ob1.showMatchInfo();

        matchInfoTable.setModel(DbUtils.resultSetToTableModel(result));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        matchInfoTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        batting_Table = new javax.swing.JTable();
        matchStatsBttn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bowling_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        run = new javax.swing.JLabel();
        team = new javax.swing.JLabel();
        wicket = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        man = new javax.swing.JLabel();
        umpire = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        winner = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricproject/icons8-Home-64.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        matchInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        matchInfoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matchInfoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(matchInfoTable);

        batting_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(batting_Table);

        matchStatsBttn.setText("Match_Statistics");
        matchStatsBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchStatsBttnActionPerformed(evt);
            }
        });

        bowling_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(bowling_Table);

        jLabel1.setText("Batting Card");

        jLabel2.setText("Bowling Card");

        run.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        team.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        wicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Umpires:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Man of the Match:");

        man.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        umpire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Winner:");

        winner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setText(")");

        jLabel4.setText("/");

        jLabel5.setText("(");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(umpire)
                .addGap(266, 266, 266)
                .addComponent(team)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(run)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(wicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(man)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1)
                        .addGap(205, 205, 205)
                        .addComponent(matchStatsBttn)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(winner)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matchStatsBttn)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(winner))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(team)
                    .addComponent(run)
                    .addComponent(wicket)
                    .addComponent(jLabel7)
                    .addComponent(man)
                    .addComponent(umpire)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(318, 318, 318))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Homepage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void matchStatsBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchStatsBttnActionPerformed
        ob1.setConnection();
        
        String win = null;
        String mom = null;
        String totrun = null;
        String totwicket = null;
        String u = " ";
        if (model != null) {
            m_id = model.getValueAt(selectedData, 0).toString();
            t_name = model.getValueAt(selectedData, 1).toString();
            
            showBatting_Table();

            showBowling_Table();
        }
        try{
        
        
        ResultSet result1 = ob1.showList("select t_name from team where t_id = (select winner from matches where m_id = '"+m_id+"');");
         while(result1.next()){
            win = result1.getString(1);
        }
         
        winner.setText(win);
        team.setText(t_name);
        
        ResultSet result2 = ob1.showList("select p_name from player where p_id = (select mom from matches where m_id = '"+m_id+"');");
         while(result2.next()){
            mom = result2.getString(1);
        }
         
        man.setText(mom);
        
        ResultSet result3 = ob1.showList("select * from plays where  m_id = '"+m_id+"' and t_id = (select t_id from team where t_name = '"+t_name+"');");
         while(result3.next()){
            totrun = result3.getString(3);
            totwicket = result3.getString(4);
            
        }
        
        run.setText(totrun);
       wicket.setText(totwicket);
       
        
        ResultSet result4 = ob1.showList("select u_name from umpire where u_id in (select u_id from supervises where m_id = '"+m_id+"');");
            
        while(result4.next()){
            u = u + result4.getString(1) + "  ";
        }
           
         umpire.setText(u);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_matchStatsBttnActionPerformed

    private void matchInfoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matchInfoTableMouseClicked
        selectedData = matchInfoTable.getSelectedRow();

        model = matchInfoTable.getModel();
    }//GEN-LAST:event_matchInfoTableMouseClicked

    private void showBatting_Table() {

        result = ob1.showBattingCard(m_id,t_name);

        batting_Table.setModel(DbUtils.resultSetToTableModel(result));

    }

    private void showBowling_Table() {

        result = ob1.showBowlingCard(m_id,t_name);

        bowling_Table.setModel(DbUtils.resultSetToTableModel(result));

    }

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
            java.util.logging.Logger.getLogger(matchinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matchinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matchinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matchinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matchinfo(ob1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable batting_Table;
    private javax.swing.JTable bowling_Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel man;
    private javax.swing.JTable matchInfoTable;
    private javax.swing.JButton matchStatsBttn;
    private javax.swing.JLabel run;
    private javax.swing.JLabel team;
    private javax.swing.JLabel umpire;
    private javax.swing.JLabel wicket;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables
}
