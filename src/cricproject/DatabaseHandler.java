/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafee
 */
public class DatabaseHandler {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement pStatement = null;
    private ResultSet result = null;
    private String databaseName;

    private ArrayList<String> tableName = new ArrayList<String>();

    private int sz_insertion;

    public void setConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/" + "cricworld";

            String user = "root";

            String password = null;

            connect = DriverManager.getConnection(url, user, password);

            //JOptionPane.showMessageDialog(null, "Connection Successfull");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

    }
    
    //show tables of database
    public ArrayList<String> showtable() {
        try {
            String[] types = {"TABLE"};

            result = connect.getMetaData().getTables(this.databaseName, null, "%", types);

            while (result.next()) {
                tableName.add(result.getString(3));
                // System.out.println(tableName);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return tableName;
    }

    //select all data from table
    public ResultSet showAllDataQuery(String table_name,String col_name,String val,int cond_count) {
        try {
            String query = "SELECT * FROM " + table_name;
            
            for(int i=0; i<cond_count; i++){
                query += " WHERE "+col_name+"= "+"'"+val+"'";
            }
            
            statement = connect.createStatement();
            result = statement.executeQuery(query);

            System.out.println("Query is successful");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
    }
    
   public ResultSet showPlayerList(String team_name){
       try {
            String query = "SELECT p.p_name FROM player p INNER JOIN team t ON p.t_id = t.t_id WHERE t.t_name = "+"'"+team_name+"'";
            statement = connect.createStatement();
            result = statement.executeQuery(query);

            System.out.println("Query is successful");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
   }
    
    public void insertData(String table_name, String[] val) {
        try {
            String query = "INSERT INTO " + table_name + " VALUES(";

            sz_insertion = val.length - 1;
             
            for (int i = 1; i <= sz_insertion; i++) {
                query += "?";
                if (i < sz_insertion) {
                    query += ",";
                }
            }
            query += ")";

            System.out.println(query);

            pStatement = connect.prepareStatement(query);

            for (int i = 0; i < sz_insertion; i++) {
                pStatement.setString(i + 1, val[i]);
            }

            pStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Insertion Successfull");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    
    public void showMatchInfo(String table_name){
        try{
            
        }catch(Exception e){
            
        }
    }
    
    public void updateData(String table_name,HashMap<String,String> colVal,String updateVal,String updateColumnName){
         try{
            String query = "UPDATE "+table_name+" SET ";
            
            Iterator<String> iter = colVal.keySet().iterator();
            
            while(iter.hasNext()){
                String colmn = iter.next();
                
                query += colmn;
                
                query += "= "+colVal.get(colmn);//get column value
                
                if(iter.hasNext()){
                    query += ", ";
                }
            }
            
            query += " WHERE "+updateColumnName + "= "+updateVal;
            
            System.out.println(query);
            
            pStatement = connect.prepareStatement(query);

            pStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Update successful");
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
    }
    
    public void deleteData(String table_name, String col_name, String val) {
        try {
            //System.out.println(table_name + " " + col_name + " " + val);

            String query = "DELETE FROM " + table_name + " WHERE " + col_name + "= ?";

            pStatement = connect.prepareStatement(query);

            pStatement.setString(1, val);

            pStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    
    public void deleteColumn(String table_name,String[] val,int trav){
        try{
            String query = "ALTER TABLE "+table_name +" DROP COLUMN ";
             
            for (int i = 0; i < trav; i++) {
                query += val[i];
                
                if(i+1 < trav){
                    query += ",";
                    
                    query += "DROP COLUMN ";
                }
            }

            System.out.println(query);

            pStatement = connect.prepareStatement(query);

            pStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Deleted Column Successfull");
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    
    public void addColumn(String table_name, String col_name, String col_type) {
        try {
            String query = "ALTER TABLE " + table_name + " ADD " + col_name + " " + col_type;

            System.out.println(query);

            statement = connect.createStatement();

            int s = statement.executeUpdate(query);

            System.out.println(s);

            JOptionPane.showMessageDialog(null, "Added Column Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
}
