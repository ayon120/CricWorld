/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class deleteColumnFrame extends JFrame{
    
    private static String table_name;
    private static int col_no;
    private static String[] col_names;
    private String[] val;
    
    private JPanel jp = new JPanel();
    private JLabel[] jl;
    private JCheckBox[] chck;
    private JButton dlte_bttn = new JButton("Delete");
    private JButton close_bttn = new JButton("Close");
    
    static private DatabaseHandler ob1 = new DatabaseHandler();
    
    public deleteColumnFrame(String table_name, int col_no, String[] col_names,DatabaseHandler ob1) {
        this.table_name = table_name;
        this.col_no = col_no;

        ob1.setConnection();

        System.out.println(table_name + " " + col_no);

        setTitle("Delete data");
        setVisible(true);
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        chck = new JCheckBox[col_no + 1];
        jl = new JLabel[col_no + 1];
        val = new String[col_no + 1];
        
        int j = 10;

        for (int i = 0; i < col_no; i++) {
            chck[i] = new JCheckBox();
            jl[i] = new JLabel();

            jl[i].setBounds(10, j, 100, 30);
            jl[i].setText(col_names[i]);
            chck[i].setBounds(225, j, 160, 30);

            j += 40;

            add(jl[i]);
            add(chck[i]);
        }

        j += 60;

        dlte_bttn.setBounds(60, j, 100, 40);

        close_bttn.setBounds(225, j, 100, 40);

        add(dlte_bttn);

        add(close_bttn);

        add(jp);
        
        dlte_bttn.addActionListener(new ActionListener() {
            int trav = 0;
            
            @Override
            public void actionPerformed(ActionEvent e) {
                 for (int i = 0; i < col_no; i++) {
                    if(chck[i].isSelected()){
                        val[trav++] = jl[i].getText();
                    }
                }
                
                ob1.deleteColumn(table_name, val,trav);
                
                trav = 0;
            }
            
        });
        
        close_bttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();    
            }
        });
    }
    
    
    
}
