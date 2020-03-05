/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProduto;
import controller.ControllerVendas;
import controller.ControllerVendasProdutos;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelProduto;
import model.ModelSessaoUsuario;
import model.ModelVendas;
import model.ModelVendasProdutos;
import util.BLDatas;

/**
 *
 * @author geiba
 */
public class ViewPDV extends javax.swing.JFrame {

    ControllerProduto controllerProdutos = new ControllerProduto();
    ModelProduto modelProdutos = new ModelProduto();
    ModelVendas modelVendas = new ModelVendas();
    ArrayList<ModelProduto> listaModelProdutos = new ArrayList<>();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutoses = new ArrayList<>();
    BLDatas blDatas = new BLDatas();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();
    int quantidade;

    /**
     * Creates new form ViewPDV
     */
    public ViewPDV() {
        initComponents();
        setLocationRelativeTo(null);
        quantidade = 1;
        setarOperador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uJPanelImagem1 = new componentes.UJPanelImagem();
        jPanel1 = new javax.swing.JPanel();
        uJPanelImagem3 = new componentes.UJPanelImagem();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLOperador = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uJPanelImagem4 = new componentes.UJPanelImagem();
        jLabel9 = new javax.swing.JLabel();
        jTFValorTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbProdutoPDV = new javax.swing.JTable();
        jTfCodigoProduto = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMItemAddQuantidade = new javax.swing.JMenuItem();
        jMIFinalizarVenda = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Caixa:");

        jLabel6.setText("jLabel6");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Operador:");

        jLOperador.setText("Operador");

        jLabel8.setText("jLabel8");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Status:");

        javax.swing.GroupLayout uJPanelImagem3Layout = new javax.swing.GroupLayout(uJPanelImagem3);
        uJPanelImagem3.setLayout(uJPanelImagem3Layout);
        uJPanelImagem3Layout.setHorizontalGroup(
            uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(uJPanelImagem3Layout.createSequentialGroup()
                        .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(uJPanelImagem3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jLabel4)
                            .addGroup(uJPanelImagem3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        uJPanelImagem3Layout.setVerticalGroup(
            uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOperador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uJPanelImagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Valor Total:");

        jTFValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorTotalActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Comandos");

        jLabel11.setText("F3 Quantidade");

        jLabel12.setText("F4 Finalizar Venda");

        jLabel13.setText("F5 Pesquisar Produtos");

        jLabel14.setText("F6 Sair");

        javax.swing.GroupLayout uJPanelImagem4Layout = new javax.swing.GroupLayout(uJPanelImagem4);
        uJPanelImagem4.setLayout(uJPanelImagem4Layout);
        uJPanelImagem4Layout.setHorizontalGroup(
            uJPanelImagem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(uJPanelImagem4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uJPanelImagem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFValorTotal)
                    .addGroup(uJPanelImagem4Layout.createSequentialGroup()
                        .addGroup(uJPanelImagem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(uJPanelImagem4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        uJPanelImagem4Layout.setVerticalGroup(
            uJPanelImagem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uJPanelImagem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uJPanelImagem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(uJPanelImagem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uJPanelImagem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GB ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Vendas");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addContainerGap(539, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTbProdutoPDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código", "Nome", "Quantidade", "Valor Unit.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbProdutoPDV);
        if (jTbProdutoPDV.getColumnModel().getColumnCount() > 0) {
            jTbProdutoPDV.getColumnModel().getColumn(0).setMinWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(0).setMaxWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(1).setMinWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(1).setMaxWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(3).setMinWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(3).setMaxWidth(50);
            jTbProdutoPDV.getColumnModel().getColumn(4).setMinWidth(80);
            jTbProdutoPDV.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTbProdutoPDV.getColumnModel().getColumn(4).setMaxWidth(80);
            jTbProdutoPDV.getColumnModel().getColumn(5).setMinWidth(80);
            jTbProdutoPDV.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTbProdutoPDV.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jTfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfCodigoProdutoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTfCodigoProduto)
                    .addComponent(jScrollPane1))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jTfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Comandos");

        jMItemAddQuantidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMItemAddQuantidade.setText("Alterar quantidade");
        jMItemAddQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemAddQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(jMItemAddQuantidade);

        jMIFinalizarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMIFinalizarVenda.setText("Finalizar Venda");
        jMIFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFinalizarVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jMIFinalizarVenda);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setText("Pesquisar Produtos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItemAddQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemAddQuantidadeActionPerformed
        // TODO add your handling code here:
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade!"));
                
    }//GEN-LAST:event_jMItemAddQuantidadeActionPerformed

    private void jMIFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFinalizarVendaActionPerformed
        // TODO add your handling code here:
        int cont;
        int codigoProduto = 0, codigoVenda = 0;
        modelVendas = new ModelVendas();
        modelVendas.setCliente(1);
        try {
            modelVendas.setVenDataVenda(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            Logger.getLogger(ViewPDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        modelVendas.setVenValorBruto(Double.parseDouble(jTFValorTotal.getText()));
        modelVendas.setVenDesconto(0);
        modelVendas.setVenValorLiquido(Double.parseDouble(jTFValorTotal.getText()));
        
        //Salvar venda;
        codigoVenda = controllerVendas.salvarVendasController(modelVendas);

        cont = jTbProdutoPDV.getRowCount();
        for (int i = 0; i < cont; i++) {
            codigoProduto = (int) jTbProdutoPDV.getValueAt(i, 1);
            modelVendasProdutos = new ModelVendasProdutos();
            modelProdutos = new ModelProduto();
            modelVendasProdutos.setProduto(codigoProduto);
            modelVendasProdutos.setVendas(codigoVenda);
            modelVendasProdutos.setVenProValor((double) jTbProdutoPDV.getValueAt(i, 4));
            modelVendasProdutos.setVenProQuantidade(Integer.parseInt(jTbProdutoPDV.getValueAt(i, 3).toString()));
            //produto
            modelProdutos.setIdProduto(codigoProduto);
            modelProdutos.setProEstoque(controllerProdutos.getProdutoController(codigoProduto).getProEstoque()
                    - Integer.parseInt(jTbProdutoPDV.getValueAt(i, 3).toString()));
            listaModelVendasProdutoses.add(modelVendasProdutos);
            listaModelProdutos.add(modelProdutos);
        }

        //salvar os produtos da venda
        if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutoses)) {
            //Alterar estoque de produtos;
            controllerProdutos.atualizarEstoqueProdutoController(listaModelProdutos);
           JOptionPane.showMessageDialog(this, "Produtos da venda  Salvo(s)!", "SUCESSO", JOptionPane.WARNING_MESSAGE);
          
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar produto da  venda", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMIFinalizarVendaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTFValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorTotalActionPerformed

    private void jTfCodigoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfCodigoProdutoKeyReleased
        // TODO add your handling code here:
        pegarConteudo(evt);
    }//GEN-LAST:event_jTfCodigoProdutoKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void pegarConteudo(java.awt.event.KeyEvent e) {
              DefaultTableModel modelo = (DefaultTableModel) jTbProdutoPDV.getModel();
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            modelProdutos = controllerProdutos.getProdutoController(Integer.parseInt(jTfCodigoProduto.getText()));
            modelo.addRow(new Object[ ]{
                modelo.getRowCount() + 1,
                modelProdutos.getIdProduto(),
                modelProdutos.getProNome(),
                quantidade,
                modelProdutos.getProValor(),
                modelProdutos.getProValor() * quantidade
            });
            jTFValorTotal.setText(String.valueOf(somaValorTotal()));
            jTfCodigoProduto.setText("");
         quantidade = 1;
        }
    }

    private float somaValorTotal() {
        float soma = 0, valor = 0;
        int cont = jTbProdutoPDV.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Float.parseFloat(String.valueOf(jTbProdutoPDV.getValueAt(i, 5)));
            soma += valor;
        }
        return soma;
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
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPDV().setVisible(true);
            }
        });
    }
    
    private void setarOperador(){
        jLOperador.setText(modelSessaoUsuario.login);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLOperador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMIFinalizarVenda;
    private javax.swing.JMenuItem jMItemAddQuantidade;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFValorTotal;
    private javax.swing.JTable jTbProdutoPDV;
    private javax.swing.JTextField jTfCodigoProduto;
    private componentes.UJPanelImagem uJPanelImagem1;
    private componentes.UJPanelImagem uJPanelImagem3;
    private componentes.UJPanelImagem uJPanelImagem4;
    // End of variables declaration//GEN-END:variables
}
