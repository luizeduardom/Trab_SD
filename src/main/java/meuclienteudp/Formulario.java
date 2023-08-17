package meuclienteudp;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import meuservidorudp.BaseDeDados;

public class Formulario extends javax.swing.JFrame {

    private BaseDeDados bd;
    private boolean validacaonome = false;

    public boolean validacao(String nome) {
        for (int i = 0; i < bd.getListaCliente().size(); i++) {
            if (bd.getListaCliente().get(i).getNome().equals(nome)) {
                validacaonome = true;
                return validacaonome; 
            }
        }
        System.out.println("Você não existe na base de dados");
        return false;
        
    }

    public Formulario() {
        this.bd = new BaseDeDados();
        initComponents();

        MeuClienteUDP cliente = new MeuClienteUDP();
        bd.criarMatriz();

        txtServidor.setText("");
        String nome = JOptionPane.showInputDialog(null, "Informe seu identificador para o chat:");
        validacaonome = validacao(nome);
        while (!validacaonome) {
            nome = JOptionPane.showInputDialog(null, "Informe seu identificador para o chat:");
            validacaonome = validacao(nome);
        }
        txtNome.setText(nome);
        txtServidor.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        lblServidor = new javax.swing.JLabel();
        txtServidor = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblFilme = new javax.swing.JLabel();
        cmbFilme = new javax.swing.JComboBox<>();
        lblAvaliacao = new javax.swing.JLabel();
        spnAvaliacao = new javax.swing.JSpinner();
        botRecomendacao = new javax.swing.JButton();
        botListar = new javax.swing.JButton();
        botAvaliacao = new javax.swing.JButton();
        lblAvaliar = new javax.swing.JLabel();
        chkAvaliar = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblServidor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblServidor.setText("Servidor");

        txtServidor.setEditable(false);
        txtServidor.setText("jTextField1");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNome.setText("Nome");

        txtNome.setEditable(false);
        txtNome.setText("jTextField2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Matriz da Base de Dados");

        lblFilme.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFilme.setText("Filme");

        cmbFilme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAvaliacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAvaliacao.setText("Avaliação");

        spnAvaliacao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));

        botRecomendacao.setText("Solicitar recomendação de filme");

        botListar.setText("Listar minhas avaliações");
        botListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botListarActionPerformed(evt);
            }
        });

        botAvaliacao.setText("Confirmar avaliação");

        lblAvaliar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAvaliar.setText("Avaliar");

        chkAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAvaliarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Filme", "Avaliacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServidor)
                            .addComponent(lblNome)
                            .addComponent(lblAvaliar)
                            .addComponent(lblFilme))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                .addComponent(cmbFilme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chkAvaliar))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvaliacao)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(spnAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botAvaliacao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botRecomendacao)
                                .addGap(62, 62, 62)
                                .addComponent(botListar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilme)
                    .addComponent(cmbFilme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvaliar)
                    .addComponent(chkAvaliar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvaliacao)
                    .addComponent(spnAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botAvaliacao))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botRecomendacao)
                    .addComponent(botListar))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarTabela() {

        // ADICIONAR LINHA NA TABELA        
        ((DefaultTableModel) jTable1.getModel()).addRow(new Object[1]);

        int linha = jTable1.getRowCount() - 1;
        int coluna = 0;
        jTable1.setValueAt(bd.getListaFilmes().get(linha).getTitulo(), linha, coluna++);
        jTable1.setValueAt(bd.getListaFilmes().get(linha).getAvaliacao(), linha, coluna++);

    }
    private void botListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botListarActionPerformed

        for (int i = 0; i < bd.getListaFilmes().size(); i++) {
            adicionarTabela();
        }


    }//GEN-LAST:event_botListarActionPerformed

    private void chkAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAvaliarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAvaliarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAvaliacao;
    private javax.swing.JButton botListar;
    private javax.swing.JButton botRecomendacao;
    private javax.swing.JCheckBox chkAvaliar;
    private javax.swing.JComboBox<String> cmbFilme;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblAvaliar;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblServidor;
    private javax.swing.JSpinner spnAvaliacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtServidor;
    // End of variables declaration//GEN-END:variables
}
