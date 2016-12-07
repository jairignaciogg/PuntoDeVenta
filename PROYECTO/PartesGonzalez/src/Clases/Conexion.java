/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class Conexion {
    private Connection conn = null;
    
    public Connection CrearBD(){
       try{
         //obtenemos el driver de para mysql
         Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
         //obtenemos la conexión
         conn = DriverManager.getConnection("jdbc:derby:.\\DB\\PartesGonzalez;create=true");
         if (conn!=null){
            JOptionPane.showMessageDialog(null,"Creando Base de Datos");
            String creartabla="create table Usuarios(username varchar(50), password varchar(50), nombre varchar (50), apelm varchar (50), apelp varchar (50), permisos varchar (50), primary key (nombre))";
            String creartabla2="create table Refacciones(id varchar(50),cantidad varchar(50) ,descripcion varchar(50), precio varchar(50), primary key(id))";
            
            try {
            PreparedStatement pstm = conn.prepareStatement(creartabla);
            pstm.execute();
            pstm.close();
            
            PreparedStatement pstm3 = conn.prepareStatement(creartabla2);
            pstm3.execute();
            pstm3.close();

            
            
            
           JOptionPane.showMessageDialog(null,"Base de Datos creada correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
         }
      }catch(SQLException e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
       return conn;
  }
    
     public Connection AccederBD(){
       try{
         //obtenemos el driver de para mysql
         Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
         //obtenemos la conexión
         conn = DriverManager.getConnection("jdbc:derby:.\\DB\\PartesGonzalez");
         if (conn!=null){
         }
      }catch(SQLException e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
       return conn;
  }
     
      public void cerracon (){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
     
}
