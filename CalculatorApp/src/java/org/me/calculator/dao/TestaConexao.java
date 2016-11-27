/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator.dao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import org.me.calculator.model.CadastroPerdiMinhaPlaca;

/**
 *
 * @author klebson
 */
public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        Connection conexao = new ConexaoBDMySQL().getConection();
        if (conexao != null) {
            System.out.println("STATUS--->Conectado com sucesso!");

            CadastroPerdiMinhaPlaca cadastroplaca = new CadastroPerdiMinhaPlaca();
            DAOPerdiEncontreiMinhaPlaca dpe = new DAOPerdiEncontreiMinhaPlaca();
            cadastroplaca.setNome("kl");
            dpe.adicionar(cadastroplaca);
            cadastroplaca.setTelefone("98866-5577");
            dpe.adicionar(cadastroplaca);
            cadastroplaca.setNumeroPlaca("pcf-8821");
            dpe.adicionar(cadastroplaca);
            cadastroplaca.setCidadePlaca("Recife");
            dpe.adicionar(cadastroplaca);
            cadastroplaca.setDataPerdaEncontro("29-08-2016");
            dpe.adicionar(cadastroplaca);
            cadastroplaca.setCidadePlaca("Jaboatão dos Guararapes, Piedade.");
            dpe.adicionar(cadastroplaca);
            cadastroplaca.setObservacao("Final de semana, próximo ao hospital da aeronautica");
            dpe.adicionar(cadastroplaca);
            cadastroplaca.setStatusPerdaEncontro("Perda");
            dpe.adicionar(cadastroplaca);

            dpe.adicionar(cadastroplaca);
//
//            CadastroPerdiMinhaPlaca cadp = new CadastroPerdiMinhaPlaca();
//            cadp.setNome("Santana");
//            cadp.setTelefone("8888-1234");
//            cadp.setNumeroPlaca("xdr-0123");
//            cadp.setCidadePlaca("rec");
//            cadp.setDataPerdaEncontro("20-11-2016");
//            cadp.setCidadePlaca("Escada");
//            cadp.setObservacao("foi lá mesmo");
//            cadp.setStatusPerdaEncontro("Perda");
//
//            DAOPerdiEncontreiMinhaPlaca bd = new DAOPerdiEncontreiMinhaPlaca();
//            bd.adicionar(cadp);

            System.out.println("Gravado!");

            conexao.close();

        } else {
            System.out.println("STATUS--->Não foi possivel realizar conexão");
        }
        conexao.close();
    }
}
