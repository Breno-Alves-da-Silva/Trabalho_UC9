/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.LivrosModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class LivrosBD {

    public void CadastrarLivrosBD(LivrosModel novoLivros) {
        String sql = "INSERT INTO LIVRO (TITULO, GENERO, PAGINAS, SINOPSE, STATUS)"
                + "VALUES(?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        Connection connection = null;
        try {
            connection = new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoLivros.getTitulo());
            stmt.setString(2, novoLivros.getGenero());
            stmt.setInt(3, novoLivros.getNumeroPaginas());
            stmt.setString(4, novoLivros.getResumo());
            stmt.setString(5, novoLivros.getStatus());
            stmt.execute();
            System.out.println("Registro realizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar regitro!");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }
    }

    public ArrayList<LivrosModel> listarLivros() {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        LivrosModel livro = null;
        ArrayList<LivrosModel> listaLivros = null;

        String sql = "SELECT * FROM ROOT.LIVRO";

        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaLivros = new ArrayList<>();
                while (rs.next()) {
                    livro = new LivrosModel();
                    livro.setCodigo(rs.getInt("CODIGO"));
                    livro.setTitulo(rs.getString("TITULO"));
                    livro.setGenero(rs.getString("GENERO"));
                    livro.setNumeroPaginas(rs.getInt("PAGINAS"));
                    livro.setResumo(rs.getString("SINOPSE"));
                    livro.setStatus(rs.getString("STATUS"));
                    listaLivros.add(livro);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar regitro!");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }
        return listaLivros;
    }

    public ArrayList<LivrosModel> buscarLivros(String nome) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        LivrosModel livro = null;
        ArrayList<LivrosModel> listaLivros = null;

        String sql = "SELECT * FROM ROOT.LIVRO WHERE titulo LIKE '%"
                + nome + "%' ORDER BY titulo";

        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaLivros = new ArrayList<>();
                while (rs.next()) {
                    livro = new LivrosModel();
                    livro.setCodigo(rs.getInt("CODIGO"));
                    livro.setTitulo(rs.getString("TITULO"));
                    livro.setGenero(rs.getString("GENERO"));
                    livro.setNumeroPaginas(rs.getInt("PAGINAS"));
                    livro.setResumo(rs.getString("SINOPSE"));
                    livro.setStatus(rs.getString("STATUS"));
                    listaLivros.add(livro);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar livros!");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }
        return listaLivros;
    }

    public void alterarLivrosBD(LivrosModel livroAjuste) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.LIVRO SET titulo=?, genero=?, paginas=?, sinopse=?, status=? where codigo=?";

        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livroAjuste.getTitulo());
            stmt.setString(2, livroAjuste.getGenero());
            stmt.setInt(3, livroAjuste.getNumeroPaginas());
            stmt.setString(4, livroAjuste.getResumo());
            stmt.setString(5, livroAjuste.getStatus());
            stmt.setInt(6, livroAjuste.getCodigo());
            stmt.execute();
            System.out.println("Alteração do registro realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração no registro!");
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }
    }

    public void deleteLivrosBD(Integer codigo) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM ROOT.LIVRO where codigo=?";

        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            System.out.println("Exlusão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar a exclusão do registro.");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }

    }

    public void alterarStatusLivrosBD(LivrosModel statusLivrosAjuste) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.LIVRO SET status=? where codigo=?";

        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, statusLivrosAjuste.getStatus());
            stmt.setInt(2, statusLivrosAjuste.getCodigo());
            stmt.execute();
            System.out.println("Alteração do registro realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração no registro!");
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }
    }
}
