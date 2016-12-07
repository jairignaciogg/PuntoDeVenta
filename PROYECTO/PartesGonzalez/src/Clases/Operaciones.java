/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pspelon
 */
public class Operaciones {
    
   public Object [][] select(String table, String fields, String where,Connection con){
      int registros = 0;      
      String colname[] = fields.split(",");

      //Consultas SQL
      String q ="SELECT " + fields + " FROM " + table;
      String q2 = "SELECT count(*) as total FROM " + table;
      if(where!=null)
      {
          q+= " WHERE " + where;
          q2+= " WHERE " + where;
     }
       try{
         PreparedStatement pstm = con.prepareStatement(q2);
         ResultSet res;
          res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
         JOptionPane.showMessageDialog(null, e.getMessage());
         System.out.println(e.getCause());
      }
    
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][fields.split(",").length];
    //realizamos la consulta sql y llenamos los datos en la matriz "Object"
      try{
         PreparedStatement pstm = con.prepareStatement(q);
          ResultSet res = pstm.executeQuery();
              int i = 0;
              while(res.next()){
                  for(int j=0; j<=fields.split(",").length-1;j++){
                      data[i][j] = res.getString( colname[j].trim() );
                  }
                  i++;         }
          
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }
      public boolean insert(String table, String fields, String values,Connection con) 
    {
        boolean res=false;
        //Se arma la consulta
        String q=" INSERT INTO " + table + " ( " + fields + " ) VALUES ( " + values + " ) ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = con.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res=true;
            
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
        
      return res;
    }
     
     
     
     public Object[][] getUsuarios(Connection con)
    {
        Object[][] res = this.select("Usuarios", "username,password, nombre, apelm, apelp, permisos", null,con);
        if( res.length > 0)
            return res;
        else
            return null;
    }
     
     public Object[][] getRefacciones(Connection con)
    {
        Object[][] res = this.select("Refacciones", "id,cantidad,descripcion, precio", null,con);
        if( res.length > 0)
            return res;
        else
            return null;
    }


    
    
    
}
