/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.UsuarioController;
import Model.UsuarioModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        initComponents();
        listarUsuariosView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTUsuario = new javax.swing.JTable();
        JPButtons = new javax.swing.JPanel();
        BtnDeletar = new javax.swing.JButton();
        BtnAlterar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        JLPesquisa = new javax.swing.JLabel();
        TxtPesquisa = new javax.swing.JTextField();
        BtnPesquisa = new javax.swing.JButton();
        BtnConfirma = new javax.swing.JButton();
        LBId = new javax.swing.JLabel();
        JPCadastroUsuario = new javax.swing.JPanel();
        JLCpf = new javax.swing.JLabel();
        JLEndereço = new javax.swing.JLabel();
        JFDataNas = new javax.swing.JFormattedTextField();
        JLNascimento = new javax.swing.JLabel();
        TxtEndereço = new javax.swing.JTextField();
        JLEmail = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        JFCpf = new javax.swing.JFormattedTextField();
        JLTitulo = new javax.swing.JLabel();
        JLNome = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        BtnLivro = new javax.swing.JButton();
        BtnAutor = new javax.swing.JButton();
        BtnEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JTUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "E-mail", "Endereço", "Data de Nascimento", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTUsuarioMouseClicked(evt);
            }
        });
        JTUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTUsuarioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTUsuario);

        JPButtons.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BtnDeletar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnDeletar.setText("Deletar");
        BtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeletarActionPerformed(evt);
            }
        });

        BtnAlterar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnAlterar.setText("Alterar");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        BtnSalvar.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        JLPesquisa.setText("Pesquisa: ");

        TxtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPesquisaActionPerformed(evt);
            }
        });

        BtnPesquisa.setText("Pesquisar");
        BtnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisaActionPerformed(evt);
            }
        });

        BtnConfirma.setText("Confirmar Alteração");
        BtnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPButtonsLayout = new javax.swing.GroupLayout(JPButtons);
        JPButtons.setLayout(JPButtonsLayout);
        JPButtonsLayout.setHorizontalGroup(
            JPButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnConfirma)
                .addGap(36, 36, 36)
                .addComponent(JLPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnPesquisa)
                .addContainerGap())
        );
        JPButtonsLayout.setVerticalGroup(
            JPButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPButtonsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(JPButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAlterar)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnDeletar)
                    .addComponent(JLPesquisa)
                    .addComponent(TxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisa)
                    .addComponent(BtnConfirma))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        LBId.setText("          ");

        JPCadastroUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        JLCpf.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        JLCpf.setText("CPF");

        JLEndereço.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        JLEndereço.setText("Endereço");

        try {
            JFDataNas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##  /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFDataNas.setText(" ");
        JFDataNas.setToolTipText("");

        JLNascimento.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        JLNascimento.setText("Data de Nascimento");

        TxtEndereço.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEndereçoActionPerformed(evt);
            }
        });

        JLEmail.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        JLEmail.setText("E-mail");

        TxtEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        try {
            JFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFCpf.setText("     .    .   -  ");

        JLTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLTitulo.setText("Cadastro de Usuário ");

        JLNome.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        JLNome.setText("Nome Completo");

        TxtNome.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        BtnLivro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnLivro.setText("Livro");
        BtnLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLivroActionPerformed(evt);
            }
        });

        BtnAutor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnAutor.setText("Autor");
        BtnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutorActionPerformed(evt);
            }
        });

        BtnEmprestimo.setText("Emprestimo");
        BtnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPCadastroUsuarioLayout = new javax.swing.GroupLayout(JPCadastroUsuario);
        JPCadastroUsuario.setLayout(JPCadastroUsuarioLayout);
        JPCadastroUsuarioLayout.setHorizontalGroup(
            JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastroUsuarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNome)
                    .addComponent(JLNascimento)
                    .addComponent(JLCpf)
                    .addComponent(JLEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JFDataNas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPCadastroUsuarioLayout.createSequentialGroup()
                        .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLTitulo))
                        .addGap(123, 123, 123)
                        .addComponent(BtnLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEmprestimo)))
                .addContainerGap())
        );
        JPCadastroUsuarioLayout.setVerticalGroup(
            JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastroUsuarioLayout.createSequentialGroup()
                .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCadastroUsuarioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JLTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLNome)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JFDataNas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCpf)
                            .addComponent(JFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLEndereço)
                            .addComponent(TxtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLEmail)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnLivro, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JPCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAutor)
                            .addComponent(BtnEmprestimo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JPButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(424, 424, 424)
                    .addComponent(LBId)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JPCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(292, 292, 292)
                    .addComponent(LBId)
                    .addContainerGap(293, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void TxtEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEndereçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEndereçoActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        // TODO add your handling code here:
        String nome = TxtNome.getText();
        String cpf = JFCpf.getText();
        String email = TxtEmail.getText();
        String endereço = TxtEndereço.getText();
        String dataNascimento = JFDataNas.getText();
        String status = "Disponivel";
        
        if (verificarIdade(dataNascimento)) {

            UsuarioController novoCadastro = new UsuarioController();

            novoCadastro.CadastroUsuarioController(nome, cpf, email, endereço, dataNascimento, status);

            TxtNome.setText("");
            TxtEmail.setText("");
            TxtEndereço.setText("");
            JFCpf.setText("");
            JFDataNas.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "O Usuario deve ter pelo menos 14 anos de idade");
        }

        listarUsuariosView();
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void JTUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTUsuarioKeyPressed
        // TODO add your handling code here:

        String id = JTUsuario.getModel().getValueAt(JTUsuario.getSelectedRow(), 2).toString();

    }//GEN-LAST:event_JTUsuarioKeyPressed

    private void JTUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTUsuarioKeyReleased
        // TODO add your handling code here:
        String id = JTUsuario.getModel().getValueAt(JTUsuario.getSelectedRow(), 2).toString();

    }//GEN-LAST:event_JTUsuarioKeyReleased

    private void TxtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPesquisaActionPerformed

    private void BtnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisaActionPerformed
        // TODO add your handling code here:
        String pesquisa = TxtPesquisa.getText();
        filtrarUsuarios(pesquisa);
    }//GEN-LAST:event_BtnPesquisaActionPerformed

    private void BtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeletarActionPerformed
        // TODO add your handling code here:
        String idAuxiliar = LBId.getText();
        String nome = TxtNome.getText();
        String cpf = JFCpf.getText();
        String email = TxtEmail.getText();
        String endereço = TxtEndereço.getText();
        String dataNascimento = JFDataNas.getText();

        Integer id = Integer.valueOf(idAuxiliar);

        UsuarioController excluirUsuario = new UsuarioController();
        excluirUsuario.excluirUsuarioController(id);
        listarUsuariosView();

        TxtNome.setText("");
        TxtEmail.setText("");
        TxtEndereço.setText("");
        JFCpf.setText("");
        JFDataNas.setText("");

        BtnSalvar.setEnabled(true);
    }//GEN-LAST:event_BtnDeletarActionPerformed

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        // TODO add your handling code here:
        preencheDados();


    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void JTUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUsuarioMouseClicked
        // TODO add your handling code here:

        CapturaDados();

    }//GEN-LAST:event_JTUsuarioMouseClicked

    private void BtnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmaActionPerformed
        // TODO add your handling code here:
        String idAux = LBId.getText();
        String nome = TxtNome.getText();
        String cpf = JFCpf.getText();
        String email = TxtEmail.getText();
        String endereço = TxtEndereço.getText();
        String dataNascimento = JFDataNas.getText();

        UsuarioController AlterarUsuario = new UsuarioController();
        AlterarUsuario.alterarUsuarioController(idAux, nome, cpf, email, endereço, dataNascimento);
        BtnSalvar.setEnabled(true);
        listarUsuariosView();
    }//GEN-LAST:event_BtnConfirmaActionPerformed

    private void BtnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmprestimoActionPerformed
        // TODO add your handling code here:
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BtnEmprestimoActionPerformed

    private void BtnLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLivroActionPerformed
        // TODO add your handling code here:
        CadastroLivro livro = new CadastroLivro();
        livro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnLivroActionPerformed

    private void BtnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutorActionPerformed
        // TODO add your handling code here:
        CadastroAutor autor = new CadastroAutor();
        autor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAutorActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnAutor;
    private javax.swing.JButton BtnConfirma;
    private javax.swing.JButton BtnDeletar;
    private javax.swing.JButton BtnEmprestimo;
    private javax.swing.JButton BtnLivro;
    private javax.swing.JButton BtnPesquisa;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JFormattedTextField JFCpf;
    private javax.swing.JFormattedTextField JFDataNas;
    private javax.swing.JLabel JLCpf;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLEndereço;
    private javax.swing.JLabel JLNascimento;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLPesquisa;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JPanel JPButtons;
    private javax.swing.JPanel JPCadastroUsuario;
    private javax.swing.JTable JTUsuario;
    private javax.swing.JLabel LBId;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEndereço;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void listarUsuariosView() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) JTUsuario.getModel();
            dtm.setRowCount(0);
            UsuarioController usuarioController = new UsuarioController();
            ArrayList<UsuarioModel> listarUsuarios = usuarioController.listarUsuariosController();

            Iterator<UsuarioModel> iterator = listarUsuarios.iterator();

            while (iterator.hasNext()) {
                UsuarioModel usuarios = iterator.next();
                dtm.addRow(new Object[]{
                    usuarios.getCodigo(),
                    usuarios.getNome(),
                    usuarios.getCpf(),
                    usuarios.getEmail(),
                    usuarios.getEndereço(),
                    usuarios.getDataNascimento(),
                    usuarios.getStatus()});
            }

        } catch (Exception e) {
        }
    }

    private void filtrarUsuarios(String nome) {

        DefaultTableModel dtm = (DefaultTableModel) JTUsuario.getModel();
        dtm.setRowCount(0);
        UsuarioController usuarioController = new UsuarioController();
        ArrayList<UsuarioModel> listarUsuarios = usuarioController.buscarUsuarioController(nome);

        Iterator<UsuarioModel> iterator = listarUsuarios.iterator();
        while (iterator.hasNext()) {
            UsuarioModel usuarios = iterator.next();
            dtm.addRow(new Object[]{
                usuarios.getCodigo(),
                usuarios.getNome(),
                usuarios.getCpf(),
                usuarios.getEmail(),
                usuarios.getEndereço(),
                usuarios.getDataNascimento(),
                usuarios.getStatus()});
        }

    }

    private void CapturaDados() {
        String nome = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 1)
                .toString();
        String cpf = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 2)
                .toString();
        String email = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 3)
                .toString();
        String endereço = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 4)
                .toString();
        String dataNascimento = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 5)
                .toString();
        String status = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 6)
                .toString();
        String idAux = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 0)
                .toString();
    }

    private void preencheDados() {
        String nome = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 1)
                .toString();
        String cpf = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 2)
                .toString();
        String email = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 3)
                .toString();
        String endereço = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 4)
                .toString();
        String dataNascimento = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 5)
                .toString();
        String status = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 6)
                .toString();
        String idAux = JTUsuario.getModel().
                getValueAt(JTUsuario.getSelectedRow(), 0)
                .toString();

        TxtNome.setText(nome);
        JFCpf.setText(cpf);
        TxtEmail.setText(email);
        TxtEndereço.setText(endereço);
        JFDataNas.setText(dataNascimento);
        LBId.setText(idAux);

        BtnSalvar.setEnabled(false);

    }

    private boolean verificarIdade(String dataNascimento) {
       try {
        SimpleDateFormat sdf = new SimpleDateFormat("  dd  /  MM  /  yyyy");
        Date dataNasc = sdf.parse(dataNascimento);

        Calendar dataNascCal = Calendar.getInstance();
        dataNascCal.setTime(dataNasc);

        Calendar hojeCal = Calendar.getInstance();

        int idade = hojeCal.get(Calendar.YEAR) - dataNascCal.get(Calendar.YEAR);

        // Verificar se o aniversário já ocorreu este ano
        if (hojeCal.get(Calendar.MONTH) < dataNascCal.get(Calendar.MONTH) ||
                (hojeCal.get(Calendar.MONTH) == dataNascCal.get(Calendar.MONTH) &&
                        hojeCal.get(Calendar.DAY_OF_MONTH) < dataNascCal.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }

        // Verificar se a idade é maior ou igual a 13 anos
        return idade >= 13;
    } catch (ParseException e) {
        e.printStackTrace();
        return false;
    }
    }
}
