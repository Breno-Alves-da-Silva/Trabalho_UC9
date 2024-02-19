package Model;

import DAO.UsuarioBD;
import java.util.ArrayList;

public class UsuarioModel {

    private int codigo;
    private String nome;
    private String cpf;
    private String email;
    private String endereço;
    private String dataNascimento;

    public UsuarioModel() {
    }

    public UsuarioModel(String nome, String cpf, String email, String endereço, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
    }

    public UsuarioModel(int codigo, String nome, String cpf, String email, String endereço, String dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void cadastrarUsuarioModel(UsuarioModel novoUsuario) {
        UsuarioBD novoRegistro = new UsuarioBD();
        novoRegistro.CadastrarUsuarioBD(novoUsuario);
    }

    public ArrayList<UsuarioModel> listarUsuariosModel() {
        return new UsuarioBD().listarUsuarios();
    }

    public ArrayList<UsuarioModel> buscarUsuarioModel(String nome) {
        return new UsuarioBD().buscarUsuario(nome);
    }

    public void alterarUsuarioModel(UsuarioModel usuarioAjuste) {
        UsuarioBD ajusteDados = new UsuarioBD();
          ajusteDados.alterarUsuarioBD(usuarioAjuste);
    }

    public void deleteUsuarioModel(Integer codigo) {
        new UsuarioBD().deleteUsuarioBD(codigo);
    }

}
