/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Mov_Saída.java
 *
 * Created on 07/04/2011, 20:48:16
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.SaidaDAO;
import br.com.medicalpharm.model.ArmazemModel;
import br.com.medicalpharm.model.ProdutoModel;
import br.com.medicalpharm.model.SaidaItemModel;
import br.com.medicalpharm.model.SaidaModel;
import br.com.medicalpharm.model.UsuarioRequisitanteModel;
import br.com.medicalpharm.model.VeiculoModel;
import br.com.medicalpharm.util.ItemDbGrid;
import br.com.medicalpharm.util.LimitadorTexto;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Alencar
 */
public class SaidaEstoqueGUI extends javax.swing.JFrame implements SaidaEstoqueGUI_interface {

    MaskFormatter formatoData;
    SaidaGUI janelapai;
    List<ProdutoModel> produtos;
    List<ArmazemModel> destinos;
    SaidaItemModel saidaItemModel = new SaidaItemModel();
    ProdutoModel produtoCombo;
    SaidaModel saidaModel = new SaidaModel();

    /** Creates new form Mov_Saída */
    public SaidaEstoqueGUI() {
        initComponents();
        //     listarDestino();
        //listarProduto();
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
    String permissao;

    public void setJanelapai(SaidaGUI janelaPaim) {
        janelapai = janelaPaim;
        permissao = janelaPaim.permissao;
//        setTela(permissao);
    }

    public void setTela(String permissao) {

        //JOptionPane.showMessageDialog(null, permissao);
        if (permissao.equals("usuario")) {
            jb_destino.setEnabled(false);
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

        jPanel2 = new javax.swing.JPanel();
        jtf_codigo = new javax.swing.JTextField();
        jtf_produto = new javax.swing.JTextField();
        jtf_quantidade = new javax.swing.JTextField(new LimitadorTexto(11), "",10);
        jb_adicionar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtf_estoque = new javax.swing.JTextField();
        jb_salvar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        try  {      
            formatoData = new MaskFormatter("##/##/####");  
        } 
        catch (Exception erro)  
        {    
            JOptionPane.showMessageDialog(null,"Não foi possivel setar");  
        }
        jftf_data = new JFormattedTextField(formatoData);
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jb_destino = new javax.swing.JButton();
        jtf_armazem = new javax.swing.JTextField();
        jtf_cod_arm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_codigoUsuarioRequisitante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_usuarioRequisitante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jtf_codigoVeiculo = new javax.swing.JTextField();
        jtf_veiculo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saída de estoque principal");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens"));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_codigo.setEnabled(false);
        jtf_codigo.setName("jtf_codigo"); // NOI18N
        jtf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_codigoActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, -1));

        jtf_produto.setName("jtf_produto"); // NOI18N
        jtf_produto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_produtoFocusLost(evt);
            }
        });
        jtf_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_produtoKeyPressed(evt);
            }
        });
        jPanel2.add(jtf_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 260, -1));

        jtf_quantidade.addKeyListener(new java.awt.event.KeyAdapter() {     // cria um listener ouvinte de digitação do fieldNumero

            public void keyReleased(java.awt.event.KeyEvent evt) {  // cria um ouvinte para cada tecla pressionada

                jtf_quantidade.setText(jtf_quantidade.getText().replaceAll("[^0-9]", "")); // faz com que pegue o texto a cada tecla digitada, e substituir tudo que não(^) seja numero  por ""

            }
        });
        jtf_quantidade.setName("jtf_quantidade"); // NOI18N
        jtf_quantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_quantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_quantidadeFocusLost(evt);
            }
        });
        jPanel2.add(jtf_quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, -1));

        jb_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/edit_add.png"))); // NOI18N
        jb_adicionar.setName("jb_adicionar"); // NOI18N
        jb_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_adicionarActionPerformed(evt);
            }
        });
        jPanel2.add(jb_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, 30));

        jb_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/edit_remove.png"))); // NOI18N
        jb_eliminar.setName("jb_eliminar"); // NOI18N
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jb_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 40, -1));

        jButton1.setText("...");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 30, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Estoque");
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Código");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Produto / Apresentação");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Quantidade");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 380, 150));

        jtf_estoque.setEnabled(false);
        jtf_estoque.setName("jtf_estoque"); // NOI18N
        jPanel2.add(jtf_estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 430, 300));

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/gravar_registro.gif"))); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.setName("jb_salvar"); // NOI18N
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 35));

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.setName("jb_cancelar"); // NOI18N
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 35));

        jftf_data.setName("jftf_data"); // NOI18N
        jftf_data.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jftf_dataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftf_dataFocusLost(evt);
            }
        });
        getContentPane().add(jftf_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Código");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setText("Data");
        jLabel14.setName("jLabel14"); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jb_destino.setText("...");
        jb_destino.setName("jb_destino"); // NOI18N
        jb_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_destinoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 30, -1));

        jtf_armazem.setName("jtf_armazem"); // NOI18N
        jtf_armazem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_armazemFocusLost(evt);
            }
        });
        jtf_armazem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_armazemKeyPressed(evt);
            }
        });
        getContentPane().add(jtf_armazem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 290, -1));

        jtf_cod_arm.setEditable(false);
        jtf_cod_arm.setName("jtf_cod_arm"); // NOI18N
        getContentPane().add(jtf_cod_arm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Armazém");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/shoppingbasket_full.png"))); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 50));

        jtf_codigoUsuarioRequisitante.setEnabled(false);
        jtf_codigoUsuarioRequisitante.setName("jtf_codigoUsuarioRequisitante"); // NOI18N
        getContentPane().add(jtf_codigoUsuarioRequisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Código");
        jLabel8.setName("jLabel8"); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, -1));

        jtf_usuarioRequisitante.setName("jtf_usuarioRequisitante"); // NOI18N
        getContentPane().add(jtf_usuarioRequisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 290, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Usuario Requisitante:");
        jLabel9.setName("jLabel9"); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jButton2.setText("...");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 30, -1));

        jtf_codigoVeiculo.setEnabled(false);
        jtf_codigoVeiculo.setName("jtf_codigoVeiculo"); // NOI18N
        getContentPane().add(jtf_codigoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, -1));

        jtf_veiculo.setName("jtf_veiculo"); // NOI18N
        getContentPane().add(jtf_veiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 290, -1));

        jButton3.setText("...");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 30, -1));

        jLabel10.setText("Código");
        jLabel10.setName("jLabel10"); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel11.setText("Veiculo:");
        jLabel11.setName("jLabel11"); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        setSize(new java.awt.Dimension(496, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        saidaEstoque();
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        jTable1.updateUI();
        this.setVisible(false);
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_adicionarActionPerformed
        if (verificarItem() && verificaTabela() == true) {//

            if (Integer.parseInt(jtf_quantidade.getText()) > produto.getEstoque()) {
                JOptionPane.showMessageDialog(null, "Estoque insuficiente");
                jtf_quantidade.requestFocus();
            } else {
                adicionarItem();
            }
        }
}//GEN-LAST:event_jb_adicionarActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() != -1) {
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja excluir ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_NO_OPTION) {
                row.removeRow(jTable1.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um produto");
            }
        }

        // TODO add your handling code here:
}//GEN-LAST:event_jb_eliminarActionPerformed

    private void jftf_dataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftf_dataFocusLost
//        jtf_armazem.requestFocus();
    }//GEN-LAST:event_jftf_dataFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        janelapai.setEnabled(true);
        janelapai.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jftf_data.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jtf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_codigoActionPerformed

    private void jftf_dataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftf_dataFocusGained
        jftf_data.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jftf_data.getText().trim().length() < 10) {
                    JOptionPane.showMessageDialog(null, "Data de emissão inválida");
                    return false;
                } else if (jftf_data.getText().equals("  /  /    ")) {
                    JOptionPane.showMessageDialog(null, "Informe a data de saída");

                    return false;
                } else {
                    try {
                        if (!validaData(jftf_data.getText())) {
                            JOptionPane.showMessageDialog(null, "Data de saida inválida");
                            return false;
                        } else {
                            return true;
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(AjusteEstoqueGUI.class.getName()).log(Level.SEVERE, null, ex);
                        return false;
                    }
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_dataFocusGained

    private void jtf_quantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_quantidadeFocusGained
        jtf_quantidade.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jtf_quantidade.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Informe a quantidade");
                    jtf_quantidade.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        });



        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_quantidadeFocusGained
    ArmazemModel destinoCombo;
private void jb_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_destinoActionPerformed
    DestinoConsultarGUI1 conDestino = new DestinoConsultarGUI1();
    conDestino.setTelaSaidaEstoque(this);;
    conDestino.janelapai2 = this;
    conDestino.listaArmazem(jtf_armazem.getText().trim());
    conDestino.setVisible(true);
    statusTela(false);
    // TODO add your handling code here:
}//GEN-LAST:event_jb_destinoActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    ProdutoConsultarGUI conProduto = new ProdutoConsultarGUI();
    conProduto.setTelaSaidaEstoque(this);;
    conProduto.janelapai2 = this;
    conProduto.listaProduto(jtf_produto.getText().trim());
    conProduto.setVisible(true);
    statusTela(false);
}//GEN-LAST:event_jButton1ActionPerformed

private void jtf_produtoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_produtoKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        ProdutoConsultarGUI conProduto = new ProdutoConsultarGUI();
        conProduto.setTelaSaidaEstoque(this);;
        conProduto.janelapai2 = this;
        conProduto.listaProduto(jtf_produto.getText().trim());
        conProduto.setVisible(true);
        statusTela(false);
    }
    if (evt.getKeyCode() == KeyEvent.VK_TAB) {
        ProdutoConsultarGUI conProduto = new ProdutoConsultarGUI();
        conProduto.setTelaSaidaEstoque(this);;
        conProduto.janelapai2 = this;
        conProduto.listaProduto(jtf_produto.getText().trim());
        conProduto.setVisible(true);
        statusTela(false);
    }
    // TODO add your handling code here:
}//GEN-LAST:event_jtf_produtoKeyPressed

private void jtf_armazemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_armazemKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        DestinoConsultarGUI1 conDestino = new DestinoConsultarGUI1();
        conDestino.setTelaSaidaEstoque(this);;
        conDestino.janelapai2 = this;
        conDestino.listaArmazem(jtf_armazem.getText().trim());
        conDestino.setVisible(true);
        statusTela(false);
    }
    if (evt.getKeyCode() == KeyEvent.VK_TAB) {
        DestinoConsultarGUI1 conDestino = new DestinoConsultarGUI1();
        conDestino.setTelaSaidaEstoque(this);;
        conDestino.janelapai2 = this;
        conDestino.listaArmazem(jtf_armazem.getText().trim());
        conDestino.setVisible(true);
        statusTela(false);
    }
    // TODO add your handling code here:
}//GEN-LAST:event_jtf_armazemKeyPressed

private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
    jtf_quantidade.requestFocus();
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1FocusLost

private void jtf_armazemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_armazemFocusLost
    jtf_produto.requestFocus();
    // TODO add your handling code here:
}//GEN-LAST:event_jtf_armazemFocusLost

private void jtf_produtoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_produtoFocusLost
//   jtf_quantidade.requestFocus();
   // TODO add your handling code here:
}//GEN-LAST:event_jtf_produtoFocusLost

private void jtf_quantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_quantidadeFocusLost
//    jb_adicionar.requestFocus();
    // TODO add your handling code here:
}//GEN-LAST:event_jtf_quantidadeFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RequisitanteConsultarGUI requi = new RequisitanteConsultarGUI();
        requi.listarUsuarios(jtf_usuarioRequisitante.getText());
        requi.setSaidaEstoque(this);
        requi.saidaEstoque = this;
        requi.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VeiculoConsultar2GUI mostrar = new VeiculoConsultar2GUI();
        mostrar.listarVeiculos(jtf_veiculo.getText());
        mostrar.setSaidaEstoque(this);
        mostrar.saidaEstoque = this;
        mostrar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SaidaEstoqueGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_adicionar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_destino;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JFormattedTextField jftf_data;
    private javax.swing.JTextField jtf_armazem;
    private javax.swing.JTextField jtf_cod_arm;
    private javax.swing.JTextField jtf_codigo;
    private javax.swing.JTextField jtf_codigoUsuarioRequisitante;
    private javax.swing.JTextField jtf_codigoVeiculo;
    private javax.swing.JTextField jtf_estoque;
    private javax.swing.JTextField jtf_produto;
    private javax.swing.JTextField jtf_quantidade;
    private javax.swing.JTextField jtf_usuarioRequisitante;
    private javax.swing.JTextField jtf_veiculo;
    // End of variables declaration//GEN-END:variables

    public void statusTela(boolean status) {
        if (status) {
            this.setVisible(status);
        }
        this.setEnabled(status);
    }
    TelaPrincipal_Interface telaPrincipal;

    public void setTelaPrincipal(TelaPrincipal_Interface telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public boolean verificarItem() {
        String msgERRO = "Preencha os campos obrigatórios:\n";

        if (jtf_codigo.getText().equals("")) {
            msgERRO = msgERRO + " *Produto\n";
        }
        if (jtf_quantidade.getText().equals("")) {
            msgERRO = msgERRO + " *Quantidade\n";
        }
        if (!msgERRO.equals("Preencha os campos obrigatórios:\n")) {
            JOptionPane.showMessageDialog(this, msgERRO);
            jtf_quantidade.requestFocus();
            return false;
        }

        if (jtf_quantidade.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Informe uma quantidade maior que zero");
            return false;
        }
        return true;

    }
    SaidaDAO controlSaida = new SaidaDAO();

    private void saidaEstoque() {
        try {
//            ItemDbGrid hashDbGrid = (ItemDbGrid)jcb_destino.getSelectedItem();
//            destinoCombo = (ArmazemModel)hashDbGrid.getObjeto();   

            if (verificaCampos()) {
                SaidaModel saida = new SaidaModel();

                List<SaidaItemModel> itens = new ArrayList<SaidaItemModel>();

                for (Integer i = 0; i < jTable1.getRowCount(); i++) {
                    SaidaItemModel saidItem = new SaidaItemModel();
                    saidItem.setProduto(new ProdutoModel((Integer) jTable1.getValueAt(i, 0)));
                    saidItem.setQuantidade(Integer.parseInt((String) jTable1.getValueAt(i, 2)));
                    itens.add(saidItem);
                    // JOptionPane.showMessageDialog(null,"Cod  "+ saidItem.getProduto().getCod_produto()+" Quant  "+saidItem.getQuantidade());
                }
                //SaidaDAO controlaSaida = new SaidaDAO();
                //controlSaida.limparTabela();

                saida.setDestino(armazem);
                saida.setDataSaida(new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data.getText()));
                saida.setIdrequisitante(Integer.parseInt(jtf_codigoUsuarioRequisitante.getText()));
                saida.setCodigoVeiculo(Integer.parseInt(jtf_codigoVeiculo.getText()));                   
                // saida.setItensSaida(itens);
                //  controlSaida.cadastraSaida(saida);
                saida = controlSaida.cadastraSaida(saida);

                if (saida != null) {
                    controlSaida.saidaItem(itens, saida);
                //    controlSaida.implementaArmazem(itens, saida);
                    controlSaida.baixarEstoque(itens);
                    controlSaida.consultaQuantidade(itens,saida);
                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
//                Relatorios relatorio = new Relatorios();
//                relatorio.relatorioSaida();
                    janelapai.listaDestino();
                    janelapai.setEnabled(true);
                    janelapai.setVisible(true);
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Erro grávidico");
                }
            }
        } catch (Exception erro) {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null, erro);
        }
    }

    private boolean verificaCampos() {
        String msgERRO = "Preencha os campos obrigatórios:\n";

        if (jtf_cod_arm.getText().equals("")) {
            msgERRO = msgERRO + " *Armazém\n";
        }
        if (jftf_data.getText().equals("  /  /    ")) {
            msgERRO = msgERRO + " *Data de saída\n";
        }
        if (jTable1.getRowCount() == 0) {
            msgERRO = msgERRO + " *Adicione pelo menos 1 Produto\n";
        }
        if (!msgERRO.equals("Preencha os campos obrigatórios:\n")) {
            JOptionPane.showMessageDialog(this, msgERRO);
            jftf_data.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    public boolean validaData(String dataString) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = new GregorianCalendar();
        Date dataDigitada = new Date(df.parse(dataString).getTime());
        Date dataAtual = new Date(System.currentTimeMillis());

        // gerando o calendar
        cal.setTime(df.parse(dataString));

        // separando os dados da string para comparacao e validacao
        String[] data = dataString.split("/");
        String dia = data[0];
        String mes = data[1];
        String ano = data[2];
        // testando se hah discrepancia entre a data que foi
        // inserida no caledar e a data que foi passada como
        // string. se houver diferenca, a data passada era
        // invalida
        if ((new Integer(dia)).intValue() != (new Integer(cal.get(Calendar.DAY_OF_MONTH))).intValue()) {
            // dia nao caso
            return false;
        } else if ((new Integer(mes)).intValue() != (new Integer(cal.get(Calendar.MONTH) + 1)).intValue()) {
            // mes nao casou
            return false;
        } else if ((new Integer(ano)).intValue() != (new Integer(cal.get(Calendar.YEAR))).intValue()) {
            // ano nao casou
            return false;
        } else if (dataDigitada.after(dataAtual)) {
            // data maior que atual
            return false;
        }
        return true;
    }

    private void removeProduto() {
        excluirProduto(jTable1);
    }

    private void excluirProduto(JTable tb) {
        DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
        if (tb.getSelectedRow() != -1) {
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja excluir ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_NO_OPTION) {
                row.removeRow(tb.getSelectedRow());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto");
        }
    }

    public boolean verificaTabela() {


        boolean tabela = true;
        if (jTable1.getRowCount() == 0) {
            return true;

        } else if (jTable1.getRowCount() > 0) {
            int linhas = jTable1.getRowCount();

            for (int i = 0; i < linhas; i++) {

                SaidaItemModel saida = new SaidaItemModel();
                saida.setProduto(new ProdutoModel((Integer) jTable1.getValueAt(i, 0)));

                if (saida.getProduto().getCod_produto() == produto.getCod_produto()) {
                    JOptionPane.showMessageDialog(null,"Este produto já foi inserido");
                    tabela = false;
                }
            }

            return tabela;
        }
        return tabela;
    }

    public void adicionarItem() {
        saidaItemModel.setSaidaModel(saidaModel);

        saidaItemModel.setProduto(produto);
        saidaItemModel.setQuantidade(new Integer(jtf_quantidade.getText()));

        DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
        ItemDbGrid hashDbGrid = new ItemDbGrid(saidaItemModel, saidaItemModel.getProduto().getNome_produto());
        row.addRow(new Object[]{saidaItemModel.getProduto().getCod_produto(), hashDbGrid, jtf_quantidade.getText()});
        limparItem();

    }

    public void limparItem() {
        //   jcb_produto.requestFocus();
        jtf_quantidade.setText("");
        jtf_estoque.setText("");
        jtf_codigo.setText("");
        jtf_produto.setText("");
        jtf_produto.requestFocus();
    }
    ProdutoModel produto;

    public void carregaProduto(ProdutoModel produto) {
        this.produto = produto;
        jtf_produto.setText(produto.getNome_produto());
        jtf_codigo.setText(String.valueOf(produto.getCod_produto()));
        jtf_estoque.setText(String.valueOf(produto.getEstoque()));
    }
    ArmazemModel armazem;

    public void carregaDestino(ArmazemModel armazem) {
        this.armazem = armazem;
        jtf_cod_arm.setText(String.valueOf(armazem.getCod_destino()));
        jtf_armazem.setText(armazem.getDesc_destino());
        jtf_produto.requestFocus();
    }
    
    
    public void carregarUsuarioRequisitante(UsuarioRequisitanteModel requisitante){//UsuarioRequisitanteModel requisitante
        //UsuarioRequisitanteDAO usu = requisitante;
        jtf_usuarioRequisitante.setText(requisitante.getNome_requisitante());
        jtf_codigoUsuarioRequisitante.setText(requisitante.getCodigo_requisitante()+"");
      
    }
    
    public void carregarVeiculo(VeiculoModel veiculo){
        jtf_codigoVeiculo.setText(veiculo.getCodigo()+"");
        jtf_veiculo.setText(veiculo.getDescricao()+"");
    }
}
