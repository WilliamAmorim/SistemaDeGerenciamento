/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cad_Unidade.java
 *
 * Created on 15/04/2011, 00:42:26
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.UnidadeDAO;
import br.com.medicalpharm.model.UnidadeModel;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alencar
 */
public class UnidadeGUI extends javax.swing.JFrame {

    public TelaPrincipal janelapai;
    String tipoCadastro;
    List<UnidadeModel> unidades;

    /** Creates new form Cad_Unidade */
    public UnidadeGUI() {
        initComponents();
        listarUnidade();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.smoothmetal.SmoothmetalLookAndAndFeel");
            //UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
            //UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    DefaultTableModel tmUnidade = new DefaultTableModel(null, new String[]{"Código", "Descrição", "Sigla"});
    ListSelectionModel lsmUnidade;

    public void request() {
        jt_pesquisar.requestFocus();
    }

    public void setTela(String permissao) {
        if (permissao.equals("usuario")) {
            jb_novo.setEnabled(false);
            jb_alterar1.setEnabled(false);
            jb_excluir1.setEnabled(false);
        } else {
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_pesquisar = new javax.swing.JTable();
        jt_pesquisar.setModel(tmUnidade);
        jt_pesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmUnidade = jt_pesquisar.getSelectionModel();
        /*
        lsmUnidade.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e){
                if (! e.getValueIsAdjusting()){
                    tbUnidadeLinhaSelecionada(jt_pesquisar);
                }
            }
        });*/
        jPanel1 = new javax.swing.JPanel();
        jrb_codigo = new javax.swing.JRadioButton();
        jrb_detalhado = new javax.swing.JRadioButton();
        jrb_descricao = new javax.swing.JRadioButton();
        jl_pesquisar_destino = new javax.swing.JLabel();
        jb_buscar = new javax.swing.JButton();
        tf_pesquisar = new javax.swing.JTextField();
        jb_novo = new javax.swing.JButton();
        jb_alterar1 = new javax.swing.JButton();
        jb_excluir1 = new javax.swing.JButton();
        jb_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de unidades");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jt_pesquisar.setModel(tmUnidade);
        jt_pesquisar.setColumnSelectionAllowed(true);
        jt_pesquisar.setName("jt_pesquisar"); // NOI18N
        jt_pesquisar.setUpdateSelectionOnSort(false);

        jt_pesquisar.setVerifyInputWhenFocusTarget(false);
        jt_pesquisar.setDefaultEditor(Object.class, null);
        jt_pesquisar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount() == 2){
                    alterar();
                }}});
                jt_pesquisar.getTableHeader().setReorderingAllowed(false);
                jScrollPane1.setViewportView(jt_pesquisar);
                jt_pesquisar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 559, 125));

                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));
                jPanel1.setName("jPanel1"); // NOI18N

                buttonGroup1.add(jrb_codigo);
                jrb_codigo.setFont(new java.awt.Font("Dialog", 0, 12));
                jrb_codigo.setSelected(true);
                jrb_codigo.setText("Código");
                jrb_codigo.setName("jrb_codigo"); // NOI18N

                buttonGroup1.add(jrb_detalhado);
                jrb_detalhado.setFont(new java.awt.Font("Dialog", 0, 12));
                jrb_detalhado.setText("Específica");
                jrb_detalhado.setName("jrb_detalhado"); // NOI18N

                buttonGroup1.add(jrb_descricao);
                jrb_descricao.setFont(new java.awt.Font("Dialog", 0, 12));
                jrb_descricao.setText("Descrição");
                jrb_descricao.setName("jrb_descricao"); // NOI18N

                jl_pesquisar_destino.setFont(new java.awt.Font("Dialog", 0, 12));
                jl_pesquisar_destino.setText("Parâmetro");
                jl_pesquisar_destino.setName("jl_pesquisar_destino"); // NOI18N

                jb_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/ok.png"))); // NOI18N
                jb_buscar.setText("Ir");
                jb_buscar.setName("jb_buscar"); // NOI18N
                jb_buscar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_buscarActionPerformed(evt);
                    }
                });

                tf_pesquisar.setName("tf_pesquisar"); // NOI18N
                tf_pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        tf_pesquisarKeyPressed(evt);
                    }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrb_codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrb_descricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrb_detalhado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_pesquisar_destino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jb_buscar)))
                        .addContainerGap(13, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrb_codigo)
                            .addComponent(jrb_descricao)
                            .addComponent(jrb_detalhado))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_pesquisar_destino)
                            .addComponent(tf_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_buscar))
                        .addContainerGap(12, Short.MAX_VALUE))
                );

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

                jb_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/novo_registro.gif"))); // NOI18N
                jb_novo.setText("Novo");
                jb_novo.setName("jb_novo"); // NOI18N
                jb_novo.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_novoActionPerformed(evt);
                    }
                });
                getContentPane().add(jb_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 35));

                jb_alterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/alterar_registro.gif"))); // NOI18N
                jb_alterar1.setText("Alterar");
                jb_alterar1.setName("jb_alterar1"); // NOI18N
                jb_alterar1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_alterar1ActionPerformed(evt);
                    }
                });
                getContentPane().add(jb_alterar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 35));

                jb_excluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/delete.gif"))); // NOI18N
                jb_excluir1.setText("Excluir");
                jb_excluir1.setName("jb_excluir1"); // NOI18N
                jb_excluir1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_excluir1ActionPerformed(evt);
                    }
                });
                getContentPane().add(jb_excluir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 35));

                jb_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
                jb_sair.setText("Sair");
                jb_sair.setName("jb_sair"); // NOI18N
                jb_sair.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_sairActionPerformed(evt);
                    }
                });
                getContentPane().add(jb_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 35));

                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                setBounds((screenSize.width-619)/2, (screenSize.height-361)/2, 619, 361);
            }// </editor-fold>//GEN-END:initComponents

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        if (jrb_codigo.isSelected() == true) {
            listarUnidadeCodigo();
        } else if (jrb_descricao.isSelected() == true) {
            listarUnidadeDescricao();
        } else if (jrb_detalhado.isSelected() == true) {
            listarUnidade();

        } else {
            listarUnidade();
        }


        // TODO add your handling code here:
}//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        UnidadeCadastroGUI un = new UnidadeCadastroGUI();
        un.setVisible(true);
        un.janelapai = this;
        this.setEnabled(false);
}//GEN-LAST:event_jb_novoActionPerformed

    private void jb_alterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alterar1ActionPerformed
        alterar();
        // TODO add your handling code here:
}//GEN-LAST:event_jb_alterar1ActionPerformed
    public void alterar() {
        UnidadeModel unid = tbUnidadeLinhaSelecionada(jt_pesquisar);
        if (unid != null) {
            UnidadeAlterarGUI unidadeAltera = new UnidadeAlterarGUI(unid);
            unidadeAltera.janelapai = this;
            unidadeAltera.setVisible(true);
            this.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma unidade");
            tf_pesquisar.requestFocus();
        }
    }
    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        setVisible(false);
        telaPrincipal.setStatusTela(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jb_sairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tf_pesquisar.requestFocus();
        // TODO add your handling code here:

        jt_pesquisar.getColumnModel().getColumn(0).setMaxWidth(70);
        jt_pesquisar.getColumnModel().getColumn(0).setMinWidth(70);
        jt_pesquisar.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(70);
        jt_pesquisar.getTableHeader().getColumnModel().getColumn(0).setMinWidth(70);

        jt_pesquisar.getColumnModel().getColumn(1).setMaxWidth(300);
        jt_pesquisar.getColumnModel().getColumn(1).setMinWidth(300);
        jt_pesquisar.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(300);
        jt_pesquisar.getTableHeader().getColumnModel().getColumn(1).setMinWidth(300);



        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jb_excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_excluir1ActionPerformed
        excluiUnidade();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_excluir1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        telaPrincipal.setStatusTela(true);
        setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    private void tf_pesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jrb_codigo.isSelected() == true) {
                listarUnidadeCodigo();
            } else if (jrb_descricao.isSelected() == true) {
                listarUnidadeDescricao();
            } else if (jrb_detalhado.isSelected() == true) {
                listarUnidade();

            } else {
                listarUnidade();
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pesquisarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UnidadeGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_alterar1;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_excluir1;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_sair;
    private javax.swing.JLabel jl_pesquisar_destino;
    private javax.swing.JRadioButton jrb_codigo;
    private javax.swing.JRadioButton jrb_descricao;
    private javax.swing.JRadioButton jrb_detalhado;
    private javax.swing.JTable jt_pesquisar;
    private javax.swing.JTextField tf_pesquisar;
    // End of variables declaration//GEN-END:variables
    private TelaPrincipal_Interface telaPrincipal;
    //Recebendo tela como parametro para atualização apos pesquisa

    public void setTelaPrincipal(TelaPrincipal_Interface telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public void listarUnidade() {
        UnidadeDAO unid = new UnidadeDAO();
        unidades = unid.listarUnidade("%" + tf_pesquisar.getText().trim() + "%");
        mostraUnidade(unidades);
    }

    public void listarUnidadeCodigo() {
        if (tf_pesquisar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código");
        } else {
            UnidadeDAO unid = new UnidadeDAO();
            unidades = unid.listarUnidadeCodigo(tf_pesquisar.getText().trim());
            mostraUnidade(unidades);
        }
    }

    public void listarUnidadeDescricao() {
        UnidadeDAO unid = new UnidadeDAO();
        unidades = unid.listarUnidade(tf_pesquisar.getText().trim() + "%");
        mostraUnidade(unidades);
    }

    public void mostraUnidade(List<UnidadeModel> unidade) {
        while (tmUnidade.getRowCount() > 0) {
            tmUnidade.removeRow(0);
        }

        if (unidade.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhuma unidade encontrada");

        } else {


            String[] campos = new String[]{null, null};
            for (int i = 0; i < unidade.size(); i++) {

                tmUnidade.addRow(campos);

                tmUnidade.setValueAt(unidade.get(i).getCod_unidade(), i, 0);
                tmUnidade.setValueAt(unidade.get(i).getDesc_unidade(), i, 1);
                tmUnidade.setValueAt(unidade.get(i).getSigla_unidade(), i, 2);
            }
        }

    }

    public UnidadeModel tbUnidadeLinhaSelecionada(JTable tb) {
        UnidadeModel unid = null;
        if (tb.getSelectedRow() != -1) {
            unid = new UnidadeModel();
            unid.setCod_unidade(unidades.get(tb.getSelectedRow()).getCod_unidade());
            unid.setDesc_unidade(unidades.get(tb.getSelectedRow()).getDesc_unidade());
            unid.setSigla_unidade(unidades.get(tb.getSelectedRow()).getSigla_unidade());
        }
        return unid;
    }
    UnidadeModel unidade = new UnidadeModel();

    public UnidadeModel removeUnidade(JTable tb) {
        if (tb.getSelectedRow() != -1) {
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja excluir ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_NO_OPTION) {
                UnidadeDAO unidadeControl = new UnidadeDAO();
                unidade.setCod_unidade(unidades.get(tb.getSelectedRow()).getCod_unidade());
                unidade.setDesc_unidade(unidades.get(tb.getSelectedRow()).getDesc_unidade());
                unidade.setSigla_unidade(unidades.get(tb.getSelectedRow()).getSigla_unidade());
                if (unidadeControl.excluirUnidade(unidade)) {
                    tmUnidade.removeRow(tb.getSelectedRow());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma unidade");
        }
        return unidade;
    }

    public void excluiUnidade() {
        removeUnidade(jt_pesquisar);
    }
}
