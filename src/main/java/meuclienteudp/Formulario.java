package meuclienteudp;

import javax.swing.JOptionPane;

public final class Formulario extends javax.swing.JFrame {

    private String validacaonome;
    private String nome;
    private MeuClienteUDP controlador;
    private String mensagem;

    public String validarNome() {
        nome = JOptionPane.showInputDialog(null, "Informe seu identificador para o chat:");
        nome = nome.toUpperCase();
        return nome;
    }

    public void esconderBotoesAvaliacao() {
        lblAvaliacao.setVisible(false);
        spnAvaliacao.setVisible(false);
        botAvaliacao.setVisible(false);
        lblFilme.setVisible(false);
        txtFilme.setVisible(false);
    }

    public void mostrarBotoesAvaliacao() {
        lblAvaliacao.setVisible(true);
        spnAvaliacao.setVisible(true);
        botAvaliacao.setVisible(true);
        lblFilme.setVisible(true);
        txtFilme.setVisible(true);
    }

    public Formulario() {
        initComponents();

        esconderBotoesAvaliacao();

        controlador = new MeuClienteUDP();

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
        lblAvaliacao = new javax.swing.JLabel();
        spnAvaliacao = new javax.swing.JSpinner();
        botRecomendacao = new javax.swing.JButton();
        botListar = new javax.swing.JButton();
        botAvaliacao = new javax.swing.JButton();
        lblAvaliar = new javax.swing.JLabel();
        chkAvaliar = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtFilme = new javax.swing.JTextField();

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
        jLabel4.setText("Resposta do Servidor");

        lblFilme.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFilme.setText("Filme");

        lblAvaliacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAvaliacao.setText("Avaliação");

        spnAvaliacao.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        botRecomendacao.setText("Solicitar recomendação de filme");

        botListar.setText("Listar minhas avaliações");
        botListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botListarActionPerformed(evt);
            }
        });

        botAvaliacao.setText("Confirmar avaliação");
        botAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAvaliacaoActionPerformed(evt);
            }
        });

        lblAvaliar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAvaliar.setText("Avaliar");

        chkAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAvaliarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        txtFilme.setEditable(false);
        txtFilme.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServidor)
                            .addComponent(lblNome))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtServidor, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAvaliacao)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(spnAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botAvaliacao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botRecomendacao)
                                .addGap(62, 62, 62)
                                .addComponent(botListar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFilme)
                                    .addComponent(lblAvaliar))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkAvaliar))))
                        .addGap(0, 31, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvaliar)
                    .addComponent(chkAvaliar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFilme)
                    .addComponent(txtFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvaliacao)
                    .addComponent(spnAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botAvaliacao))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botRecomendacao)
                    .addComponent(botListar))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botListarActionPerformed
      
    }//GEN-LAST:event_botListarActionPerformed

    private void chkAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAvaliarActionPerformed
        
    }//GEN-LAST:event_chkAvaliarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void botAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAvaliacaoActionPerformed

    }//GEN-LAST:event_botAvaliacaoActionPerformed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblAvaliar;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblServidor;
    private javax.swing.JSpinner spnAvaliacao;
    private javax.swing.JTextField txtFilme;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtServidor;
    // End of variables declaration//GEN-END:variables
}
