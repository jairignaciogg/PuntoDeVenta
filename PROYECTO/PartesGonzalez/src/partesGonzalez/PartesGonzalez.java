/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package partesGonzalez;

import Clases.Conexion;
import Clases.Operaciones;
import java.io.File;
import java.sql.Connection;




/**
 *
 * @author David
 */
public class PartesGonzalez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File folder = new File(".\\\\DB");
        Conexion cn = new Conexion();
        Operaciones op = new Operaciones();
        Connection con;
        if (folder.exists()){
            
        }else{
            cn.CrearBD();
            cn.AccederBD();
            con = cn.AccederBD();
            op.insert("Usuarios", "username,password,nombre,apelm,apelp,permisos", "'admin','admin','','','','Administrador'", con);
            
        }
        new Interfaces.Login().setVisible(true);

        
        
    }
}
