/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.dao;

import br.com.medicalpharm.model.RequisicoesModel;
import br.com.medicalpharm.model.RequisicoesProdutoModel;
import br.com.medicalpharm.model.UsuarioRequisitanteModel;
import br.com.medicalpharm.util.Conexao;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class UsuarioRequisitanteDAO {
    
    java.sql.PreparedStatement pstm;
    ResultSet rs;
    
    private String cadastraUsuario = "INSERT INTO `usuario_requisitor`(`nome`, `cpf`) VALUES (?,?)";
    private String alterarUsuario = "UPDATE `usuario_requisitor` SET `nome`= ?,`cpf`= ? WHERE codigo_requisitor = ?";
    private String verificarCodigo = "SELECT `codigo_requisitor` FROM `usuario_requisitor` WHERE codigo_requisitor = ?";
    private String buscarNome = "SELECT * FROM `usuario_requisitor` WHERE nome LIKE ?";
    private String buscarCpf = "SELECT * FROM `usuario_requisitor` WHERE cpf LIKE";
    private String buscarRequisitante = "SELECT `nome` FROM `usuario_requisitor` WHERE codigo_requisitor = ?";

    public void cadastraUsuarioRequisitante(UsuarioRequisitanteModel usuario){
        try {

            Conexao conexao = new Conexao();
            
            pstm = (PreparedStatement) conexao.conecta().prepareStatement(cadastraUsuario);
           // pstm.setInt(1, usuario.getCodigo_requisitante());
            pstm.setString(1, usuario.getNome_requisitante());
            pstm.setString(2, usuario.getCpf());            
            pstm.executeUpdate();
            conexao.desconecta();                        
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar");

        }
        
    }
    
    public void alterarUsuarioRequisitante(UsuarioRequisitanteModel usuario){
        try {

            Conexao conexao = new Conexao();
            
            pstm = (PreparedStatement) conexao.conecta().prepareStatement(alterarUsuario);            
            pstm.setString(1, usuario.getNome_requisitante());
            pstm.setString(2, usuario.getCpf());            
            pstm.setInt(3, usuario.getCodigo_requisitante());
            pstm.executeUpdate();
            conexao.desconecta();                        
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar");

        }
    }
    
    public int gerarCodigo(){
        try {            
            boolean cod = true;
            Random gerador = new Random();
            
            Conexao conexao = new Conexao();
            
            while(cod){
                int resultado = 0;
                int codigo = gerador.nextInt((999999 - 100000) + 1) + 100000;
                pstm = (PreparedStatement) conexao.conecta().prepareStatement(verificarCodigo);
                pstm.setInt(1, codigo);                   
                rs = pstm.executeQuery();
                while (rs.next()) {
                    if(rs.getInt("codigo_requisitor") == codigo){
                        resultado++;
                    }
                }
                if(resultado == 0){
                    conexao.desconecta();
                    return codigo;
                }
                
            }
            //conexao.desconecta();
           
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar");
          
        }
        return 0;
        
    }
    
    public List<UsuarioRequisitanteModel> listarUsuarios(String parametro){
        List<UsuarioRequisitanteModel> usuario = new ArrayList();
        try {
            Conexao conexao = new Conexao();
            pstm = (PreparedStatement) conexao.conecta().prepareStatement(buscarNome);
            pstm.setString(1, parametro);
            rs = pstm.executeQuery();
            UsuarioRequisitanteModel requi;
            while (rs.next()) {
                requi = new UsuarioRequisitanteModel();
                requi.setCodigo_requisitante(rs.getInt("codigo_requisitor"));
                requi.setNome_requisitante(rs.getString("nome"));                
                requi.setCpf(rs.getString("cpf"));
                usuario.add(requi);
            }
            conexao.desconecta();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }
    
    public String buscarRequisitanteCodigo(int cod) {
        String produto = null;
        try {
            Conexao conexao = new Conexao();
            pstm = (java.sql.PreparedStatement) conexao.conecta().prepareStatement(buscarRequisitante);
            pstm.setInt(1, cod);
            rs = pstm.executeQuery();            
            while (rs.next()) {
                produto = rs.getString("nome");
                
            }
            conexao.desconecta();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produto;
    }
}
