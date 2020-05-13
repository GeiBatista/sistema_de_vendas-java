/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;

/**
 *
 * @author geiba
 */
public class ViewCliente extends javax.swing.JFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    String salvarAlterar;

    /**
     * Creates new form ViewCliente
     */
    public ViewCliente() {
        initComponents();
        carregarCliente();
        setLocationRelativeTo(null);
        desabilitaHabilitaCampos(false);
        this.limparCampos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbCliente = new javax.swing.JTable();
        jPBotoesCliente = new javax.swing.JPanel();
        jBtCancelar = new javax.swing.JButton();
        jBtNovo = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtSalvar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtRelatorioCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFCep = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBEstados = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFPesquisar = new javax.swing.JTextField();
        jBtPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jTbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Cliente", "Cidade", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbCliente);
        if (jTbCliente.getColumnModel().getColumnCount() > 0) {
            jTbCliente.getColumnModel().getColumn(0).setMinWidth(20);
            jTbCliente.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPBotoesCliente.setBackground(new java.awt.Color(0, 102, 102));
        jPBotoesCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jBtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magens18X18/Save_64.png"))); // NOI18N
        jBtSalvar.setText("Salvar");
        jBtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalvarActionPerformed(evt);
            }
        });

        jBtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magens18X18/delete-128.png"))); // NOI18N
        jBtExcluir.setText("Excluir");
        jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirActionPerformed(evt);
            }
        });

        jBtRelatorioCliente.setText("Imprimir");
        jBtRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtRelatorioClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBotoesClienteLayout = new javax.swing.GroupLayout(jPBotoesCliente);
        jPBotoesCliente.setLayout(jPBotoesClienteLayout);
        jPBotoesClienteLayout.setHorizontalGroup(
            jPBotoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBotoesClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtRelatorioCliente)
                .addGap(18, 18, 18)
                .addComponent(jBtSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPBotoesClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtAlterar, jBtCancelar, jBtExcluir, jBtNovo, jBtRelatorioCliente});

        jPBotoesClienteLayout.setVerticalGroup(
            jPBotoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBotoesClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBotoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtCancelar)
                    .addComponent(jBtNovo)
                    .addComponent(jBtAlterar)
                    .addComponent(jBtSalvar)
                    .addComponent(jBtExcluir)
                    .addComponent(jBtRelatorioCliente))
                .addContainerGap())
        );

        jPBotoesClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtAlterar, jBtCancelar, jBtExcluir, jBtNovo, jBtRelatorioCliente});

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Telefone:");

        jTFCodigo.setEditable(false);
        jTFCodigo.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setText("UF:");

        jLabel2.setText("Nome:");

        jLabel5.setText("Cidade:");

        try {
            jTFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Endereço:");

        jLabel4.setText("Bairro:");

        jLabel1.setText("Código:");

        jCBEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jCBEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEstadosActionPerformed(evt);
            }
        });

        jLabel6.setText("CEP:");

        jLabel9.setText("Pesquisar: ");

        jTFPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFPesquisarFocusGained(evt);
            }
        });
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFNome)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(281, 281, 281)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFTelefone)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jTFPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtPesquisar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPBotoesCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBotoesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jCBEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEstadosActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
         this.carregarCliente();
        this.limparCampos();
          jBtCancelar.setEnabled(false);
         jBtPesquisar.setEnabled(false);
         jBtNovo.requestFocus();
         jBtNovo.setEnabled(true);
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed
        // TODO add your handling code here:
        int linha = jTbCliente.getSelectedRow();
        int codigoCliente = (int) jTbCliente.getValueAt(linha, 0);
        salvarAlterar = "alterar";

        modelCliente = controllerCliente.getClienteController(codigoCliente);
        jTFCodigo.setText(String.valueOf(modelCliente.getIdCliente()));
        jTFNome.setText(modelCliente.getCliNome());
        jTFEndereco.setText(modelCliente.getCliEndereco());
        jTFBairro.setText(modelCliente.getCliBairro());
        jTFCidade.setText(modelCliente.getCliCidade());
        jCBEstados.setSelectedItem(modelCliente.getCliUf());
        jTFCep.setText(modelCliente.getCliCep());
        jTFTelefone.setText(modelCliente.getCliTelefone());
        this.desabilitaHabilitaCampos(true);

    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalvarActionPerformed

        try {
            modelCliente.setIdCliente(Integer.parseInt(this.jTFCodigo.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        modelCliente.setCliNome(this.jTFNome.getText());
        modelCliente.setCliEndereco(this.jTFEndereco.getText());
        modelCliente.setCliBairro(this.jTFBairro.getText());
        modelCliente.setCliCidade(this.jTFCidade.getText());
        modelCliente.setCliUf(this.jCBEstados.getSelectedItem().toString());
        modelCliente.setCliCep(this.jTFCep.getText());
        modelCliente.setCliTelefone(this.jTFTelefone.getText());

        if (salvarAlterar.equals("salvar")) {
            if (controllerCliente.salvarClienteController(modelCliente) > 0) {
                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!", "SUCESSO", JOptionPane.WARNING_MESSAGE);
                //carregar os clientes na tabela
                carregarCliente();
                this.desabilitaHabilitaCampos(false);
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o registro!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (controllerCliente.atualizarClienteController(modelCliente)) {
                JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!", "SUCESSO", JOptionPane.WARNING_MESSAGE);
                //carregar os clientes na tabela
                carregarCliente();
                this.desabilitaHabilitaCampos(false);
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar o registro!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBtSalvarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jTbCliente.getSelectedRow();
        int codigoCliente = (int) jTbCliente.getValueAt(linha, 0);
        if (controllerCliente.excluirClienteController(codigoCliente)) {
            JOptionPane.showMessageDialog(this, "Registro Excluido com sucesso!", "SUCESSO", JOptionPane.WARNING_MESSAGE);
            this.carregarCliente();
             this.desabilitaHabilitaCampos(false);
             jBtNovo.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao Excluir o registro!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtExcluirActionPerformed

    private void jBtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtNovoActionPerformed
        // TODO add your handling code here:
        this.desabilitaHabilitaCampos(true);
        this.limparCampos();
        salvarAlterar = "salvar";
          jBtAlterar.setEnabled(false);
         jBtExcluir.setEnabled(false);
    }//GEN-LAST:event_jBtNovoActionPerformed

    private void jBtRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtRelatorioClienteActionPerformed
        // TODO add your handling code here:
        controllerCliente.gerarRelatorioCliente();
    }//GEN-LAST:event_jBtRelatorioClienteActionPerformed

    private void jTFPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesquisarFocusGained
        jBtPesquisar.setEnabled(true);
        jBtCancelar.setEnabled(true);
    }//GEN-LAST:event_jTFPesquisarFocusGained

    private void jTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPesquisarActionPerformed

    }//GEN-LAST:event_jTFPesquisarActionPerformed

    private void jBtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jTbCliente.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jTbCliente.setRowSorter(classificador);
        String texto = jTFPesquisar.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jBtPesquisarActionPerformed

    private void jTbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbClienteMouseClicked
        jBtAlterar.setEnabled(true);
       jBtExcluir.setEnabled(true);
       jBtNovo.setEnabled(false);
       jBtCancelar.setEnabled(true);
    }//GEN-LAST:event_jTbClienteMouseClicked

    // Habilita ou desabilita campo e botoes
    private void desabilitaHabilitaCampos(boolean condicao) {
        jTFNome.setEnabled(condicao);
        jTFEndereco.setEnabled(condicao);
        jTFBairro.setEnabled(condicao);
        jTFCidade.setEnabled(condicao);
        jCBEstados.setEnabled(condicao);
        jTFCep.setEnabled(condicao);
        jTFTelefone.setEnabled(condicao);
        jBtSalvar.setEnabled(condicao);
        
        
       // jTFEstoque.setEnabled(condicao);
      //  jTFValor.setEnabled(condicao);
        jBtSalvar.setEnabled(condicao);
        jBtAlterar.setEnabled(condicao);
        jBtCancelar.setEnabled(condicao);
       jBtExcluir.setEnabled(condicao);
       
    }

    // limpar campos do formulário
    private void limparCampos() {
        jTFNome.setText(" ");
        jTFEndereco.setText(" ");
        jTFBairro.setText(" ");
        jTFCidade.setText(" ");
        jTFCep.setText(" ");
        jTFTelefone.setText(" ");
        jTFPesquisar.setText(" ");
        jTFCodigo.setText(" ");
    }

    private void carregarCliente() {
        listaModelClientes = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) jTbCliente.getModel(); // criar tabela
        modelo.setNumRows(0); //remove linhas para não duplicar
        int cont = listaModelClientes.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelClientes.get(i).getIdCliente(),
                listaModelClientes.get(i).getCliNome(),
                listaModelClientes.get(i).getCliCidade(),
                listaModelClientes.get(i).getCliTelefone()
            });
        }
    }

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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtNovo;
    private javax.swing.JButton jBtPesquisar;
    private javax.swing.JButton jBtRelatorioCliente;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JComboBox<String> jCBEstados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPBotoesCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JFormattedTextField jTFCep;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPesquisar;
    private javax.swing.JTextField jTFTelefone;
    private javax.swing.JTable jTbCliente;
    // End of variables declaration//GEN-END:variables
}
