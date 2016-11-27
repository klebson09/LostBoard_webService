package org.me.calculator.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author klebson
 */
public class ConexaoBDMySQL {

    Connection con = null;
    String usuario = "root";
    String senha = "";
    String url = "jdbc:mysql://localhost:3306/bd_lost_board";

    public static String status = "Não conectou...";

    public ConexaoBDMySQL() {
    }

    public Connection getConection() throws SQLException {
    
        try {
            ConexaoBDMySQL conexaobd = new ConexaoBDMySQL();
            Class.forName("com.mysql.jdbc.Driver"); //registrando o driver
            con = DriverManager.getConnection(url, usuario, senha);
        } catch(SQLException ex){
            //Não conseguindo se conectar ao banco
            System.out.println("Não foi possivel coectar ao Banco de Dados");
//            throw new RuntimeException(ex);
        }catch (ClassNotFoundException ex) {
            System.out.println("O driver expecificado nao foi encontrado.");
            Logger.getLogger(ConexaoBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    
        return con; // gambisMontila ????
    }
    
  
    
//    public static boolean fecharConexao(){
//        try {
//            conexaobd.getConection().close();
//            return true;
//        } catch (SQLException ex) {
//            return false;
////            Logger.getLogger(ConexaoBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
} 
      