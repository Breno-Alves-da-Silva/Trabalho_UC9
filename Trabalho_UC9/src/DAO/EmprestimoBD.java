/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.EmprestimoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmprestimoBD {

    public void CadastrarEmprestimoBD(EmprestimoModel novoEmprestimo) {
        String sql = "INSERT INTO EMPRESTIMO (DATALOCACAO, DATADEVOLUCAO, CODIGOLIVRO, CODIGOUSUARIO)"
                + "VALUES(?, ?, ?, ?)";
        PreparedStatement stmt = null;
        Connection connection = null;
        try {
            connection = new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoEmprestimo.getDataLocacao());
            stmt.setString(2, novoEmprestimo.getDataDevolucao());
            stmt.setInt(3, novoEmprestimo.getCodigoLivro());
            stmt.setInt(4, novoEmprestimo.getCodigoUsuario());
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

    public ArrayList<EmprestimoModel> listarEmprestimo() {

        
        Connection conn = null;
        PreparedStatement stmt = null;

        EmprestimoModel emprestimo = null;
        ArrayList<EmprestimoModel> listaEmprestimo = null;

        String sql = "SELECT * FROM ROOT.EMPRESTIMO";

        try {
            ResultSet rs = null;
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = (ResultSet) stmt.executeQuery();
            if (rs != null) {
                listaEmprestimo = new ArrayList<>();
                while (rs.next()) {
                    emprestimo = new EmprestimoModel();
                    emprestimo.setCodigo(rs.getInt("CODIGO"));
                    emprestimo.setDataLocacao(rs.getString("DATALOCACAO"));
                    emprestimo.setDataDevolucao(rs.getString("DATADEVOLUCAO"));
                    emprestimo.setCodigoLivro(rs.getInt("CODIGOLIVRO"));
                    emprestimo.setCodigoUsuario(rs.getInt("CODIGOUSUARIO"));
                    listaEmprestimo.add(emprestimo);
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
        return listaEmprestimo;
    }

    public ArrayList<EmprestimoModel> buscarEmprestimo(Integer codigo) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        EmprestimoModel emprestimo = null;
        ArrayList<EmprestimoModel> listaEmprestimo = null;

        String sql = "SELECT * FROM ROOT.EMPRESTIMO WHERE codigo LIKE '%"
                + codigo + "%' ORDER BY codigo";

        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaEmprestimo = new ArrayList<>();
                while (rs.next()) {
                    emprestimo = new EmprestimoModel();
                    emprestimo.setCodigo(rs.getInt("CODIGO"));
                    emprestimo.setDataLocacao(rs.getString("DATALOCACAO"));
                    emprestimo.setDataDevolucao(rs.getString("DATADEVOLUCAO"));
                    emprestimo.setCodigoLivro(rs.getInt("CODIGOLIVRO"));
                    emprestimo.setCodigoUsuario(rs.getInt("CODIGOUSUARIO"));
                    listaEmprestimo.add(emprestimo);
                
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar emprestimo!");
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
        return listaEmprestimo;
    }

    public void deleteEmprestimoBD(Integer codigo) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM ROOT.EMPRESTIMO where codigo=?";

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
}
