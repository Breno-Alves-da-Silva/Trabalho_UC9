package DAO;

import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContatoBD {

    public void CadastrarUsuarioBD(UsuarioModel novoUsuario) {
        String sql = "INSERT INTO USUARIO (NOME, CPF, EMAIL, ENDERECO,DATANASCIMENTO)"
                + "VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        Connection connection = null;
        try {
            connection = new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoUsuario.getNome());
            stmt.setString(2, novoUsuario.getCpf());
            stmt.setString(3, novoUsuario.getEmail());
            stmt.setString(4, novoUsuario.getEndereço());
            stmt.setString(5, novoUsuario.getDataNascimento());
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
    public void deleteUsuarioBD(int id) {
    }

    public ArrayList<UsuarioModel> listarUsuarios() {
    
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        
        UsuarioModel usuarios = null;
        ArrayList<UsuarioModel> listaUsuarios = null;
        
        String sql = "SELECT * FROM ROOT.USUARIO";
        
        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaUsuarios = new ArrayList<>();
                while (rs.next()) {
                    usuarios = new UsuarioModel();
                    usuarios.setCodigo(rs.getInt("CODIGO"));
                    usuarios.setNome(rs.getString("NOME"));
                    usuarios.setCpf(rs.getString("CPF"));
                    usuarios.setEmail(rs.getString("EMAIL"));
                    usuarios.setEndereço(rs.getString("ENDERECO"));
                    usuarios.setDataNascimento(rs.getString("DATANASCIMENTO"));
                    listaUsuarios.add(usuarios);
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
        return listaUsuarios;
    }
    public ArrayList<UsuarioModel> buscarUsuario(String nome){
    
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        
        UsuarioModel usuarios = null;
        ArrayList<UsuarioModel> listaUsuarios = null;
        
        String sql = "SELECT * FROM ROOT.USUARIO WHERE nome LIKE '%" + 
                nome + "%' ORDER BY nome";
        
        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaUsuarios = new ArrayList<>();
                while (rs.next()) {
                     usuarios = new UsuarioModel();
                    usuarios.setCodigo(rs.getInt("CODIGO"));
                    usuarios.setNome(rs.getString("NOME"));
                    usuarios.setCpf(rs.getString("CPF"));
                    usuarios.setEmail(rs.getString("EMAIL"));
                    usuarios.setEndereço(rs.getString("ENDERECO"));
                    usuarios.setDataNascimento(rs.getString("DATANASCIMENTO"));
                    listaUsuarios.add(usuarios);
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
        return listaUsuarios;
    }

    public void alterarUsuarioBD(UsuarioModel usuarioAjuste) {
    
        Connection conn = null;
        PreparedStatement stmt = null;
        
        String sql = "UPDATE ROOT.USUARIO SET nome=?, cpf=?, email=?, endereco=?, datanascimento=? where codigo=?";
        
        try {
            conn = new ConexaoBD().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioAjuste.getNome());
            stmt.setString(2, usuarioAjuste.getCpf());
            stmt.setString(3, usuarioAjuste.getEmail());
            stmt.setString(4, usuarioAjuste.getEndereço());
            stmt.setString(5, usuarioAjuste.getDataNascimento());
            stmt.setInt(4,usuarioAjuste.getCodigo());            stmt.execute();
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
    
    
    public void deleteUsuarioBD(Integer codigo){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM ROOT.USUARIO where codigo=?";
        
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
