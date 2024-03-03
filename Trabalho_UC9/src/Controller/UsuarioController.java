
package Controller;

import Model.UsuarioModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class UsuarioController {

    public void CadastroUsuarioController(String nome, String cpf, String email, String endereço, String dataNascimento) {
        if ((nome != null && nome.length() > 0)
                && (cpf != null && cpf.length() > 0)
                && (email != null && email.length() > 0)
                && (endereço != null && endereço.length() > 0)
                && (dataNascimento != null && dataNascimento.length() > 0)) {

            UsuarioModel novoUsuario = new UsuarioModel(nome, cpf, email, endereço, dataNascimento) {
            };
            novoUsuario.cadastrarUsuarioModel(novoUsuario);

        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }

    }

    public ArrayList<UsuarioModel> listarUsuariosController() {
        UsuarioModel usuarios = new UsuarioModel();
        return usuarios.listarUsuariosModel();
    }

    public ArrayList<UsuarioModel> buscarUsuarioController(String nome) {
        UsuarioModel usuario = new UsuarioModel();
        return usuario.buscarUsuarioModel(nome);
    }

    public void alterarUsuarioController(String codigo, String nome, String cpf, String email, String endereco, String dataNascimento) {

        if ((codigo != null && codigo.length() > 0)
                && (nome != null && nome.length() > 0)
                && (cpf != null && cpf.length() > 0)
                && (endereco != null && endereco.length() > 0)
                && (dataNascimento != null && dataNascimento.length() > 0)
                && (email != null && email.length() > 0)) {
            int idNumerico = Integer.parseInt(codigo);

            UsuarioModel usuarioAjuste = new UsuarioModel(idNumerico, nome, cpf, email, endereco, dataNascimento);
            usuarioAjuste.alterarUsuarioModel(usuarioAjuste);
        }
    }

    public void excluirUsuarioController(int codigo) {
        UsuarioModel codUsuario = new UsuarioModel();
        codUsuario.deleteUsuarioModel(codigo);
    }
}
