package DAO;

import Model.AutorModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AutorBD {
    
    public void CadastrarAutorBD(AutorModel novoAutor) {
        String sql = "INSERT INTO AUTOR (NOME, NACIONALIDADE)"
                + "VALUES(?,?)";
        PreparedStatement stmt = null;
        Connection connection = null;
        try {
            connection = new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoAutor.getNome());
            stmt.setString(2, novoAutor.getNacionalidade());
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

    public ArrayList<AutorModel> listarAutor() {
    
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        
        AutorModel autor = null;
        ArrayList<AutorModel> listaAutor = null;
        
        String sql = "SELECT * FROM ROOT.AUTOR";
        
        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaAutor = new ArrayList<>();
                while (rs.next()) {
                    autor = new AutorModel();
                    autor.setCodigo(rs.getInt("CODIGO"));
                    autor.setNome(rs.getString("NOME"));
                    autor.setNacionalidade(rs.getString("NACIONALIDADE"));
                    listaAutor.add(autor);
                }
            }
        }catch (Exception e) {
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
        return listaAutor;
    }
    public ArrayList<AutorModel> buscarAutor(String nome){
    
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        
        AutorModel autor = null;
        ArrayList<AutorModel> listaAutor = null;
        
        String sql = "SELECT * FROM ROOT.AUTOR WHERE nome LIKE '%" + 
                nome + "%' ORDER BY nome";
        
        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaAutor = new ArrayList<>();
                while (rs.next()) {
                  autor = new AutorModel();
                    autor.setCodigo(rs.getInt("CODIGO"));
                    autor.setNome(rs.getString("NOME"));
                    autor.setNacionalidade(rs.getString("NACIONALIDADE"));
                    listaAutor.add(autor);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar usuarios!");
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
        return listaAutor;
    }

    public void alterarAutorBD(AutorModel autorAjuste) {
    
        Connection conn = null;
        PreparedStatement stmt = null;
        
        String sql = "UPDATE ROOT.USUARIO SET nome=?, nacionalidade=? where codigo=?";
        
        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, autorAjuste.getNome());
            stmt.setString(2, autorAjuste.getNacionalidade());
            stmt.setInt(6, autorAjuste.getCodigo());
            stmt.execute();
            System.out.println("Alteração do registro realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração no registro!");
            e.printStackTrace();
        }finally {
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
        }}
    
    
    public void deleteAutorBD(Integer codigo){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM ROOT.AUTOR where codigo=?";
        
        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            System.out.println("Exlusão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar a exclusão do registro.");
        }finally {
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
