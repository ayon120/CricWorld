/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rafee
 */
public class updateFormAdmin extends JFrame {

    private static String table_name;
    private static int col_no;
    private static String[] col_names;
    private static String updateVal;
    private static String updateColumnName;
    
    private JPanel jp = new JPanel();
    private JLabel[] jl;
    private JTextField[] jt;
    private JButton jb = new JButton("Update");
    private JButton close_bttn = new JButton("Close");

    private static DatabaseHandler ob1 = new DatabaseHandler();
    private HashMap<String, String> colVal = new HashMap<String, String>();

    public updateFormAdmin(String table_name, int col_no, String[] col_names, DatabaseHandler ob1,String updateVal,String updateColumnName) {
        this.table_name = table_name;
        this.col_no = col_no;

        System.out.println(table_name + " " + col_no);

        setTitle("Update data");
        setVisible(true);
        setSize(450, 430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        jt = new JTextField[col_no + 1];
        jl = new JLabel[col_no + 1];
        
        int j = 10;

        for (int i = 0; i < col_no; i++) {
            jt[i] = new JTextField();
            jl[i] = new JLabel();

            jl[i].setBounds(10, j, 100, 30);
            jl[i].setText(col_names[i]);
            jt[i].setBounds(225, j, 160, 30);

            j += 40;

            add(jl[i]);
            add(jt[i]);
        }

        j += 30;

        jb.setBounds(60, j, 100, 40);

        close_bttn.setBounds(225, j, 100, 40);

        add(jb);

        add(close_bttn);

        add(jp);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < col_no; i++) {

                    if (!jt[i].getText().equals("")) {
                        colVal.put(jl[i].getText(), jt[i].getText());
                    }
                 }
                
                ob1.updateData(table_name, colVal, updateVal, updateColumnName);
                
                colVal.clear();
            }
        });

        close_bttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colVal.clear();
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        updateFormAdmin t = new updateFormAdmin(table_name, col_no, col_names, ob1,updateVal,updateColumnName);
    }

}
