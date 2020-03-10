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
    
    private String cadastraUsuario = "INSERT INTO `usuario_requisitor`(`codigo`, `nome`, `cpf`) VALUES (?,?,?)";
    private String verificarCodigo = "SELECT `codigo` FROM `usuario_requisitor` WHERE codigo = ?";
    private String buscarNome = "SELECT * FROM `usuario_requisitor` WHERE nome LIKE ?";
    private String buscarCpf = "SELECT * FROM `usuario_requisitor` WHERE cpf LIKE";

    public void cadastraUsuarioRequisitante(UsuarioRequisitanteModel usuario){
        try {

            Conexao conexao = new Conexao();
            
            pstm = (PreparedStatement) conexao.conecta().prepareStatement(cadastraUsuario);
            pstm.setInt(1, usuario.getCodigo_requisitante());
            pstm.setString(2, usuario.getNome_requisitante());
            pstm.setString(3, usuario.getCpf());            
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
                    if(rs.getInt("codigo") == codigo){
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
                requi.setCodigo_requisitante(rs.getInt("codigo"));
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
  
}
