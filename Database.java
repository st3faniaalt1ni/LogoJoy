/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogoJoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JOY
 */
public abstract class Database {
            
        
        
          public static void connectionDB(){ 
Connection conn=null;
    Statement st;
    ResultSet rs=null;
        
    try {
       String driver="com.mysql.jdbc.Driver";
       String url="jdbc:derby://localhost:1527/LogoJoyDB";
       Class.forName(driver);
    conn= DriverManager.getConnection(url,null,null);
    st=conn.createStatement();
    rs=st.executeQuery("select * from GNWMATEUSEIS ");
    while (rs.next()){
        int i=0;
        System.out.println(rs.getString(i));
        i++;
        
    }
    st.close();
    conn.close();
}
    catch (SQLException ex){
   JOptionPane.showInputDialog(ex,JOptionPane.ERROR_MESSAGE);
}           catch (ClassNotFoundException ex) {
                Logger.getLogger(Voithitikes_methodoi.class.getName()).log(Level.SEVERE, null, ex);
            }

}
          
      public void addGnwmateusi(){
          
      }
      
      public void deleteGnwmateusi(){
          
      }
      //tropopoiisi, anazitisi
      public void ofilesMathitwn(){
          
      }
      //tropopoiisi
      public void kartelaMathiti(){
          
      }
      
      public void addEidikotitas(){
          
      }
      //eisagwgi ekpaideutikou se kapoia eidikotita
      public void addEkpaideutikoEidikotita(){
          
      }
}
