/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.EmprestimoModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class EmprestimoController {
    
    public void CadastroEmprestimoController(String dataLocacao, String dataDevolucao, Integer codigoLivro, Integer codigoUsuario) {
        if ((dataLocacao != null && dataLocacao.length() > 0)
                && (dataDevolucao != null && dataDevolucao.length() > 0)
                && (codigoLivro != null)
                && (codigoUsuario != null)) {

           EmprestimoModel novoEmprestimo = new EmprestimoModel(dataLocacao, dataDevolucao, codigoLivro, codigoUsuario) {
            };
            novoEmprestimo.cadastrarEmprestimoModel(novoEmprestimo);

        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }

    }

    public ArrayList<EmprestimoModel> listarEmprestimoController() {
        EmprestimoModel emprestimo = new EmprestimoModel();
        return emprestimo.listarEmprestimoModel();
    }

    public ArrayList<EmprestimoModel> buscarEmprestimoController(Integer codigo) {
        EmprestimoModel emprestimo = new EmprestimoModel();
        return emprestimo.buscarEmprestimoModel(codigo);
    }
     public void excluirEmprestimoController(int codigo) {
        EmprestimoModel codEmprestimo = new EmprestimoModel();
        codEmprestimo.deleteEmprestimoModel(codigo);
    }
}
