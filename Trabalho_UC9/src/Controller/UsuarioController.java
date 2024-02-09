/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ClienteModel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UsuarioController {
    public void CadastroUsuario(String nome,String cpf,String email,String endereço,String dataNascimento){
        if((nome != null && nome.length() > 0)&&
                (cpf != null && cpf.length() > 0)&&
                (email != null && email.length() > 0)&&
                (endereço != null && endereço.length() > 0)&&
                (dataNascimento != null && dataNascimento.length() > 0)){
           
            ClienteModel novoCliente = new ClienteModel(nome, cpf, email, endereço, dataNascimento) {
        };
                    novoCliente.cadastrarClienteDAO(novoCliente);

        }else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }

    
}
      public void excluirContato(int id){
        ClienteModel idCliente = new ClienteModel();
        idCliente.excluirCliente(id);
    } 
}
