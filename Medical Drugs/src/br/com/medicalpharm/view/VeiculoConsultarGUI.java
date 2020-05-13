/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.VeiculoDAO;
import br.com.medicalpharm.model.VeiculoModel;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author willi
 */
public class VeiculoConsultarGUI extends javax.swing.JFrame {

    /**
     * Creates new form VeiculoConsultar
     */
    public VeiculoConsultarGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        listarVeiculos(0);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jb_novo1 = new javax.swing.JButton();
        jb_novo2 = new javax.swing.JButton();
        jb_novo3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jrb_codigo = new javax.swing.JRadioButton();
        jrb_descricao = new javax.swing.JRadioButton();
        jrb_chassi = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        tf_pesquisar_veiculo = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Veículos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                exit(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Chassi", "Placa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(90);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable1.getColumnModel().getColumn(2).setMinWidth(70);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        jb_novo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/alterar_registro.gif"))); // NOI18N
        jb_novo1.setText("Editar");
        jb_novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novo1ActionPerformed(evt);
            }
        });

        jb_novo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_novo2.setText("Cancelar");
        jb_novo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novo2ActionPerformed(evt);
            }
        });

        jb_novo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/novo_registro.gif"))); // NOI18N
        jb_novo3.setText("Novo");
        jb_novo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novo3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));

        buttonGroup1.add(jrb_codigo);
        jrb_codigo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jrb_codigo.setSelected(true);
        jrb_codigo.setText("Código");

        buttonGroup1.add(jrb_descricao);
        jrb_descricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jrb_descricao.setText("Descrição");

        buttonGroup1.add(jrb_chassi);
        jrb_chassi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jrb_chassi.setText("Chassi");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Parâmetro");

        tf_pesquisar_veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisar_veiculoActionPerformed(evt);
            }
        });
        tf_pesquisar_veiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_pesquisar_veiculoKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/ok.png"))); // NOI18N
        jButton1.setText("Ir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_pesquisar_veiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jrb_codigo)
                        .addGap(18, 18, 18)
                        .addComponent(jrb_descricao)
                        .addGap(18, 18, 18)
                        .addComponent(jrb_chassi)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_codigo)
                    .addComponent(jrb_descricao)
                    .addComponent(jrb_chassi))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_pesquisar_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jb_novo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_novo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_novo2)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_novo1)
                    .addComponent(jb_novo2)
                    .addComponent(jb_novo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_novo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novo3ActionPerformed
        VeiculoCadastrarEditar abrir = new VeiculoCadastrarEditar();
        abrir.telaPai = this;
        this.setEnabled(false);
        abrir.setVisible(true);
    }//GEN-LAST:event_jb_novo3ActionPerformed

    private void jb_novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novo1ActionPerformed
        abrirEditar();
    }//GEN-LAST:event_jb_novo1ActionPerformed
   
    private void jb_novo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novo2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jb_novo2ActionPerformed

    private void exit(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exit
        setVisible(false);
    }//GEN-LAST:event_exit

    private void tf_pesquisar_veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisar_veiculoActionPerformed
       
    }//GEN-LAST:event_tf_pesquisar_veiculoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pesquisar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2 && evt.getButton() == evt.BUTTON1){
            abrirEditar();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void tf_pesquisar_veiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pesquisar_veiculoKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {        
            pesquisar();
        }
    }//GEN-LAST:event_tf_pesquisar_veiculoKeyPressed
    
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
            java.util.logging.Logger.getLogger(VeiculoConsultarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculoConsultarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculoConsultarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculoConsultarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculoConsultarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_novo1;
    private javax.swing.JButton jb_novo2;
    private javax.swing.JButton jb_novo3;
    private javax.swing.JRadioButton jrb_chassi;
    private javax.swing.JRadioButton jrb_codigo;
    private javax.swing.JRadioButton jrb_descricao;
    private java.awt.TextField tf_pesquisar_veiculo;
    // End of variables declaration//GEN-END:variables
    
    List<VeiculoModel> veiculos;
   // DefaultTableModel Jt_veiculos = new DefaultTableModel(null, new String[]{"Código", "descricao","chassi","placa"});
    public void listarVeiculos(int parametro){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        VeiculoDAO ve = new VeiculoDAO();

        
        veiculos = ve.listarVeiculos(tf_pesquisar_veiculo.getText()+"",parametro);
        DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
        
        //String[] campos = new String[]{null, null};
        for (int i = 0; i < veiculos.size(); i++) {            
            row.addRow(new Object[]{veiculos.get(i).getCodigo(),veiculos.get(i).getDescricao(),veiculos.get(i).getChassi(),veiculos.get(i).getPlaca()});
        }
        
    }
     private void abrirEditar(){
         if(jTable1.getSelectedRow() != -1){
            VeiculoCadastrarEditar abrir = new VeiculoCadastrarEditar();
            this.setEnabled(false);
            abrir.codigo = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            abrir.descricao = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            abrir.chassi = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            abrir.placa = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            abrir.update = true;
            abrir.telaPai = this;
            abrir.update();
            abrir.setVisible(true);
        }
    }
     
    private void pesquisar(){
        if (jrb_codigo.isSelected() == true) {
            listarVeiculos(0);
        } else if (jrb_descricao.isSelected() == true) {
            listarVeiculos(1);
        } else if (jrb_chassi.isSelected() == true) {
            listarVeiculos(2);
        } else {
           listarVeiculos(0);
        }
    } 

}
