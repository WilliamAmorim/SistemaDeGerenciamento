/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.VeiculoDAO;
import br.com.medicalpharm.model.VeiculoModel;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class VeiculoCadastrarEditar extends javax.swing.JFrame {
    
    /**
     * Creates new form VeiculoCadastrarEditar
     */
    public VeiculoCadastrarEditar() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_chassi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_placa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtf_codigo = new javax.swing.JTextField();
        jb_cancelar = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtf_descricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Descrição:");

        jLabel3.setText("Nº  chassi:");

        jtf_chassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_chassiActionPerformed(evt);
            }
        });

        jLabel4.setText("Nº placa:");

        jtf_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_placaActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo:");

        jtf_codigo.setEnabled(false);
        jtf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_codigoActionPerformed(evt);
            }
        });

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/gravar_registro.gif"))); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });

        jtf_descricao.setColumns(20);
        jtf_descricao.setRows(5);
        jScrollPane1.setViewportView(jtf_descricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salvar)
                        .addGap(6, 6, 6)
                        .addComponent(jb_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_chassi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jtf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_chassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_chassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_chassiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_chassiActionPerformed

    private void jtf_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_placaActionPerformed

    private void jtf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_codigoActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        //        janelapai.setEnabled(true);
        //        janelapai.setVisible(true);
        //        janelapai.request();
        //        setVisible(false);
        if(telaPai != null){
            telaPai.setEnabled(true);
        }else{
            telaPai2.setEnabled(true);
        }
        setVisible(false);

    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        //        verificaCadastro();
        //        janelapai.listarUsuário();
        cadastrarNovoVeiculo();
    }//GEN-LAST:event_jb_salvarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VeiculoCadastrarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculoCadastrarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculoCadastrarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculoCadastrarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculoCadastrarEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JTextField jtf_chassi;
    private javax.swing.JTextField jtf_codigo;
    private javax.swing.JTextArea jtf_descricao;
    private javax.swing.JTextField jtf_placa;
    // End of variables declaration//GEN-END:variables
    
    public String codigo = null;
    public String descricao = null;
    public String chassi = null;
    public String placa = null;
    public boolean update = false;
    VeiculoConsultarGUI telaPai;
    VeiculoConsultar2GUI telaPai2;
    
    public void update(){
        if(update){
            jtf_codigo.setText(codigo);
            jtf_descricao.setText(descricao);
            jtf_placa.setText(placa);
            jtf_chassi.setText(chassi);
            setTitle("Alterar Veiculo");
        }else{
            setTitle("Novo Veiculo");
        }
        
    }
    
    private void cadastrarNovoVeiculo(){
        try{
            if(verifcarCampos()){
                VeiculoModel veiculo = new VeiculoModel();
                if(update){
                    veiculo.setCodigo(Integer.parseInt(jtf_codigo.getText()));
                }
                veiculo.setDescricao(jtf_descricao.getText());
                veiculo.setChassi(jtf_chassi.getText());
                veiculo.setPlaca(jtf_placa.getText());

                VeiculoDAO novoVeiculo = new VeiculoDAO();        
                novoVeiculo.cadastarVeiculo(veiculo,update);
                
                if(telaPai != null){
                    telaPai.listarVeiculos();
                    telaPai.setEnabled(true);
                }else{
                    telaPai2.listarVeiculos("");
                    telaPai2.setEnabled(true);
                }
                if(update){
                    JOptionPane.showMessageDialog(null, "Alterações salvas");                
                }else{
                    JOptionPane.showMessageDialog(null, "Cadastro concluido");
                }            
                setVisible(false);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }
    
    private boolean verifcarCampos(){                                             
        String msgERRO = "Preencha os campos obrigatórios:\n";

        if (jtf_descricao.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Descrição\n";
        }
        if (jtf_chassi.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Chassi\n";
        }        
        if (jtf_placa.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Placa\n";
        }
        if (!msgERRO.equals("Preencha os campos obrigatórios:\n")) {
            JOptionPane.showMessageDialog(this, msgERRO);            
            return false;
        } else {
            return true;
        }
    }
}
