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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
   
   public ResultSet teamMatchPlayed(String team_name)
   {
        try {
            String query = "SELECT t.t_name, count(*) AS match_played FROM plays AS p INNER JOIN team AS t ON t.t_id = p.t_id "
                    + "WHERE t.t_name = "+"'"+team_name+"'";
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            
            System.out.println("Query is successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
   }
   
   public ResultSet teamWinCount(String team_name)
   {
       try {
            String query = "SELECT count(*) FROM team AS t INNER JOIN plays AS p ON p.t_id = t.t_id AND t_name = "+"'"+team_name+"'"
                    + "INNER JOIN matches AS m ON m.m_id = p.m_id WHERE t.t_id = winner";
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            
            System.out.println("Query is successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
   }
   
   public ResultSet playerInningsBowled(String p_name)
   {
       try {
            String query = "SELECT count(*) FROM player AS p INNER JOIN bowling_card AS b ON b.p_id = p.p_id WHERE p_name = "+"'"+p_name+"'";
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            
            System.out.println("Query is successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
   }
   
   public ResultSet playerInningsBatted(String p_name)
   {
       try {
            String query = "SELECT count(*) FROM player AS p INNER JOIN batting_card AS b ON b.p_id = p.p_id WHERE p_name = "+"'"+p_name+"'";
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            
            System.out.println("Query is successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
   }
   
   public ResultSet playerWicketsTaken(String p_name)
   {
       try {
            String query = "SELECT sum(b.wickets) FROM bowling_card AS b INNER JOIN player AS p ON p.p_id = b.p_id WHERE p.p_name = "+"'"+p_name+"'";
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            
            System.out.println("Query is successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
   }
   
   public ResultSet playerHighestWicket(String p_name)
   {
       try {
            String query = "SELECT max(b.wickets) FROM bowling_card AS b INNER JOIN player AS p ON p.p_id = b.p_id WHERE p.p_name = "+"'"+p_name+"'";
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            
            System.out.println("Query is successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
   }
   
   public ResultSet playerEconomy(String p_name)
   {
       try {
            String query = "SELECT sum(overs), sum(runs_given) FROM player AS p INNER JOIN bowling_card AS b ON p.p_id = b.p_id WHERE p.p_name = "+"'"+p_name+"'";
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            
            System.out.println("Query is successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
   }
   
   public ResultSet playerCatches(String p_name)
   {
       try {
            String query = "SELECT count(*) FROM player AS p INNER JOIN batting_card AS b ON b.out_fielder = p.p_id AND out_type = 'Catch Out' WHERE p_name = "+"'"+p_name+"'";
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            
            System.out.println("Query is successful");
        } catch (SQLException e) {
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

    public void deleteData(String table_name, String col_name, String val) {
        try {
            System.out.println(table_name + " " + col_name + " " + val);

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
