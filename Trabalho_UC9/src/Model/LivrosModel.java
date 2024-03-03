package Model;

import DAO.LivrosBD;
import java.util.ArrayList;

public class LivrosModel {

    private Integer codigo;
    private String titulo;
    private String genero;
    private Integer numeroPaginas;
    private String resumo;
    private String status;

    public LivrosModel() {
    }

    public LivrosModel(String titulo, String genero, Integer numeroPaginas, String resumo, String status) {
        this.titulo = titulo;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.status = status;
    }

    public LivrosModel(Integer codigo, String titulo, String genero, Integer numeroPaginas, String resumo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
    }

    public LivrosModel(Integer codigo, String status) {
        this.codigo = codigo;
        this.status = status;
    }
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void cadastrarLivrosModel(LivrosModel novoLivros) {
        LivrosBD novoRegistro = new LivrosBD();
        novoRegistro.CadastrarLivrosBD(novoLivros);
    }

    public ArrayList<LivrosModel> listarLivrosModel() {
        return new LivrosBD().listarLivros();
    }

    public ArrayList<LivrosModel> buscarLivrosModel(String nome) {
        return new LivrosBD().buscarLivros(nome);
    }

    public void alterarLivrosModel(LivrosModel livrosAjuste) {
        LivrosBD ajusteDados = new LivrosBD();
        ajusteDados.alterarLivrosBD(livrosAjuste);
    }

    public void deleteLivrosModel(Integer codigo) {
        new LivrosBD().deleteLivrosBD(codigo);
    }

    public void alterarStatusLivrosModel(LivrosModel statusLivrosAjuste) {
        LivrosBD ajusteDados = new LivrosBD();
        ajusteDados.alterarStatusLivrosBD(statusLivrosAjuste);
    }
}
