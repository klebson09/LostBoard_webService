package org.me.calculator.dao;

import com.mysql.jdbc.PreparedStatement; //????
//import java.sql.PreparedStatement; //????
import java.sql.Connection;
import java.sql.SQLException;
import org.me.calculator.model.CadastroPerdiMinhaPlaca;
/**
 * @author klebson
 */
public class DAOPerdiEncontreiMinhaPlaca {
    Connection conexao;
    public DAOPerdiEncontreiMinhaPlaca() throws SQLException {
        this.conexao = new ConexaoBDMySQL().getConection();
    }

    public void adicionar(CadastroPerdiMinhaPlaca cadastroplaca) throws SQLException {

        String sql = "insert into cadastro_perdi_minha_placa "
                + "(NOME, TELEFONE, NUMERO_PLACA, CIDADE_PLACA, DATA_PERDA_ENCONTRO, LOCAL_PERDA_ENCONTRO, OBSERVACAO, STATUS_PERDA_ENCONTRO)"
                + " values (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            
            stmt.setString(1, cadastroplaca.getNome());
            stmt.setString(2, cadastroplaca.getTelefone());
            stmt.setString(3, cadastroplaca.getNumeroPlaca());
            stmt.setString(4, cadastroplaca.getCidadePlaca());
            stmt.setString(5, cadastroplaca.getDataPerdaEncontro());
            stmt.setString(6, cadastroplaca.getLocalPerdaEncontro());
            stmt.setString(7, cadastroplaca.getObservacao());
            stmt.setString(8, cadastroplaca.getStatusPerdaEncontro());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
//    catch (ClassNotFoundException ex){
//                Logger.getLogger(DAOPerdiEncontreiMinhaPlaca.class.getName()).log(Level.SEVERE, null, ex);
//        }

    // fim do método adicionar
    public void deletar() {
    }

    public void listar() {
    }

}
