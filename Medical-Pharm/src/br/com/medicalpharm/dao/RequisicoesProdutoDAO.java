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
 * @author willi
 */
public class RequisicoesProdutoDAO {
    java.sql.PreparedStatement pstm;
    ResultSet rs;
    
    
   
    public List<RequisicoesProdutoModel> buscarRequisicaoProduto(String nomeUsuario){
        //String produto = null;
        List<RequisicoesProdutoModel> produtosList = new ArrayList();
        List<RequisicoesModel> requi = buscarRequisicoes(nomeUsuario);
        for (int i = 0; i < requi.size(); i++) {
            saldo = 0;
            devolvido = 0;
            qtd = 0;
            try {
                Conexao conexao = new Conexao();
                pstm = (PreparedStatement) conexao.conecta().prepareStatement("SELECT * FROM `requisicoes` WHERE codigo_requisicao = ? ORDER BY data_devolucao");
                pstm.setInt(1, requi.get(i).getCodigo_requisicao());
                rs = pstm.executeQuery();

                RequisicoesProdutoModel produtos = null;
                 produtos = new RequisicoesProdutoModel();  
                 String produto = null;
                    while (rs.next()) {                                              
                        verificarStatus(rs.getString("tipo"),rs.getInt("qtd"));                        
                        produto = rs.getString("produto");
                    }
                    produtos.setCodigoRequisicao(requi.get(i).getCodigo_requisicao());
                    produtos.setUsuarioEstoquista(requi.get(i).getUsuario_estoquista());
                    produtos.setProduto(produto);//RequisicaoProduto.add(produto);
                    produtos.setQtd(qtd);//RequisicaoProduto.add(qtd);
                    produtos.setQtdDevolvida(devolvido);//RequisicaoProduto.add(devolvido);
                    produtos.setSaldo(saldo);//RequisicaoProduto.add(saldo); 
                    produtosList.add(produtos);



                conexao.desconecta();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return produtosList;
    }
    
    public List<RequisicoesModel> buscarRequisicoes(String codigoRequisicao){
        List<RequisicoesModel> requisicoes = new ArrayList();
        try {
            Conexao conexao = new Conexao();
            pstm = (PreparedStatement) conexao.conecta().prepareStatement("SELECT * FROM `requisicao` WHERE usuario_requisitor = ?");
            pstm.setString(1, codigoRequisicao);
            rs = pstm.executeQuery();
            RequisicoesModel requi;            
            while (rs.next()) {                
                requi = new RequisicoesModel();
                requi.setCodigo_requisicao(rs.getInt("codigo_requisicao"));
                requi.setUsuario_estoquista(rs.getString("usuario_estoquista"));
                requisicoes.add(requi);
                
                

            }
            conexao.desconecta();
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        return requisicoes;
    }
  
    
    private int saldo = 0;
    private int devolvido = 0;
    private int qtd = 3;
    public void verificarStatus(String tipo,int qtd){
        if(tipo.equals("D")){
            saldo -= qtd;    
            devolvido += qtd; 
        }else if(tipo.equals("E")){
            saldo = qtd;
            this.qtd = qtd;
            
        }
    }
    
    
    public void cadastrarNovaRequisicaoProduto(RequisicoesProdutoModel produto){
        try{
            Conexao conexao = new Conexao();
            pstm = (PreparedStatement) conexao.conecta().prepareStatement("INSERT INTO `requisicoes`(`tipo`, `codigo_requisicao`,`produto`, `qtd`, `data_devolucao`, `data_emissao`) VALUES (?,?,?,?,?,?)");
            pstm.setString(1, produto.getTipo());
            pstm.setInt(2,produto.getCodigoRequisicao());
            pstm.setString(3,produto.getProduto());
            pstm.setInt(4,produto.getQtd());
            pstm.setDate(5, (Date) produto.getData_devolucao());
            pstm.setDate(6, (Date) produto.getData_emissao());
            pstm.executeUpdate();
            conexao.desconecta();            
            
            System.out.println("cadastro ok");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String verificarStatus(String nome){
        List<RequisicoesProdutoModel> produtos = buscarRequisicaoProduto(nome);
        int status = 0;
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getSaldo() == 0){
                
            }else{
                status++;
            }
            
        }
        if(status == 0){
            return "Fechado";
        }
        return "Aberto";
    }
    
    
}
