/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.EmprestimoBD;
import DAO.LivrosBD;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmprestimoModel {

    private Integer codigo;
    private String dataLocacao;
    private String dataDevolucao;
    private Integer codigoLivro;
    private Integer codigoUsuario;

    public EmprestimoModel() {
    }

    public EmprestimoModel(Integer codigo, String dataLocacao, String dataDevolucao, Integer codigoLivro, Integer codigoUsuario) {
        this.codigo = codigo;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.codigoLivro = codigoLivro;
        this.codigoUsuario = codigoUsuario;
    }

    public EmprestimoModel(String dataLocacao, String dataDevolucao, Integer codigoLivro, Integer codigoUsuario) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.codigoLivro = codigoLivro;
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Integer getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(Integer codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void cadastrarEmprestimoModel(EmprestimoModel novoEmprestimo) {
        EmprestimoBD novoRegistro = new EmprestimoBD();
        novoRegistro.CadastrarEmprestimoBD(novoEmprestimo);
    }

    public ArrayList<EmprestimoModel> listarEmprestimoModel() {
        return new EmprestimoBD().listarEmprestimo();
    }

    public ArrayList<EmprestimoModel> buscarEmprestimoModel(Integer codigo) {
        return new EmprestimoBD().buscarEmprestimo(codigo);
    }

    public void deleteEmprestimoModel(Integer codigo) {
        new EmprestimoBD().deleteEmprestimoBD(codigo);
    }

}
