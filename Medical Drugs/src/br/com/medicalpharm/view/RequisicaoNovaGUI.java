/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.ProdutoDAO;
import br.com.medicalpharm.dao.RequisicoesDAO;
import br.com.medicalpharm.model.ProdutoModel;
import br.com.medicalpharm.model.RequisicoesModel;
import br.com.medicalpharm.model.RequisicoesProdutoModel;
import br.com.medicalpharm.model.UsuarioRequisitanteModel;
import br.com.medicalpharm.model.VeiculoModel;
import br.com.medicalpharm.util.Data;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.medicalpharm.dao.UsuarioDAO;
import br.com.medicalpharm.model.UsuarioModel;
import br.com.medicalpharm.relatorios.Relatorios;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 *
 * @author willi
 */
public class RequisicaoNovaGUI extends javax.swing.JFrame implements RequisicaoNovaGUI_Interface{

    /**
     * Creates new form RequisicaoNovaGUI
     */
    public RequisicaoNovaGUI() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Data mostrar = new Data();
        mostrar.le_data();
        jtf_data.setText(mostrar.dia+"/"+mostrar.mes+"/"+mostrar.ano);
        
        RequisicoesDAO re = new RequisicoesDAO();
        jtf_codigoRequisicao.setText((re.pegarUltimoID()+1)+"");  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jtf_codigoVeiculo = new javax.swing.JTextField();
        jtf_data = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtf_veiculo = new javax.swing.JTextField();
        jtf_codigoUsuarioRequisitante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jtf_usuarioRequisitante = new javax.swing.JTextField();
        jtf_codigoRequisicao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtf_codigoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_produto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtf_saldoEstoque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        js_qtd = new javax.swing.JTextField();
        jb_salvar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/shoppingcart_full.png"))); // NOI18N

        jtf_codigoVeiculo.setEnabled(false);

        jtf_data.setText("12/02/2020");
        jtf_data.setEnabled(false);
        jtf_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dataActionPerformed(evt);
            }
        });

        jLabel6.setText("Código:");

        jLabel1.setText("Data:");

        jtf_veiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_veiculoKeyPressed(evt);
            }
        });

        jtf_codigoUsuarioRequisitante.setEnabled(false);

        jLabel2.setText("Código:");

        jLabel9.setText("Veiculo:");

        jButton6.setText("...");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jtf_usuarioRequisitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_usuarioRequisitanteKeyPressed(evt);
            }
        });

        jtf_codigoRequisicao.setText("123456");
        jtf_codigoRequisicao.setEnabled(false);
        jtf_codigoRequisicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_codigoRequisicaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuario Requisitante:");

        jLabel12.setText("Código da  Requisição:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Produtos"));

        jtf_codigoProduto.setEnabled(false);

        jLabel4.setText("Código:");

        jtf_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_produtoKeyPressed(evt);
            }
        });

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Estoque:");

        jtf_saldoEstoque.setEnabled(false);

        jLabel8.setText("Quantidade:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/edit_add.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/edit_remove.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Qtd"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel10.setText("Produto:");

        js_qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                js_qtdActionPerformed(evt);
            }
        });
        js_qtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                js_qtdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtf_produto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(js_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtf_saldoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_saldoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/gravar_registro.gif"))); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addComponent(jb_salvar)
                        .addGap(6, 6, 6)
                        .addComponent(jb_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_codigoRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtf_codigoUsuarioRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtf_usuarioRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_codigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_codigoRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jtf_codigoUsuarioRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(jtf_usuarioRequisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_codigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dataActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        VeiculoConsultar2GUI mostrar = new VeiculoConsultar2GUI();
        mostrar.listarVeiculos(jtf_veiculo.getText());
        mostrar.setRequisicaoNova(this);
        mostrar.requiNova = this;
        mostrar.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jtf_codigoRequisicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_codigoRequisicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_codigoRequisicaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ProdutoConsultarGUI conProduto = new ProdutoConsultarGUI();
        //conProduto.setTelaCadNota(this);;
        //conProduto.janelapai = this;
        conProduto.setTelaNovaRequisicao(this);
        conProduto.janelapai5 = this;
        conProduto.listaProduto(jtf_produto.getText().trim());
        conProduto.setVisible(true);
        //setStatusTela(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(verificarCampos()){
            adicionarLinha();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        removerLinha();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        if(verificarCampos()){
            salvarRequisicao();
        }
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        //        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        //        jTable1.updateUI();
        //        this.setVisible(false);
        //        janelaPaim.setEnabled(true);
        //        janelaPaim.setVisible(true);
        requisicaoLista.setEnabled(true);
        setVisible(false);
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RequisitanteConsultarGUI requi = new RequisitanteConsultarGUI();
        requi.listarUsuarios(jtf_usuarioRequisitante.getText());
        requi.setRequisicaoNova(this);
        requi.requiNova = this;
        requi.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtf_usuarioRequisitanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_usuarioRequisitanteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {        
            RequisitanteConsultarGUI requi = new RequisitanteConsultarGUI();
            requi.listarUsuarios(jtf_usuarioRequisitante.getText());
            requi.setRequisicaoNova(this);
            requi.requiNova = this;
            requi.setVisible(true);
        }
    }//GEN-LAST:event_jtf_usuarioRequisitanteKeyPressed

    private void jtf_veiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_veiculoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {        
            VeiculoConsultar2GUI mostrar = new VeiculoConsultar2GUI();
            mostrar.listarVeiculos(jtf_veiculo.getText());
            mostrar.setRequisicaoNova(this);
            mostrar.requiNova = this;
            mostrar.setVisible(true);
        }
    }//GEN-LAST:event_jtf_veiculoKeyPressed

    private void jtf_produtoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_produtoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
              ProdutoConsultarGUI conProduto = new ProdutoConsultarGUI();
        //conProduto.setTelaCadNota(this);;
        //conProduto.janelapai = this;
        conProduto.setTelaNovaRequisicao(this);
        conProduto.janelapai5 = this;
        conProduto.listaProduto(jtf_produto.getText().trim());
        conProduto.setVisible(true);
        //setStatusTela(false);     
        }
    }//GEN-LAST:event_jtf_produtoKeyPressed

    private void js_qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_js_qtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_js_qtdActionPerformed

    private void js_qtdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_js_qtdKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) { 
           if(verificarCampos()){
            adicionarLinha();
            jtf_produto.requestFocus();
           }
       }
    }//GEN-LAST:event_js_qtdKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RequisicaoNovaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequisicaoNovaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequisicaoNovaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequisicaoNovaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequisicaoNovaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JTextField js_qtd;
    private javax.swing.JTextField jtf_codigoProduto;
    private javax.swing.JTextField jtf_codigoRequisicao;
    private javax.swing.JTextField jtf_codigoUsuarioRequisitante;
    private javax.swing.JTextField jtf_codigoVeiculo;
    private javax.swing.JTextField jtf_data;
    private javax.swing.JTextField jtf_produto;
    private javax.swing.JTextField jtf_saldoEstoque;
    private javax.swing.JTextField jtf_usuarioRequisitante;
    private javax.swing.JTextField jtf_veiculo;
    // End of variables declaration//GEN-END:variables
    public boolean update = false;
    public String usuarioRequisitante;
    public String codigo_requisicao;
    public String veiculo;
    public RequisicaoListaGUI requisicaoLista = null;
    
    public void verificarUpdata(){
         if(update){
            setTitle("Editar Requisição");
            jtf_codigoRequisicao.setText(codigo_requisicao); 
            ArrayList retorno = new ArrayList();
            RequisicoesDAO r = new RequisicoesDAO();
            retorno = r.buscarUsuario(codigo_requisicao);
            jtf_usuarioRequisitante.setText(retorno.get(1).toString());
            jtf_usuarioRequisitante.setEnabled(false);            
            
            jtf_codigoUsuarioRequisitante.setText(retorno.get(0).toString());
            
            jtf_codigoVeiculo.setText(retorno.get(2).toString());
            jtf_veiculo.setText(retorno.get(3).toString());
            jtf_veiculo.setEnabled(false);
            
            jButton1.setEnabled(false);jButton6.setEnabled(false);         
        }else{
            setTitle("Nova Requisição");
         }
    }
    
    public void carregarUsuario(UsuarioRequisitanteModel requisitante){//UsuarioRequisitanteModel requisitante
        //UsuarioRequisitanteDAO usu = requisitante;
        jtf_usuarioRequisitante.setText(requisitante.getNome_requisitante());
        jtf_codigoUsuarioRequisitante.setText(requisitante.getCodigo_requisitante()+"");
      
    }
    
    public void carregaProduto(ProdutoModel produto) {
        ProdutoModel produtos;
        produtos = produto;
        //jtf_codigo.setText(String.valueOf(produto.getCod_produto()));
        jtf_produto.setText(produto.getNome_produto());
        jtf_codigoProduto.setText(produto.getCod_produto()+"");
        jtf_saldoEstoque.setText(produto.getEstoque()+"");
    
    }
    public void carregarVeiculo(VeiculoModel veiculo){
        jtf_codigoVeiculo.setText(veiculo.getCodigo()+"");
        jtf_veiculo.setText(veiculo.getDescricao()+"");
    }
    
    private void adicionarLinha(){
        int estoque = 0;
        if(jtf_saldoEstoque.getText().trim() != null){
            if(verificarProdutoRepetido(Integer.parseInt(jtf_codigoProduto.getText()),jtf_produto.getText())){
                estoque = Integer.parseInt(jtf_saldoEstoque.getText());
                if(verificarQtd(Integer.parseInt(js_qtd.getText()),estoque)){
                    DefaultTableModel row = (DefaultTableModel) jTable2.getModel();
                    row.addRow(new Object[]{jtf_codigoProduto.getText(),jtf_produto.getText(),js_qtd.getText()});
                    js_qtd.setText("");
                    jtf_produto.setText("");
                    jtf_codigoProduto.setText("");
                    jtf_saldoEstoque.setText("");                   
                }
            }else{
                JOptionPane.showMessageDialog(null, "Produto Repetido");                
            }
        }
        
    }
    
    private void removerLinha(){
        DefaultTableModel row = (DefaultTableModel) jTable2.getModel();
        if(row.getRowCount() != 0){
            row.removeRow(jTable2.getSelectedRow());
        }
 
    }
    
    
    private boolean verificarQtd(int qtd,int estoque){
        if(qtd > estoque){
            JOptionPane.showMessageDialog(null, "Quantidade mais que o estoque");                
            return false;
        }
       
        if(qtd < 1){
            JOptionPane.showMessageDialog(null, "Quantidade menor que o esperado");                
            return false;
        }
        if(estoque < 1){
            JOptionPane.showMessageDialog(null, "Estoque faltando");                
            return false;
        }
        
        
        return true;
    }
    
    public List<RequisicoesProdutoModel> criarListaProdutos(){
        ProdutoDAO p = new ProdutoDAO();
        DefaultTableModel row = (DefaultTableModel) jTable2.getModel();
        List<RequisicoesProdutoModel> produtosList = new ArrayList();
        RequisicoesProdutoModel produtos = null;
        for (int i = 0; i < row.getRowCount(); i++) {            
            produtos = new RequisicoesProdutoModel();
            produtos.setTipo("E");                   
            produtos.setCodigoRequisicao(Integer.parseInt(jtf_codigoRequisicao.getText()));
            produtos.setProduto(p.listarProdutoDesc(row.getValueAt(i, 1).toString()));
            produtos.setQtd(Integer.parseInt(row.getValueAt(i, 2).toString()));            
            produtos.setData_devolucao(new java.sql.Date(new java.util.Date().getTime()));
            produtosList.add(produtos);
            
            ProdutoDAO pro = new ProdutoDAO(); 
            int produtoID = Integer.parseInt(p.listarProdutoDesc(row.getValueAt(i, 1).toString()));
            pro.updateQuatidade(Integer.parseInt(row.getValueAt(i, 2).toString()),produtoID , "-");
        }
        
        
        return produtosList;                
    }
    private boolean verificarProdutoRepetido(int produtoCodigo,String produtoNome){
        DefaultTableModel row = (DefaultTableModel) jTable2.getModel();
        int re = 0;        
        for (int i = 0; i < row.getRowCount(); i++) { 
            System.out.println(produtoCodigo+"|"+Integer.parseInt((String) row.getValueAt(i, 0)));
//            if(produtoCodigo  == Integer.parseInt(jtf_codigoProduto.getText())){
//               
//            }
            if(produtoCodigo == Integer.parseInt((String) row.getValueAt(i, 0))){
                return false; 
            }
        }        
        return  requisicaoLista.verificarProdutoRepetidoNome(produtoNome);       
    }
    List<UsuarioModel> usuario = new ArrayList();
    public void salvarRequisicao(){
        DefaultTableModel row = (DefaultTableModel) jTable2.getModel();
        try{
            if(row.getRowCount() > 0){
                UsuarioDAO usu = new UsuarioDAO();
                usuario = usu.listarUsuario(RequisicoesModel.usuarioNome1);
                RequisicoesModel novaRequisicao = new RequisicoesModel();
                RequisicoesProdutoModel novaRequisicaoProduto = new RequisicoesProdutoModel();
                RequisicoesDAO cadastrar = new  RequisicoesDAO();

                novaRequisicao.setData_emissao(new java.sql.Date(new java.util.Date().getTime()));
                novaRequisicao.setUsuario_requisitor(jtf_codigoUsuarioRequisitante.getText());
                novaRequisicao.setUsuario_estoquista(usuario.get(0).getCod_usuario()+"");
                novaRequisicao.setCodigo_veiculo(jtf_codigoVeiculo.getText());

                cadastrar.cadastrarNovaRequisicao(novaRequisicao, criarListaProdutos(),update);
                requisicaoLista.listarRequisicoesAction();
                if(update){
                    JOptionPane.showMessageDialog(null, "Alterações Salvas!");                
                }else{
                    JOptionPane.showMessageDialog(null, "Requisição Criada com sucesso");                
                }
               
                    int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja imprimir relatório ?", "Atenção", JOptionPane.YES_NO_OPTION);
                    if (selectedOption == JOptionPane.YES_NO_OPTION) {
                        Relatorios relatorio = new Relatorios();
                        if(update){                        
                            relatorio.relatorioEdicaoRequisicao(Integer.parseInt(jtf_codigoRequisicao.getText()),new java.sql.Date(new java.util.Date().getTime()));                        
                        }else{
                            relatorio.relatorioNovaRequisicao(Integer.parseInt(jtf_codigoRequisicao.getText()));                            
                        }                                        

                    }
                
                requisicaoLista.setEnabled(true);
                    setVisible(false);
                    
            }else{
                JOptionPane.showMessageDialog(null, "Adicione um produto para continuar");                
            }
        }catch(Exception ex){
            System.out.println("Erro:"+ex);
        }
    }
            
    public boolean verificarCampos(){
        DefaultTableModel row = (DefaultTableModel) jTable2.getModel();
        String msgERRO = "Preencha os campos obrigatórios:\n";

        if (jtf_codigoUsuarioRequisitante.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Usuario Requisitante\n";
        }
        if (jtf_codigoVeiculo.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Veiculo\n";
        }        
        if(row.getRowCount() <= 0){           
            if (jtf_codigoProduto.getText().trim().equals("")) {
                msgERRO = msgERRO + " *Produto\n";
            }
        }
        if (!msgERRO.equals("Preencha os campos obrigatórios:\n")) {
            JOptionPane.showMessageDialog(this, msgERRO);            
            return false;
        } else {
            return true;
        }
        
    }

    @Override
    public void listarRequisicoesAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
