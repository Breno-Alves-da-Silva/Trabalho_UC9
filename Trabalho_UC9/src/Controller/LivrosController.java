/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.LivrosModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LivrosController {
     public void CadastroLivrosController(String titulo,String genero,Integer numeroPaginas, String resumo) {
        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (numeroPaginas != null )
                && (resumo != null && resumo.length() > 0)) {

            LivrosModel novoLivros = new LivrosModel(titulo, genero, numeroPaginas, resumo) {
            };
            novoLivros.cadastrarLivrosModel(novoLivros);

        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }

    }

    public ArrayList<LivrosModel> listarLivrosController() {
       LivrosModel livros = new LivrosModel();
        return livros.listarLivrosModel();
    }

    public ArrayList<LivrosModel> buscarLivrosController(String nome) {
        LivrosModel livros = new LivrosModel();
        return livros.buscarLivrosModel(nome);
    }

    public void alterarLivrosController(String codigo,String titulo,String genero,Integer numeroPaginas,String resumo) {

        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (numeroPaginas != null)
                && (resumo != null && resumo.length() > 0))
                {
            int idNumerico = Integer.parseInt(codigo);

            LivrosModel livrosAjuste = new LivrosModel(idNumerico, titulo, genero, numeroPaginas, resumo);
            livrosAjuste.alterarLivrosModel(livrosAjuste);
        }
    }

    public void excluirLivrosController(int codigo) {
        LivrosModel codLivros = new LivrosModel();
        codLivros.deleteLivrosModel(codigo);
    }
}
