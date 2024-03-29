/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AutorController;
import Model.AutorModel;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CadastroAutor extends javax.swing.JFrame {

    /**
     * Creates new form CadastroEscritor
     */
    public CadastroAutor() {
        initComponents();
        listarAutorView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPButtons = new javax.swing.JPanel();
        BtnDeletar = new javax.swing.JButton();
        BtnAlterar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        JLPesquisa = new javax.swing.JLabel();
        TxtPesquisa = new javax.swing.JTextField();
        BtnPesquisa = new javax.swing.JButton();
        BtnConfirma = new javax.swing.JButton();
        JPCadastroAutor = new javax.swing.JPanel();
        JLTitulo = new javax.swing.JLabel();
        JLNome = new javax.swing.JLabel();
        JLNacionalidade = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtNacionalidade = new javax.swing.JTextField();
        JLId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAutor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BtnUsuario = new javax.swing.JButton();
        BtnLivro = new javax.swing.JButton();
        BtnEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        JPCadastroAutor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        JLTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JLTitulo.setText("Cadastro Do Autor");

        JLNome.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        JLNome.setText("Nome Completo");

        JLNacionalidade.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        JLNacionalidade.setText("Nacionalidade");

        TxtNome.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        TxtNacionalidade.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        javax.swing.GroupLayout JPCadastroAutorLayout = new javax.swing.GroupLayout(JPCadastroAutor);
        JPCadastroAutor.setLayout(JPCadastroAutorLayout);
        JPCadastroAutorLayout.setHorizontalGroup(
            JPCadastroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastroAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPCadastroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNome)
                    .addComponent(JLNacionalidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(JPCadastroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLTitulo)
                    .addComponent(TxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(TxtNacionalidade))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        JPCadastroAutorLayout.setVerticalGroup(
            JPCadastroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastroAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo)
                .addGap(43, 43, 43)
                .addGroup(JPCadastroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNome)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(JPCadastroAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNacionalidade)
                    .addComponent(TxtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        JLId.setText("jLabel1");

        JTAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nacionalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        JTAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTAutorMouseClicked(evt);
            }
        });
        JTAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTAutorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTAutorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTAutor);
        if (JTAutor.getColumnModel().getColumnCount() > 0) {
            JTAutor.getColumnModel().getColumn(0).setResizable(false);
            JTAutor.getColumnModel().getColumn(1).setResizable(false);
            JTAutor.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnUsuario.setText("Usuario");
        BtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BtnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BtnLivro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnLivro.setText("Livro");
        BtnLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLivroActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 65, -1));

        BtnEmprestimo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnEmprestimo.setText("Emprestimo");
        BtnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmprestimoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(JPCadastroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(395, 395, 395)
                    .addComponent(JLId)
                    .addContainerGap(417, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(JPCadastroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(JPButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(255, 255, 255)
                    .addComponent(JLId)
                    .addContainerGap(334, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeletarActionPerformed
        // TODO add your handling code here:
        String idAuxiliar = JLId.getText();
        String nome = TxtNome.getText();
        String nacionalidade = TxtNacionalidade.getText();

        Integer id = Integer.valueOf(idAuxiliar);

        AutorController excluirAutor = new AutorController();
        excluirAutor.excluirAutorController(id);
        listarAutorView();

        TxtNome.setText("");
        TxtNacionalidade.setText("");

        BtnSalvar.setEnabled(true);
    }//GEN-LAST:event_BtnDeletarActionPerformed

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        // TODO add your handling code here:
        preencheDados();
        listarAutorView();
    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        // TODO add your handling code here:
        String nome = TxtNome.getText();
        String nacionalidade = TxtNacionalidade.getText();

        AutorController novoCadastro = new AutorController();

        novoCadastro.CadastroAutorController(nome, nacionalidade);

        TxtNome.setText("");
        TxtNacionalidade.setText("");

        listarAutorView();
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void TxtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPesquisaActionPerformed

    private void BtnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisaActionPerformed
        // TODO add your handling code here:
        String pesquisa = TxtPesquisa.getText();
        filtrarAutor(pesquisa);
        listarAutorView();
    }//GEN-LAST:event_BtnPesquisaActionPerformed

    private void BtnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmaActionPerformed
        // TODO add your handling code here:
        String idAux = JLId.getText();
        String nome = TxtNome.getText();
        String nacionalidade = TxtNacionalidade.getText();

        AutorController AlterarAutor = new AutorController();
        AlterarAutor.alterarAutorController(idAux, nome, nacionalidade);
        BtnSalvar.setEnabled(true);
        listarAutorView();
    }//GEN-LAST:event_BtnConfirmaActionPerformed

    private void JTAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTAutorMouseClicked
        // TODO add your handling code here:
        CapturaDados();
    }//GEN-LAST:event_JTAutorMouseClicked

    private void JTAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTAutorKeyPressed
        // TODO add your handling code here:
        String id = JTAutor.getModel().getValueAt(JTAutor.getSelectedRow(), 0).toString();

    }//GEN-LAST:event_JTAutorKeyPressed

    private void JTAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTAutorKeyReleased
        // TODO add your handling code here:
        String id = JTAutor.getModel().getValueAt(JTAutor.getSelectedRow(), 0).toString();

    }//GEN-LAST:event_JTAutorKeyReleased

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

    private void BtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioActionPerformed
        // TODO add your handling code here:
        CadastroUsuario usuario = new CadastroUsuario();
        usuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnConfirma;
    private javax.swing.JButton BtnDeletar;
    private javax.swing.JButton BtnEmprestimo;
    private javax.swing.JButton BtnLivro;
    private javax.swing.JButton BtnPesquisa;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JButton BtnUsuario;
    private javax.swing.JLabel JLId;
    private javax.swing.JLabel JLNacionalidade;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLPesquisa;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JPanel JPButtons;
    private javax.swing.JPanel JPCadastroAutor;
    private javax.swing.JTable JTAutor;
    private javax.swing.JTextField TxtNacionalidade;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void preencheDados() {
        String nome = JTAutor.getModel().
                getValueAt(JTAutor.getSelectedRow(), 1)
                .toString();
        String nacionalidade = JTAutor.getModel().
                getValueAt(JTAutor.getSelectedRow(), 2)
                .toString();
        String idAux = JTAutor.getModel().
                getValueAt(JTAutor.getSelectedRow(), 0)
                .toString();

        TxtNome.setText(nome);
        TxtNacionalidade.setText(nacionalidade);
        JLId.setText(idAux);

        BtnSalvar.setEnabled(false);
    }

    private void listarAutorView() {

        DefaultTableModel dtm = (DefaultTableModel) JTAutor.getModel();
        dtm.setRowCount(0);
        AutorController autorController = new AutorController();
        ArrayList<AutorModel> listarAutor = autorController.listarAutorController();

        Iterator<AutorModel> iterator = listarAutor.iterator();

        while (iterator.hasNext()) {
            AutorModel autor = iterator.next();
            dtm.addRow(new Object[]{
                autor.getCodigo(),
                autor.getNome(),
                autor.getNacionalidade()});
        }

    }

    private void filtrarAutor(String nome) {
        DefaultTableModel dtm = (DefaultTableModel) JTAutor.getModel();
        dtm.setRowCount(0);
        AutorController autorController = new AutorController();
        ArrayList<AutorModel> listarAutor = autorController.buscarAutorController(nome);

        Iterator<AutorModel> iterator = listarAutor.iterator();
        while (iterator.hasNext()) {
            AutorModel autor = iterator.next();
            dtm.addRow(new Object[]{
                autor.getCodigo(),
                autor.getNome(),
                autor.getNacionalidade()});
        }
    }

    private void CapturaDados() {

        String nome = JTAutor.getModel().
                getValueAt(JTAutor.getSelectedRow(), 1)
                .toString();
        String nascimento = JTAutor.getModel().
                getValueAt(JTAutor.getSelectedRow(), 2)
                .toString();
        String idAux = JTAutor.getModel().
                getValueAt(JTAutor.getSelectedRow(), 0)
                .toString();
    }
}
