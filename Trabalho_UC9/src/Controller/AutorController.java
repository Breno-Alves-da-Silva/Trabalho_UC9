package Controller;

import Model.AutorModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AutorController {

    public void CadastroAutorController(String nome, String nacionalidade) {
        if ((nome != null && nome.length() > 0)
                && (nacionalidade != null && nacionalidade.length() > 0)) {

            AutorModel novoAutor = new AutorModel(nome, nacionalidade) {
            };
            novoAutor.cadastrarAutorModel(novoAutor);

        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }

    }

    public ArrayList<AutorModel> listarAutorController() {
        AutorModel usuarios = new AutorModel();
        return usuarios.listarAutorModel();
    }

    public ArrayList<AutorModel> buscarAutorController(String nome) {
        AutorModel usuario = new AutorModel();
        return usuario.buscarAutorModel(nome);
    }

    public void alterarAutorController(String codigo,String nome, String nacionalidade) {

        if ((codigo != null && codigo.length() > 0)
                && (nome != null && nome.length() > 0)
                && (nacionalidade != null && nacionalidade.length() > 0))
                {
            int idNumerico = Integer.parseInt(codigo);

            AutorModel autorAjuste = new AutorModel(idNumerico, nome, nacionalidade);
            autorAjuste.alterarUsuarioModel(autorAjuste);
        }
    }

    public void excluirAutorController(int codigo) {
        AutorModel codUsuario = new AutorModel();
        codUsuario.deleteAutorModel(codigo);
    }
}
