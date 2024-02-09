package DAO;

import Model.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContatoBD {

    public void CadastrarUsuarioBD(ClienteModel novoCliente) {
        String sql = "INSERT INTO CLIENTE_EQUIPAMENTO (NOME, CPF, EMAIL, ENDEREÇO,DATANASCIMENTO)"
                + "VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        Connection connection = null;
        try {
            connection = new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoCliente.getNome());
            stmt.setString(2, novoCliente.getCpf());
            stmt.setString(3, novoCliente.getEmail());
            stmt.setString(4, novoCliente.getEndereço());
            stmt.setString(5, novoCliente.getDataNascimento());
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

    public void deletClienteBD(int id) {
    }
}
