package Controller;

import Model.LivrosModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LivrosController {

    public void CadastroLivrosController(String titulo, String genero, Integer numeroPaginas, String resumo, String status) {
        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (numeroPaginas != null)
                && (resumo != null && resumo.length() > 0)
                && (status != null && status.length() > 0)) {

            LivrosModel novoLivros = new LivrosModel(titulo, genero, numeroPaginas, resumo, status) {
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

    public void alterarStatusLivrosController(String codigo, String status) {
        if (status != null && status.length() > 0) {
            int idNumerico = Integer.parseInt(codigo);

            LivrosModel statusLivrosAjuste = new LivrosModel(idNumerico, status);
            statusLivrosAjuste.alterarStatusLivrosModel(statusLivrosAjuste);
        }

    }

    public void alterarLivrosController(String codigo, String titulo, String genero, Integer numeroPaginas, String resumo) {

        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (numeroPaginas != null)
                && (resumo != null && resumo.length() > 0)) {
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
