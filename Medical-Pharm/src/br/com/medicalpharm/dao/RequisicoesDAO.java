/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.dao;

import br.com.medicalpharm.model.RequisicoesModel;
import br.com.medicalpharm.model.RequisicoesProdutoModel;
import br.com.medicalpharm.util.Conexao;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class RequisicoesDAO {
    
    java.sql.PreparedStatement pstm;
    ResultSet rs;
    
    private String consultaUsuarioNome = "SELECT * FROM `requisicao` WHERE usuario_requisitor LIKE ?";
    private String cadastrarRequisicao = "INSERT INTO `requisicao`(`data_emissao`, `usuario_requisitor`, `usuario_estoquista`) VALUES (?,?,?)";
    
    
    public List<RequisicoesModel> listarRequisicoes(String parametro){
        List<RequisicoesModel> requisicao = new ArrayList();
        try {
            Conexao conexao = new Conexao();
            pstm = (PreparedStatement) conexao.conecta().prepareStatement(consultaUsuarioNome);
            pstm.setString(1, parametro);
            rs = pstm.executeQuery();
            RequisicoesModel requi;
            while (rs.next()) {
                requi = new RequisicoesModel();
                requi.setCodigo_requisicao(rs.getInt("codigo_requisicao"));
                requi.setData_emissao(rs.getDate("data_emissao"));
                requi.setUsuario_requisitor(rs.getString("usuario_requisitor"));
                requi.setUsuario_estoquista(rs.getString("usuario_estoquista"));
                
                requisicao.add(requi);

            }
            conexao.desconecta();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return requisicao;
    }
    
    public void cadastrarNovaRequisicao(RequisicoesModel requisicao,RequisicoesProdutoModel produto){
        try{
            Conexao conexao = new Conexao();
            pstm = (PreparedStatement) conexao.conecta().prepareStatement(cadastrarRequisicao);
            pstm.setDate(1, (Date) requisicao.getData_emissao());
            pstm.setString(2, requisicao.getUsuario_requisitor());
            pstm.setString(3,requisicao.getUsuario_estoquista());
            pstm.executeUpdate();
            conexao.desconecta();
            
            RequisicoesProdutoDAO novaRequisicao = new RequisicoesProdutoDAO();
            novaRequisicao.cadastrarNovaRequisicaoProduto(produto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int pegarUltimoID(){
        int id = 0;
        try {
            Conexao conexao = new Conexao();
            pstm = (PreparedStatement) conexao.conecta().prepareStatement("SELECT MAX(codigo_requisicao) FROM requisicao");            
            rs = pstm.executeQuery();           
           
            while (rs.next()) {
                
                id = rs.getInt("MAX(codigo_requisicao)");
               
                
                

            }
            conexao.desconecta();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public void updateProdutoQtd(int codigo,int qtd){
//        try{
//            Conexao conexao = new Conexao();
//            pstm = (PreparedStatement) conexao.conecta().prepareStatement("INSERT INTO `requisicao`(`data_emissao`, `usuario_requisitor`, `usuario_estoquista`) VALUES (?,?,?)");
//            pstm.setDate(1, (Date) requisicao.getData_emissao());
//            pstm.setString(2, requisicao.getUsuario_requisitor());
//            pstm.setString(3,requisicao.getUsuario_estoquista());
//            pstm.executeUpdate();
//            conexao.desconecta();
//            
//            RequisicoesProdutoDAO novaRequisicao = new RequisicoesProdutoDAO();
//            novaRequisicao.cadastrarNovaRequisicaoProduto(produto);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    
    
        
}
