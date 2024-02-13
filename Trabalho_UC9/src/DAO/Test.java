/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import org.apache.derby.client.am.SqlException;
import org.apache.derby.iapi.sql.ResultSet;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) throws SqlException{
        ConexaoBD conex = new ConexaoBD();
        conex.getConnection();
        
        
    }
    
}
