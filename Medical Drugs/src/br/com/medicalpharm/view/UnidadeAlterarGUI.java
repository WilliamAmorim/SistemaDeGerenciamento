/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UnidadeAlterarGUI.java
 *
 * Created on 26/05/2011, 01:12:11
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.UnidadeDAO;
import br.com.medicalpharm.model.UnidadeModel;
import br.com.medicalpharm.util.LimitadorTexto;
import br.com.medicalpharm.util.UnaccentedDocument;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author ALENCAR
 */
public class UnidadeAlterarGUI extends javax.swing.JFrame {

    public UnidadeGUI janelapai;
    private UnidadeModel objunidade;

    /** Creates new form UnidadeAlterarGUI */
    public UnidadeAlterarGUI() {
        initComponents();
    }

    public UnidadeAlterarGUI(UnidadeModel unid) {
        this.objunidade = unid;
        initComponents();
        jtf_codigo.setText(String.valueOf(unid.getCod_unidade()));
        jtf_desc_unidade.setText(unid.getDesc_unidade());
        jtf_sigla.setText(unid.getSigla_unidade());
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_cancelar = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jtf_sigla = new javax.swing.JTextField(new LimitadorTexto(45), "",10);
        jtf_codigo = new javax.swing.JTextField();
        lb_sigla = new javax.swing.JLabel();
        jtf_desc_unidade = new javax.swing.JTextField(new LimitadorTexto(45), "",10);
        lb_desc_unidade = new javax.swing.JLabel();
        lb_cod_unidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterando Unidade de Medida");
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

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.setName("jb_cancelar"); // NOI18N
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 35));

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/gravar_registro.gif"))); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.setName("jb_salvar"); // NOI18N
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 35));

        jtf_sigla.setDocument(new UnaccentedDocument());
        jtf_sigla.setName("jtf_sigla"); // NOI18N
        jtf_sigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_siglaActionPerformed(evt);
            }
        });
        jtf_sigla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_siglaFocusGained(evt);
            }
        });
        jtf_sigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_siglaKeyPressed(evt);
            }
        });
        getContentPane().add(jtf_sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, -1));

        jtf_codigo.setEditable(false);
        jtf_codigo.setName("jtf_codigo"); // NOI18N
        jtf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_codigoActionPerformed(evt);
            }
        });
        getContentPane().add(jtf_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 81, -1));

        lb_sigla.setFont(new java.awt.Font("Dialog", 0, 12));
        lb_sigla.setText("Sigla");
        lb_sigla.setName("lb_sigla"); // NOI18N
        getContentPane().add(lb_sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jtf_desc_unidade.setDocument(new UnaccentedDocument());
        jtf_desc_unidade.setName("jtf_desc_unidade"); // NOI18N
        jtf_desc_unidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_desc_unidadeFocusGained(evt);
            }
        });
        jtf_desc_unidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_desc_unidadeKeyPressed(evt);
            }
        });
        getContentPane().add(jtf_desc_unidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, -1));

        lb_desc_unidade.setFont(new java.awt.Font("Dialog", 0, 12));
        lb_desc_unidade.setText("Descrição");
        lb_desc_unidade.setName("lb_desc_unidade"); // NOI18N
        getContentPane().add(lb_desc_unidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lb_cod_unidade.setFont(new java.awt.Font("Dialog", 0, 12));
        lb_cod_unidade.setText("Código");
        lb_cod_unidade.setName("lb_cod_unidade"); // NOI18N
        getContentPane().add(lb_cod_unidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-429)/2, (screenSize.height-179)/2, 429, 179);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_codigoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtf_codigoActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        alteraUnidade();
}//GEN-LAST:event_jb_salvarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtf_desc_unidade.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        setVisible(false);
        janelapai.listarUnidade();

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jtf_siglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_siglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_siglaActionPerformed

    private void jtf_siglaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_siglaKeyPressed
    jtf_sigla.addKeyListener(new KeyAdapter() {  
      public void keyReleased(KeyEvent evt) {  
        if (evt.getKeyCode() != KeyEvent.VK_HOME) {  
          String s = jtf_sigla.getText();  
          jtf_sigla.setText(s.toUpperCase());  
        }  
      }  
    }); 
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alteraUnidade();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_siglaKeyPressed

    private void jtf_desc_unidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_desc_unidadeFocusGained
        jtf_desc_unidade.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jtf_desc_unidade.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Informe a descrição da unidade");
                    jtf_desc_unidade.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_desc_unidadeFocusGained

    private void jtf_siglaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_siglaFocusGained
        jtf_sigla.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jtf_sigla.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Informe a sigla da unidade");
                    jtf_sigla.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_siglaFocusGained

private void jtf_desc_unidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_desc_unidadeKeyPressed
    jtf_desc_unidade.addKeyListener(new KeyAdapter() {  
      public void keyReleased(KeyEvent evt) {  
        if (evt.getKeyCode() != KeyEvent.VK_HOME) {  
          String s = jtf_desc_unidade.getText();  
          jtf_desc_unidade.setText(s.toUpperCase());  
        }  
      }  
    }); 
    // TODO add your handling code here:
}//GEN-LAST:event_jtf_desc_unidadeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UnidadeAlterarGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JTextField jtf_codigo;
    private javax.swing.JTextField jtf_desc_unidade;
    private javax.swing.JTextField jtf_sigla;
    private javax.swing.JLabel lb_cod_unidade;
    private javax.swing.JLabel lb_desc_unidade;
    private javax.swing.JLabel lb_sigla;
    // End of variables declaration//GEN-END:variables
    UnidadeModel unidade = new UnidadeModel();
//método para cadastrar

    private void alteraUnidade() {
        if (verificarCampos()) {
            UnidadeDAO unidadeControl = new UnidadeDAO();
            unidade.setCod_unidade(Integer.parseInt(jtf_codigo.getText().trim()));
            unidade.setDesc_unidade(jtf_desc_unidade.getText().trim());
            unidade.setSigla_unidade(jtf_sigla.getText().trim());
            unidadeControl.alteraUnidade(unidade);
            JOptionPane.showMessageDialog(null, "Cadastro alteardo com sucesso");
            retornaJanelapai();
        }

    }

    public void retornaJanelapai() {
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        setVisible(false);
        janelapai.listarUnidade();
    }

    public boolean verificarCampos() {
        String msgERRO = "Preencha os campos obrigatórios:\n";

        if (jtf_desc_unidade.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Descrição\n";
        }
        if (jtf_sigla.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Sigla\n";
        }

        if (!msgERRO.equals("Preencha os campos obrigatórios:\n")) {
            JOptionPane.showMessageDialog(this, msgERRO);
            jtf_desc_unidade.requestFocus();
            return false;
        } else {

            return true;
        }

    }
}
