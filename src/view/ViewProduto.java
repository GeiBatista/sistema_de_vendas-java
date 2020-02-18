/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import util.Formatador;

/**
 *
 * @author geiba
 */
public class ViewProduto extends javax.swing.JFrame {

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    Formatador formatador = new Formatador();
    String salvarAlterar;

    /**
     * Creates new form newProduto
     */
    public ViewProduto() {
        initComponents();
        carregarProdutos();
        setLocationRelativeTo(null);
        habilitaDesabilitaCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbProduto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTFPesquisar = new javax.swing.JTextField();
        jBtPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBtCancelar = new javax.swing.JButton();
        jBtNovo = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtSalvar = new javax.swing.JButton();
        jTFEstoque = new javax.swing.JFormattedTextField();
        jTFValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        jLabel1.setText("Código: ");

        jLabel2.setText("Nome: ");

        jLabel3.setText("Estoque: ");

        jLabel4.setText("Valor:");

        jTFCodigo.setEditable(false);
        jTFCodigo.setEnabled(false);
        jTFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoActionPerformed(evt);
            }
        });

        jTbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbProduto);
        if (jTbProduto.getColumnModel().getColumnCount() > 0) {
            jTbProduto.getColumnModel().getColumn(1).setMinWidth(300);
            jTbProduto.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jLabel5.setText("Pesquisar: ");

        jTFPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPesquisarActionPerformed(evt);
            }
        });

        jBtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magens18X18/Search-128(1).png"))); // NOI18N
        jBtPesquisar.setText("Pesquisar");
        jBtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisarActionPerformed(evt);
            }
        });

        jBtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magens18X18/Cancel2-256.png"))); // NOI18N
        jBtCancelar.setText("Cancelar");
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
            }
        });

        jBtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magens18X18/New File-256.png"))); // NOI18N
        jBtNovo.setText("Novo");
        jBtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtNovoActionPerformed(evt);
            }
        });

        jBtAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magens18X18/Edit_128.png"))); // NOI18N
        jBtAlterar.setText("Alterar");
        jBtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAlterarActionPerformed(evt);
            }
        });

        jBtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magens18X18/delete-128.png"))); // NOI18N
        jBtExcluir.setText("Excluir");
        jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirActionPerformed(evt);
            }
        });

        jBtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magens18X18/Save_64.png"))); // NOI18N
        jBtSalvar.setText("Salvar");
        jBtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBtCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtSalvar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCancelar)
                    .addComponent(jBtNovo)
                    .addComponent(jBtAlterar)
                    .addComponent(jBtExcluir)
                    .addComponent(jBtSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTFEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jTFValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jTFEstoque))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jTbProduto.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jTbProduto.setRowSorter(classificador);
        String texto = jTFPesquisar.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jBtPesquisarActionPerformed

    private void jTFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoActionPerformed

    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalvarActionPerformed
        if (salvarAlterar.equals("salvar")) {
            this.salvarProduto();
        } else if (salvarAlterar.equals("alterar")) {
            this.alterarProduto();
        }
    }//GEN-LAST:event_jBtSalvarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        int linha = jTbProduto.getSelectedRow();
        int codigoProduto = (int) jTbProduto.getValueAt(linha, 0);
        if (controllerProdutos.excluirProdutoController(codigoProduto)) {
            JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!", "SUCESSO", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.habilitaDesabilitaCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtExcluirActionPerformed

    private void jBtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtNovoActionPerformed
        habilitaDesabilitaCampos(true);
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jBtNovoActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        this.habilitaDesabilitaCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed
        salvarAlterar = "alterar";
        habilitaDesabilitaCampos(true);
        int linha = this.jTbProduto.getSelectedRow();
        try {
            int codigoProduto = (int) jTbProduto.getValueAt(linha, 0);
            //recuperar dados do banco
            modelProdutos = controllerProdutos.retonarProdutoController(codigoProduto);
            //setar na interface
            this.jTFCodigo.setText(String.valueOf(modelProdutos.getIdProduto()));
            this.jTFNome.setText(modelProdutos.getProNome());
            this.jTFEstoque.setText(String.valueOf(modelProdutos.getProEstoque()));
            this.jTFValor.setText(String.valueOf(modelProdutos.getProValor()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesquisarActionPerformed

    }//GEN-LAST:event_jTFPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    private void salvarProduto() {
        modelProdutos.setProNome(this.jTFNome.getText());
        modelProdutos.setProEstoque(Integer.parseInt(this.jTFEstoque.getText()));
        modelProdutos.setProValor(formatador.converterVirgulaParaPonto(this.jTFValor.getText()));
        if (controllerProdutos.salvrProdutosController(modelProdutos) > 0) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "SUCESSO", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.limparCampos();
            this.habilitaDesabilitaCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarProduto() {
        modelProdutos.setProNome(this.jTFNome.getText());
        modelProdutos.setProEstoque(Integer.parseInt(this.jTFEstoque.getText()));
        modelProdutos.setProValor(formatador.converterVirgulaParaPonto(this.jTFValor.getText()));
        if (controllerProdutos.alterarProdutoController(modelProdutos)) {
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "SUCESSO", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.limparCampos();
            this.habilitaDesabilitaCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * habilita e desabilita os campos do formulário
     *
     * @param condicao
     */
    private void habilitaDesabilitaCampos(boolean condicao) {
        jTFNome.setEnabled(condicao);
        jTFEstoque.setEnabled(condicao);
        jTFValor.setEnabled(condicao);
    }

    private void limparCampos() {
        jTFNome.setText(" ");
        jTFEstoque.setText(" ");
        jTFValor.setText(" ");
    }

    private void carregarProdutos() {
        listaModelProdutos = controllerProdutos.retornarListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jTbProduto.getModel();
        modelo.setNumRows(0);
        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getIdProduto(),
                listaModelProdutos.get(i).getProNome(),
                listaModelProdutos.get(i).getProEstoque(),
                listaModelProdutos.get(i).getProValor()
            });

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtNovo;
    private javax.swing.JButton jBtPesquisar;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JFormattedTextField jTFEstoque;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisar;
    private javax.swing.JFormattedTextField jTFValor;
    private javax.swing.JTable jTbProduto;
    // End of variables declaration//GEN-END:variables
}
