/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.AutorBD;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AutorModel {
    private Integer codigo;
    private String nome;
    private String nacionalidade;

    public AutorModel() {
    }

    public AutorModel(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public AutorModel(Integer codigo, String nome, String nacionalidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
    public void cadastrarAutorModel(AutorModel novoAutor) {
        AutorBD novoRegistro = new AutorBD();
        novoRegistro.CadastrarAutorBD(novoAutor);
    }

    public ArrayList<AutorModel> listarAutorModel() {
        return new AutorBD().listarAutor();
    }

    public ArrayList<AutorModel> buscarAutorModel(String nome) {
        return new AutorBD().buscarAutor(nome);
    }

    public void alterarUsuarioModel(AutorModel autorAjuste) {
        AutorBD ajusteDados = new AutorBD();
          ajusteDados.alterarAutorBD(autorAjuste);
    }

    public void deleteAutorModel(Integer codigo) {
        new AutorBD().deleteAutorBD(codigo);
    }
    
}
