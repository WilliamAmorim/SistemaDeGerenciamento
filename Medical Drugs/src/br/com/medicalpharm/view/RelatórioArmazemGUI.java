/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RelatórioGUI.java
 *
 * Created on 25/08/2011, 12:24:36
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.DestinoDAO;
import br.com.medicalpharm.model.ArmazemModel;
import br.com.medicalpharm.relatorios.Relatorios;
import br.com.medicalpharm.util.ItemDbGrid;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author ALENCAR
 */
public class RelatórioArmazemGUI extends javax.swing.JFrame {

    /** Creates new form RelatórioGUI */
    public RelatórioArmazemGUI() {
        initComponents();
        listarDestino();

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
    MaskFormatter formatoData;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton5 = new javax.swing.JRadioButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jb_cancelar = new javax.swing.JButton();
        jb_gerar = new javax.swing.JButton();
        jrb_media = new javax.swing.JRadioButton();
        jrb_retirada = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jrb_consumo = new javax.swing.JRadioButton();
        jrb_descarte = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        try  {      
            formatoData = new MaskFormatter("##/##/####");  
        } 
        catch (Exception erro)  
        {    
            JOptionPane.showMessageDialog(null,"Não foi possivel setar");  
        }
        jftf_data1 = new JFormattedTextField(formatoData);
        jcb_destino = new javax.swing.JComboBox();
        try  {      
            formatoData = new MaskFormatter("##/##/####");  
        } 
        catch (Exception erro)  
        {    
            JOptionPane.showMessageDialog(null,"Não foi possivel setar");  
        }
        jftf_data = new JFormattedTextField(formatoData);
        jLabel3 = new javax.swing.JLabel();
        jrb_estoque = new javax.swing.JRadioButton();

        jRadioButton5.setText("jRadioButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório do almoxarifado");
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

        jb_cancelar.setText("Sair");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jb_gerar.setText("Gerar");
        jb_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_gerarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_gerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 93, -1));

        buttonGroup2.add(jrb_media);
        jrb_media.setSelected(true);
        jrb_media.setText("Média de gastos");
        jrb_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_mediaActionPerformed(evt);
            }
        });
        getContentPane().add(jrb_media, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        buttonGroup2.add(jrb_retirada);
        jrb_retirada.setText("Retirada por");
        jrb_retirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_retiradaActionPerformed(evt);
            }
        });
        getContentPane().add(jrb_retirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(jrb_consumo);
        jrb_consumo.setSelected(true);
        jrb_consumo.setText("consumo");

        buttonGroup1.add(jrb_descarte);
        jrb_descarte.setText("descarte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jrb_consumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_descarte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jrb_consumo)
                .addComponent(jrb_descarte))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel1.setText("Armazém");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel2.setText("a");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jftf_data1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jftf_data1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftf_data1FocusLost(evt);
            }
        });
        jftf_data1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jftf_data1KeyPressed(evt);
            }
        });
        getContentPane().add(jftf_data1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 80, -1));

        jcb_destino.setEditable(true);
        jcb_destino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Todos>" }));
        jcb_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_destinoActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 200, -1));

        jftf_data.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jftf_dataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftf_dataFocusLost(evt);
            }
        });
        jftf_data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jftf_dataKeyPressed(evt);
            }
        });
        getContentPane().add(jftf_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        jLabel3.setText("Data:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        buttonGroup2.add(jrb_estoque);
        jrb_estoque.setText("Estoque por almoxarifado");
        jrb_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_estoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jrb_estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        setSize(new java.awt.Dimension(318, 274));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_mediaActionPerformed
        if (jrb_media.isSelected()) {
            jftf_data.setEnabled(true);
            jftf_data1.setEnabled(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_mediaActionPerformed
    TelaPrincipal janelapai;
    private TelaPrincipal_Interface telaPrincipal;//Recebendo tela como parametro para atualização apos pesquisa

    public void setTelaPrincipal(TelaPrincipal_Interface telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }
    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        setVisible(false);
        telaPrincipal.setStatusTela(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gerarActionPerformed
        if (jrb_media.isSelected()) {
            if (jcb_destino.getSelectedIndex() == 0) {

                Date data1 = null;
                Date data2 = null;
                try {
                    data1 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data.getText());

                    data2 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data1.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(RelatórioArmazemGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                Relatorios relatorio = new Relatorios();
                relatorio.relatorioMédia(data1, data2);
            } else {
                Date data1 = null;
                Date data2 = null;
                try {
                    data1 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data.getText());

                    data2 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data1.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(RelatórioArmazemGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                ItemDbGrid hashDbGrid = (ItemDbGrid) jcb_destino.getSelectedItem();
                ArmazemModel destino = (ArmazemModel) hashDbGrid.getObjeto();
                Relatorios relatorio = new Relatorios();
                relatorio.relatorioMédiaDestino(data1, data2, destino);
            }
        }
        if (jrb_retirada.isSelected() && jrb_consumo.isSelected()) {
            if (jcb_destino.getSelectedIndex() == 0) {
                Relatorios relatorio = new Relatorios();


                Date data1 = null;
                Date data2 = null;
                try {
                    data1 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data.getText());

                    data2 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data1.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(RelatórioArmazemGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                relatorio.relatorioConsumo(data1, data2);
            } else {
                Date data1 = null;
                Date data2 = null;
                try {
                    data1 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data.getText());

                    data2 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data1.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(RelatórioArmazemGUI.class.getName()).log(Level.SEVERE, null, ex);
                }


                ItemDbGrid hashDbGrid = (ItemDbGrid) jcb_destino.getSelectedItem();
                ArmazemModel destino = (ArmazemModel) hashDbGrid.getObjeto();
                Relatorios relatorio = new Relatorios();
                relatorio.relatorioConsumoDestino(data1, data2, destino);
            }
        }
        if (jrb_retirada.isSelected() && jrb_descarte.isSelected()) {
            if (jcb_destino.getSelectedIndex() == 0) {
                Relatorios relatorio = new Relatorios();


                Date data1 = null;
                Date data2 = null;
                try {
                    data1 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data.getText());

                    data2 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data1.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(RelatórioArmazemGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                relatorio.relatorioDescarte(data1, data2);
            } else {
                Date data1 = null;
                Date data2 = null;
                try {
                    data1 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data.getText());

                    data2 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data1.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(RelatórioArmazemGUI.class.getName()).log(Level.SEVERE, null, ex);
                }


                ItemDbGrid hashDbGrid = (ItemDbGrid) jcb_destino.getSelectedItem();
                ArmazemModel destino = (ArmazemModel) hashDbGrid.getObjeto();
                Relatorios relatorio = new Relatorios();
                relatorio.relatorioDescarteDestino(data1, data2, destino);
            }
        }
        if (jrb_estoque.isSelected()) {
            if (jcb_destino.getSelectedIndex() == 0) {
                Relatorios relatorio = new Relatorios();
                relatorio.estoqueArmazem();
            } else {
                Date data1 = null;
                Date data2 = null;
                try {
                    data1 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data.getText());

                    data2 = new SimpleDateFormat("dd/MM/yyyy").parse(jftf_data1.getText());
                } catch (ParseException ex) {
                    Logger.getLogger(RelatórioArmazemGUI.class.getName()).log(Level.SEVERE, null, ex);
                }


                ItemDbGrid hashDbGrid = (ItemDbGrid) jcb_destino.getSelectedItem();
                ArmazemModel destino = (ArmazemModel) hashDbGrid.getObjeto();
                Relatorios relatorio = new Relatorios();
                relatorio.relatorioDescarteDestino(data1, data2, destino);
            }
        }


}//GEN-LAST:event_jb_gerarActionPerformed

    private void jrb_retiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_retiradaActionPerformed
        if (jrb_retirada.isSelected()) {
            jftf_data.setEnabled(true);
            jftf_data1.setEnabled(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_retiradaActionPerformed

    private void jftf_dataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftf_dataFocusLost
}//GEN-LAST:event_jftf_dataFocusLost

    private void jftf_dataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftf_dataKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_jftf_dataKeyPressed

    private void jftf_data1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftf_data1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_data1FocusLost

    private void jftf_data1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftf_data1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_data1KeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        janelapai.setVisible(true);
        janelapai.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jcb_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_destinoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jftf_data.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jftf_dataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftf_dataFocusGained
        jftf_data.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jftf_data.getText().trim().length() < 10) {
                    JOptionPane.showMessageDialog(null, "Data de emissão inválida");
                    return false;
                } else if (jftf_data.getText().equals("  /  /    ")) {
                    JOptionPane.showMessageDialog(null, "Informe a data de emissão");
                    jftf_data.requestFocus();
                    return false;
                } else {
                    try {
                        if (!validaData(jftf_data.getText())) {
                            JOptionPane.showMessageDialog(null, "Data de emissão inválida");
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

    private void jftf_data1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftf_data1FocusGained
        jftf_data1.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jftf_data1.getText().trim().length() < 10) {
                    JOptionPane.showMessageDialog(null, "Data de emissão inválida");
                    return false;
                } else if (jftf_data1.getText().equals("  /  /    ")) {
                    JOptionPane.showMessageDialog(null, "Informe a data de emissão");
                    jftf_data1.requestFocus();
                    return false;
                } else {
                    try {
                        if (!validaData(jftf_data1.getText())) {
                            JOptionPane.showMessageDialog(null, "Data de emissão inválida");
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
    }//GEN-LAST:event_jftf_data1FocusGained

private void jrb_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_estoqueActionPerformed
    if (jrb_estoque.isSelected()) {
        jftf_data.setEnabled(false);
        jftf_data1.setEnabled(false);
    }

    // TODO add your handling code here:
}//GEN-LAST:event_jrb_estoqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RelatórioArmazemGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_gerar;
    private javax.swing.JComboBox jcb_destino;
    private javax.swing.JFormattedTextField jftf_data;
    private javax.swing.JFormattedTextField jftf_data1;
    private javax.swing.JRadioButton jrb_consumo;
    private javax.swing.JRadioButton jrb_descarte;
    private javax.swing.JRadioButton jrb_estoque;
    private javax.swing.JRadioButton jrb_media;
    private javax.swing.JRadioButton jrb_retirada;
    // End of variables declaration//GEN-END:variables
    List<ArmazemModel> destinos;

    public void listarDestino() {
        DestinoDAO dest = new DestinoDAO();
        destinos = dest.listarDestinos();
        mostraDestinos(destinos);

    }

    public void mostraDestinos(List<ArmazemModel> destinos) {
        if (destinos.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum armazém encontrado");

        } else {
            for (int i = 0; i < destinos.size(); i++) {//ou i<destino.size() para retornar todos
                ArmazemModel destinoModel = new ArmazemModel();
                destinoModel.setCod_destino(destinos.get(i).getCod_destino());
                destinoModel.setDesc_destino(destinos.get(i).getDesc_destino());
                ItemDbGrid hashDbGrid = new ItemDbGrid(destinoModel, destinoModel.getDesc_destino());
                jcb_destino.addItem(hashDbGrid);
            }
        }
    }

    public static boolean validaData(String dataString) throws java.text.ParseException {

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
            // dia nao casou
            return (false);
        }
        if ((new Integer(mes)).intValue() != (new Integer(cal.get(Calendar.MONTH) + 1)).intValue()) {
            // mes nao casou

            return (false);
        }
        if ((new Integer(ano)).intValue() != (new Integer(cal.get(Calendar.YEAR))).intValue()) {
            // ano nao casou

            return (false);
        }
//             if (dataDigitada.after(dataAtual)) {
//                 // data maior que atual
//                 return (false);
//             }
        return (true);
    }
}
